/****************************************************/
/* @Author 		: heiko lauer                       */
/* @Date        : 2017.02.16                        */
/* @Last Change : 2017.02.22                        */
/* @Description : Bean for the ArticelTypeCategorie */
/* @Scope		: Session                           */            
/****************************************************/


package com.pinhost.app.webshopxxl2.dataBeans;

import java.util.List;

public class ArtikelTypCategorieBean {
	
	private int index;
	private Long id;
	private String name;
	private String image;
	
	private List<ArtikelTypGroupBean> artikelTypGroupList;
	
	/**** Getter and Setter *******************/
	
	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	
	public List<ArtikelTypGroupBean> getArtikelTypGroupList() {
		return artikelTypGroupList;
	}
	public void setArtikelTypGroupList(List<ArtikelTypGroupBean> artikelTypGroupList) {
		this.artikelTypGroupList = artikelTypGroupList;
	}
	
	
}
