package com.pinhost.common.webshopxxl2.dbconnect;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.pinhost.common.webshopxxl2.to.UserTO;

public class DBUserConnect extends DataBase{
	
	public static String TABLE = "users";
	
	/*** Table Columns *******************/
	public static String LOGINNAME = "loginname";
	public static String PASSWORD = "password";
	public static String FIRSTNAME = "firstname";
	public static String LASTNAME = "lastname";
	public static String AMMOUNT = "ammount";
	
	/***
	 * @author heiko
	 * @param username
	 * @param password
	 */
	public UserTO readUserForLogin(String loginname, String password) {

		UserTO userTO = null;
		
		try {

			String readSQl = "SELECT * FROM " + TABLE +" WHERE " 
					+ LOGINNAME + " = '" + loginname 
					+ "' AND " + PASSWORD + " = '" + password + "'";
			
			ResultSet res = getResult(readSQl);
		
			if(res.next()){

				userTO = new UserTO();
				
				userTO.setFirstName(res.getString(FIRSTNAME));
				userTO.setLastName(res.getString(LASTNAME));
				userTO.setLoginName(res.getString(LOGINNAME));
				userTO.setPassword(res.getString(PASSWORD));
				userTO.setAmmount(res.getFloat(AMMOUNT));
			}
		
		} catch (SQLException e) {
			System.out.println("\n\n ----------------------------------------------------"
					+ "\n  DBUserConnect 48 : readUserForLogin : " + e.toString());
		}
		
		return userTO;
	}
	
	
}
