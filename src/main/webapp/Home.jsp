<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ page import="com.Entity.User"%>
<%@ page import="java.util.*"%>
<%@ page import="com.Entity.Notes"%>
<%@ page import="com.Dao.*" %>



<%
response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
response.setHeader("Pragma", "no-cache");
response.setDateHeader("Expires", 0);

User u1 = (User) session.getAttribute("userd");
if (u1 == null) {
	request.getRequestDispatcher("index.jsp").forward(request,response);
	return;
}
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home page</title>

<%@include file="all_component/allcdn.jsp"%>

<link rel="stylesheet" href="css/style2.css">

</head>
<body>

	<%@include file="all_component/navbar.jsp"%>
	
	<div class="container mt-4">
	<div class="row">
	<%
	ArrayList<Notes> al=(ArrayList<Notes>) request.getAttribute("al");
	UserDao d=new UserDao();
	if(al!=null && !al.isEmpty())
	{
		for(Notes n:al)
		{
	%>
		<div class="col-12 col-md-6 col-lg-4 mb-4">
            <div class="card h-100 shadow-sm">
                <div class="card-body">	
                <h5 class="card-title">
                <%=n.getNoid()%> : <%=n.getQuestion()%>
                </h5>
                <p class="card-text">
                <%= n.getAnswear() %>
                </p>
               	</div>
               	<div class="card-footer text-muted">
               <%
               User u2=new User();
               u2.setId(n.getUserId());
               %>
               	Notes Creater : <%= d.getName(u2)%>
               	<br>
               	Created At :<%= n.getCreatedat() %>
               	</div>
              </div>
            </div>
	<%
		}
	}
	else
	{
	%>
	<div class="col-12">
	<h5 class="text-center text-muted">
                No notes available
    </h5>
	</div>
	
	
	<%
	}
		
	%>
	</div>
	</div>
	
	
	
<script>
  window.history.pushState(null, null, window.location.href);
  window.onpopstate = function () {
    window.history.pushState(null, null, window.location.href);
  };
</script>

</body>
</html>
