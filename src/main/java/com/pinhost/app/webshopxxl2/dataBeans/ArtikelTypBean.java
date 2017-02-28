/****************************************************/
/* @Author 		: heiko lauer                       */
/* @Date        : 2017.02.16                        */
/* @Description : Bean for a Product                */
/* @Scope		: Request                           */            
/****************************************************/

package com.pinhost.app.webshopxxl2.dataBeans;

public class ArtikelTypBean {
	
	// Only for Frontend : index counter for List
	private int index;
	 
	private long id;
	private long artikelGroup_id;
	private String name;
	private String image;
	private Long value;
	private Long maxQuantity;
	private Long quantity;
	private Long totalValue;
	private String currency;
	
	// This is not a property from the ArtikelTyp in the Database
	// This is the counter for the warehouse
	private int artikelCounter = 0;
	
	/**** Getter and Setter   *****************/
	
	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	public long getArtikelGroup_id() {
		return artikelGroup_id;
	}
	public void setArtikelGroup_id(long artikelGroup_id) {
		this.artikelGroup_id = artikelGroup_id;
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
	public Long getValue() {
		return value;
	}
	public void setValue(Long value) {
		this.value = value;
	}
	public Long getMaxQuantity() {
		return maxQuantity;
	}
	public void setMaxQuantity(Long maxQuantity) {
		this.maxQuantity = maxQuantity;
	}
	
	public Long getQuantity() {
		return quantity;
	}
	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}
	
	public void setTotalValue(Long totalValue) {
		this.totalValue = totalValue;
	}
	
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	
	
	/*** Getter and setter for the Properties ***/
	/*** for the Warehouse                    ***/
	
	public int getArtikelCounter() {
		return artikelCounter;
	}
	public void setArtikelCounter(int artikelCounter) {
		this.artikelCounter = artikelCounter;
	}
	
	/***
	 * @author heiko
	 * <br> calculate the totalValue
	 * @return
	 */
	public String getTotalValue(){
		totalValue = artikelCounter * value;
		return "" +(totalValue);
	}
	
	/***
	 * @author heiko
	 * <<br> return himself
	 * @return
	 */
	public ArtikelTypBean getArtikelTypBean(){
		return this;
	}
}
