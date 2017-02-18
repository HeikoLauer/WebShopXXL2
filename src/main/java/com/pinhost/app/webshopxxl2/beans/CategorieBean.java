/****************************************************/
/* @Author 		: heiko lauer                       */
/* @Date        : 20170216                          */
/* @Description : Bean for a Categorie              */
/****************************************************/

package com.pinhost.app.webshopxxl2.beans;

public class CategorieBean {
	
	private String name = "";
	private String icon = "";
	private String id = "";
	
	/*** Getter and Setter *************/
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIcon() {
		return icon;
	}
	public void setIcon_name(String icon) {
		this.icon = icon;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
}
