/*******************************************************************/
/* @Author 		: heiko lauer                                      */
/* @Date        : 2017.02.16                                       */
/* @Last Change : 2017.02.22                                       */
/* @Description : Facade for all Artikel Data                      */
/*                ArtikelTypCategorie, ArtikelTypGroup, ArtikelTyp */
/*******************************************************************/

package com.pinhost.app.webshopxxl2.facade;

import java.util.ArrayList;
import java.util.List;

import javax.faces.event.ActionEvent;

import com.pinhost.app.webshopxxl2.dataBeans.ArtikelTypBean;
import com.pinhost.app.webshopxxl2.dataBeans.ArtikelTypCategorieBean;
import com.pinhost.app.webshopxxl2.dataBeans.ArtikelTypGroupBean;
import com.pinhost.common.webshopxxl2.dbconnect.DBArtikelConnect;
import com.pinhost.common.webshopxxl2.to.ArticelTypTO;
import com.pinhost.common.webshopxxl2.to.ArtikelTypCategorieTO;
import com.pinhost.common.webshopxxl2.to.ArtikelTypGroupTO;

public class ArtikelFacade {

	/****
	 * @author heiko
	 *
	 * @return
	 */
	public static List<ArtikelTypCategorieBean> getAllArticelTypCategorieBean(){
		
		// get a List of CategorieTO
		List<ArtikelTypCategorieTO> readList = new DBArtikelConnect().readAllArticelTypCategorie();
		
		// Create a List of CategorieBean
		List<ArtikelTypCategorieBean> retList = new ArrayList<ArtikelTypCategorieBean>();
		ArtikelTypCategorieBean writeBean;
		
		// Transfer the Properties
		int i=0; // Index for the List
		for(ArtikelTypCategorieTO readTO : readList){
			
			writeBean = new ArtikelTypCategorieBean();
			writeBean.setIndex(i);
			writeBean.setId(readTO.getId());
			writeBean.setName(readTO.getName());
			writeBean.setImage(readTO.getImage());
			
			i++;
			
			retList.add(writeBean);
		}
		
		return retList;
	}


	/****
	 * @author heiko
	 * <br> Get all ArtikelTypCategorieBean from DBConnect
	 * 
	 * @param none
	 * @return List of ArtikelTypCategorieBean
	 */
	public static List<ArtikelTypGroupBean> getAllArticelTypGroupBean(long artikelTypCategorie_id){
		
		// get a List of ArtikelTypGroupTO
		List<ArtikelTypGroupTO> readList = new DBArtikelConnect().readAllArticelTypGroupForId(artikelTypCategorie_id);
		
		// Create a List of ArtikelTypGroupBean
		List<ArtikelTypGroupBean> retList = new ArrayList<ArtikelTypGroupBean>();
		ArtikelTypGroupBean writeBean;
		
		// Transfer the Properties
		int i=0; // Index for the List
		for(ArtikelTypGroupTO readTO : readList){
			
			writeBean = new ArtikelTypGroupBean();
			writeBean.setIndex(i);
			writeBean.setId(readTO.getId());
			writeBean.setName(readTO.getName());
			i++;
			
			retList.add(writeBean);
		}
		
		return retList;
	}

	/**
	 * @author heiko
	 * <br> get a List of ArtikelTypTO from the Backend
	 * <br> get all ArtikelTypTO for the given artikelGroup_id
	 * <br> convert the ArtikelTO to a to a ArtikelTypBean
	 * @return List of ArtikelTypTO 
	 */
	public static List<ArtikelTypBean> getAllArtikelTypBean(long artikelGroup_id){
	
		// get a List of CategorieTO
		List<ArticelTypTO> readList = new DBArtikelConnect().readAllArtikelTypForArtikelGroup(artikelGroup_id);
		
		// Create a List of CategorieBean
		List<ArtikelTypBean> retList = new ArrayList<ArtikelTypBean>();
		ArtikelTypBean artikelTypBean;
		
		// Transfer the Properties
		for(ArticelTypTO artikelTypTO : readList){
			
			artikelTypBean = new ArtikelTypBean();

			artikelTypBean.setId(artikelTypTO.getId());
			artikelTypBean.setCurrency(artikelTypTO.getCurrency());
			artikelTypBean.setArtikelGroup_id(artikelGroup_id);
			artikelTypBean.setImage(artikelTypTO.getImage());
			artikelTypBean.setMaxQuantity(artikelTypTO.getMaxQuantity());
			artikelTypBean.setName(artikelTypTO.getName());
			artikelTypBean.setQuantity(artikelTypTO.getQuantity());
			artikelTypBean.setTotalValue(artikelTypTO.getTotalValue());
			artikelTypBean.setValue(artikelTypTO.getValue());
			
			retList.add(artikelTypBean);
		}
		
		return retList;
	}
	
}
