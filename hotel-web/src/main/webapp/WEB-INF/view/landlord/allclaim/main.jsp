<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <table align="center">
        <tr>
            <td>    data in    </td>
            <td>    data out   </td>
            <td>   data userName   </td>
            <td>   number Room     </td>
        </tr>
            <c:forEach var = "claim" items ="${claims}" varStatus= "loopIndex">
        <tr>
                <td>
                    <c:out value="${claim.getCheckInDate()}"/>
                </td>
                <td>
                    <c:out value="${claim.getCheckOutDate()}"/>
                </td>
                <td>
                    <c:out value="${claim.getUser().getLogin()}"/>
                </td>

                <td>
                    <c:out value="${claim.getRoom().getId()}"/>
                </td>
                <td>
                    <form action="/room/accept" method="POST">
                        <input type="hidden" name="roomId" value="${claim.getRoom().getId()}">
                        <input type="hidden" name="flag" value="${true}">
                        <input type="hidden" name="userId" value="${claim.getUser().getId()}">
                        <input type="submit" value="Accept">
                    </form>
                </td>
                <td>
                    <form action="/room/accept" method="POST">
                        <input type="hidden" name="roomId" value="${claim.getRoom().getId()}">
                        <input type="hidden" name="flag" value="${false}">
                        <input type="hidden" name="userId" value="${claim.getUser().getId()}">
                        <input type="submit" value="Decline">
                    </form>
                </td>
            </tr>
            </c:forEach>
    </table>

</body>
</html>
