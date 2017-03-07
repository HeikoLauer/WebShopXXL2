/***************************************************************/
/* @Author 		: heiko lauer                                  */
/* @Date        : 2017.02.10                                   */
/* @Description : DAO for User                                 */
/* @Scope		: No Bean is a Facade                          */            
/***************************************************************/

package com.pinhost.app.webshopxxl2.facade;


import com.pinhost.app.webshopxxl2.util.Util;
import com.pinhost.common.webshopxxl2.dbconnect.DBCustomerConnect;
import com.pinhost.common.webshopxxl2.to.CostumerTO;


public class CustomerFacade extends Util {
	
	/***
	 * @author heiko
	 * <br> Is the Customer exist
	 * @param loginname
	 * @return
	 */
	public static boolean isCustomerExist(String loginname) {
		return new DBCustomerConnect().isCustomerExist(loginname);
	}
	
	/**
	 * @author heiko
	 * 
	 * <br> Request a CostumerTO from CostumerDAO 
	 * <br> with the given loginname and password
	 * <br> Transfer the TO to a CostumerBean
	 * 
	 * @param name
	 * @param password
	 * 
	 * @return UserTO
	 */
	public static boolean getUserForLogin(String loginname, String password){
		
		CostumerTO userTO = new DBCustomerConnect().readCostumerForLogin(loginname, password);
			
		if(userTO != null){
			getCostumerBean().setUser(userTO);
			return true;
		}
		
		return false;
	}

}
