package com.pinhost.common.webshopxxl2.to;

public class ProductTO {

	private String id;
	private String id_categorie;
	private String name;
	private String icon_name;

	/*** Getter and Setter ***/

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public String getId_categorie() {
		return id_categorie;
	}
	public void setId_categorie(String id_categorie) {
		this.id_categorie = id_categorie;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getIcon_name() {
		return icon_name;
	}
	public void setIcon_name(String icon_name) {
		this.icon_name = icon_name;
	}

}
