/*********************************************************************/
/* @Author 		: heiko lauer                                        */
/* @Date        : 2017.02.16                                         */
/* @Last Change : 2017.02.22                                         */
/* @Description : Bean for the ArticelTypeGroup                      */
/*                For this exist no own ListBean, the List of this   */
/*                Bean are read and stored from ArtikelFacade        */
/*                The List of this Bean is Part of the               */
/*                ArtikelTypCategorieBean                            */
/* @Scope		: Request                                            */            
/*********************************************************************/

package com.pinhost.app.webshopxxl2.dataBeans;

public class ArtikelTypGroupBean {
	
	/** Only for Frontend : Counter for List index ***/
	private int index;
	
	private Long id;
	private Long artikelTypCategorie_id;
	private String name;
	
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
	
	public Long getArtikelTypCategorie_id() {
		return artikelTypCategorie_id;
	}
	public void setArtikelTypCategorie_id(Long artikelTypCategorie_id) {
		this.artikelTypCategorie_id = artikelTypCategorie_id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
