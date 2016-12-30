<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<link href="/assets/css/style.css" type="text/css" rel="stylesheet">
		<title>Add Room</title>
		<style>
			p{
				color: yellow;
				margin-bottom: 0;
				margin-top: 20px;

			}
			.simpleInput{
				width: 400px;
			}
			.simpleInput:focus{
				width: 420px;
			}
		</style>
	</head>

	<body background="/assets/images/bg.jpg">

		<h4><p>main</p></h4>

		<sf:form action="/room/addRoom" method="POST" modelAttribute="roomModel">
			<div align="center">

				<p>Coast:</p>
				<sf:input cssClass="simpleInput" path="coast"/>

				<p>Seats:</p>
				<sf:input cssClass="simpleInput" path="seats"/>

				<p>StreetEn:</p>
				<sf:input cssClass="simpleInput" path="streetEn"/>

				<p>StreetRu:</p>
				<sf:input cssClass="simpleInput" path="streetRu"/>

				<p>Number:</p>
				<sf:input cssClass="simpleInput" path="number"/>

				<p>Type of room</p>

				<select name="type">
					<option value="0">!--Type of room--!</option>
					<c:forEach var = "type" items ="${typeList}" varStatus= "loopIndex">
						<option value="${type.id}">${type.typeEn}</option>
					</c:forEach>
				</select>

				<br/><br/><br/><br/>

				<input type="submit" class="glossBtn" value="Add Room" style="margin-bottom: 50px">

			</div>
		</sf:form>
	</body>
</html>