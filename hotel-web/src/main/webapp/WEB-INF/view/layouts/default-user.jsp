<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>User page</title>
	</head>
	<body background="/assets/images/bg.jpg">
		<img align="right" src="/assets/images/NetCracker.png" alt="Я не появился, но я очень старался:(" width="400" height="100"/>
		<tiles:insertAttribute name="header"/>
		<br/>
		<br/>
		<br/>
		<h1><p align="center">User page</p></h1>
		<tiles:insertAttribute name="menu"/>
		<tiles:insertAttribute name="main"/>
		<tiles:insertAttribute name="footer"/>
		
	</body>
</html>