<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Registration</title>
    <script src="<c:url value="/resources/js/jquery-3.1.1.min.js"/>"></script>
    <script src="<c:url value="/resources/js/requests/userRequest.js"/>"></script>
	<script src="<c:url value="/resources/js/requests/validations.js"/>"></script>
</head>
<body>

    <sf:form action="" method="POST" modelAttribute="userModel" onsubmit="return validation_registration()">
		<table align="center">
			<tr>
				<td>Login:</td>
				<td><sf:input id="login" path="login" required="required"/></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><sf:password id="password1" path="password1" required="required"/></td>
			</tr>
			
			<tr>
				<td>Password:</td>
				<td><sf:password id="password2" path="password2" required="required"/></td>
			</tr>
			
			<tr>
				<td>Name:</td>
				<td><sf:input id="name" path="name" required="required"/></td>
			</tr>
			<tr>
				<td>Surname:</td>
				<td><sf:input id = "surname" path="surname" required="required"/></td>
			</tr>
			<tr>
				<td>Email:</td>
				<td><sf:input id = "email" path="email" required="required"/></td>
			</tr>
			<tr>
				<td>Phone:</td>
				<td><sf:input id="phone" path="phone" required="required"/></td>
			</tr>
			<tr>
				<td colspan="2" align="center">
					<input type="submit" value="Registration">
				</td>
			</tr>
		</table>
	</sf:form>
	
	<span>Errors</span>
	<span>${errors["login"]}</span>
	<span>${errors["password"]}</span>
	<span>${errors["password.no_match"]}</span>
	<span>${errors["name"]}</span>
	<span>${errors["surname"]}</span>
	<span>${errors["email"]}</span>
	<span>${errors["phone"]}</span>
	
</body>
</html>

