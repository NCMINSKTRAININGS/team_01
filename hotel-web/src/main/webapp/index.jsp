<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
Я index а ты кто?

	<form method="post" class="signin" action="j_spring_security_check">
	
		<table>
			<tr>
				<td>Login: </td>
				<td><input id="username_or_email" name="username" type="text" /></td>
			</tr>
			
			<tr>
				<td>Password: </td>
				<td><input id="password" name="password" type="password" /></td>
			</tr>
			
			<tr align="right">
				<td colspan="2">
					<input id="remember_me" name="_spring_security_remember_me" type="checkbox"/>
					Remember me
					<input name="commit" type="submit" value="Sign In" />
				</td>
			</tr>
		</table>
	
	</form>

    <form action="registration">
        <input type="submit" value="go to registration">
    </form>
</body>
</html>
