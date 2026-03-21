<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
	
	
	    <%
response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
response.setHeader("Pragma", "no-cache");
response.setDateHeader("Expires", 0);





%>
	
	
	
	
	
	
	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ram</title>

<style type="text/css">
body {
	margin: 0;
	padding: 0;
}

.back-img {
	background: url("Image/notes.jpg");
	background-size: cover;
	background-repeat: no-repeat;
	height: 84vh;
	width: 100%;
}
</style>

<%@include file="all_component/allcdn.jsp"%>
</head>

<body>

	<%@include file="all_component/navbar.jsp"%>

	<div class="container-fluid back-img px-0">
		<div class="text-center hero-content">
			<h1 class="text-light p-2 p-md-4 fw-bold">
				<i class="bi bi-journal-text"></i> E Notes <span
					class="d-block fs-5 fw-normal mt-2"> Save Your Notes
					Securely </span>
			</h1>

			<a href="login.jsp" class="btn btn-light btn-lg mx-2"> <i
				class="bi bi-box-arrow-in-right"></i> Login
			</a> <a href="register.jsp" class="btn btn-light btn-lg mx-2"> <i
				class="bi bi-person-plus"></i> Register
			</a>
		</div>

	</div>
	<%@include file="all_component/footer.jsp"%>
</body>
</html>
