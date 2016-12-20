<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Valeria
  Date: 13.12.2016
  Time: 21:59
  To change this template use File | Settings | File Templates.
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script src="<c:url value="/resources/js/jquery-3.1.1.min.js"/>"></script>
        <script src="<c:url value="/resources/js/requests/addRoom.js"/>"></script>
    </head>
    <body>

        <div align="center">

            <hr/>
            <form>
                    <h5>Register new room</h5>

                    Coast:
                    <input type="text" id="coast" name="coast" />

                    Seats:
                    <input type="text" id="seats" name="seats" />

                    Status_id:
                    <input type="text" id="status_id" name="status_id" />

                    Type_id:
                    <input type="text" id="type_id" name="type_id" />

                    <input type="button" value="Register the Room" onclick="registerRoom()"/>
            </form>
            <hr/>

        </div>

    </body>
</html>