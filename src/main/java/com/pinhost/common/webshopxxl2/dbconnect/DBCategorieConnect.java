package com.pinhost.common.webshopxxl2.dbconnect;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.pinhost.common.webshopxxl2.to.CategorieTO;

public class DBCategorieConnect extends DataBase{
	
	public static String TABLE = "categorie";
	
	/*** Table Columns *******************/
	public static String ID = "ID";
	public static String NAME = "name";
	public static String ICON_NAME = "icon_name";
	
	/***
	 * @author heiko
	 * @param username
	 * @param password
	 */
	public CategorieTO readAllCateggorie() {

		CategorieTO categorieTO = null;
		
		try {

			String readSQl = "SELECT * FROM " + TABLE;
			
			ResultSet res = getResult(readSQl);
		
			if(res.next()){

				categorieTO = new CategorieTO();
				
				categorieTO.setId(res.getString(ID));
				categorieTO.setName(res.getString(NAME));
				categorieTO.setIcon_name(res.getString(ICON_NAME));
			}
		
		} catch (SQLException e) {
			System.out.println("\n\n ----------------------------------------------------"
					+ "\n  DBUserConnect 48 : readUserForLogin : " + e.toString());
		}
		
		return categorieTO;
	}
	
	
}
