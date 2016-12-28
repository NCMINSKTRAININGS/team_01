<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Registration</title>
    <%--<script src="<c:url value="/resources/js/jquery-3.1.1.min.js"/>"></script>--%>
    <%--<script src="<c:url value="/resources/js/requests/userRequest.js"/>"></script>--%>
	<script src="<c:url value="/assets/js/requests/validations.js"/>"></script>

	<link rel="stylesheet" href="/assets/css/style.css">

	<style>
		p{
			color: rgba(253, 255, 0, 0.75);
		}
	</style>
</head>

<body background="/assets/images/bg.jpg">

    <sf:form action="" method="POST" modelAttribute="userModel" onsubmit="return validation_registration()">
		<div align="center">

			<p>Login:<br/>
				<sf:input cssClass="simpleInput" id="login" path="login" required="required"/>
			</p>

			<p>Password:<br/>
				<sf:password id="password1" path="password1" required="required"/>
			</p>

			<p>Repeat password:<br/>
				<sf:password id="password2" path="password2" required="required"/>
			</p>

			<p>Name:<br/>
				<sf:input id="name" path="name" required="required"/>
			</p>

			<p>Surname:<br/>
				<sf:input id = "surname" path="surname" required="required"/>
			</p>

			<p>Email:<br/>
				<sf:input id = "email" path="email" required="required"/>
			</p>

			<p>Phone:<br/>
				<sf:input id="phone" path="phone" required="required"/>
			</p>
			<p>
				<input type="submit" value="Registration">
			<p>


		</div>
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

