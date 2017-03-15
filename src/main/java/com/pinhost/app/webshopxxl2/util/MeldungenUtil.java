/*****************************************************************/
/* @Author 		: heiko lauer                                    */
/* @Date        : 2017.02.10                                     */
/* @LastChange  : 2017.03.02                                     */
/* @Description : Util for Messages                              */
/* @Scope		: No Bean                                        */            
/*****************************************************************/

package com.pinhost.app.webshopxxl2.util;

public class MeldungenUtil {

	/*** Message Text **************************************/
	private static String TEXT_ANMELDEN = "Bitte melden Sie sich an";
	private static String TEXT_WRONG_LOGIN = "Ihre Anmeldedaten sind fehlerhaft";
	private static String TEXT_CUSTOMER_UNKNOWN = "Der Benutzer $ ist nicht bekannt";
	private static String TEXT_CORRECT_LOGIN = "Sie sind erfolgreich angemeldet";
	
	private static String TEXT_ARTIKELTYP_MAXOVER = "Sie dürfen von diesem Artikel keine weiteren kaufen";

	private static String TEXT_COUSTUMER_CREDIT = "Ihr Guthaben ist zu gering";

	private static String TEXT_CHANGEPASSWORD_OK = "Sie haben ihr Password erfolgreich geändert";

	/*** CSS definition ************************************/
		
	private static String CSS_ERROR ="color : red";
	private static String CSS_WARNING ="color : blue";
	private static String CSS_MESSAGE ="color : green";

	/**** Getter for Texte ****************************/

	public static String getText_LoginDialog(){
		return TEXT_ANMELDEN;
	}

	public static String getText_WrongLoginDialog(){
		return TEXT_WRONG_LOGIN;
	}
	
	public static String getText_CustomerUnknownDialog(){
		return TEXT_CUSTOMER_UNKNOWN;
	}
	
	public static String getText_Correct_Login() {
		return TEXT_CORRECT_LOGIN;
	}

	public static String getText_ArtikelTypMaxOver() {
		return TEXT_ARTIKELTYP_MAXOVER;
	}
	
	public static String getText_CostumCredit() {
		return TEXT_COUSTUMER_CREDIT;
	}
	
	public static String getText_ChangePasswordOK() {
		return TEXT_CHANGEPASSWORD_OK;
	}
	
	
	/**** Getter for CSS  *****************************/
	

	
	public static String getCss_Error() {
		return CSS_ERROR;
	}

	public static String getCss_Warning() {
		return CSS_WARNING;
	}

	public static String getCss_Message() {
		return CSS_MESSAGE;
	}

}

