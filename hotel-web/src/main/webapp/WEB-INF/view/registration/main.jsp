<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Registration</title>
    <script src="<c:url value="/resources/js/jquery-3.1.1.min.js"/>"></script>
    <script src="<c:url value="/resources/js/requests/userRequest.js"/>"></script>
</head>
<body>
    <form>
		<input type="hidden" name="command" value="registration"/>
		
		<table align="center">
			<tr>
				<td>Login:</td>
				<td><input type="text" name="login" id="login"/></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><input type="password" name="password1" id="password1"/></td>
			</tr>
			
			<tr>
				<td>Password:</td>
				<td><input type="password" name="password2" id="password2"/></td>
			</tr>
			
			<tr>
				<td>Name:</td>
				<td><input type="text" name="name" id="name"/></td>
			</tr>
			<tr>
				<td>Surname:</td>
				<td><input type="text" name="surname" id="surname"/></td>
			</tr>
			<tr>
				<td>Email:</td>
				<td><input type="text" name="email" id="email"/></td>
			</tr>
			<tr>
				<td>Phone:</td>
				<td><input type="text" name="phone" id="phone"/></td>
			</tr>
			<tr>
				<td colspan="2" align="center">
					<input type="button" value="Registration" onclick="registration()"/>
				</td>
			</tr>
		</table>
	</form>
</body>
</html>

