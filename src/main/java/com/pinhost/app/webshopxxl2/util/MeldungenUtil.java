/****************************************************/
/* @Author 		: heiko lauer                       */
/* @Date        : 2017.02.10                        */
/* @Description : Util for Messages                 */
/* @Scope		: No Bean                           */            
/****************************************************/

package com.pinhost.app.webshopxxl2.util;

public class MeldungenUtil {

	/*** Message Text **************************************/
	private static String TEXT_ANMELDEN = "Bitte melden Sie sich an";
	private static String TEXT_WRONG_LOGIN = "Ihre Anmeldedaten sind fehlerhaft";
	private static String TEXT_CORRECT_LOGIN = "Sie sind erfolgreich angemeldet";

	/*** CSS definition ************************************/
	private static String CSS_ANMELDEN ="color : green";
	private static String CSS_WRONG_LOGIN ="color : red";
	private static String CSS_CORRECT_LOGIN ="color : green";
	
	
	/**** Getter for Texte ****************************/

	public static String getText_LoginDialog(){
		return TEXT_ANMELDEN;
	}

	public static String getText_WrongLoginDialog(){
		return TEXT_WRONG_LOGIN;
	}

	public static String getText_Correct_Login() {
		return TEXT_CORRECT_LOGIN;
	}

	/**** Getter for CSS  *****************************/
	
	public static String getCss_LoginDialog(){
		return CSS_ANMELDEN;
	}

	public static String getCss_WrongLoginDialog(){
		return CSS_WRONG_LOGIN;
	}

	public static String getCss_Correct_Login() {
		return CSS_CORRECT_LOGIN;
	}
	
}

