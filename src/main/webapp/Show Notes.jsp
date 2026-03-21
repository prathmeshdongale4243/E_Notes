<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.*"%>
<%@ page import="com.Entity.*"%>
<%@ page import="com.Dao.*"%>

 <%
response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
response.setHeader("Pragma", "no-cache");
response.setDateHeader("Expires", 0);

User ua = (User) session.getAttribute("userd");
if (ua == null) 
{
    response.sendRedirect("index.jsp");
    return;
}


%>




<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<%@include file="all_component/allcdn.jsp"%>
<link rel="shylesheet" href="css/style2.css">

</head>
<body>
	<%@include file="all_component/navbar.jsp"%>


	<div class="container mt-4">
		<div class="row">
			<%
			ArrayList<Notes> al = (ArrayList<Notes>) request.getAttribute("al");

			if (al != null && !al.isEmpty()) {
				for (Notes n : al) {
			%>
			<div class="col-12 col-md-6 col-lg-4 mb-4">
				<div class="card h-100 shadow-sm">
					<div class="card-body">
						<h5 class="card-title">
							<%=n.getNoid()%>
							:
							<%=n.getQuestion()%>
						</h5>
						<p class="card-text">
							<%=n.getAnswear()%>
						</p>
					</div>
					
					<div class="d-flex justify-content-between mt-1">
						<a href="editNote?id=<%=n.getNoid()%>"  
						class="btn btn-sm btn-warning"> 
						<i class="fa fa-edit"></i> Update
						</a> 
						
						<a href="javascript:void(0)"
						 class="btn btn-sm btn-danger"
						 onclick="confirmDelete(<%=n.getNoid()%>)">
						 
						  <i class="fa fa-trash"></i> Delete
						</a>
						
					</div>
				</div>
			</div>
			<%
			}
			} else {
			%>
			<div class="col-12">
				<h5 class="text-center text-muted">No notes available</h5>
			</div>


			<%
			}
			%>
		</div>
	</div>




<script>
	function confirmDelete(noteid)
	{
		if(confirm("Are you sure want to delete this notes?"))
		{
			window.location.href="deleteNote?id="+noteid;
		}
	}
</script>
</body>
</html>