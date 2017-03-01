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
import java.util.List;

import javax.faces.event.ActionEvent;

import com.pinhost.app.webshopxxl2.util.Util;

public class WarehouseBean extends Util {

    private List<ArtikelTypBean> allArtikelTypBeans = new ArrayList<ArtikelTypBean>();

    
	/*** Getter and Setter ********************/
	
	public List<ArtikelTypBean> getAllWarehouseArtikelTypBeans() {
		return allArtikelTypBeans;
	}

	public void setAllWarehouseArtikelTypBeans(List<ArtikelTypBean> allArtikelTypBeans) {
		this.allArtikelTypBeans = allArtikelTypBeans;
	}

	/**** Calculated Getter *************************/
	
	/***
	 * @author heiko
	 * <br> calculate the totalValue for all ArtikelTyp in the warehouse
	 * <br> therefore get the artikelCounter and the Value of the ArtikelTyp
	 * <br> multiplie the both value and add this to the totalValue
	 * 
	 * @return the result
	 */
	public String getTotalValueAllArtikelTyp(){
		Long retValue=0L;
		for(ArtikelTypBean bean : allArtikelTypBeans){
			retValue = retValue +  Long.parseLong(bean.getTotalValue());
		}
		return retValue.toString();
	}
	
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
		for(ArtikelTypBean bean : allArtikelTypBeans){
			retValue = retValue + bean.getArtikelCounter();
		}
		return retValue.toString();
	}
	
	
	/*** Action Methods ***********************/
	
	/**
	 * @author heiko
	 * 
	 * <br> get a parameter ( ArtikelBean ) from the xhtml Page
	 * <br> add this Bean in the List
	 * 
	 * @param event
	 */
	public void addNewArtikelTypBean(ActionEvent event){
		
		ArtikelTypBean artikeltypBean  = (ArtikelTypBean) event.getComponent().getAttributes().get("artikeltyp_index");
		artikeltypBean.setArtikelCounter(1);
		allArtikelTypBeans.add(artikeltypBean);

		getNavigationBean().setContent_page(getNavigationBean().getCONTENT_WAREHOUSE_PAGE());
	}
	
	/****
	 * @author heiko
	 * 
	 * @param event
	 */
	public void incrementArtikelTyp(ActionEvent event){
		
		ArtikelTypBean artikeltypBean  = (ArtikelTypBean) event.getComponent().getAttributes().get("artikeltyp_index");
		artikeltypBean.setArtikelCounter(artikeltypBean.getArtikelCounter()+1);
	}
	
	/****
	 * @author heiko
	 * 
	 * 
	 * @param event
	 */
	public void decrementArtikelTyp(ActionEvent event){
		
		ArtikelTypBean artikeltypBean  = (ArtikelTypBean) event.getComponent().getAttributes().get("artikeltyp_index");
		
		artikeltypBean.setArtikelCounter(artikeltypBean.getArtikelCounter()-1);
		if(artikeltypBean.getArtikelCounter()==0){
			allArtikelTypBeans.remove(artikeltypBean);
		}
	}
	
}
