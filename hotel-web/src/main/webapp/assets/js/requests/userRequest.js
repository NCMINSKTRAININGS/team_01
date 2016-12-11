function registration() {
	var user = {
		login: document.getElementById('login').value,
		password1: document.getElementById('password1').value,
		password2: document.getElementById('password2').value,
		name: document.getElementById('name').value,
		surname: document.getElementById('surname').value,
		email: document.getElementById('email').value,
		phone: document.getElementById('phone').value
	};
	
	$.ajax({
		url: 'registration',
		type: 'POST',
		dataType: 'json',
		contentType: 'application/json',
		data: JSON.stringify(user),
		success: location.href = 'index.jsp'
	});
}