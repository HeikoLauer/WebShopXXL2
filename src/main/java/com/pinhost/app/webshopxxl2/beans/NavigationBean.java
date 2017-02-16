
package com.pinhost.app.webshopxxl2.beans;

import com.pinhost.app.webshopxxl2.util.Util;

public class NavigationBean extends Util
{
	
	protected SessionBean getSessionBean() { return (SessionBean) getBean("sessionBean"); }
	protected UserBean getUserBean() { return (UserBean) getBean("userBean"); }
	protected MessageBean getMessageBean() { return (MessageBean) getBean("messageBean"); }

	private String header_page = "../template/header.xhtml";
	private String error_page = "../template/error.xhtml";
	private String footer_page = "../template/footer.xhtml";
	private String content_page = "../pages/login.xhtml";
	
	// Statics for the Content Pages
	private String CONTENT_LOGIN_PAGE = "../pages/login.xhtml";
	private String CONTENT_CATEGORIE_PAGE = "../pages/categorie.xhtml";
	private String CONTENT_PRODUCT_PAGE = "../pages/product.xhtml";
	
	
	public NavigationBean(){
		content_page = CONTENT_LOGIN_PAGE;
	}
	
	/*** getter for the Pages ***************************/
	
	public String getHeader_page() {
		return header_page;
	}
	public void setHeader_page(String header_page) {
		this.header_page = header_page;
	}
	
	public String getError_page() {
		return error_page;
	}
	public void setError_page(String error_page) {
		this.error_page = error_page;
	}
	
	public String getContent_page() {
		return content_page;
	}
	
	public void setContent_page(String content_page) {
		this.content_page = content_page;
	}
	
	public String getFooter_page() {
		return footer_page;
	}
	
	public void setFooter_page(String footer_page) {
		this.footer_page = footer_page;
	}
	
	/*** Getter for the Content Pages *************/
	
	public String getCONTENT_LOGIN_PAGE() {
		return CONTENT_LOGIN_PAGE;
	}
	public String getCONTENT_CATEGORIE_PAGE() {
		return CONTENT_CATEGORIE_PAGE;
	}
	
	public String getCONTENT_PRODUCT_PAGE() {
		return CONTENT_PRODUCT_PAGE;
	}
	
	/**
	 * @author heiko
	 * <br> get the User login state from SessionBean
	 * <br> if the user is online return the css class to show the Menubar
	 * <br> Otherwise return the css Class to hide the Menubar
	 * @return true when user in online, otherwise false
	 */
	public String getMenuBarClass(){
		
		if(getSessionBean().isUserIsOnline()){
			return "topnav display_on";
		} else {
			return "topnav display_off";
		}
	}

	/***
	 * @author heiko
	 * @return true when user is online
	 */
	public boolean isShowLogoff(){
		return getSessionBean().isUserIsOnline();
	}
	
	/******** Action Methods *************************************/
	
	/**
	 * @author heiko
	 * <br> When logoff then
	 * <br> 1. clear the User
	 * <br> 2. set the boolean user is online  to false
	 * <br> 3. set the content Page to login Page
	 * <br>
	 */
	public String logoff(){
		
		getUserBean().clearUser();
		getSessionBean().setUserIsOnline(false);
 		setContent_page(getCONTENT_LOGIN_PAGE());
		getMessageBean().setLoginStartState();

		return "#";
	}
}
