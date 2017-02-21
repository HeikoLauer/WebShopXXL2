/****************************************************/
/* @Author 		: heiko lauer                       */
/* @Date        : 2017.02.10                        */
/* @Description : DAO for Categories                */
/* @Scope		: No Bean                           */            
/****************************************************/

package com.pinhost.app.webshopxxl2.facade;

import java.util.ArrayList;
import java.util.List;

import com.pinhost.app.webshopxxl2.beans.CategorieBean;
import com.pinhost.common.webshopxxl2.dbconnect.DBCategorieConnect;
import com.pinhost.common.webshopxxl2.to.CategorieTO;

public class CategorieFacade {
	
	/**
	 * @author heiko
	 * 
	 * <br> Get a List of CategorieTO from DBCategorieConnect
	 * <br> Transfer the Properties from CategorieTO to CategorieBean
	 * <br> Set the CategorieBean in a List of CategorieBean
	 * <br> Return the List
	 * <br> Call from CategorieListBean
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
		int i=0; // Index for the List
		for(CategorieTO categorieTO : categorieTOList){
			
			categorieBean = new CategorieBean();
			categorieBean.setIndex(i);
			categorieBean.setId(categorieTO.getId());
			categorieBean.setName(categorieTO.getName());
			categorieBean.setIcon_name(categorieTO.getIcon_name());
			
			i++;
			
			retList.add(categorieBean);
		}
		
		return retList;
	}

}
