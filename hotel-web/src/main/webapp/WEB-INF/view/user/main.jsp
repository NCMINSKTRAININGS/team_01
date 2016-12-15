<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<style>
			<%@ include file="/assets/css/style.css" %>
		</style>
	</head>
	<body>
	<div class = 'wrapper'>
		<c:choose>
			<c:when test="${userCommand == 'newRequest'}">
			<sf:form action="addRequest" method="POST" modelAttribute="claim">
			<fieldset>
			<div class="addNewRequest">
					<ul class="dropdown">
							<li class="dropdown-top">
								<p class="dropdown-top">Enter Type</p>
								<ul class="dropdown-inside">
										<c:forEach  var="k" begin="0" end="${type.size()-1}">
											<li class = "floatType">
												<c:out value="${type[k].getTypeEn()}"/>
												<sf:radiobutton path="type" class="button"  value="${type[k].getId()}"/>
											</li>
										</c:forEach>

								</ul>
							</li>
						dateIn<sf:input name="check-in_date"  path="checkInDate"/>
						dateOut<sf:input  name="check-out_date" path ="checkOutDate" />
					</ul>
				</div>
				<input type="submit" value="Add new request" />
				</fieldset>
			</sf:form>
			</c:when>
			<c:when test="${userCommand == null}">
				<a href = "/user/addRequest?userCommand=newRequest">Go to new Request</a>
			</c:when>
		</c:choose>
	</div>
	</body>
</html>