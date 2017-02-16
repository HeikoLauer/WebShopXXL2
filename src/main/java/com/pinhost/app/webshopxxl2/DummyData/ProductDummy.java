package com.pinhost.app.webshopxxl2.DummyData;

import java.util.HashMap;

public class ProductDummy {

	// Dummy Data for Test
	private  static HashMap<String, String> productMap = new HashMap<String, String>();
	
	/***
	 * @author heiko
	 * <br> Read Products for a Chossen Categorie
	 * @param cat_id
	 * @return HashMap with Key = 'Produkt'+counter
	 */
	public static HashMap<String, String> readProduct(String cat_id){

		for(int i=1; i<11; i++){
			productMap.put("Produkt "+i, cat_id+"_produkt"+i);
		}
		
		return productMap;
	}

}
