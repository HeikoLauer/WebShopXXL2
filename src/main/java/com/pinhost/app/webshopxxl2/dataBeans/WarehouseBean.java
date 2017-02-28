/***************************************************************/
/* @Author 		: heiko lauer                                  */
/* @Date        : 2017.02.24                                   */
/* @LastChange  : 2017.02.24                                   */
/* @Description : Bean for Warehouse Page                      */
/* @Scope		: Request                                      */            
/***************************************************************/

package com.pinhost.app.webshopxxl2.dataBeans;


public class WarehouseBean {

	private long total_value = 0L;
    private int productCounter=0;
    private long leftAccount=0;
	
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

	


}
