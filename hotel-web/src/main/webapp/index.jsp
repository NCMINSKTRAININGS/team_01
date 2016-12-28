<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<script src="<c:url value="/assets/js/requests/validations.js"/>"></script>
<html>
<head>
    <title>Title</title>

	<style type="text/css">
		#featured { width: 940px; height: 450px; background: #009cff url('/assets/css/orbit/loading.gif') no-repeat center center; overflow: hidden; }
		/* Want a different Loading GIF - visit http://www.webscriptlab.com/ - that's where we go this one :) */
	</style>

	<link rel="stylesheet" href="/assets/css/orbit.css">

	<script type="text/javascript" src="/assets/js/styles/jquery-1.4.1.min.js"></script>
	<script type="text/javascript" src="/assets/js/styles/jquery.orbit.min.js"></script>

	<script type="text/javascript">
		$(window).load(function() {
			$('#featured').orbit({
				'bullets': true,
				'timer' : true,
				'animation' : 'horizontal-slide'
			});
		});
	</script>

</head>
<body background="/assets/images/bg.jpg">
Я index

	<form method="post" class="signin" action="j_spring_security_check" onsubmit="return validation_signIn()">
	
		<table>
			<tr>
				<td>Login: </td>
				<td><input id="username_or_email" name="username" type="text" required/></td>
			</tr>
			
			<tr>
				<td>Password: </td>
				<td><input id="password" name="password" type="password" required/></td>
			</tr>
			
			<tr align="right">
				<td colspan="2">
					<input id="remember_me" name="_spring_security_remember_me" type="checkbox"/>
					Remember me
					<input name="commit" type="submit" value="Sign In" />
				</td>
			</tr>
		</table>

	</form>

    <form action="registration">
        <input type="submit" value="go to registration">
    </form>

	<form>

		<div id="featured">
			<img src="/assets/images/slider/hotel1.jpg" alt="hotel1" />
			<img src="/assets/images/slider/hotel2.jpg" alt="2" rel="22"/>
			<img src="/assets/images/slider/hotel3.jpg" alt="3" />
			<img src="/assets/images/slider/hotel1.jpg"  alt="non" rel="nonn" />
		</div>
		<span class="orbit-caption" id="22" style="color: white">This is an <em>awesome caption</em> for 22. <strong>Note:</strong> This whole image is not linked</span>

	</form>

</body>
</html>
