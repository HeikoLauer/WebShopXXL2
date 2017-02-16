package com.pinhost.app.webshopxxl2.beans;

import java.util.List;

import javax.faces.event.ActionEvent;

import com.pinhost.app.webshopxxl2.dao.CategorieDao;
import com.pinhost.app.webshopxxl2.util.Util;

public class CategorieListBean extends Util {

	/** The injected Beans ****/
	
	protected NavigationBean getNavigationBean() { return (NavigationBean) getBean("navigationBean"); }
	protected SessionBean getSessionBean() { return (SessionBean) getBean("sessionBean"); }

	/***
	 * @author heiko
	 * 
	 * <br> Get all CategorienBean
	 * @return List<CategorieBean>
	 */
	public List<CategorieBean> getAllCategorie(){
		return CategorieDao.getAllCategorie();
	}
	
	
	/****** Action Mathoden *************************************/
	
	/***
	 * @author heiko
	 * 
	 * @param event
	 */
	public void switchProductSeite(ActionEvent event){
		
		String categorie_id  = (String) event.getComponent().getAttributes().get("categorie_id");
  		getNavigationBean().setContent_page(getNavigationBean().getCONTENT_PRODUCT_PAGE());
  		getSessionBean().setCategorie_id(categorie_id);
	}
}
