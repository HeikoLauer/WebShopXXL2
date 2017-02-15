package com.pinhost.app.webshopxxl2.DummyData;

import java.util.HashMap;

public class UserDummy {

	// Dummy Data for Test
	private  static HashMap<String, String> namesAndPasswordMap = new HashMap<String, String>();
	private static HashMap<String, HashMap<String,String>> dataMap = new HashMap<String, HashMap<String,String>>();
	
	
	public static HashMap<String, String> readUser(String name, String password){
		
		init();
		
		if(namesAndPasswordMap.containsKey(name)){
			
			if(namesAndPasswordMap.get(name).equals(password)){
				return dataMap.get(name);
			}
		}
		
		return null;
	}
	
	/***
	 * @author heiko
	 */
	private static void init(){
		
		
		namesAndPasswordMap.put("heiko", "lauer");
		namesAndPasswordMap.put("verena", "milz");
		
		HashMap<String, String> innerMap  = new HashMap<String, String>();
		innerMap.put("loginName", "heiko");
		innerMap.put("password", "lauer");
		innerMap.put("firstName", "Heiko");
		innerMap.put("lastName", "Lauer");
		innerMap.put("ammout", "1000");
		
		dataMap.put("heiko", innerMap);
		
		innerMap  = new HashMap<String, String>();
		innerMap.put("loginName", "verena");
		innerMap.put("password", "milz");
		innerMap.put("firstName", "Verena");
		innerMap.put("lastName", "Milz");
		innerMap.put("ammout", "2000");
		
		dataMap.put("verena", innerMap);
		
	}
}
