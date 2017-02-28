/*********************************************************/
/* @Author 		: heiko lauer                            */
/* @Date        : 2017.02.16                             */
/* @Last Change : 2017.02.22                             */
/* @Description : Bean for the ArticelTypeCategorieListe */
/* @Scope		: Session                                */
/*********************************************************/

package com.pinhost.app.webshopxxl2.beans;

import java.util.List;

import javax.faces.event.ActionEvent;

import com.pinhost.app.webshopxxl2.dataBeans.ArtikelTypBean;
import com.pinhost.app.webshopxxl2.facade.ArtikelFacade;
import com.pinhost.app.webshopxxl2.dataBeans.ArtikelTypCategorieBean;
import com.pinhost.app.webshopxxl2.dataBeans.ArtikelTypGroupBean;
import com.pinhost.app.webshopxxl2.util.Util;

public class ArtikelListBean extends Util {

	private List<ArtikelTypCategorieBean> articelTypCategorieList;
	
	// The actual selected List's and Beans
	private List<ArtikelTypGroupBean> actualArtikelGroupBeanList;
	private ArtikelTypGroupBean actualArtikelGroupBean;
	

	/**
	 * @author heiko <br>
	 *         init Methode to read all Artikel Data from Database <br>
	 *         For each ArtikelTypCategorie read a List of <br>
	 *         ArtikelTypGroupBean and set this in the setter
	 *         List<ArtikelTypGroupBean> <br>
	 *         from the ArtikelTypCategorie <br>
	 *         The List<ArtikelTypGroupBean> is a Property of
	 *         ArtikelTypCategorie
	 * @return
	 */
	private void init() {

		if (articelTypCategorieList == null) {
			articelTypCategorieList = ArtikelFacade.getAllArticelTypCategorieBean();

			// Read all ArtikelTypGroups
			for (ArtikelTypCategorieBean bean : articelTypCategorieList) {
				bean.setArtikelTypGroupList(ArtikelFacade.getAllArticelTypGroupBean(bean.getId()));
			}
		}
	}

	/***
	 * @author heiko <br>
	 * @return List<ArticelTypKategorieBean>
	 */
	public List<ArtikelTypCategorieBean> getAllArticelTypKategorieBean() {
		
		if (articelTypCategorieList == null) {
			init();
		}	
		
		return articelTypCategorieList;
	}

	/***
	 * @author heiko
	 * 
	 * <br> Get all ArtikelTypBean
	 * <br> get the actual selected ArtikelTypGroupBean from here
	 * <br>  ( actualArtikelGroupBean )
	 * <br> and read the List of ArtikelTyp from Facade with the id 
	 * <br> from the actual selected ArtikelTypGroupBean
	 * @return List<ArtikelTypBean>
	 */
	public List<ArtikelTypBean> getArtikelTypBean() {
		return ArtikelFacade.getAllArtikelTypBean(actualArtikelGroupBean.getId());
	}

/*************************************************************************************/
/* Action Methods                                                                    */
/*************************************************************************************/

	/****
	 * @author heiko <br>
	 * <br> Switch to the ArtikelType Page of the selected ArtikelTypGroupBean
	 * <br> set the ArtikelTypGroupBean as actual ..Bean 
	 * <br>   for this ...
	 * <br>    - get the List of ArtikelTypGroupBean from the List of ArtikelTypCategorie
	 * <br>    - with the param artikelTypCategorie_index
	 * <br>    - and then get the ArtikelTypGroupBean from this LIst
	 * <br>    - with the param artikelTypGroup_index
	 * @param int artikelTypCategorie_index
	 * @param artikelTypGroup_index
	 */
	public void switchArtikelGroup(ActionEvent event) {
	
		int artikelTypCategorie_index = (Integer) event.getComponent().getAttributes().get("artikelTypCategorie_index");
		int artikelTypGroup_index = (Integer) event.getComponent().getAttributes().get("artikelTypGroup_index");

		// set the selected List of ArtikelTypGroupBeans
		actualArtikelGroupBeanList = articelTypCategorieList.get(artikelTypCategorie_index)
				.getArtikelTypGroupList();
		// set the selected List of ArtikelTypGroupBean
		actualArtikelGroupBean = actualArtikelGroupBeanList.get(artikelTypGroup_index);
		
		getNavigationBean().setContent_page(getNavigationBean().getCONTENT_ARTICELTYP_PAGE());
	}

}
