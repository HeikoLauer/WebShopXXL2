/*************************************************************/
/* @Author 		: heiko lauer                                */
/* @Date        : 2017.02.16                                 */
/* @Last Change : 2017.02.22                                 */
/* @Description : TO for the ArticelTypeCategorie            */
/*                will convert to Bean ArticelTypeCategorie  */
/* @Scope		: Session                                    */            
/*************************************************************/

package com.pinhost.common.webshopxxl2.to;

public class ArtikelTypGroupTO {

	private Long id;
	private Long artikelTypCategorie_id;
	private String name;
	private String image;
	
	private boolean paymentCard=false;
	private boolean directLoad=false;
	private boolean pinprinting=false;
	
	/**** Getter and Setter *******************/
	
	
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
