<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <link href="/assets/css/style.css" type="text/css" rel="stylesheet">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <style>
        p{
            color: white;
        }
    </style>
</head>
<body background="/assets/images/bg.jpg">
    <img align="right" src="/assets/images/NetCracker.png" alt="Я не появился, но я очень старался:(" width="400" height="100"/>
    <br/><br/><br/>
    <h4><p>main</p></h4>
    <br/><br/><br/><br/>
    <h2><p align="center">Please, plane your visit</p></h2>
    <sf:form action="claim/addClaim" method="POST" modelAttribute="userClaimModel" onsubmit = "return validation_addClaim();">

        <sf:hidden path="roomId" value="${roomId}"/>

        <table align="center">
            <tr>
                <td><p>Check in date</p></td>
                <fmt:formatDate value="" var="dateString" pattern="dd-MM-yyyy" />
                <td><p><sf:input type = "date" id="checkInDate" path="checkInDate" required="required" value = "${dateString}"/></p></td>
            </tr>
            <tr>
                <td><p>Check out date</p></td>
                <td><p><sf:input type="date" path="checkOutDate" id="checkOutDate" required="required" value="${dateString}"/></p></td>
            </tr>
            <tr/><tr/><tr/><tr/><tr/><tr/><tr/>
            <tr>
                <td colspan="2" align="center">
                    <input type="submit" class="buttonG" value="Add Claim">
                </td>
            </tr>
        </table>
    </sf:form>



</body>
</html>