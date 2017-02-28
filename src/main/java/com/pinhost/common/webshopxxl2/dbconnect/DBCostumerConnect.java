package com.pinhost.common.webshopxxl2.dbconnect;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.pinhost.common.webshopxxl2.to.CostumerTO;

public class DBCostumerConnect extends DataBase{
	
	public static String TABLE = "costumer";
	
	/*** Table Columns *******************/
	public static String loginname = "loginname";
	public static String password = "password";

	public static String creditLimit = "creditLimit"; 	
	public static String reachedCreditLimit = "reachedCreditLimit"; 
	
	public static  String filial_Name = "filial_Name";
	public static  String filial_street = "filial_street";
	public static  String filial_number = "filial_number";
	public static  String filial_postcode = "filial_postcode";
	public static  String filial_place = "filial_place";
	public static  String filial_phone = "filial_phone";
	public static  String filial_fax = "filial_fax";
	public static  String filial_mobil = "filial_mobil";
	public static  String filial_mail = "filial_mail";
	public static  String filial_position = "filial_position";

	public static  String fi_contact_titel = "fi_contact_titel";
	public static  String fi_contact_name = "fi_contact_name";  
	public static  String fi_contact_street = "fi_contact_street";
	public static  String fi_contact_number = "fi_contact_number";
	public static  String fi_contact_postcode = "fi_contact_postcode";
	public static  String fi_contact_place = "fi_contact_place";
	public static  String fi_contact_phone = "fi_contact_phone";
	public static  String fi_contact_fax = "fi_contact_fax";
	public static  String fi_contact_mobil = "fi_contact_mobil";
	public static  String fi_contact_mail = "fi_contact_mail";
	public static  String fi_contact_position = "fi_contact_position"; 
	
	/***
	 * @author heiko
	 * @param username
	 * @param password
	 */
	public CostumerTO readCostumerForLogin(String loginname_in, String password_in) {

		CostumerTO userTO = null;
		
		try {

			String readSQl = "SELECT * FROM " + TABLE +" WHERE " 
					+ loginname + " = '" + loginname_in 
					+ "' AND " + password + " = '" + password_in + "'";
			
			System.out.println("\n\n DBUserConnect : 57 : Read : " + readSQl);
			
			ResultSet res = getResult(readSQl, true);
		
			if(res.next()){

				userTO = new CostumerTO();
				
				userTO.setLoginName(res.getString(loginname));
				userTO.setPassword(res.getString(password));
				
				userTO.setCreditLimit(res.getLong(creditLimit)); 
				userTO.setFi_contact_fax(res.getString(fi_contact_fax));
				
				userTO.setFi_contact_mail(res.getString(fi_contact_mail));
				userTO.setFi_contact_mobil(res.getString(fi_contact_mobil));
				userTO.setFi_contact_name(res.getString(fi_contact_name));
				userTO.setFi_contact_number(res.getString(fi_contact_number));
				userTO.setFi_contact_phone(res.getString(fi_contact_phone));
				userTO.setFi_contact_place(res.getString(fi_contact_place));
				userTO.setFi_contact_position(res.getString(fi_contact_position));
				userTO.setFi_contact_postcode(res.getString(fi_contact_postcode));
				userTO.setFi_contact_street(res.getString(fi_contact_street));
				userTO.setFi_contact_titel(res.getString(fi_contact_titel));
				
				userTO.setFilial_fax(res.getString(filial_fax));
				userTO.setFilial_mail(res.getString(filial_mail));
				userTO.setFilial_mobil(res.getString(filial_mobil));
				userTO.setFilial_Name(res.getString(filial_Name));
				userTO.setFilial_number(res.getString(filial_number));
				userTO.setFilial_phone(res.getString(filial_phone));
				userTO.setFilial_place(res.getString(filial_place));
				userTO.setFilial_position(res.getString(filial_position));
				userTO.setFilial_postcode(res.getString(filial_postcode));
				userTO.setFilial_street(res.getString(filial_street));
						
			}
		
		} catch (SQLException e) {
			System.out.println("\n\n ----------------------------------------------------"
					+ "\n  DBCostumerConnect 95 : readCostumerForLogin : " + e.toString());
		}
		
		return userTO;
	}
	
	
}
