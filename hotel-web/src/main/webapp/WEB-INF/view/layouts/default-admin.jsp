<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Admin page</title>
	</head>
	<body>
		
		<form action="j_spring_security_logout">
    		<input type="submit" value="LOGOUT">
		</form>
	
		<h2>Admin page</h2>
		
		<tiles:insertAttribute name="header"/>
		<tiles:insertAttribute name="menu"/>
		<tiles:insertAttribute name="main"/>
		<tiles:insertAttribute name="footer"/>
		
	</body>
</html>