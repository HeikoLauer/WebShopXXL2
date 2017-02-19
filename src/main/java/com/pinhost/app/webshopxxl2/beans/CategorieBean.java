/****************************************************/
/* @Author 		: heiko lauer                       */
/* @Date        : 2017.02.16                        */
/* @Description : Bean for a Categorie              */
/* @Scope		: Request                           */            
/****************************************************/

package com.pinhost.app.webshopxxl2.beans;


public class CategorieBean {
	
	private int index=0;
	private String name = "";
	private String icon = "";
	private String id = "";
	
	/*** Getter and Setter *************/
	
	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}
	
	
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
