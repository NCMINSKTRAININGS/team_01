<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script src="<c:url value="/resources/js/jquery-3.1.1.min.js"/>"></script>
        <script src="<c:url value="/resources/js/requests/addRoom.js"/>"></script>
        <script src="<c:url value="/resources/js/requests/addClaimRequest.js"/>"></script>
    </head>
    <body >

    <c:choose>
    <c:when test="${command == 'addRoom'}">
    <div>

        <div align="center">

            <hr/>
            <form action="/admin/main" method="post" >
                    <h3>Register new room</h3>

                    Coast:
                    <input type="text" id="coast" name="coast" />

                    Seats:
                    <input type="text" id="seats" name="seats" />

                    <div>
                        <br/>
                        Type:
                        <c:forEach  var="k" begin="0" end="${type.size()-1}">
                                <c:out value="${type[k].getTypeEn()}"/>
                                <input type="radio" class="button" name="type" id="type" value="${type[k].getId()}"/>
                        </c:forEach>
                        <br/>
                    </div>
                <br/>

                <input type="button" value="Register the Room" onclick="addRoom()"/>

            </form>

        </div>
        </c:when>
        </c:choose>
    </div>
    </body>
</html>