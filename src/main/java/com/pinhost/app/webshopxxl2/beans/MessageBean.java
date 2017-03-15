/******************************************************************/
/* @Author 		: heiko lauer                                     */
/* @Date        : 2017.02.10                                      */
/* @LastDate    : 2017.03.01                                      */
/* @Description : Bean for Messages                               */
/* @Scope		: Session                                         */
/* @Scope		: Request                                         */
/* xhtml        : pages/message.xhtml                             */
/******************************************************************/

package com.pinhost.app.webshopxxl2.beans;

import java.util.ArrayList;
import java.util.List;

import com.pinhost.app.webshopxxl2.util.MeldungenUtil;

public class MessageBean extends MeldungenUtil {
 
	private String messageCSS;
	private List<String> messageList = new ArrayList<String>();
	private List<String> messageListRetvalue = new ArrayList<String>();
	
	/***
	 * @author heiko
	 * <br> Init the Bean
	 */
	public MessageBean(){
		setLoginStartState();
	}

	/**** Getter and Setter *************************/
	
	public void setMessageText(String messageText) {
		messageList.add(messageText);
	}

	public String getMessageCSS() {
		return messageCSS;
	}
	public void setMessageCSS(String messageCSS) {
		this.messageCSS = messageCSS;
	}
	
	
	public List<String> getMessageList() {
		
		messageListRetvalue.clear();
		
		if(messageList.size()>0){
			
			for(String msg : messageList){
				messageListRetvalue.add(msg);
			}
			messageList.clear();
		}
		
		return messageListRetvalue;
	}

	/*** Helper Methods to set Meldungen text and color ****/
	
	public void setLoginStartState(){
		setMessageText(MeldungenUtil.getText_LoginDialog());
		setMessageCSS(MeldungenUtil.getCss_Message());
	}
	
	public void setLoginCorrectState(String name){
		setMessageText(MeldungenUtil.getText_Correct_Login() + " : " + name);
		setMessageCSS(MeldungenUtil.getCss_Message());
	}

	public void setLoginWrongState(){
		setMessageText(MeldungenUtil.getText_WrongLoginDialog());
		setMessageCSS(MeldungenUtil.getCss_Error());
	}
	
	public void setCustomerUnknown(String customer){
		String msg = "Der Benutzer - " + customer + " - ist dem System nicht bekannt!";
		setMessageText(msg);
		setMessageCSS(MeldungenUtil.getCss_Warning());
	}

	public void setChangePasswordOk(){
		setMessageText(MeldungenUtil.getText_ChangePasswordOK());
		setMessageCSS(MeldungenUtil.getCss_Message());
	}

}
