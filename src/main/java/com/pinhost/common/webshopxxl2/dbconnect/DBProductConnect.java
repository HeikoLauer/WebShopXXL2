package com.pinhost.common.webshopxxl2.dbconnect;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.pinhost.common.webshopxxl2.to.ProductTO;

public class DBProductConnect extends DataBase{
	
	public static String TABLE = "products";
	public static String TABLE_CATEGORIE = "categorie";
	
	/*** Table Columns *******************/
	public static String ID = "ID";
	public static String ID_CATEGORIE = "ID_CATEGORIE";
	public static String NAME = "name";
	public static String ICON_NAME = "icon_name";
	
	/***
	 * @author heiko
	 * @param username
	 * @param password
	 */
	public List<ProductTO> readAllProductsForCategorie(String categorie_id) {
		
		List<ProductTO> retList = new ArrayList<ProductTO>();
		
		try {

			String readSQl = "SELECT * FROM " 
					+ TABLE + " WHERE " 
					+ ID_CATEGORIE + " = '" + categorie_id + "'" ;
			
			ResultSet res = getResult(readSQl);

			ProductTO productTO = null;
		
			while(res.next()){

				productTO = new ProductTO();
				
				productTO.setId(res.getString(ID));
				productTO.setId_categorie(res.getString(ID_CATEGORIE));
				productTO.setName(res.getString(NAME));
				productTO.setIcon_name(res.getString(ICON_NAME));
			
				retList.add(productTO);
			}
		
		} catch (SQLException e) {
			System.out.println("\n\n ----------------------------------------------------"
					+ "\n  DBProductConnect 55 : readAllProductsForCategorie : " + e.toString());
		}
		
		return retList;
	}
	
}
