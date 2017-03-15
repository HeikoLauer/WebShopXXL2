
function js_init(){

	/** Calculate the Screen *****/
	
	var w = window.innerWidth-100;
	var m= w-260;
	if(m<10){m=10;}
    
	document.getElementById("id_menu_menubar").style.width = w+"px";
	document.getElementById("form_menubar:id_menu_menuEnd").style.marginLeft=m+"px";

}

function js_common_check_login(){

	var loginnanme = document.getElementById("form_login_page:id_loginpage_loginname_input").value;
	var password = document.getElementById("form_login_page:id_loginpage_password_input").value;
	
	document.getElementById("form_login_page:id_loginpage_button_login").disabled = true;
	if(loginnanme.length>3 && password.length>3){
		document.getElementById("form_login_page:id_loginpage_button_login").disabled = false;	
	}
}

function js_common_changepassword(){

	var password = document.getElementById("form_settingspage:id_passwordpage_password_input").value;
	var oldpassword = document.getElementById("form_settingspage:form_newpasswordpage:id_passwordpage_oldpassword_input").value;
	var newpassword1 = document.getElementById("form_settingspage:form_newpasswordpage:id_passwordpage_newpassword_input").value;
	var newpassword2 = document.getElementById("form_settingspage:form_newpasswordpage:id_passwordpage_repeatpassword_input").value;
	
	document.getElementById("form_settingspage:form_newpasswordpage:id_passwordpage_message").innerHTML="";
	document.getElementById("form_settingspage:form_newpasswordpage:id_passwordpage_save").style.display="none";
	
	if(oldpassword != password){
		document.getElementById("form_settingspage:form_newpasswordpage:id_passwordpage_message").innerHTML="Das alte Password ist nicht richtig";
		document.getElementById("form_settingspage:form_newpasswordpage:id_passwordpage_save").style.display="none";
	} else {

		document.getElementById("form_settingspage:form_newpasswordpage:id_passwordpage_oldpassword_input").disabled="true";
		
		if(newpassword1.length==0 && newpassword2.length==0){
			document.getElementById("form_settingspage:form_newpasswordpage:id_passwordpage_message").innerHTML="Bitte die neuen Passwörter eingeben";
		} else {
			if(newpassword1 != newpassword2){
				document.getElementById("form_settingspage:form_newpasswordpage:id_passwordpage_message").innerHTML="Die neuen Passwörter sind nicht gleich";
			} else{
				
				if(newpassword1.length<8){
					document.getElementById("form_settingspage:form_newpasswordpage:id_passwordpage_message").innerHTML="Die neuen Passwörter sind zu kurz, bitte mindestens 8 Zeichen";
				} else{
					document.getElementById("form_settingspage:form_newpasswordpage:id_passwordpage_save").style.display="inline";
				}
			}
		}
	}
}

