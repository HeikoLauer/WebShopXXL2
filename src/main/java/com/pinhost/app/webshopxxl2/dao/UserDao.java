package com.pinhost.app.webshopxxl2.dao;

import com.pinhost.common.webshopxxl2.dbconnect.DBUserConnect;
import com.pinhost.common.webshopxxl2.to.UserTO;


public class UserDao {
	
	/**
	 * @author heiko
	 * 
	 * <br> Get a UserTO from UserDAO with the given loginname and password
	 * 
	 * @param name
	 * @param password
	 * @return UserTO
	 */
	public static UserTO getUserForLogin(String loginname, String password){
		return new DBUserConnect().readUserForLogin(loginname, password);
	}
}
