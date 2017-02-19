/****************************************************/
/* @Author 		: heiko lauer                       */
/* @Date        : 2017.02.16                        */
/* @Description : Bean for the Session Data         */
/* @Scope		: Session                           */            
/****************************************************/

package com.pinhost.app.webshopxxl2.beans;


public class SessionBean {

	private boolean userIsOnline = false;  // after successful login is true
	
	private CategorieBean categorieBean;  // The actual Categorie
	private ProductBean productBean;      // The actual Product
	
	/****  Getter and setter ****/
	
	public boolean isUserIsOnline() {
		return userIsOnline;
	}
	public void setUserIsOnline(boolean userIsOnline) {
		this.userIsOnline = userIsOnline;
	}
	
	public CategorieBean getCategorieBean() {
		return categorieBean;
	}
	public void setCategorieBean(CategorieBean categorieBean) {
		this.categorieBean = categorieBean;
	}
	
	public ProductBean getProductBean() {
		return productBean;
	}
	public void setProductBean(ProductBean productBean) {
		this.productBean = productBean;
	}

	
}
