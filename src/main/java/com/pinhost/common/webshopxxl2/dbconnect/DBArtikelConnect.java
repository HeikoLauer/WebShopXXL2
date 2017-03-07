/*******************************************************************/
/* @Author 		: heiko lauer                                      */
/* @Date        : 2017.02.16                                       */
/* @Last Change : 2017.02.22                                       */
/* @Description : DBConnect for all Artikel Data                   */
/*                ArtikelTypCategorie, ArtikelTypGroup, ArtikelTyp */
/*******************************************************************/


package com.pinhost.common.webshopxxl2.dbconnect;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.pinhost.common.webshopxxl2.to.ArticelTypTO;
import com.pinhost.common.webshopxxl2.to.ArtikelTypCategorieTO;
import com.pinhost.common.webshopxxl2.to.ArtikelTypGroupTO;


public class DBArtikelConnect extends DataBase{

	/*** Table Columns *******************/
	public static String TABLE_ARTIKELTYPCATEGORIE = "artikelTypCategorie";
	public static String TABLE_ARTIKELTYPGROUP = "artikelTypGroup";
	public static String TABLE_ARTIKELTYP = "artikeltyp";

	/*** ID *****************************/
	public static String ID = "ID";
	public static String ARTIKELTYPGROUP_ID = "ARTIKELTYPGROUP_ID";
	public static String ARTIKELTYPCATEGORIE_ID = "artikeltypcategorie_id";

	/*** Columns Names ******************/
	public static String NAME = "name";
	public static String IMAGE = "image";

	public static String CURRENCY = "currency"; 
	public static String MAXQUANTITY = "maxquantity"; 

	public static String PRICE_VALUE = "price_value"; 

	public static String ISPAYMENTCARD = "ispaymentcard";
	public static String ISPINPRINT = "ispinprint";
	public static String ISDIRECTLOAD = "isdirectload";
	
	/***
	 * @author heiko
	 * <br> Read all ArtikelTypCategorieTO from Database
	 * 
	 * @param none
	 * @return List of ArtikelTypCategorieTO
	 */
	public List<ArtikelTypCategorieTO> readAllArticelTypCategorie() {
		
		List<ArtikelTypCategorieTO> retList = new ArrayList<ArtikelTypCategorieTO>();
		
		try {

			String readSQl = "SELECT * FROM " + TABLE_ARTIKELTYPCATEGORIE;
			
			ResultSet res = getResult(readSQl, true);

			ArtikelTypCategorieTO articelTypKategorieTO = null;
		
			while(res.next()){

				articelTypKategorieTO = new ArtikelTypCategorieTO();
				
				articelTypKategorieTO.setId(res.getLong(ID));
				articelTypKategorieTO.setName(res.getString(NAME));
							
				retList.add(articelTypKategorieTO);
			}
		
		} catch (SQLException e) {
			System.out.println("\n\n ----------------------------------------------------"
					+ "\n  DBArticelConnect 68 : readAllArticelTypKategorieTO : " + e.toString());
		}
		
		return retList;
	}


	/***
	 * @author heiko
	 * <br> Read ArtikelTypGroup from Database
	 * <br> Select ArtikelTypGroup for given long artikelTypCategorie_id
	 *   
	 * @param long artikelTypCategorie_id
	 * @return List of ArtikelTypGroupTO
	 */
	public List<ArtikelTypGroupTO> readAllArticelTypGroupForId(long artikelTypCategorie_id) {
		
		List<ArtikelTypGroupTO> retList = new ArrayList<ArtikelTypGroupTO>();
		
		try {

			String readSQl = "SELECT * FROM " 
					+ TABLE_ARTIKELTYPGROUP 
					+ " WHERE " 
					+ ARTIKELTYPCATEGORIE_ID + " = " + artikelTypCategorie_id;
			
			ResultSet res = getResult(readSQl, true);

			ArtikelTypGroupTO articelTypGroupTO = null;
			
			while(res.next()){

				articelTypGroupTO = new ArtikelTypGroupTO();
				
				articelTypGroupTO.setId(res.getLong(ID));
				articelTypGroupTO.setArtikelTypCategorie_id(artikelTypCategorie_id);
				articelTypGroupTO.setName(res.getString(NAME));
				articelTypGroupTO.setImage(res.getString(IMAGE));
				articelTypGroupTO.setDirectLoad(res.getBoolean(ISDIRECTLOAD));
				articelTypGroupTO.setPinprinting(res.getBoolean(ISPINPRINT));
				articelTypGroupTO.setPaymentCard(res.getBoolean(ISPAYMENTCARD));
				
				retList.add(articelTypGroupTO);
			}
		
		} catch (SQLException e) {
			System.out.println("\n\n ----------------------------------------------------"
					+ "\n  DBArticelConnect 50 : readAllArticelTypKategorieTO : " + e.toString());
		}
		
		return retList;
	}
		



		
	/***
	 * @author heiko
	 * <br> Read all ArtikelTypTO from Database
	 * @param username
	 * @param password
	 */
	public List<ArticelTypTO> readAllArtikelTypForArtikelGroup(Long artikelTypGroup_id) {
		
		List<ArticelTypTO> retList = new ArrayList<ArticelTypTO>();
		
		try {

			String readSQl = "SELECT * FROM " 
					+ TABLE_ARTIKELTYP + " WHERE " 
					+ ARTIKELTYPGROUP_ID + " = " + artikelTypGroup_id + "" ;
			
			ResultSet res = getResult(readSQl, true);

			ArticelTypTO artikelTypTO = null;
		
			while(res.next()){

				artikelTypTO = new ArticelTypTO();
				
				artikelTypTO.setId(res.getLong(ID));
				artikelTypTO.setArtikelGroup_id(artikelTypGroup_id);
				artikelTypTO.setCurrency(res.getString(CURRENCY));
				artikelTypTO.setImage(res.getString(IMAGE));
				artikelTypTO.setMaxQuantity(res.getLong(MAXQUANTITY));
				artikelTypTO.setName(res.getString(NAME));
				artikelTypTO.setValue(res.getLong(PRICE_VALUE));
				
				retList.add(artikelTypTO);
			}
		
		} catch (SQLException e) {
			System.out.println("\n\n ----------------------------------------------------"
					+ "\n  DBArtikelConnect 55 : readAllProductsForCategorie : " + e.toString());
		}
		
		return retList;
	}

}
