/****************************************************/
/* @Author 		: heiko lauer                       */
/* @Date        : 2017.02.10                        */
/* @Description : DAO for Products                  */
/* @Scope		: No Bean                           */            
/****************************************************/

package com.pinhost.app.webshopxxl2.dao;

import java.util.ArrayList;
import java.util.List;

import com.pinhost.app.webshopxxl2.beans.ProductBean;
import com.pinhost.app.webshopxxl2.util.Util;
import com.pinhost.common.webshopxxl2.dbconnect.DBProductConnect;
import com.pinhost.common.webshopxxl2.to.ProductTO;

public class ProductDao extends Util {
	

	/**
	 * @author heiko
	 * @return List of CategorieBean
	 */
	public static List<ProductBean> getAllProduct(String categorie_id){
	
		// get a List of CategorieTO
		List<ProductTO> productTOList = new DBProductConnect().readAllProductsForCategorie(categorie_id);
		
		// Create a List of CategorieBean
		List<ProductBean> retList = new ArrayList<ProductBean>();
		ProductBean productBean;
		
		// Transfer the Properties
		for(ProductTO productTO : productTOList){
			
			productBean = new ProductBean();

			productBean.setId(productTO.getId());
			productBean.setId_categorie(productTO.getId_categorie());
			productBean.setName(productTO.getName());
			productBean.setIcon_name(productTO.getIcon_name());
			
			retList.add(productBean);
		}
		
		return retList;
	}
}
