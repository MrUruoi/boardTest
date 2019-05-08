/**
 * 
 */

function loginCheck(){
		var userid = document.getElementById("userid");
		var userpwd = document.getElementById("userpwd");
		
		if (userid.value == '') {
			alert('IDを入力してください。');
			userid.select();
			userid.focus();
			return;
		}
		
		if (userpwd.value.length == 0) {
			alert('パスワードを入力してください。');
			userpwd.select();
			userpwd.focus();
			return;
		}
		
		var form = document.getElementById("loginForm");
		form.submit();
		
}