package com.pinhost.app.webshopxxl2.util;

import javax.faces.context.FacesContext;
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
}
