/****************************************************/
/* @Author 		: heiko lauer                       */
/* @Date        : 2017.02.10                        */
/* @Description : DAO for User                      */
/* @Scope		: No Bean                           */            
/****************************************************/

package com.pinhost.app.webshopxxl2.facade;


import com.pinhost.app.webshopxxl2.util.Util;
import com.pinhost.common.webshopxxl2.dbconnect.DBCostumerConnect;
import com.pinhost.common.webshopxxl2.to.CostumerTO;


public class CostumerFacade extends Util {
	
	
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

		CostumerTO userTO = new DBCostumerConnect().readCostumerForLogin(loginname, password);
		
		if(userTO != null){
			getCostumerBean().setUser(userTO);
			return true;
		}
		
		return false;
	}

}
