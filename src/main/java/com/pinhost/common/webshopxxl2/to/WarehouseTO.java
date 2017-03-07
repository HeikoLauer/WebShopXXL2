/***************************************************************/
/* @Author 		: heiko lauer                                  */
/* @Date        : 2017.02.24                                   */
/* @LastChange  : 2017.03.01                                   */
/* @Description : Bean for Warehouse Page                      */
/* @Scope		: Session                                      */ 
/* xhtml        : warehouse.xhtml                              */
/***************************************************************/

package com.pinhost.common.webshopxxl2.to;

import java.util.ArrayList;
import java.util.List;

import javax.faces.event.ActionEvent;

import com.pinhost.app.webshopxxl2.util.Util;

public class WarehouseTO extends Util {

//    private List<ArtikelTypTO> allArtikelTypBeans = new ArrayList<ArtikelTypTO>();
//
//    private Long totalValueAllArtikel=0L;
//    
//	/*** Getter and Setter ********************/

//    
//	public List<ArtikelTypBean> getAllWarehouseArtikelTypBeans() {
//		return allArtikelTypBeans;
//	}
//
//	public void setAllWarehouseArtikelTypBeans(List<ArtikelTypBean> allArtikelTypBeans) {
//		this.allArtikelTypBeans = allArtikelTypBeans;
//	}
//
//	public void incrementTotalValueAllArtikel(Long artikelValue){
//		totalValueAllArtikel = totalValueAllArtikel +  artikelValue;
//	}
//	
//	public void decrementTotalValueAllArtikel(Long artikelValue){
//		totalValueAllArtikel = totalValueAllArtikel -  artikelValue;
//	}
//	
//	public String getTotalValueAllArtikelTyp(){
//		return totalValueAllArtikel.toString();
//	}
//	
//	/**** Calculated Getter *************************/
//	
//	
//	/***
//	 * @author heiko
//	 * <br> calculate the total count for all ArtikelTyp in the warehouse
//	 * <br> therefore get the artikelCounter the ArtikelTyp
//	 * <br> and add this to the totalValue
//	 * 
//	 * @return the result
//	 */
//	public String getTotalAllArtikelTyp(){
//		Integer retValue=0;
//		for(ArtikelTypBean bean : allArtikelTypBeans){
//			retValue = retValue + bean.getArtikelCounter();
//		}
//		return ""+ retValue;
//	}
//	
//	
//	/*** Action Methods ***********************/
//	
//	/**
//	 * @author heiko
//	 * 
//	 * <br> get a parameter ( ArtikelBean ) from the xhtml Page
//	 * <br> add this Bean in the List
//	 * <br> decrement the Credist of the Costumer
//	 * <br> increment the total Value of the account
//	 * 
//	 * @param event
//	 */
//	public void addNewArtikelTypBean(ActionEvent event){
//		
//		ArtikelTypBean artikeltypBean  = (ArtikelTypBean) event.getComponent().getAttributes().get("artikeltyp_index");
//		artikeltypBean.setArtikelCounter(1);
//		allArtikelTypBeans.add(artikeltypBean);
//		
//		// Set the Value of a Artikel to TotalValue
//		incrementTotalValueAllArtikel(artikeltypBean.getValue());
//
//		// Increment Artikel Total Value
//		artikeltypBean.inCrementValue();
//		
//		// decrement thew Credit of the Costumer
//		getCostumerBean().decrementCredit(artikeltypBean.getValue());
//		
//		getNavigationBean().setContent_page(getNavigationBean().getCONTENT_WAREHOUSE_PAGE());
//	}
//	
//	/****
//	 * @author heiko
//	 * 
//	 * <br> check if the maxQuantity for the ArtikelTyBean is less 
//	 * <br> as the Quantity from the WarehouseBean
//	 * <br> then ...
//	 * <br> Incremt the ArtikelTypCounter at 1
//	 * <br> decrement the CostumerBean CreditLimit to ArtikelBean value
//	 * <br> Increment the Total Value from ArtikelTypBean at ArtikelBean value
//	 * <br> set a Message TODO
//	 *  
//	 * @param event
//	 */
//	public void incrementArtikelTyp(ActionEvent event){
//		
//		ArtikelTypBean artikeltypBean  = (ArtikelTypBean) event.getComponent().getAttributes().get("artikeltyp_index");
//		
//		// Only if the artikelCounter of a ArtkelTyp is lower than maxQuantity...
//		if(artikeltypBean.getArtikelCounter()<artikeltypBean.getMaxQuantity()){
//			
//			// Increment the ArtikelCounter at 1
//			artikeltypBean.setArtikelCounter(artikeltypBean.getArtikelCounter()+1);
//				
//			// TODO
//			incrementTotalValueAllArtikel(artikeltypBean.getValue());
//			
//			// decrement the CreditLimit at ArtikelBean.value()
//			getCostumerBean().decrementCredit(artikeltypBean.getValue());
//		
//			// Increment the Total Value of the ArtikelTypBean
//		    artikeltypBean.inCrementValue();
//		}
//	}
//	
//	/****
//	 * @author heiko
//	 * 
//	 * <br> check if the maxQuantity for the ArtikelTyBean is less 
//	 * <br> as the Quantity from the WarehouseBean
//	 * <br> then ...
//	 * <br> Decrement the ArtikelTypCounter at 1
//	 * <br> Increment the CostumerBean CreditLimit to ArtikelBean value
//	 * <br> Decrement the Total Value from ArtikelTypBean at ArtikelBean value
//	 * <br> set a Message TODO
//	 *  
//	 * @param event
//	 */
//	public void decrementArtikelTyp(ActionEvent event){
//		
//		ArtikelTypBean artikeltypBean  = (ArtikelTypBean) event.getComponent().getAttributes().get("artikeltyp_index");
//		
//		artikeltypBean.setArtikelCounter(artikeltypBean.getArtikelCounter()-1);
//		
//		// decrement the CreditLimit at ArtikelBean.value()
//		getCostumerBean().incrementCredit(artikeltypBean.getValue());
//	
//		
//		decrementTotalValueAllArtikel(artikeltypBean.getValue());
//		
//		// Increment the Total Value of the ArtikelTypBean
//	    artikeltypBean.deCrementValue();	
//		
//	    // If the count of a ArtikelTyp = 0, remove that from the Warehouse
//		if(artikeltypBean.getArtikelCounter()==0){
//			allArtikelTypBeans.remove(artikeltypBean);
//		}
//	}
//	
//	/***
//	 * @author heiko
//	 * <br> Increment the Credit from the Costumwer to the 
//	 * <br>    Artikelvalue * Artikelcounter
//	 * 
//	 * @param event
//	 */
//	public void removeArtikelTyp(ActionEvent event){
//		
//		ArtikelTypBean artikeltypBean  = (ArtikelTypBean) event.getComponent().getAttributes().get("artikeltyp_index");
//		
//		// increment the CreditLimit at Artikelcounter * Artikeklvalue
//		getCostumerBean().incrementCredit(artikeltypBean.getValue() * artikeltypBean.getArtikelCounter());
//	
//		// decrement the TotalValue in the Warehouse to Artikelcounter * Artikelvalue
//		decrementTotalValueAllArtikel(artikeltypBean.getValue()  * artikeltypBean.getArtikelCounter());
//		
//	    // set Artikelcounter to 0
//	 	artikeltypBean.setArtikelCounter(0);
//		
//		allArtikelTypBeans.remove(artikeltypBean);
//	}
//	
//	public void sendWarehouse(ActionEvent event){
//		
//		System.out.println("\n\n---------------------------------------------------------"
//				+ "\n\n  Warehouse Bean : sendWarehouse : 203 ");
//		
//		
//		System.out.println("\n\n---------------------------------------------------------\n\n\n");
//	}
//	
//	/***
//	 * @author heiko
//	 * <br> set the Warehouse to init
//	 */
//	public void resetWarehouse(){
//		allArtikelTypBeans.clear();
//		totalValueAllArtikel=0L;
//	}
//	
	
}
