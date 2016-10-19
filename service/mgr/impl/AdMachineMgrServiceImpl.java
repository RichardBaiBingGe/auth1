package cn.com.wito.auth.service.mgr.impl;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.apache.http.HttpHeaders;
import org.springframework.stereotype.Service;

import cn.com.wito.auth.components.Page;
import cn.com.wito.auth.components.Pageable;
import cn.com.wito.auth.dao.AdMachineDao;
import cn.com.wito.auth.dao.AdResourceDao;
import cn.com.wito.auth.dao.IVendingMachineDao;
import cn.com.wito.auth.dao.SysUserDao;
import cn.com.wito.auth.dto.VendingMachineDto;
import cn.com.wito.auth.po.AdMachine;
import cn.com.wito.auth.po.AdResource;
import cn.com.wito.auth.po.SysUser;
import cn.com.wito.auth.po.VendingMachine;
import cn.com.wito.auth.service.mgr.AdMachineMgrService;
import cn.com.wito.auth.transform.VendingMachineTransform;

/**
 * 售货机广告功能实现
 * @author wangxing
 *
 */
@Service("adMachineMgrService")
public class AdMachineMgrServiceImpl implements AdMachineMgrService{

	@Resource
	private IVendingMachineDao vendingMachineDao;
	
	@Resource
	private SysUserDao sysUserDao;
	
	@Resource
	private AdMachineDao adMachineDao;
	
	@Resource
	private AdResourceDao adResourceDao;
	
	@Override
	public Page<VendingMachineDto> findPage(Pageable<VendingMachineDto> pageable) {
		
		Pageable<VendingMachine> vendingMachinePageable = new Pageable<VendingMachine>();
		if (pageable != null) {
			vendingMachinePageable.setEntity(VendingMachineTransform.dtoToPo(pageable.getEntity()));
			vendingMachinePageable.setOrderDirection(pageable.getOrderDirection());
			vendingMachinePageable.setPageNumber(pageable.getPageNumber());
			vendingMachinePageable.setPageSize(pageable.getPageSize());
			vendingMachinePageable.setSearchProperty(pageable.getSearchProperty());
			vendingMachinePageable.setSearchValue(pageable.getSearchValue());
		}
		Page<VendingMachine> vendingMachinePage = vendingMachineDao.findPage(vendingMachinePageable); 
		Page<VendingMachineDto> page = null;
		if(vendingMachinePage != null) {
			List<VendingMachine> content = vendingMachinePage.getContent();
			page = new Page<VendingMachineDto>(VendingMachineTransform.poLstToDtoLst(content), vendingMachinePage.getTotal(), pageable);
		}
		return page;
	}

	@Override
	public String findAdResource(String machineCode) {
		
		AdMachine adMachine = adMachineDao.find(machineCode);
		String resourceCode = null;
		if (adMachine != null) {
			resourceCode = adMachine.getResourceCode();
		}
		
		return resourceCode;
	}

	@Override
	public boolean updateAdResource(String code, String adResourceCodes) {

		if (adResourceCodes != null) {
			AdMachine adMachine = adMachineDao.find(code);
			if (adMachine != null) {
				adMachine.setResourceCode(adResourceCodes);
				adMachineDao.update(adMachine);
			} else {
				adMachine = new AdMachine();
				adMachine.setMachineCode(code);
				adMachine.setResourceCode(adResourceCodes);
				adMachineDao.add(adMachine);
			}
		}
		return true;
	}

