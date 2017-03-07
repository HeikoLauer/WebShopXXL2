/***************************************************************/
/* @Author 		: heiko lauer                                  */
/* @Date        : 2017.02.24                                   */
/* @LastChange  : 2017.03.01                                   */
/* @Description : Bean for Warehouse Page                      */
/* @Scope		: Session                                      */ 
/* xhtml        : warehouse.xhtml                              */
/***************************************************************/

package com.pinhost.app.webshopxxl2.dataBeans;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.faces.event.ActionEvent;

import com.pinhost.app.webshopxxl2.util.MeldungenUtil;
import com.pinhost.app.webshopxxl2.util.Util;

public class WarehouseBean extends Util {

    
    private HashMap<Long, ArtikelTypBean> allArtikelTypBeansMap = new HashMap<Long, ArtikelTypBean>();

    private Long totalValueAllArtikel=0L;
    
	/*** Getter and Setter ********************/
	
    /***
     * @author heiko
     * @return
     */
    public boolean isWarehouseHasArtikel(){
    	
    	if(allArtikelTypBeansMap.size()>0){
    		return true;
    	} else {
    		return false;
    	}
    }
    
	public List<ArtikelTypBean> getAllWarehouseArtikelTypBeans() {
		return  new ArrayList<ArtikelTypBean>(allArtikelTypBeansMap.values());
	}

	public void incrementTotalValueAllArtikel(Long artikelValue){
		totalValueAllArtikel = totalValueAllArtikel +  artikelValue;
	}
	
	public void decrementTotalValueAllArtikel(Long artikelValue){
		totalValueAllArtikel = totalValueAllArtikel -  artikelValue;
	}
	
	public String getTotalValueAllArtikelTyp(){
		return totalValueAllArtikel.toString();
	}
	
	/**** Calculated Getter *************************/
	
	
	/***
	 * @author heiko
	 * <br> calculate the total count for all ArtikelTyp in the warehouse
	 * <br> therefore get the artikelCounter the ArtikelTyp
	 * <br> and add this to the totalValue
	 * 
	 * @return the result
	 */
	public String getTotalAllArtikelTyp(){
		Integer retValue=0;
		for(ArtikelTypBean bean : allArtikelTypBeansMap.values()){
			retValue = retValue + bean.getArtikelCounter();
		}
		return ""+ retValue;
	}
	
	
	/*** Action Methods ***********************/
	
	/**
	 * @author heiko
	 * 
	 * <br> get a parameter ( ArtikelBean ) from the xhtml Page
	 * <br> delegate to addOrIncrementArtikelTypToWarehouse
	 * 
	 * @param event
	 */
	public void addNewArtikelTypBean(ActionEvent event){
		ArtikelTypBean artikeltypBean  = (ArtikelTypBean) event.getComponent().getAttributes().get("artikeltyp_index");
		addOrIncrementArtikelTypToWarehouse(artikeltypBean, true);
	}
	
	/**
	 * @author heiko
	 * 
	 * <br> get a parameter ( ArtikelBean ) from the xhtml Page
	 * <br> delegate to addOrIncrementArtikelTypToWarehouse
	 * 
	 * @param event
	 */
	public void incrementArtikelTyp(ActionEvent event){
		ArtikelTypBean artikeltypBean  = (ArtikelTypBean) event.getComponent().getAttributes().get("artikeltyp_index");
		addOrIncrementArtikelTypToWarehouse(artikeltypBean, false);
	}
	
	/****
	 * @author heiko
	 * 
	 * <br> check if the maxQuantity for the ArtikelTyBean is less 
	 * <br> as the Quantity from the WarehouseBean
	 * <br> then ...
	 * <br> Decrement the ArtikelTypCounter at 1
	 * <br> Increment the CostumerBean CreditLimit to ArtikelBean value
	 * <br> Decrement the Total Value from ArtikelTypBean at ArtikelBean value
	 * <br> set a Message TODO
	 *  
	 * @param event
	 */
	public void decrementArtikelTyp(ActionEvent event){
		
		ArtikelTypBean artikeltypBean  = (ArtikelTypBean) event.getComponent().getAttributes().get("artikeltyp_index");
		
		artikeltypBean.setArtikelCounter(artikeltypBean.getArtikelCounter()-1);
		
		// decrement the CreditLimit at ArtikelBean.value()
		getCostumerBean().incrementCredit(artikeltypBean.getValue());
	
		
		decrementTotalValueAllArtikel(artikeltypBean.getValue());
		
		// Increment the Total Value of the ArtikelTypBean
	    artikeltypBean.deCrementValue();	
		
	    // If the count of a ArtikelTyp = 0, remove that from the Warehouse
		if(artikeltypBean.getArtikelCounter()==0){
			allArtikelTypBeansMap.remove(artikeltypBean.getId());
		}
	}
	
