<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	</head>
	<body>

		<h4>main</h4>
		
		<sf:form action="" method="POST" modelAttribute="roomModel">
		<table align="center">
			<tr>
				<td>Coast:</td>
				<td><sf:input path="coast"/></td>
			</tr>
			<tr>
				<td>Seats:</td>
				<td><sf: path="seats"/></td>
			</tr>
			
			
			
			<tr>
				<td colspan="2" align="center">
					<input type="submit" value="Registration">
				</td>
			</tr>
		</table>
	</sf:form>
		
		

	</body>
</html>