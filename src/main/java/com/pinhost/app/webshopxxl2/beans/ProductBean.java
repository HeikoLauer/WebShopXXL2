/****************************************************/
/* @Author 		: heiko lauer                       */
/* @Date        : 2017.02.16                        */
/* @Description : Bean for a Product                */
/* @Scope		: Request                           */            
/****************************************************/

package com.pinhost.app.webshopxxl2.beans;

public class ProductBean {
	
	private String name ="";
	private String icon ="";
	private String id ="";
	private String id_categorie ="";
	
	/**** Getter and Setter   *****************/
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getIcon_name() {
		return icon;
	}
	public void setIcon_name(String icon) {
		this.icon = icon;
	}
	
	public String getId_categorie() {
		return id_categorie;
	}
	public void setId_categorie(String id_categorie) {
		this.id_categorie = id_categorie;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	
}
