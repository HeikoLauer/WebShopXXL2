package com.pinhost.app.webshopxxl2.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.pinhost.app.webshopxxl2.DummyData.ProductDummy;
import com.pinhost.app.webshopxxl2.beans.ProductBean;
import com.pinhost.app.webshopxxl2.util.Util;

public class ProductDao extends Util {
	

	/**
	 * @author heiko
	 * @return List of CategorieBean
	 */
	public static List<ProductBean> getAllProduct(String cat_id){
	
		List<ProductBean> retList = new ArrayList<ProductBean>();
		
		//TODO Here get the Data from Database
		
		HashMap<String, String> allproductMAP = ProductDummy.readProduct(cat_id);
			
		ProductBean productBean;
		
		for(String productName : allproductMAP.keySet()){
			
			productBean = new ProductBean();
			productBean.setIcon(allproductMAP.get(productName)+".png");
			productBean.setId(allproductMAP.get(productName));
			productBean.setName(productName);
			retList.add(productBean);
		}
		
		return retList;
	}
}
