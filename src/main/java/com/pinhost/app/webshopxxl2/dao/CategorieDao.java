package com.pinhost.app.webshopxxl2.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.pinhost.app.webshopxxl2.DummyData.CategorieDummy;
import com.pinhost.app.webshopxxl2.beans.CategorieBean;

public class CategorieDao {
	
	/**
	 * @author heiko
	 * @return List of CategorieBean
	 */
	public static List<CategorieBean> getAllCategorie(){
		
		List<CategorieBean> retList = new ArrayList<CategorieBean>();
		
		//TODO Here get the Data from Database
		
		HashMap<String, String> allCateggorieMAP = CategorieDummy.readCategorie();
			
		CategorieBean categorieBean;
		
		for(String categorieName : allCateggorieMAP.keySet()){
			
			categorieBean = new CategorieBean();
			categorieBean.setIcon(allCateggorieMAP.get(categorieName)+".png");
			categorieBean.setId(allCateggorieMAP.get(categorieName));
			categorieBean.setName(categorieName);
			retList.add(categorieBean);
		}
		
		return retList;
	}
}
