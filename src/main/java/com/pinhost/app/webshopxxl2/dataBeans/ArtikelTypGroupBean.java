/*********************************************************************/
/* @Author 		: heiko lauer                                        */
/* @Date        : 2017.02.16                                         */
/* @Last Change : 2017.03.01                                         */
/* @Description : Bean for the ArticelTypeGroup                      */
/*                For this exist no own ListBean, the List of this   */
/*                Bean are read and stored from ArtikelFacade        */
/*                The List of this Bean is Part of the               */
/*                ArtikelTypCategorieBean                            */
/* @Scope		: Request                                            */   
/* xhtml        : pages/artikelGroup.xhtml                           */
/*********************************************************************/

package com.pinhost.app.webshopxxl2.dataBeans;

public class ArtikelTypGroupBean {
	
	/** Only for Frontend : Counter for List index ***/
	private int index;
	
	private Long id;
	private Long artikelTypCategorie_id;
	private String name;
	private String image;
	
	private boolean paymentCard=false;
	private boolean directLoad=false;
	private boolean pinprinting=false;
	
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
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public boolean isPaymentCard() {
		return paymentCard;
	}
	public void setPaymentCard(boolean paymentCard) {
		this.paymentCard = paymentCard;
	}
	public boolean isDirectLoad() {
		return directLoad;
	}
	public void setDirectLoad(boolean directLoad) {
		this.directLoad = directLoad;
	}
	public boolean isPinprinting() {
		return pinprinting;
	}
	public void setPinprinting(boolean pinprinting) {
		this.pinprinting = pinprinting;
	}
	
	
}
