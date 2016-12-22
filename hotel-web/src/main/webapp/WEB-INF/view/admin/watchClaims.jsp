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
    <script src="<c:url value="/resources/js/requests/addClaimRequest.js"/>"></script>
    <script src="<c:url value="/resources/js/requests/claimssWatch.js"/>"></script>
</head>
<body>
    <hr/>
    <br/>

    CLAIMS ACCEPTANCE

    <br/>
    <br/>
    <hr/>

    <br/>
    <div>
        <c:choose>
            <c:when test="${command == 'findClaims' && claims.size() > 0}">
                <c:forEach  var="k" begin="0" end="${claims.size()-1}">
                    <div class = "data_string">
                        <c:out value="Type = ${claims[k].getTypeObj().getTypeEn()}   "/>
                        <c:out value="check in date${claims[k].getCheckInDate()}   "/>
                        <c:out value="check out date${claims[k].getCheckOutDate()}   "/>
                        <c:out value="STATUS = ${claims[k].getStatus()}   "/>
                    </div>
                    <hr/>
                </c:forEach>
            </c:when>
            <c:when test="${command == null}">
                <input type="button" value="watch claims" onclick="watchClaims('addClaim')"/>
            </c:when>
        </c:choose>

    </div>
</body>
</html>
