/****************************************************/
/* @Author 		: heiko lauer                       */
/* @Date        : 2017.02.16                        */
/* @Description : Bean for Product List             */
/* @Scope		: Session                           */            
/****************************************************/

package com.pinhost.app.webshopxxl2.beans;

import java.util.List;

import com.pinhost.app.webshopxxl2.facade.ProductFacade;
import com.pinhost.app.webshopxxl2.util.Util;

public class ProductListBean extends Util {

	/***
	 * @author heiko
	 * 
	 * <br> Get all CategorienBean
	 * @return List<CategorieBean>
	 */
	public List<ProductBean> getAllProduct(){
		return ProductFacade.getAllProduct(getSessionBean().getCategorieBean().getId());
	}
	
}
