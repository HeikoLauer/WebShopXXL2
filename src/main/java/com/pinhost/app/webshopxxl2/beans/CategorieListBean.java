/****************************************************/
/* @Author 		: heiko lauer                       */
/* @Date        : 2017.02.16                        */
/* @Description : Bean for a CategorieList          */
/* @Scope		: Seession                          */            
/****************************************************/

package com.pinhost.app.webshopxxl2.beans;

import java.util.List;

import javax.faces.event.ActionEvent;

import com.pinhost.app.webshopxxl2.dao.CategorieDao;
import com.pinhost.app.webshopxxl2.util.Util;

public class CategorieListBean extends Util {


	List<CategorieBean> categorieList = null;
	
	/***
	 * @author heiko
	 * 
	 * <br> Get all CategorienBean
	 * @return List<CategorieBean>
	 */
	public List<CategorieBean> getAllCategorie(){
		categorieList = CategorieDao.getAllCategorie();
		return categorieList;
	}
	
	
	/****** Action Mathoden *************************************/
	
	/***
	 * @author heiko
	 * 
	 * @param event
	 */
	public void switchProductSeite(ActionEvent event){
		
		Integer categorie_index  = (Integer) event.getComponent().getAttributes().get("categorie_index");
		
		getNavigationBean().setContent_page(getNavigationBean().getCONTENT_PRODUCT_PAGE());
  		getSessionBean().setCategorieBean(categorieList.get(categorie_index));
 	}
}
