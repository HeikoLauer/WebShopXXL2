package com.pinhost.app.webshopxxl2.beans;


public class SessionBean {

	private boolean userIsOnline = false;
	private String categorie_id;
	private String product_id;
	
	
	/****  Getter and setter ****/
	
	public boolean isUserIsOnline() {
		return userIsOnline;
	}
	public void setUserIsOnline(boolean userIsOnline) {
		this.userIsOnline = userIsOnline;
	}

	public String getCategorie_id() {
		return categorie_id;
	}
	public void setCategorie_id(String categorie_id) {
		this.categorie_id = categorie_id;
	}

	public String getProduct_id() {
		return product_id;
	}
	
	public void setProduct_id(String product_id) {
		this.product_id = product_id;
	}

	
	
}
