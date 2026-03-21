<%@ page import="com.Entity.User"%>
<%
User u = (User) session.getAttribute("userd");
%>
<nav class="navbar navbar-expand-lg navbar-dark bg-custom px-3">

	<!-- BRAND -->
	<a class="navbar-brand fw-bold" href="#"> <i
		class="fa fa-book me-2"></i> E-Notes
	</a>

	<!-- TOGGLER (BS5) -->
	<button class="navbar-toggler" type="button" data-bs-toggle="collapse"
		data-bs-target="#navbarSupportedContent"
		aria-controls="navbarSupportedContent" aria-expanded="false"
		aria-label="Toggle navigation">
		<span class="navbar-toggler-icon"></span>
	</button>

	<!-- COLLAPSE -->
	<div class="collapse navbar-collapse" id="navbarSupportedContent">

		<!-- LEFT MENU -->
		<ul class="navbar-nav">
		
			<%
			if (u == null) {
			%>
			<li class="nav-item"><a class="nav-link" href="#"><i
					class="fa fa-home"></i> Home</a></li>
			<%
			} else {
			%>
			<li class="nav-item">
			<a class="nav-link" href="<%= request.getContextPath() %>/home">
			
			<i class="fa fa-home"></i> Home</a></li>
			<%
			}
			%>
			
			<%
			if (u == null) {
			%>
			<li class="nav-item"><a class="nav-link" href="#"><i
					class="fa fa-plus-circle"></i> Add Note</a></li>
			<%
			} else {
			%>
			<li class="nav-item">
			<a class="nav-link" href="Add Note.jsp"><i
					class="fa fa-plus-circle"></i> Add Note</a></li>
			<%
			}
			%>
			
			<%
			if(u==null)
			{
			%>
			<li class="nav-item"><a class="nav-link" href="#"><i
					class="fa fa-sticky-note"></i> Show Note</a></li>
			<%
			}
			else
			{
			%>
				<li class="nav-item">
				<a class="nav-link" href="<%=request.getContextPath()%>/show">
				<i class="fa fa-sticky-note"></i> Show Note
				</a>
				</li>
			<%}
			%>		
					
					
					
					
					
		</ul>



		<%
		if (u == null) {
		%>
		<div class="d-flex ms-auto gap-2 mt-3 mt-lg-0">
			<a href="login.jsp" class="btn btn-light"> <i
				class="fa fa-sign-in"></i> Login
			</a> <a href="register.jsp" class="btn btn-light"> <i
				class="fa fa-user-plus"></i> Register
			</a>
		</div>
		<%
		} else {
		%>


		<div class="modal fade" id="userModal" tabindex="-1">
			<div class="modal-dialog modal-dialog-centered">
				<div class="modal-content shadow">

					<div class="modal-header bg-primary text-white">
						<h5 class="modal-title">
							<i class="fa fa-user-circle me-2"></i> User Profile
						</h5>
						<button type="button" class="btn-close btn-close-white"
							data-bs-dismiss="modal"></button>
					</div>

					<div class="modal-body">
						<p>
							<strong>ID:</strong>
							<%=u.getId()%></p>
						<p>
							<strong>Name:</strong>
							<%=u.getName()%></p>
						<p>
							<strong>Email:</strong>
							<%=u.getEmail()%></p>
						<p>
							<strong>Gender:</strong>
							<%=u.getGender()%></p>
					</div>

					<div class="modal-footer">
						<button type="button" class="btn btn-secondary"
							data-bs-dismiss="modal">Close</button>
					</div>

				</div>
			</div>
		</div>


		<div class="d-flex ms-auto gap-2 mt-3 mt-lg-0">
			<a href="" class="btn btn-light" data-bs-toggle="modal"
				data-bs-target="#userModal"> <i class="fa fa-sign-in"></i> <%=u.getName()%>

			<a href="<%=request.getContextPath()%>/logout" class="btn btn-light">
					<i class="fa fa-user-plus"></i> Log Out
			</a>
		</div>
		<%
		}
		%>

		<!-- RIGHT BUTTONS -->

		<!--  -->

	</div>
</nav>
