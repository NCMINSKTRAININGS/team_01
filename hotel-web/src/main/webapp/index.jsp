<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<script src="<c:url value="/assets/js/requests/validations.js"/>"></script>
<html>
<head>
    <title>NetCracker</title>

	<style type="text/css">
		#featured { width: 940px; height: 450px; background: white url('/assets/css/orbit/loading.gif') no-repeat center center; overflow: hidden; }
		.formLine {
			display: inline-block;
		}
	</style>

	<link rel="stylesheet" href="/assets/css/style.css">

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
	<div style="height: 150px">
		<div id="rightDiv">
			<form method="post" class="formLine" action="j_spring_security_check" onsubmit="return validation_signIn()">
				<p align="left" style="color: rgba(253, 255, 0, 0.75); margin-bottom: 0">Login: </p>
				<input class="simpleInput" style="margin-top: 3px" id="username_or_email" placeholder="Login.." name="username" type="text" required/>
				<p align="left" style="color: rgba(253, 255, 0, 0.75); margin-top: 10px; margin-bottom: 0">Password:</p>
				<input class="simpleInput" id="password" style="margin-bottom: 10px" name="password" placeholder="Password.." type="password" required/>
				<p align="left" style="color: rgba(253, 255, 0, 0.75);">
					<input id="remember_me"  name="_spring_security_remember_me" type="checkbox"/>
					Remember me
				</p>
				<input name="commit" class="glossBtn" type="submit" value="Sign In" />

			</form>

			<form class="formLine" action="registration">
			<input type="submit" class="glossBtn" style="
					text-shadow: -1px -1px #ffd800;
					box-shadow: rgb(255, 237, 200) 0 2px 5px;
					background-color: #ffdc71;
					background-image: linear-gradient(45deg, rgba(255,255,255,.0) 30%,
						rgba(255, 251, 251, 0.8),
						rgba(255,255,255,.0) 70%),
						radial-gradient(190% 100% at 50% 0%,
						rgb(255, 210, 129) 0%,
						rgba(255,255,255,.5) 50%,
						rgba(0,0,0,0) 50%);
    				box-shadow: rgb(255, 237, 200) 0 2px 5px;" value="Registration"/>
		</form>


		</div>

		<div id="leftDiv">
			<img src="/assets/images/NetCracker.png" width="400" height="100" alt="Я старался)"/>
		</div>

	</div>

		<form>
			<div id="featured">
				<img src="/assets/images/slider/hotel1.jpg" width="860" height="480" alt="hotel1"/>
				<img src="/assets/images/slider/hotel2.jpg" width="860" height="480" alt="2" rel="2"/>
				<img src="/assets/images/slider/hotel3.jpg" width="860" height="480" alt="3"/>
				<img src="/assets/images/slider/hotel4.jpeg" width="860" height="480" alt="4" rel="4"/>
				<img src="/assets/images/slider/hotel5.jpeg" width="860" height="480" alt="5" rel="5"/>
				<img src="/assets/images/slider/hotel6.jpg" width="860" height="480" alt="6" rel="6"/>
			</div>
			<span class="orbit-caption" id="2" style="color: white">This is an <em>awesome caption</em> for 2. <strong>Note:</strong> This whole image is not linked</span>

		</form>

</body>
</html>
