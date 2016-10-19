package cn.com.wito.auth.transform;

import java.util.ArrayList;
import java.util.List;

import cn.com.wito.auth.dto.ProductCategoryDto;
import cn.com.wito.auth.po.ProductCategory;
/**
 * PO对象转DTO
 * 
 * @param ProductCategory
 * @return
 */
public class ProductCategoryTransform {
  public static ProductCategoryDto poToDto(ProductCategory pc){
	  ProductCategoryDto pcdDto=null;
	  if(pc!=null){
		  pcdDto=new ProductCategoryDto(pc.getId(),pc.getGrade(),pc.getName(), 
				  pc.getSeoDescription(), pc.getSeoKeywords(), 
				  pc.getSeoTitle(), pc.getTreePath(), 
				  pc.getParent(), pc.getNum());
	  }
	  
	  
	  return pcdDto;
  }
  
  public static List<ProductCategoryDto> poLstToDtoLst(List<ProductCategory> listpc){
	  List<ProductCategoryDto> listpcdDto=new ArrayList<ProductCategoryDto>();
	    if(listpc != null){
	    	ProductCategoryDto pcdDto=null;
	    	for(ProductCategory pc:listpc){
	    		pcdDto=poToDto(pc);
		    	listpcdDto.add(pcdDto);
		    }
	    }
	  return listpcdDto;
  }
  

	public static ProductCategory DtoTopo(ProductCategoryDto pcdDto){
    	ProductCategory pc=null;
    	if(pcdDto != null){
    		pc=new ProductCategory(pcdDto.getId(),pcdDto.getGrade(), pcdDto.getName(),
    				pcdDto.getSeoDescription(), pcdDto.getSeoKeywords(), 
    				pcdDto.getSeoTitle(), pcdDto.getTreePath(), 
    				pcdDto.getParent(), pcdDto.getNum());
    	}
    	return pc;
    }
    
    public static List<ProductCategory> DtoLstTopoLst(List<ProductCategoryDto> listpcdDto){
  	  List<ProductCategory> listpc=new ArrayList<ProductCategory>();
  	    if(listpcdDto != null){
  	    	ProductCategory pc=null;
  	    	for(ProductCategoryDto pcdDto:listpcdDto){
  	    		pc=DtoTopo(pcdDto);
  	    		listpc.add(pc);
  		    }
  	    }
  	  return listpc;
    }
  
}
