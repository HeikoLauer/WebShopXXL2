/****************************************************/
/* @Author 		: heiko lauer                       */
/* @Date        : 2017.02.10                        */
/* @Description : DAO for User                      */
/* @Scope		: No Bean                           */            
/****************************************************/

package com.pinhost.app.webshopxxl2.dao;


import com.pinhost.app.webshopxxl2.util.Util;
import com.pinhost.common.webshopxxl2.dbconnect.DBUserConnect;
import com.pinhost.common.webshopxxl2.to.UserTO;


public class UserDao extends Util {
	
	
	/**
	 * @author heiko
	 * 
	 * <br> Get a UserTO from UserDAO with the given loginname and password
	 * 
	 * @param name
	 * @param password
	 * @return UserTO
	 */
	public static boolean getUserForLogin(String loginname, String password){

		UserTO userTO = new DBUserConnect().readUserForLogin(loginname, password);
		
		if(userTO != null){
			getUserBean().setUser(userTO);
			return true;
		}
		
		return false;
	}

}
