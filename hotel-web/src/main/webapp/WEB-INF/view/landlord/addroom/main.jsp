<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	</head>
	<body>

		<h4>main</h4>
		
		<sf:form action="/room/addRoom" method="POST" modelAttribute="roomModel">
			<table align="center">
				<tr>
					<td>Coast:</td>
					<td><sf:input path="coast"/></td>
				</tr>
				<tr>
					<td>Seats:</td>
					<td><sf:input path="seats"/></td>
				</tr>
				
				<tr>
					<td>StreetEn:</td>
					<td><sf:input path="streetEn"/></td>
				</tr>
				
				<tr>
					<td>StreetRu:</td>
					<td><sf:input path="streetRu"/></td>
				</tr>
				
				<tr>
					<td>Number:</td>
					<td><sf:input path="number"/></td>
				</tr>
			
				<tr>
					<td>Type of room</td>
					<td>
					
						<select name="type">
							<option value="0">!--Type of room--!</option>
							<c:forEach var = "type" items ="${typeList}" varStatus= "loopIndex">	
								<option value="${type.id}">${type.typeEn}</option>
							</c:forEach>
						</select>
					
					</td>	
				</tr>
			
				<tr>
					<td colspan="2" align="center">
						<input type="submit" value="Add Room">
					</td>
				</tr>
			</table>
		</sf:form>
	</body>
</html>