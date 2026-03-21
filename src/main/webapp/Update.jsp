<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update notes</title>

<%@include file="all_component/allcdn.jsp" %>
<link rel="shylesheet" href="css/style2.css">

</head>
<body>
<%@include file="all_component/navbar.jsp" %>

<%@ page import="com.Entity.*" %>
<% Notes n=(Notes) request.getAttribute("notes");%>

<div class="container mt-5">
  <div class="row justify-content-center">
    <div class="col-md-8 col-lg-6">

      <div class="card shadow-lg border-0 rounded-4">
        <div class="card-body p-4">

          <h3 class="text-center mb-3">
            <i class="fa fa-pencil-square-o me-2"></i>Update Notes
          </h3>

          <p class="text-center text-muted mb-4">
            Update your question and its answer below
          </p>
          <h4>${msg}</h4>

          <form action="updateNote?id=<%=n.getNoid()%>" method="post">

            <!-- Question -->
            <div class="mb-3">
              <label class="form-label fw-semibold">Question</label>
              <input type="text"
                     class="form-control"
                     name="question"
                     value="<%=n.getQuestion() %>"
                     required>
            </div>

            <!-- Answer -->
            <div class="mb-4">
              <label class="form-label fw-semibold">Answer</label>
              <textarea class="form-control"
                        name="answear"
                        rows="6"
                        required>
                        <%=n.getAnswear() %>
                        
              </textarea>
            </div>

            <!-- Submit -->
            <div class="d-grid">
              <button type="submit" class="btn btn-primary btn-lg">
                <i class="fa fa-save me-2"></i>Submit Note
              </button>
            </div>

          </form>

        </div>
      </div>

    </div>
  </div>
</div>

</body>
</html>