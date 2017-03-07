/******************************************************************/
/* @Author 		: heiko lauer                                     */
/* @Date        : 2017.02.16                                      */
/* @LastDate    : 2017.03.01                                      */
/* @Description : Bean for the Navigation                         */
/* @Scope		: Session                                         */   
/* xhtml        : pages/artikelGroup.xhtml                        */
/******************************************************************/

package com.pinhost.app.webshopxxl2.beans;

import javax.faces.event.ActionEvent;

import com.pinhost.app.webshopxxl2.util.Util;

public class NavigationBean extends Util
{
	
	/** Static String for each Page **********************/
	private String header_page = "../template/header.xhtml";
	private String error_page = "../template/error.xhtml";
	private String footer_page = "../template/footer.xhtml";
	private String content_page = "../pages/login.xhtml";
	
	// Statics for the Content Pages
	private String CONTENT_LOGIN_PAGE = "../pages/login.xhtml";

	/** Static Strings for each CONTENT Page  ***************/
	private String CONTENT_ARTICELTYP_PAGE = "../pages/artikelTyp.xhtml";
	private String CONTENT_ARTICELGROUP_PAGE = "../pages/artikelGroup.xhtml";
	private String CONTENT_WAREHOUSE_PAGE = "../pages/warehouse.xhtml";
	private String CONTENT_COSTUMER_ACCOUNT_PAGE = "../pages/costumer_account.xhtml";
	
	private String CONTENT_CUSTOMER_INVALID_PAGE = "../pages/subPages/customer_invalid.xhtml";
	
	/***
	 * @author heiko
	 * 
	 * <br> Init the Navigation 
	 * <br> and set the Login Page as actual Content Page
	 */
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
	
	/*** Getter for the set Content Pages *************/
	
	public String getCONTENT_LOGIN_PAGE() {
		return CONTENT_LOGIN_PAGE;
	}
	
	public String getCONTENT_ARTICELGROUP_PAGE() {
		return CONTENT_ARTICELGROUP_PAGE;
	}

	public String getCONTENT_ARTICELTYP_PAGE() {
		return CONTENT_ARTICELTYP_PAGE;
	}

	public String getCONTENT_WAREHOUSE_PAGE() {
		return CONTENT_WAREHOUSE_PAGE;
	}

	public String getCONTENT_COSTUMER_ACCOUNT_PAGE() {
		return CONTENT_COSTUMER_ACCOUNT_PAGE;
	}
	
	public String getCONTENT_CUSTOMER_INVALID_PAGE() {
		return CONTENT_CUSTOMER_INVALID_PAGE;
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
			return "display_on";
		} else {
			return "display_off";
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
	
	/***
	 * @author heiko
	 * <br> set the actual Content Page
	 * <br> from the differented xhtml pages comes a parameter
	 * <br> the Value of the Paraneter ist the Name of the next content Page
	 * @param ActionEvent
	 */
	public void switchContentPage(ActionEvent event){
		String content_page  = (String) event.getComponent().getAttributes().get("content_page");
		setContent_page(content_page);
	}
	
	/**
	 * @author heiko
	 * <br> When logoff then
	 * <br> 1. clear the User
	 * <br> 2. set the boolean user is online  to false
	 * <br> 3. set the content Page to login Page
	 * <br>
	 */
	public String logoff(){
	
		getWarehouseBean().resetWarehouse();

		getCostumerBean().clearUser();
		getSessionBean().setUserIsOnline(false);
 		setContent_page(getCONTENT_LOGIN_PAGE());
		getMessageBean().setLoginStartState();

		return "#";
	}
}
