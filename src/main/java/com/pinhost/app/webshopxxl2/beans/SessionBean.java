/*****************************************************************/
/* @Author 		: heiko lauer                                    */
/* @Date        : 2017.02.16                                     */
/* @LastDate    : 2017.03.01                                     */
/* @Description : Bean for the Session Data                      */
/* @Scope		: Session                                        */  
/* xhtml        : none                                           */
/*****************************************************************/

package com.pinhost.app.webshopxxl2.beans;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;

import javax.faces.context.FacesContext;

import com.pinhost.app.webshopxxl2.dataBeans.ArtikelTypBean;
import com.pinhost.app.webshopxxl2.dataBeans.ArtikelTypGroupBean;

public class SessionBean {

	private boolean userIsOnline = false;  // after successful login is true
	
	private ArtikelTypBean artikelTypBean;
	private ArtikelTypGroupBean articelTypGroupBean;
	
	// Multi Language
	private String currentLocale = Locale.GERMAN.toString();
    private static Map<String, Locale> availableLocalesMap;

    /***
     * @author heiko
     * <br> Init the SessionBean
     * <br> Set Language
     */
	public SessionBean(){

		availableLocalesMap = new LinkedHashMap<String, Locale>();
		availableLocalesMap.put("Deutsch", Locale.GERMAN);
		availableLocalesMap.put("English", Locale.ENGLISH);
	}
	
	/***
	 * @author heiko
	 * @param newLocale
	 */
	public void setCurrentLocale(String newLocale){
		
		this.currentLocale = newLocale;
	    
		for (Entry<String, Locale> entry : availableLocalesMap.entrySet())
	    {
	      if (entry.getValue().toString().equals(newLocale))
	        FacesContext.getCurrentInstance().getViewRoot().setLocale(entry.getValue());
	    }
	}
	
	/****  Getter and setter ****/
	
	public Map<String, Locale> getAvailableLocales(){
	    return availableLocalesMap;
	}
	 
	public String getCurrentLocale(){
	    return currentLocale;
	}
	
	public boolean isUserIsOnline() {
		return userIsOnline;
	}
	public void setUserIsOnline(boolean userIsOnline) {
		this.userIsOnline = userIsOnline;
	}
	
	/*** the Bean Getter and Setter ***********************/
	
	public ArtikelTypBean getArtikelTypBean() {
		return artikelTypBean;
	}
	public void setArtikelTypBean(ArtikelTypBean artikelTypBean) {
		this.artikelTypBean = artikelTypBean;
	}
	
	public ArtikelTypGroupBean getArticelTypGroupBean() {
		return articelTypGroupBean;
	}
	public void setArticelTypGroupBean(ArtikelTypGroupBean articelTypGroupBean) {
		this.articelTypGroupBean = articelTypGroupBean;
	}
	
}
