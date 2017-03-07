/******************************************************************/
/* @Author 		: heiko lauer                                     */
/* @Date        : 2017.02.16                                      */
/* @LastDate    : 2017.03.01                                      */
/* @Description : Bean for a ArtikelTyp                           */
/* @Scope		: Request                                         */            
/* xhtml        : pages/artikelTyp.xhtml, pages/account.xhtml     */
/*                pages/warehouse.xhtml                           */
/******************************************************************/

package com.pinhost.app.webshopxxl2.dataBeans;

public class ArtikelTypBean {
	
	// Only for Frontend : index counter for List
	private int index;
	 
	private long id;

	private long artikelCategorie_id;
	private long artikelGroup_id;
	private String name;
	private String image;
	private Long value;
	private Long maxQuantity;
	private String currency;
	
	// This is not a property from the ArtikelTyp in the Database
	// This is the counter for the warehouse
	private int artikelCounter = 0;
	private long totalValue = 0;
	
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
	
	public long getArtikelCategorie_id() {
		return artikelCategorie_id;
	}
	public void setArtikelCategorie_id(long artikelCategorie_id) {
		this.artikelCategorie_id = artikelCategorie_id;
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
		return "" + totalValue;
	}
	
	public void setTotalValue(long value){
		totalValue = value;
	}
	
	/***
	 * @author heiko
	 * <br> TODO
	 */
	public void inCrementValue(){
		setTotalValue(totalValue + value);
	}
	
	/***
	 * @author heiko
	 * <br> TODO
	 */
	public void deCrementValue(){
		setTotalValue(totalValue - value);
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
