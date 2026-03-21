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
<title>Register Page</title>

<%@include file="all_component/allcdn.jsp" %>

<link rel="stylesheet" href="css/style2.css">

</head>
<body class="d-flex flex-column min-vh-100">


<%@include file="all_component/navbar.jsp" %>
<main class="flex-grow-1 d-flex align-items-center">

<div class="container-fluid py-4 py-md-5 div-color">
  <div class="row justify-content-center">
    <div class="col-12 col-md-6 col-lg-4">
      
      <div class="card shadow-lg">
        <div class="card-body p-4">
          <div>
          <h3 class="text-center mb-4">
            <i class="bi bi-person-plus"></i> Register
          </h3>
          <h4 style='text-align:center;'>${msg}</h4>
          
		  </div>
          <form action="save" method="post" autocomplete="off">


            <!-- Full Name -->
            <div class="mb-3">
              <label class="form-label">Full Name</label>
              <input type="text" class="form-control"
                     placeholder="Enter your full name"
                     name="username" required>
            </div>

            <!-- Email -->
            <div class="mb-3">
              <label class="form-label">Email</label>
              <input type="email" class="form-control"
                     placeholder="Enter your email"
                     autocomplete="off"
                     name="email" required>
            </div>

            <!-- Password -->
            <div class="mb-3">
              <label class="form-label">Password</label>
              <input type="password" class="form-control"
                     placeholder="Enter your password"
                     autocomplete="new-password"
                     name="password" required>
            </div>

            <!-- Gender -->
            <div class="mb-3">
              <label class="form-label d-block">Gender</label>

              <div class="form-check form-check-inline">
                <input class="form-check-input" type="radio"
                       name="gender" value="Male">
                <label class="form-check-label">Male</label>
              </div>

              <div class="form-check form-check-inline">
                <input class="form-check-input" type="radio"
                       name="gender" value="Female">
                <label class="form-check-label">Female</label>
              </div>
            </div>

            <!-- Submit Button -->
            <div class="d-grid">
              <button type="submit" class="btn btn-primary">
                <i class="bi bi-check-circle"></i> Register
              </button>
            </div>

          </form>

        </div>
      </div>

    </div>
  </div>
</div>
</main>
<%@include file="all_component/footer.jsp" %>

</body>
</html>