<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>

<h4>main</h4>

<sf:form action="/claim/addClaim" method="POST" modelAttribute="userClaimModel" onsubmit = "return validation_addClaim();">
	
	<sf:hidden path="roomId" value="${roomId}"/>
	
    <table align="center">
        <tr>
            <td>Check in date</td>
            <fmt:formatDate value="" var="dateString" pattern="dd-MM-yyyy" />
            <td><sf:input type = "date" id="checkInDate" path="checkInDate" required="required" value = "${dateString}"/></td>
        </tr>
        <tr>
            <td>Check out date</td>
            <td><sf:input type="date" path="checkOutDate" id="checkOutDate" required="required" value="${dateString}"/></td>
        </tr>
        <tr>
            <td colspan="2" align="center">
                <input type="submit" value="Add Claim">
            </td>
        </tr>
    </table>
</sf:form>



</body>
</html>