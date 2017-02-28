/****************************************************/
/* @Author 		: heiko lauer                       */
/* @Date        : 2017.02.16                        */
/* @Last Change : 2017.02.22                        */
/* @Description : Bean for the Costumer             */
/* @Scope		: Session                           */            
/****************************************************/

package com.pinhost.app.webshopxxl2.dataBeans;

import com.pinhost.common.webshopxxl2.to.CostumerTO;

public class CostumerBean {
	
	private long id;
	
	private String loginName;
	private String password;
	
	private Long creditLimit; 	
	private Long reachedCreditLimit; 
	
	/** Filial Adresse ****/
	private String filial_Name;
	private String filial_street;
	private String filial_number;
	private String filial_postcode;
	private String filial_place;
	private String filial_phone;
	private String filial_fax;
	private String filial_mobil;
	private String filial_mail;
	private String filial_position;

	/** Anprech Partner ***/
	
	private String fi_contact_titel;
	private String fi_contact_name;  // first and lastname
	private String fi_contact_street;
	private String fi_contact_number;
	private String fi_contact_postcode;
	private String fi_contact_place;
	private String fi_contact_phone;
	private String fi_contact_fax;
	private String fi_contact_mobil;
	private String fi_contact_mail;
	private String fi_contact_position; // Show only when is not empty
	
	/*** Getter and Setter ***/

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

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

	public Long getCreditLimit() {
		return creditLimit;
	}

	public void setCreditLimit(Long creditLimit) {
		this.creditLimit = creditLimit;
	}

	public Long getReachedCreditLimit() {
		return reachedCreditLimit;
	}

	public void setReachedCreditLimit(Long reachedCreditLimit) {
		this.reachedCreditLimit = reachedCreditLimit;
	}

	public String getFilial_Name() {
		return filial_Name;
	}

	public void setFilial_Name(String filial_Name) {
		this.filial_Name = filial_Name;
	}

	public String getFilial_street() {
		return filial_street;
	}

	public void setFilial_street(String filial_street) {
		this.filial_street = filial_street;
	}

	public String getFilial_number() {
		return filial_number;
	}

	public void setFilial_number(String filial_number) {
		this.filial_number = filial_number;
	}

	public String getFilial_postcode() {
		return filial_postcode;
	}

	public void setFilial_postcode(String filial_postcode) {
		this.filial_postcode = filial_postcode;
	}

	public String getFilial_place() {
		return filial_place;
	}

	public void setFilial_place(String filial_place) {
		this.filial_place = filial_place;
	}

	public String getFilial_phone() {
		return filial_phone;
	}

	public void setFilial_phone(String filial_phone) {
		this.filial_phone = filial_phone;
	}

	public String getFilial_fax() {
		return filial_fax;
	}

	public void setFilial_fax(String filial_fax) {
		this.filial_fax = filial_fax;
	}

	public String getFilial_mobil() {
		return filial_mobil;
	}

	public void setFilial_mobil(String filial_mobil) {
		this.filial_mobil = filial_mobil;
	}

	public String getFilial_mail() {
		return filial_mail;
	}

	public void setFilial_mail(String filial_mail) {
		this.filial_mail = filial_mail;
	}

	public String getFilial_position() {
		return filial_position;
	}

	public void setFilial_position(String filial_position) {
		this.filial_position = filial_position;
	}

	public String getFi_contact_titel() {
		return fi_contact_titel;
	}

	public void setFi_contact_titel(String fi_contact_titel) {
		this.fi_contact_titel = fi_contact_titel;
	}

	public String getFi_contact_name() {
		return fi_contact_name;
	}

	public void setFi_contact_name(String fi_contact_name) {
		this.fi_contact_name = fi_contact_name;
	}

	public String getFi_contact_street() {
		return fi_contact_street;
	}

	public void setFi_contact_street(String fi_contact_street) {
		this.fi_contact_street = fi_contact_street;
	}

	public String getFi_contact_number() {
		return fi_contact_number;
	}

	public void setFi_contact_number(String fi_contact_number) {
		this.fi_contact_number = fi_contact_number;
	}