	@Override
	public File download(String code,
			HttpServletResponse response, HttpServletRequest request) {
		
		AdMachine adMachine = adMachineDao.find(code);
		if (adMachine != null) {
			String adResString = adMachine.getResourceCode();
			String[] adResourceCode = StringUtils.split(adResString, ",");
			List<File> files = new ArrayList<File>();
			
			StringBuilder jsonArray = new StringBuilder();
			String realPath = request.getSession().getServletContext().getRealPath("");
			
			for(String key : adResourceCode) {
				AdResource adResource = adResourceDao.find(key);
				if (adResource != null && adResource.getResourceUrl() != null) {
					files.add(new File(realPath + adResource.getResourceUrl()));
					jsonArray.append("{\"filename\":\""+adResource.getName()+"\",\"filetype\":\""+adResource.getFileType()+"\"},");
				}
			}
			if(jsonArray.length()>0){
				jsonArray.deleteCharAt(jsonArray.length()-1);	
			}
			
			String json = "{\"ret\":\"0\", \"count\":\"" + adResourceCode.length + "\", \"checkcode\":\"12343234ere\", \"advertlist\":["+jsonArray.toString()+"]}";
			String path = request.getSession().getServletContext().getRealPath("/") + "temp/";
            File dirFile = new File(path);
            if (!dirFile.exists()) {
            	dirFile.mkdirs();
            }
			PrintWriter printWriter;
			File file = new File(path+"advertlist.rar");
			File fileTxt = new File(path+"advertlist.txt");
			try {
				printWriter = new PrintWriter(fileTxt);
				printWriter.print(json);
				printWriter.close();
				files.add(fileTxt);
				downLoadFiles(file, files, response);
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			return file;
			
		}
		
		return null;
	}
		
		private  HttpServletResponse downLoadFiles(File file,List<File> files,HttpServletResponse response)
	            throws Exception {
	        try {
	            /**创建一个临时压缩文件，
	             * 我们会把文件流全部注入到这个文件中
	             * 这里的文件你可以自定义是.rar还是.zip*/
	            if (!file.exists()){  
	                file.createNewFile();  
	            }
	            response.reset();
	            response.getWriter();
	            //创建文件输出流
	            FileOutputStream fous = new FileOutputStream(file);  
	            /**打包的方法我们会用到ZipOutputStream这样一个输出流,
	             * 所以这里我们把输出流转换一下*/
//	            org.apache.tools.zip.ZipOutputStream zipOut
//	                = new org.apache.tools.zip.ZipOutputStream(fous);
	           ZipOutputStream zipOut
	            = new ZipOutputStream(fous);
	            /**这个方法接受的就是一个所要打包文件的集合，
	             * 还有一个ZipOutputStream*/
	           zipFile(files, zipOut);
	            zipOut.close();
	            fous.close();
//	           return downloadZip(file,response);
	        }catch (Exception e) {
	                e.printStackTrace();
	            }
	            /**直到文件的打包已经成功了，
	             * 文件的打包过程被我封装在FileUtil.zipFile这个静态方法中，
	             * 稍后会呈现出来，接下来的就是往客户端写数据了*/
	           // OutputStream out = response.getOutputStream();
			return response;
	          
	    
//	        return response ;
	    }

	  /**
	     * 把接受的全部文件打成压缩包
	     * @param List<File>; 
	     * @param org.apache.tools.zip.ZipOutputStream 
	     */
		private void zipFile
	            (List files,ZipOutputStream outputStream) {
	        int size = files.size();
	        for(int i = 0; i < size; i++) {
	            File file = (File) files.get(i);
	            zipFile(file, outputStream);
	        }
	    }
		
		private void zipFile(File inputFile,
		            ZipOutputStream ouputStream) {
		        try {
		            if(inputFile.exists()) {
		                /**如果是目录的话这里是不采取操作的，
		                 * 至于目录的打包正在研究中*/
		                if (inputFile.isFile()) {
		                    FileInputStream IN = new FileInputStream(inputFile);
		                    BufferedInputStream bins = new BufferedInputStream(IN, 512);
		                    //org.apache.tools.zip.ZipEntry
		                    ZipEntry entry = new ZipEntry(inputFile.getName());
		                    ouputStream.putNextEntry(entry);
		                    // 向压缩文件中输出数据  
		                    int nNumber;
		                    byte[] buffer = new byte[512];
		                    while ((nNumber = bins.read(buffer)) != -1) {
		                        ouputStream.write(buffer, 0, nNumber);
		                    }
		                    // 关闭创建的流对象  
		                    bins.close();
		                    IN.close();
		                } else {
		                    try {
		                        File[] files = inputFile.listFiles();
		                        for (int i = 0; i < files.length; i++) {
		                            zipFile(files[i], ouputStream);
		                        }
		                    } catch (Exception e) {
		                        e.printStackTrace();
		                    }
		                }
		            }
		        } catch (Exception e) {
		            e.printStackTrace();
		        }
		    }

}
