/***************************************************************/
/* @Author 		: heiko lauer                                  */
/* @Date        : 2017.02.24                                   */
/* @LastChange  : 2017.02.24                                   */
/* @Description : Bean for Warehouse Page                      */
/* @Scope		: Request                                      */            
/***************************************************************/

package com.pinhost.app.webshopxxl2.dataBeans;

import java.util.ArrayList;
import java.util.List;

import javax.faces.event.ActionEvent;

public class WarehouseArtikelTypBean {

	private long total_value = 0L;
    private int productCounter=0;
    private long leftAccount=0;

    private List<WarehouseArtikelTypBean> allWarehouseArtikelTypBeans = new ArrayList<WarehouseArtikelTypBean>();
    
	/*** Getter and Setter ********************/
	
	public String getTotal_value() {
		return ""+ total_value;
	}

	public void setTotal_value(String total_value) {
		total_value.trim();
		this.total_value = Long.parseLong(total_value);
	}

	public String getProductCounter() {
		return "" + productCounter;
	}

	public void setProductCounter(String productCounter) {
		productCounter.trim();
		this.productCounter = Integer.parseInt(productCounter);
	}

	public String getLeftAccount() {
		return ""+leftAccount;
	}

	public void setLeftAccount(String leftAccount) {
		leftAccount.trim();
		this.leftAccount = Long.parseLong(leftAccount);
	}

	public List<WarehouseArtikelTypBean> getAllWarehouseArtikelTypBeans() {
		return allWarehouseArtikelTypBeans;
	}

	public void setAllWarehouseArtikelTypBeans(List<WarehouseArtikelTypBean> allWarehouseArtikelTypBeans) {
		this.allWarehouseArtikelTypBeans = allWarehouseArtikelTypBeans;
	}

	/****** Action Methods **********************************/
	
	/***
	 * @author heiko
	 * @param event
	 */
	public void addArtikelTypBean(ActionEvent event){
		
	}

	/***
	 * @author heiko
	 * @param event
	 */
	public void removeArtikelTypBean(ActionEvent event){
		
	}


}
