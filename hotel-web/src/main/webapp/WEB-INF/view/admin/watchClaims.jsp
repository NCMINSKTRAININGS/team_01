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
    <link href="/assets/css/style.css" type="text/css" rel="stylesheet">
    <script src="<c:url value="/assets/js/jquery-3.1.1.min.js"/>"></script>
    <script src="<c:url value="/assets/js/requests/addRoom.js"/>"></script>
    <style>
        p{
            color: white;
            margin: 0;
        }
        table {
            /*border-collapse: collapse; !* Убираем двойные линии между ячейками *!*/
            /*border: 5px; !* Прячем рамку вокруг таблицы *!*/
        }
        td, tr {
            border: 0px;
        }
    </style>
</head>
<body>
<div align="center">
    <c:choose>
        <c:when test="${command == 'showClaims' && claims.size() > 0}">
            <hr/>
            <br/>

            <h3> <p>Claims acceptance</p></h3>

            <br/>
            <br/>
            <hr/>

            <br/>
            <c:forEach  var="k" begin="0" end="${claims.size()-1}">
                <div>
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
                    <div>
                        <table class="greenField" width="550" border="0">
                            <tr>
                                <td>
                                    <img src="/assets/images/default.png" alt="Я не появился, но я очень старался:(" width="100" height="100"/>
                                </td>

                                <td rowspan="2">
                                    <table border="0">
                                        <tr>
                                            <td>
                                                <p>Name:</p>
                                            </td>
                                            <td>
                                                <p>
                                                    <c:out value="${users[k].getName()} ${users[k].getSurname()}"/>
                                                </p>
                                            </td>
                                        </tr>

                                        <tr>
                                            <td>
                                                <p>
                                                    Login:
                                                </p>
                                            </td>
                                            <td>
                                                <p>
                                                    <c:out value="${users[k].getLogin()}"/>
                                                </p>
                                            </td>
                                        </tr>

                                        <tr>
                                            <td>
                                                <p>
                                                    Email:
                                                </p>
                                            </td>
                                            <td>
                                                <p>
                                                    <c:out value="${users[k].getEmail()}"/>
                                                </p>
                                            </td>
                                        </tr>

                                        <tr>
                                            <td>
                                                <p>
                                                    Phone:
                                                </p>
                                            </td>
                                            <td>
                                                <p>
                                                    <c:out value="${users[k].getPhone()}"/>
                                                </p>
                                            </td>
                                        </tr>

                                        <tr>
                                            <td>
                                                <p>
                                                    Role:
                                                </p>
                                            </td>
                                            <td>
                                                <p>
                                                    <c:out value="${users[k].getRole()}"/>
                                                </p>
                                            </td>
                                        </tr>

                                    </table>
                                </td>
                            </tr>

                            <tr>
                                <td align="center">
                                    <input type="button" class="buttonG" align="center" value="show claims" onclick="getClaimByUser('showClaims', ${users[k].getId()})"/>
                                </td>
                            </tr>
                        </table>
                    </div>
                </c:forEach>


        </c:when>

        <c:when test="${claims.size() == 0}">
            <p>No claims</p>
        </c:when>
        <c:when test="${command == null}">
            <input type="button" value="watch users" onclick="setCommandAdmin('showUsers')"/>
            <input type="button" value="AddRoom" onclick="setCommandAdmin('addRoom')"/>
        </c:when>
        </c:choose>

    </div>
</body>
</html>
