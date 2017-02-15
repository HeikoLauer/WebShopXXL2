package com.pinhost.app.webshopxxl2.dao;


import java.util.HashMap;

import com.pinhost.app.webshopxxl2.DummyData.UserDummy;
import com.pinhost.app.webshopxxl2.beans.UserBean;
import com.pinhost.app.webshopxxl2.to.UserTO;

public class UserDao {
	
	/**
	 * @author heiko
	 * @param name
	 * @param password
	 * @return
	 */
	public static UserTO isUserLoginOk(String name, String password){
		
		UserTO retObject = null;

		//TODO : Here read the LoginData from DataBase
		
		HashMap<String, String> result = UserDummy.readUser(name, password);
		if(result != null ){
			
			retObject = new UserTO();
			
			retObject.setLoginName(result.get("loginName"));
			retObject.setPassword(result.get("password"));
			retObject.setFirstName(result.get("firstName"));
			retObject.setLastName(result.get("lastName"));
			retObject.setAmmount(Float.valueOf(result.get("ammout")));
		}
		
		// User Login Data are incorrect
		return retObject;
	}
}
