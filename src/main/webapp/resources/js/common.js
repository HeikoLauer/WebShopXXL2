
function js_init(){
	document.getElementById("form_loginpage:id_loginpage_button_login").disabled = true;
}

function js_common_check_login(){
	
	var loginnanme = document.getElementById("form_loginpage:id_loginpage_loginname_input").value;
	var password = document.getElementById("form_loginpage:id_loginpage_password_input").value;
	
	document.getElementById("form_loginpage:id_loginpage_button_login").disabled = true;
	if(loginnanme.length>3 && password.length>3){
		document.getElementById("form_loginpage:id_loginpage_button_login").disabled = false;	
	}
		
}