	public String getFi_contact_postcode() {
		return fi_contact_postcode;
	}

	public void setFi_contact_postcode(String fi_contact_postcode) {
		this.fi_contact_postcode = fi_contact_postcode;
	}

	public String getFi_contact_place() {
		return fi_contact_place;
	}

	public void setFi_contact_place(String fi_contact_place) {
		this.fi_contact_place = fi_contact_place;
	}

	public String getFi_contact_phone() {
		return fi_contact_phone;
	}

	public void setFi_contact_phone(String fi_contact_phone) {
		this.fi_contact_phone = fi_contact_phone;
	}

	public String getFi_contact_fax() {
		return fi_contact_fax;
	}

	public void setFi_contact_fax(String fi_contact_fax) {
		this.fi_contact_fax = fi_contact_fax;
	}

	public String getFi_contact_mobil() {
		return fi_contact_mobil;
	}

	public void setFi_contact_mobil(String fi_contact_mobil) {
		this.fi_contact_mobil = fi_contact_mobil;
	}

	public String getFi_contact_mail() {
		return fi_contact_mail;
	}

	public void setFi_contact_mail(String fi_contact_mail) {
		this.fi_contact_mail = fi_contact_mail;
	}

	public String getFi_contact_position() {
		return fi_contact_position;
	}

	public void setFi_contact_position(String fi_contact_position) {
		this.fi_contact_position = fi_contact_position;
	}

	
	
	/*** Action Methoden *******/

	/**
	 * @author heiko
	 * <br> receive a TO Object 
	 * <br> and set the Data in the Bean 
	 * @param userTO
	 */
	public void setUser(CostumerTO userTO){
		
		id = userTO.getId();
		
		loginName = userTO.getLoginName();
		password = userTO.getPassword();
		
		creditLimit = userTO.getCreditLimit(); 	
		reachedCreditLimit = userTO.getReachedCreditLimit();
		
		filial_Name = userTO.getFilial_Name();
		filial_street = userTO.getFilial_street();
		filial_number = userTO.getFilial_number();
		filial_postcode = userTO.getFilial_postcode();
		filial_place = userTO.getFilial_place();
		filial_phone = userTO.getFilial_phone();
		filial_fax = userTO.getFilial_fax();
		filial_mobil = userTO.getFilial_mobil();
		filial_mail = userTO.getFilial_mail();
		filial_position = userTO.getFilial_position();
		
		fi_contact_titel = userTO.getFi_contact_titel();
		fi_contact_name = userTO.getFi_contact_name();  
		fi_contact_street = userTO.getFi_contact_street();
		fi_contact_number = userTO.getFi_contact_number();
		fi_contact_postcode = userTO.getFi_contact_postcode();
		fi_contact_place = userTO.getFi_contact_place();
		fi_contact_phone = userTO.getFi_contact_phone();
		fi_contact_fax = userTO.getFi_contact_fax();
		fi_contact_mobil = userTO.getFi_contact_mobil();
		fi_contact_mail = userTO.getFi_contact_mail();
		fi_contact_position = userTO.getFi_contact_position();
		
	}
	
	
	/***
	 * @author heiko
	 * <br> clear the actual User after logout
	 * <br> call from Navigation Bean -> Logout
	 */
	public void clearUser(){
		id=0L;
		
		loginName="";
		password="";
		
		creditLimit=0L; 	
		reachedCreditLimit=0L; 
		
		filial_Name="";
		filial_street="";
		filial_number="";
		filial_postcode="";
		filial_place="";
		filial_phone="";
		filial_fax="";
		filial_mobil="";
		filial_mail="";
		filial_position="";
		
		fi_contact_titel="";
		fi_contact_name="";  
		fi_contact_street="";
		fi_contact_number="";
		fi_contact_postcode="";
		fi_contact_place="";
		fi_contact_phone="";
		fi_contact_fax="";
		fi_contact_mobil="";
		fi_contact_mail="";
		fi_contact_position=""; 
	
	}
	
}
