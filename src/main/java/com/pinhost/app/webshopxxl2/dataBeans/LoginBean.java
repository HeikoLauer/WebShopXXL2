/*************************************************************/
/* @Author 		: heiko lauer                                */
/* @Date        : 2017.02.16                                 */
/* @Description : Bean for Login Page                        */
/* @Scope		: Request                                    */
/* xhtml        : pages/login.xht                            */
/*************************************************************/

package com.pinhost.app.webshopxxl2.dataBeans;

import com.pinhost.app.webshopxxl2.facade.CostumerFacade;
import com.pinhost.app.webshopxxl2.util.Util;

public class LoginBean extends Util{
	
	
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
		
		// TODO Custiomer Startseite eintragen
		
		if(CostumerFacade.getUserForLogin(loginName, password)){

			getWarehouseBean().resetWarehouse();

			getSessionBean().setUserIsOnline(true);
			getNavigationBean().setContent_page(getNavigationBean().getCONTENT_ARTICELGROUP_PAGE());
			getMessageBean().setLoginCorrectState(getCostumerBean().getFi_contact_name());
		} else {
			getMessageBean().setLoginWrongState();
		}
		
		return "#";
	}
}
