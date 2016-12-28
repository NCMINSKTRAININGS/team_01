<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<link href="/assets/css/style.css" type="text/css" rel="stylesheet">
	</head>
	<body>

		<h4><p>main</p></h4>

		<div align="center">
			<form action="/room">
				<input type="submit" class="glossBtn" value="Add room">
			</form>

			<br/><br/>

			<form action="/room/getAllClaim">
				<input type="submit" class="glossBtn" value="Browse user requests">
			</form>
		</div>
	</body>
</html>