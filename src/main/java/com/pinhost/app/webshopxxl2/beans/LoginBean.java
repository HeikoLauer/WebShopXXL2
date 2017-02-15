package com.pinhost.app.webshopxxl2.beans;

import com.pinhost.app.webshopxxl2.dao.UserDao;
import com.pinhost.app.webshopxxl2.to.UserTO;
import com.pinhost.app.webshopxxl2.util.Util;

public class LoginBean extends Util{
	
	/** The injected Beans ****/
	
	protected NavigationBean getNavigationBean() { return (NavigationBean) getBean("navigationBean"); }
	protected SessionBean getSessionBean() { return (SessionBean) getBean("sessionBean"); }
	protected UserBean getUserBean() { return (UserBean) getBean("userBean"); }
	protected MessageBean getMessageBean() { return (MessageBean) getBean("messageBean"); }
	
	/** Private Objects **/	
	private String loginName="";
	private String password="";
		
	
	/** Public Methods **/
	
	public String getLoginName() {
		return loginName;
	}
	
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	/***** Action Methoden **************/
	
	/***
	 * @author heiko
	 * 
	 * <br> Get a UserTO from UserDao
	 * <br> if UserTO not null, ( user is found )
	 * <br> transfer this Object to the UserBean
	 * <br> set the userIsOnline flag to true
	 * <br> set the new content Page to categorie.xhtml
	 * <br> set a new Message for a successful Login
	 * <br> if the UserTO Object is null
	 * <br> set a error Message 
	 * 
	 * @return "#" for the actionCommand Button
	 */
	public String login(){
		
		UserTO userTO = UserDao.isUserLoginOk(loginName, password);
		
		if(userTO != null){
			getUserBean().setUser(userTO);
			getSessionBean().setUserIsOnline(true);
			getNavigationBean().setContent_page(getNavigationBean().getCONTENT_CATEGORIE_PAGE());
			getMessageBean().setLoginCorrectState(userTO.getFirstName(), userTO.getLastName());
		} else {
			getMessageBean().setLoginWrongState();
		}
		
		return "#";
	}
}
