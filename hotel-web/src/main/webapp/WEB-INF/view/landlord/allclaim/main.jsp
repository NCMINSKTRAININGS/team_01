<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Browse requests</title>
    <link href="/assets/css/style.css" type="text/css" rel="stylesheet">
    <style>
        p{
            color:yellow;
            margin-bottom: 0;
        }
        .inline{
            display: inline-block;
            /*margin-left: 10%;*/
        }
        .simpleInput{
            width: 300px;
        }
        .simpleInput:focus{
            width: 310px;
        }
        a{
            color: white;
        }
    </style>
</head>

<body background="/assets/images/bg.jpg">

    <div align="center">

        <c:forEach var = "claim" items ="${claims}" varStatus= "loopIndex">

            <div align="center">
                <p>Data In</p>
                <p style="margin-top: 0" class="simpleInput">
                    <c:out value="${claim.getCheckInDate()}"/>
                </p>

                <p>Data Out</p>
                <p style="margin-top: 0" class="simpleInput">
                    <c:out value="${claim.getCheckOutDate()}"/>
                </p>

                <p>Potential Tenant</p>
                <p style="margin-top: 0" class="simpleInput">
                    <c:out value="${claim.getUser().getLogin()} | ${claim.getUser().getName()} ${claim.getUser().getSurname()}"/>
                </p>

                <p>Room Number</p>
                <p style="margin-top: 0" class="simpleInput">
                    <c:out value="${claim.getRoom().getId()}"/>
                </p>

            </div>
            <br/><br/>

            <div align="center">
                <form action="/room/accept" method="POST">
                    <input type="hidden" name="roomId" value="${claim.getRoom().getId()}">
                    <input type="hidden" name="flag" value="${true}">
                    <input type="hidden" name="userId" value="${claim.getUser().getId()}">
                    <input type="submit" class="glossBtn" align="center" value="Accept">
                </form>

                <br/>

                <form action="/room/accept" method="POST">
                    <input type="hidden" name="roomId" value="${claim.getRoom().getId()}">
                    <input type="hidden" name="flag" value="${false}">
                    <input type="hidden" name="userId" value="${claim.getUser().getId()}">
                    <input type="submit" class="glossBtn" align="center" value="Decline" style="margin-bottom: 30px">
                </form>

            </div>
        </c:forEach>
    </div>

</body>
</html>
