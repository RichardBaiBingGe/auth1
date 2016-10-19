package cn.com.wito.auth.service.mgr.impl;


import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.com.wito.auth.dao.ProductCategoryDao;
import cn.com.wito.auth.dto.ProductCategoryDto;
import cn.com.wito.auth.exception.BussinessException;
import cn.com.wito.auth.po.ProductCategory;
import cn.com.wito.auth.service.mgr.ProductCategoryMgrService;
import cn.com.wito.auth.transform.ProductCategoryTransform;

@Service("productCategoryMgrService")
public class ProductCategoryMgrServiceImp implements ProductCategoryMgrService {

	@Resource
	private ProductCategoryDao productCategorydao;


	public List<ProductCategory> find(ProductCategoryDto pcd) {
		ProductCategory pc=ProductCategoryTransform.DtoTopo(pcd);
		return productCategorydao.find(pc);
	}


	public ProductCategoryDto findProductCategory(String id) {
          ProductCategory pc=productCategorydao.find(id);
          ProductCategoryDto pcdDto=ProductCategoryTransform.poToDto(pc);
		return pcdDto;
	}


	public boolean addProductCategory(ProductCategoryDto pcd)
			throws BussinessException {
		ProductCategory pc=ProductCategoryTransform.DtoTopo(pcd);
		Date date=new Date();
		pc.setCreateDate(date);
		pc.setUpdateDate(date);
		pc.setGrade(0);
		pc.setTreePath(",");
		return productCategorydao.add(pc);
	}


	public boolean modifyProductCategory(ProductCategoryDto pcd) {
		Date date=new Date();

		ProductCategory pc=ProductCategoryTransform.DtoTopo(pcd);
		pc.setUpdateDate(date);
		return productCategorydao.update(pc);
	}


	public boolean deleteProductCategory(String num) {

		return productCategorydao.delete(num);
	}



	public List<ProductCategoryDto> findAll() {
           List<ProductCategory> listpc=productCategorydao.findAll();
           List<ProductCategoryDto> listpcdDto=ProductCategoryTransform.poLstToDtoLst(listpc);
		return listpcdDto;
	}

}
