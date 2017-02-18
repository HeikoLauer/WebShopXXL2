package com.pinhost.app.webshopxxl2.beans;

import java.util.List;

import com.pinhost.app.webshopxxl2.dao.ProductDao;
import com.pinhost.app.webshopxxl2.util.Util;

public class ProductListBean extends Util {

	/** The injected Beans ****/
	
	protected NavigationBean getNavigationBean() { return (NavigationBean) getBean("navigationBean"); }
	protected SessionBean getSessionBean() { return (SessionBean) getBean("sessionBean"); }

	/***
	 * @author heiko
	 * 
	 * <br> Get all CategorienBean
	 * @return List<CategorieBean>
	 */
	public List<ProductBean> getAllProduct(){

		return ProductDao.getAllProduct(getSessionBean().getCategorie_id());
	}
	
}
