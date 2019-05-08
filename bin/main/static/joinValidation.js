/**
 * 
 */

function transAlphabet(){
	var str = document.getElementById("userid");
	
	if(str.value.match(/[^A-Z^a-z\d\-]/)){
		alert("英文、数字のみ入力してください。");
		str.value = "";
	}
	
}

function dataCheck(){
	
	var userid = document.getElementById("userid");
	var userpwd = document.getElementById("userpwd");
	var email = document.getElementById("email");
	
	
	if(userid.value.length < 3 || userid.value.length > 12 ){
		
		
		alert("IDは3~12文字。");
		userid.select();
		userid.focus();
		
		return false;
	}
	
	if(userpwd.value.length < 3 || userpwd.value.length > 12 ){
		alert("パスワードは3~12文字。");
		userpwd.select();
		userpwd.focus();
		
		return false;
	}
	
	if(username.value.trim() == ''){
		alert("お名前を入力してください。");
		username.focus();
		username.select();
		
		return false;
	}
	
	
	var mailCheck = /^[A-Za-z0-9_\.\-]+@[A-Za-z0-9\-]+\.[A-Za-z0-9\-]+/;
	if(!mailCheck.test(email.value)){
		alert("メールアドレスが間違っています。");
		email.focus();
		email.select();
		
		return false;
	}

	return true;
}