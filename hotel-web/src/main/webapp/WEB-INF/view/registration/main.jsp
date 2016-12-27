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
				<td><sf:input id="login" path="login"/></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><sf:password id="password1" path="password1"/></td>
			</tr>
			
			<tr>
				<td>Password:</td>
				<td><sf:password id="password2" path="password2"/></td>
			</tr>
			
			<tr>
				<td>Name:</td>
				<td><sf:input id="name" path="name"/></td>
			</tr>
			<tr>
				<td>Surname:</td>
				<td><sf:input id = "surname" path="surname"/></td>
			</tr>
			<tr>
				<td>Email:</td>
				<td><sf:input id = "email" path="email"/></td>
			</tr>
			<tr>
				<td>Phone:</td>
				<td><sf:input id="phone" path="phone"/></td>
			</tr>
			<tr>
				<td colspan="2" align="center">
					<input type="submit" value="Registration">
				</td>
			</tr>
		</table>
	</sf:form>
</body>
</html>

