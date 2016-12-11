<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
Я index а ты кто?

    <form action="user/registration">
        <input type="submit" value="go to registration">
    </form>

<form action="user/login">
    <input type="submit" value="go to login">
</form>

<form action="user/main">
    <input type="submit" value="go to main">
</form>

</body>
</html>
