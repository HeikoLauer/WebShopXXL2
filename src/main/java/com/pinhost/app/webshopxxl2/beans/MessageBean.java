/******************************************************************/
/* @Author 		: heiko lauer                                     */
/* @Date        : 2017.02.10                                      */
/* @LastDate    : 2017.03.01                                      */
/* @Description : Bean for Messages                               */
/* @Scope		: Request                                         */
/* xhtml        : pages/message.xhtml                             */
/******************************************************************/

package com.pinhost.app.webshopxxl2.beans;

import com.pinhost.app.webshopxxl2.util.MeldungenUtil;

public class MessageBean extends MeldungenUtil {
 
	private String messageText;
	private String messageCSS;

	/***
	 * @author heiko
	 * <br> Init the Bean
	 */
	public MessageBean(){
		setLoginStartState();
	}

	/**** Getter and Setter *************************/
	
	public String getMessageText() {
		return messageText;
	}
	public void setMessageText(String messageText) {
		this.messageText = messageText;
	}

	public String getMessageCSS() {
		return messageCSS;
	}

	public void setMessageCSS(String messageCSS) {
		this.messageCSS = messageCSS;
	}
	
	
	/*** Helper Methods to set Meldungen text and color ****/
	
	public void setLoginStartState(){
		setMessageText(MeldungenUtil.getText_LoginDialog());
		setMessageCSS(MeldungenUtil.getCss_LoginDialog());
	}
	
	public void setLoginCorrectState(String name){
		setMessageText(MeldungenUtil.getText_Correct_Login() + " : " + name);
		setMessageCSS(MeldungenUtil.getCss_Correct_Login());
	}

	public void setLoginWrongState(){
		setMessageText(MeldungenUtil.getText_WrongLoginDialog());
		setMessageCSS(MeldungenUtil.getCss_WrongLoginDialog());
	}

}
