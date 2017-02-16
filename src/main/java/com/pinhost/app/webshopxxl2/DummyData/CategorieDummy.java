package com.pinhost.app.webshopxxl2.DummyData;

import java.util.HashMap;

public class CategorieDummy {

	// Dummy Data for Test
	private  static HashMap<String, String> categorieMap = new HashMap<String, String>();

	public static HashMap<String, String> readCategorie(){

		for(int i=1; i<11; i++){
			categorieMap.put("Kategorie"+i, "cat"+i);
		}
		
		return categorieMap;
	}

}
