package cn.com.wito.auth.service.mgr.impl;


import java.util.Date;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import cn.com.wito.auth.components.Page;
import cn.com.wito.auth.components.Pageable;
import cn.com.wito.auth.dao.ProductDao;
import cn.com.wito.auth.dto.ProductDto;
import cn.com.wito.auth.po.Product;
import cn.com.wito.auth.service.mgr.ProductMgrService;
import cn.com.wito.auth.transform.ProductTransform;
/**
 * 商品管理
 * 
 * @author FJG
 * 
 */
@Service("productMgrService")
public class ProductMgrServiceImpl implements ProductMgrService {

	@Resource
	private ProductDao productDao;

	public Page<ProductDto> findPage(Pageable<ProductDto> pageable) {
         Pageable<Product> productPageable=new Pageable<Product>();
         if(pageable != null){
        	 productPageable.setEntity(ProductTransform.DtoTopo(pageable.getEntity()));
        	 productPageable.setOrderDirection(pageable.getOrderDirection());
        	 productPageable.setPageNumber(pageable.getPageNumber());
        	 productPageable.setPageSize(pageable.getPageSize());
        	 productPageable.setSearchProperty(pageable.getSearchProperty());
        	 productPageable.setSearchValue(pageable.getSearchValue());
         }
         Page<Product> productPage=productDao.findPage(productPageable);
         Page<ProductDto> page=null;
         if(productPage != null){
        	 List<Product> content=productPage.getContent();
        	 page=new Page<ProductDto>(ProductTransform.poLstToDtoLst(content),productPage.getTotal(),pageable);
         }
		return page;
	}


	public boolean modifyProduct(ProductDto pcDto) {
          Product product=ProductTransform.DtoTopo(pcDto);
          Date date=new Date();
          product.setModifyDate(date);
		return productDao.update(product);
	}


	public boolean deleteProduct(Long ProductID) {

		return productDao.delete(ProductID);
	}


	/*public String getProductSn() {
		Date now = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");// 可以方便地修改日期格式
		long n = Math.round(Math.random() * 9000+1000);
		String Sn = dateFormat.format(now) + n;
		long num = productDao.countSn(Sn);
		if (num != 0) {
			getProductSn();
		}
		return Sn;
	}*/
	public boolean addProduct(ProductDto pcDto) {
		Product pc=ProductTransform.DtoTopo(pcDto);	
		/*String sn=getProductSn();
		pc.setSn(sn);*/
		//因为数据库有非空判断，所以为其添加初始值
		Date date=new Date();
		pc.setCreateDate(date);
		pc.setModifyDate(date);
		pc.setHits(new Long(0));
		pc.setIsGift(false);
		pc.setIsList(false);
		pc.setIsMarketable(false);
		pc.setIsTop(false);
		pc.setMonthHits(new Long(0));
		pc.setMonthHitsDate(date);
		pc.setMonthSales(new Long(0));
		pc.setMonthSalesDate(date);
        long l=pc.getPrice().longValue();
        long l1=pc.getCost().longValue();
		pc.setTotalScore(l*l1);
		pc.setWeekHits(new Long(0));
		pc.setWeekHitsDate(date);
		pc.setWeekSales(new Long(0));
		pc.setWeekSalesDate(date);
		pc.setGoods(new Long(102));
		return productDao.add(pc);
	}



	public Page<ProductDto> findPage2(Pageable<ProductDto> pageable,
			ProductDto pcDto) {
		Pageable<Product> orderPageable = new Pageable<Product>();
		if (pageable != null) {
			orderPageable
					.setEntity(ProductTransform.DtoTopo(pageable.getEntity()));
			orderPageable.setOrderDirection(pageable.getOrderDirection());
			orderPageable.setPageNumber(pageable.getPageNumber());
			orderPageable.setPageSize(pageable.getPageSize());
			orderPageable.setSearchProperty(pageable.getSearchProperty());
			orderPageable.setSearchValue(pageable.getSearchValue());
		}
		Product product=null;
		if(pcDto != null){
			product = ProductTransform.DtoTopo(pcDto);
		}
		Page<Product> orderPage = productDao.findPage2(orderPageable,product);
		Page<ProductDto> page = null;
		if (orderPage != null) {
			List<Product> content = orderPage.getContent();
			page = new Page<ProductDto>(ProductTransform.poLstToDtoLst(content),
					orderPage.getTotal(), pageable);
		}
		return page;
	}


	@Override
	public List<ProductDto> findAll() {
        Product pc=null;
        List<Product> list = productDao.find(pc);
        List<ProductDto> listdto=ProductTransform.poLstToDtoLst(list);
		return listdto;
	}


	@Override
	public boolean productDel(Product pc) {
		
		return productDao.productDel(pc);
	}

}
