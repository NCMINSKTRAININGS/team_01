<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<sec:authorize access="hasRole('ROLE_ADMIN')">
    HALLO ADMIN
</sec:authorize>

<sec:authorize access="hasRole('ROLE_USER')">
    HALLO USER
</sec:authorize>

<form action="<c:url value="/static/j_spring_security_logout"/>">
    <input type="submit" value="LOGOUT">
</form>
</body>
</html>
