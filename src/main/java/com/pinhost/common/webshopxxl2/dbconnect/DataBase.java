package com.pinhost.common.webshopxxl2.dbconnect;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class DataBase {
	
	private  Connection conectionCON;
	
	/****
	 * @author heiko
	 * 
	 * <br> Create a Connection to Database
	 * 
	 * @throws SQLException 
	 * @throws IOException 
	 * @throws InterruptedException 
	 */
	private void createConnection() {

		try{
			Class.forName("org.apache.derby.jdbc.ClientDriver");
			conectionCON = DriverManager.getConnection("jdbc:derby://localhost:1527/webshopXXL; create=true");
		} catch (ClassNotFoundException e2) {
			System.out.println("    Error --> SQL  CLASS : " + "  " + e2.toString());
		} catch (SQLException e) {
			System.out.println("    Error --> SQL  SQLException : " + "  " + e.toString());
		} 
	}
	
	/***
	 * @author heiko
	 * @return
	 */
	private Connection getConnection(){

		if(conectionCON == null){
			createConnection();
		}
		return conectionCON;
	}

	/****
	 * @author heiko
	 * @param readSQL
	 * @return
	 */
	public ResultSet getResult(String readSQL, boolean print){

		if(print){
			System.out.println("\n  ->  Database : getResult : 78 : SQL : " + readSQL);
		}
		
		ResultSet resultSet = null;

		try {
			PreparedStatement statement = getConnection().prepareStatement(readSQL);
			resultSet = statement.executeQuery();
			
		} catch (SQLException e) {
			System.out.println("   ---> getResultset : " + e.getMessage());
		}
		
		return resultSet;
	}
}
