<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
    <title>Registration</title>
</head>
<body>
    Registration

    <sf:form action="" method="POST" modelAttribute="user">
        <fieldset>
            <label for="login">Login:</label>
            <sf:input path="login"/><br>
            <label for="password">Password:</label>
            <sf:password path="password"/><br>
            <label for="name">Name:</label>
            <sf:input path="name"/><br>
            <label for="surname">Surname:</label>
            <sf:input path="surname"/><br>
            <label for="email">Email:</label>
            <sf:input path="email"/><br>
            <label for="phone">Phone:</label>
            <sf:input path="phone"/><br>
            <input type="submit" value="Registration">
        </fieldset>
    </sf:form>
</body>
</html>

