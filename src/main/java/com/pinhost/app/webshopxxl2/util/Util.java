/****************************************************/
/* @Author 		: heiko lauer                       */
/* @Date        : 2017.02.10                        */
/* @Description : Util                              */
/* @Scope		: No Bean                           */            
/****************************************************/

package com.pinhost.app.webshopxxl2.util;

import javax.faces.context.FacesContext;

import com.pinhost.app.webshopxxl2.beans.MessageBean;
import com.pinhost.app.webshopxxl2.beans.NavigationBean;
import com.pinhost.app.webshopxxl2.beans.SessionBean;
import com.pinhost.app.webshopxxl2.beans.UserBean;

import javax.el.ExpressionFactory;
import javax.el.ValueExpression;

public class Util {

	/***
	 * 
	 * @author heiko
	 * <br> Return a ManagedBean for the given Bean Name
	 * @param String name : Name of the Bean
	 * @return Object bean
	 */
	public static Object getBean (String name) 
    { 
        FacesContext fc = FacesContext.getCurrentInstance();
        ExpressionFactory ef = fc.getApplication().getExpressionFactory();
        ValueExpression ve = ef.createValueExpression(fc.getELContext(), "#{" +name + "}",Object.class);
        Object o = ve.getValue(fc.getELContext());
        return o;
    }
	
	/*** Getter for the ManagedBeans **********************/
	
	public NavigationBean getNavigationBean() { return (NavigationBean) getBean("navigationBean"); }
	public SessionBean getSessionBean() { return (SessionBean) getBean("sessionBean"); }
	public UserBean getUserBean() { return (UserBean) getBean("userBean"); }
	public MessageBean getMessageBean() { return (MessageBean) getBean("messageBean"); }

	
}
