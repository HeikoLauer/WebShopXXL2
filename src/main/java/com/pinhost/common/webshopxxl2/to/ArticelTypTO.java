package com.pinhost.common.webshopxxl2.to;

public class ArticelTypTO {
	
	private long id;
	private long artikelGroup_id;
	private String name;
	private String image;
	private Long value;
	private Long maxQuantity;
	
	private String currency;
	
	/**** Getter and Setter   *****************/
	
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
	
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}

}
