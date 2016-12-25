<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Registration</title>
    <script src="<c:url value="/assets/js/jquery-3.1.1.min.js"/>"></script>
    <script src="<c:url value="/assets/js/requests/userRequest.js"/>"></script>
</head>
<body>

    <sf:form action="" method="POST" modelAttribute="userModel">
		<table align="center">
			<tr>
				<td>Login:</td>
				<td><sf:input path="login"/></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><sf:password path="password1"/></td>
			</tr>
			
			<tr>
				<td>Password:</td>
				<td><sf:input path="password2"/></td>
			</tr>
			
			<tr>
				<td>Name:</td>
				<td><sf:input path="name"/></td>
			</tr>
			<tr>
				<td>Surname:</td>
				<td><sf:input path="surname"/></td>
			</tr>
			<tr>
				<td>Email:</td>
				<td><sf:input path="email"/></td>
			</tr>
			<tr>
				<td>Phone:</td>
				<td><sf:input path="phone"/></td>
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