	/***
	 * @author heiko
	 * <br> Increment the Credit from the Costumwer to the 
	 * <br> Artikelvalue * Artikelcounter
	 * 
	 * @param event
	 */
	public void removeArtikelTyp(ActionEvent event){
		
		ArtikelTypBean artikeltypBean  = (ArtikelTypBean) event.getComponent().getAttributes().get("artikeltyp_index");
		
		// increment the CreditLimit at Artikelcounter * Artikeklvalue
		getCostumerBean().incrementCredit(artikeltypBean.getValue() * artikeltypBean.getArtikelCounter());
	
		// decrement the TotalValue in the Warehouse to Artikelcounter * Artikelvalue
		decrementTotalValueAllArtikel(artikeltypBean.getValue()  * artikeltypBean.getArtikelCounter());
		
	    // set Artikelcounter to 0
	 	artikeltypBean.setArtikelCounter(0);
		
	 	allArtikelTypBeansMap.remove(artikeltypBean.getId());
	}
	
	/***
	 * @author heiko
	 * <br> // TODO
	 * @param event
	 */
	public void sendWarehouse(ActionEvent event){
		
		System.out.println("\n\n---------------------------------------------------------"
				+ "\n\n  Warehouse Bean : sendWarehouse : 203 ");
		
		
		System.out.println("\n\n---------------------------------------------------------\n\n\n");
	}
	
	/***
	 * @author heiko
	 * <br> set the Warehouse to init
	 */
	public void resetWarehouse(){
		allArtikelTypBeansMap.clear();
		totalValueAllArtikel=0L;
	}
	
	
	/*****  Private Methods *************************************/
	
	/***
	 * @author heiko
	 * 
	 * <br> 1. is the ArtikelTypeBean not exist in the Map
	 * <br>    (then is this a Articel from the ArtikelTyp page )
	 * <br>    or is is it a existing ArtikelTypBean 
	 * <br> 2. Add the new ArtikelTypBean in the Map, or
	 * <br>    increment the ArtikelTyp Counter
	 * <br> 3. increment the totalValueCounter in the Warehouse
	 * <br> 4. decrement the Credit for the Costumer
	 * 
	 * @param artikelTypBean
	 * @param fromArtikelGroupPage
	 */
	private void addOrIncrementArtikelTypToWarehouse(ArtikelTypBean artikelTypBean, boolean fromArtikelGroupPage){
		// Check the Credit of the Costumer and the maxQuantity
		if(checkCostumCredit(artikelTypBean) && checkMaxQuantity(artikelTypBean)){
			
			// This is a new ArtikelTyp
			if(!allArtikelTypBeansMap.containsKey(artikelTypBean.getId())){
				allArtikelTypBeansMap.put(artikelTypBean.getId(), artikelTypBean);
			} 
				
			// Increment the ArtikelCounter at 1
			artikelTypBean.setArtikelCounter(artikelTypBean.getArtikelCounter()+1);
			
			// Increment the Total Value of the ArtikelTypBean
			artikelTypBean.inCrementValue();
								
			// Set the Value of a articel to TotalValue
			incrementTotalValueAllArtikel(artikelTypBean.getValue());
						
			// decrement thew Credit of the Costumer
			getCostumerBean().decrementCredit(artikelTypBean.getValue());
					
			if(fromArtikelGroupPage){
				getNavigationBean().setContent_page(getNavigationBean().getCONTENT_WAREHOUSE_PAGE());
			}
		}
	}
	
	
	/***
	 * @author heiko
	 * 
	 * <br> Check the Credit is higher as the actual TotalValue in the Warehouse
	 * <br> if ok the return true
	 * <br> if not ok, return false 
	 * <br> anbd set a ErrorMessage
	 * @return
	 */
	private boolean checkCostumCredit(ArtikelTypBean artikelTypBean){
		
		if(getCostumerBean().getCreditLimit()>totalValueAllArtikel){
			return true;	
		}else{
			getMessageBean().setMessageText(MeldungenUtil.getText_CostumCredit());
			getMessageBean().setMessageCSS(MeldungenUtil.getCss_Error());
			return false;
		}
	}
		
	/***
	 * @author heiko
	 * <br> check if the actual ArtikelTyp Counter lower as the
	 * <br> ArtikelTyp maxQuantity
	 * <br> if ok then return true
	 * <br> if noit ok, return false and
	 * <br>   set a Error Message
	 * @return
	 */
	private boolean checkMaxQuantity(ArtikelTypBean artikelTypBean){
		if(artikelTypBean.getArtikelCounter()<artikelTypBean.getMaxQuantity()){
			return true;
		} else {
			getMessageBean().setMessageText(MeldungenUtil.getText_ArtikelTypMaxOver());
			getMessageBean().setMessageCSS(MeldungenUtil.getCss_Error());
			return false;
		}		
	}

}
