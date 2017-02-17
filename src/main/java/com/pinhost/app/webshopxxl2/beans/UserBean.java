package com.pinhost.app.webshopxxl2.beans;

import com.pinhost.common.webshopxxl2.to.UserTO;

public class UserBean {
	
	private String loginName;
	private String password;
	private String firstName;
	private String lastName;
	
	private float ammount;

	/*** Getter and Setter ***/

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public float getAmmount() {
		return ammount;
	}

	public void setAmmount(float ammount) {
		this.ammount = ammount;
	}
	
	/*** Action Methoden *******/

	public void setUser(UserTO userTO){
		
		setLoginName(userTO.getLoginName());
		setPassword(userTO.getPassword());
		setFirstName(userTO.getFirstName());
		setLastName(userTO.getLastName());
		setAmmount(userTO.getAmmount());
	}
	
	/***
	 * @author heiko
	 */
	public void clearUser(){
		loginName="";
		password="";
		firstName="";
		lastName="";
		ammount=0;
	}
	
}
