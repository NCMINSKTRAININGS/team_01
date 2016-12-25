<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<%--
  Created by IntelliJ IDEA.
  User: Valeria
  Date: 21.12.2016
  Time: 17:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <script src="<c:url value="/resources/js/jquery-3.1.1.min.js"/>"></script>
    <script src="<c:url value="/resources/js/requests/addRoom.js"/>"></script>
</head>
<body>
<div align="center">
    <c:choose>
        <c:when test="${command == 'showClaims' && claims.size() > 0}">
            <hr/>
            <br/>

            <h3>Claims acceptance</h3>

            <br/>
            <br/>
            <hr/>

            <br/>
            <c:forEach  var="k" begin="0" end="${claims.size()-1}">
                <div  >
                    <c:out value="Type = ${claims[k].getType().getTypeEn()}   "/>
                    <c:out value="check in date${claims[k].getCheckInDate()}   "/>
                    <c:out value="check out date${claims[k].getCheckOutDate()}   "/>
                    <c:out value="STATUS = ${claims[k].getStatus()}   "/>
                </div>
                <hr/>
            </c:forEach>
        </c:when>

            <c:when test="${command == 'showUsers' && users.size() > 0}">
                <c:forEach  var="k" begin="0" end="${users.size()-1}">
                    <div >
                        <c:out value="Name = ${users[k].getName()}   "/>
                        <c:out value="Login ${users[k].getLogin()}   "/>
                        <c:out value="Email${users[k].getEmail()}   "/>
                        <input type="button" value="settings" onclick="getClaimByUser('showClaims', ${users[k].getId()})"/>
                    </div>
                </c:forEach>
            </c:when>

        <c:when test="${claims.size() == 0}">
            claims absent
        </c:when>
        <c:when test="${command == null}">
            <input type="button" value="watch users" onclick="setCommandAdmin('showUsers')"/>
            <input type="button" value="AddRoom" onclick="setCommandAdmin('addRoom')"/>
        </c:when>
        </c:choose>

    </div>
</body>
</html>