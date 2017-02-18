package com.pinhost.app.webshopxxl2.dao;

import java.util.ArrayList;
import java.util.List;

import com.pinhost.app.webshopxxl2.beans.CategorieBean;
import com.pinhost.common.webshopxxl2.dbconnect.DBCategorieConnect;
import com.pinhost.common.webshopxxl2.to.CategorieTO;

public class CategorieDao {
	
	/**
	 * @author heiko
	 * 
	 * <br> Get a List of CategorieTO from DBCategorieConnect
	 * <br> Transfer the Properties from CategorieTO to CategorieBean
	 * <br> Set the CategorieBean in a List of CategorieBean
	 * <br> Return the List
	 * 
	 * @return List of CategorieBean
	 */
	public static List<CategorieBean> getAllCategorie(){
	
		// get a List of CategorieTO
		List<CategorieTO> categorieTOList = new DBCategorieConnect().readAllCateggorie();
		
		// Create a List of CategorieBean
		List<CategorieBean> retList = new ArrayList<CategorieBean>();
		CategorieBean categorieBean;
		
		// Transfer the Properties
		for(CategorieTO categorieTO : categorieTOList){
			
			categorieBean = new CategorieBean();

			categorieBean.setId(categorieTO.getId());
			categorieBean.setName(categorieTO.getName());
			categorieBean.setIcon_name(categorieTO.getIcon_name());
			
			retList.add(categorieBean);
		}
		
		return retList;
	}

}
