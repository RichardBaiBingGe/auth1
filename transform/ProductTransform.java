package cn.com.wito.auth.transform;

import java.util.ArrayList;
import java.util.List;

import cn.com.wito.auth.dto.ProductDto;
import cn.com.wito.auth.po.Product;


/**
 * PO对象转DTO
 * 
 * @param Product
 * @return
 */
public class ProductTransform {

	public static ProductDto poToDto(Product pc) {
		ProductDto pcDto = null;
		if (pc != null) {
			pcDto = new ProductDto(pc.getId(), pc.getCreateDate(),
					pc.getModifyDate(), pc.getAllocatedStock(),
					pc.getAttributeValue0(), pc.getAttributeValue1(),
					pc.getAttributeValue10(), pc.getAttributeValue11(),
					pc.getAttributeValue12(), pc.getAttributeValue13(),
					pc.getAttributeValue14(), pc.getAttributeValue15(),
					pc.getAttributeValue16(), pc.getAttributeValue17(),
					pc.getAttributeValue18(), pc.getAttributeValue19(),
					pc.getAttributeValue2(), pc.getAttributeValue3(),
					pc.getAttributeValue4(), pc.getAttributeValue5(),
					pc.getAttributeValue6(), pc.getAttributeValue7(),
					pc.getAttributeValue8(), pc.getAttributeValue9(),
					pc.getCost(), pc.getFullName(), pc.getHits(),
					pc.getImage(), pc.getIsGift(), pc.getIsList(),
					pc.getIsMarketable(), pc.getIsTop(), pc.getKeyword(),
					pc.getMarketPrice(), pc.getMemo(), pc.getMonthHits(),
					pc.getMonthHitsDate(), pc.getMonthSales(),
					pc.getMonthSalesDate(), pc.getName(), pc.getPoint(),
					pc.getPrice(), pc.getSales(), pc.getScore(),
					pc.getScoreCount(), pc.getSeoDescription(),
					pc.getSeoKeywords(), pc.getSeoTitle(), pc.getSn(),
					pc.getStock(), pc.getStockMemo(), pc.getTotalScore(),
					pc.getUnit(), pc.getWeekHits(), pc.getWeekHitsDate(),
					pc.getWeekSales(), pc.getWeekSalesDate(), pc.getWeight(),
					pc.getBrand(), pc.getGoods(), pc.getProductCategory(),
					pc.getBusinessArea(), pc.getOperateSubjectCode(),
					pc.getOperateSubjectName(), pc.getStoreName(),
					pc.getIntroduction(),pc.getProductDel(),
					pc.getProducingarea()
					);
		}
		return pcDto;
	}
	
	public static List<ProductDto> poLstToDtoLst(List<Product> poLst){
		List<ProductDto> listpcdDto=new ArrayList<ProductDto>();
	    if(poLst != null){
	    	ProductDto pcdDto=null;
	    	for(Product pc:poLst){
	    		pcdDto=poToDto(pc);
		    	listpcdDto.add(pcdDto);
		    }
	    }
	  return listpcdDto;
	}
	
	public static Product DtoTopo(ProductDto pcDto){
		Product pc = null;
		if (pcDto != null) {
			pc = new Product(pcDto.getId(), pcDto.getCreateDate(),
					pcDto.getModifyDate(), pcDto.getAllocatedStock(),
					pcDto.getAttributeValue0(), pcDto.getAttributeValue1(),
					pcDto.getAttributeValue10(), pcDto.getAttributeValue11(),
					pcDto.getAttributeValue12(), pcDto.getAttributeValue13(),
					pcDto.getAttributeValue14(), pcDto.getAttributeValue15(),
					pcDto.getAttributeValue16(), pcDto.getAttributeValue17(),
					pcDto.getAttributeValue18(), pcDto.getAttributeValue19(),
					pcDto.getAttributeValue2(), pcDto.getAttributeValue3(),
					pcDto.getAttributeValue4(), pcDto.getAttributeValue5(),
					pcDto.getAttributeValue6(), pcDto.getAttributeValue7(),
					pcDto.getAttributeValue8(), pcDto.getAttributeValue9(),
					pcDto.getCost(), pcDto.getFullName(), pcDto.getHits(),
					pcDto.getImage(), pcDto.getIsGift(), pcDto.getIsList(),
					pcDto.getIsMarketable(), pcDto.getIsTop(), pcDto.getKeyword(),
					pcDto.getMarketPrice(), pcDto.getMemo(), pcDto.getMonthHits(),
					pcDto.getMonthHitsDate(), pcDto.getMonthSales(),
					pcDto.getMonthSalesDate(), pcDto.getName(), pcDto.getPoint(),
					pcDto.getPrice(), pcDto.getSales(), pcDto.getScore(),
					pcDto.getScoreCount(), pcDto.getSeoDescription(),
					pcDto.getSeoKeywords(), pcDto.getSeoTitle(), pcDto.getSn(),
					pcDto.getStock(), pcDto.getStockMemo(), pcDto.getTotalScore(),
					pcDto.getUnit(), pcDto.getWeekHits(), pcDto.getWeekHitsDate(),
					pcDto.getWeekSales(), pcDto.getWeekSalesDate(), pcDto.getWeight(),
					pcDto.getBrand(), pcDto.getGoods(), pcDto.getProductCategory(),
					pcDto.getBusinessArea(), pcDto.getOperateSubjectCode(),
					pcDto.getOperateSubjectName(), pcDto.getStoreName(),
					pcDto.getIntroduction(),pcDto.getProductDel(),
					pcDto.getProducingarea()
					);
		}
		return pc;
	}
	 public static List<Product> DtoLstTopoLst(List<ProductDto> listpcdDto){
		 List<Product> listpc=new ArrayList<Product>();
	  	    if(listpcdDto != null){
	  	    	Product pc=null;
	  	    	for(ProductDto pcdDto:listpcdDto){
	  	    		pc=DtoTopo(pcdDto);
	  	    		listpc.add(pc);
	  		    }
	  	    }
	  	  return listpc;
	 }
}
