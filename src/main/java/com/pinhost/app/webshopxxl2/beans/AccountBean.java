/****************************************************/
/* @Author 		: heiko lauer                       */
/* @Date        : 2017.02.22                        */
/* @Last Change : 2017.02.28                        */
/* @Description : Bean for the Account Data         */
/*                In the right corner in the Info   */
/* 				  row is the Warehouse Icon.		*/
/*                For this Action is this Bean      */
/* @Scope		: Session                           */            
/****************************************************/
 

package com.pinhost.app.webshopxxl2.beans;


import com.pinhost.app.webshopxxl2.util.Util;

public class AccountBean extends Util {

	/***** Getter and Setter *****************************/
	
	
	/***
	 * @author heiko
	 * <br> Show or not the Account Snippet
	 * <br> In depending from the Userstate
	 * <br> Show the Snippet when user in online 
	 * <br> Therefore set display : table
	 * <br> Otherwise set desplay : none
	 * @return
	 */
	public String getAccountCSSMain(){
		
		if(getSessionBean().isUserIsOnline()){
			return "acountpanel_main_on"; 
		}
		else{
			return "acountpanel_main_off"; 
		}
	}

}
