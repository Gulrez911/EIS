<%@page language="java" contentType="text/html; charset=ISO-8859-1"
	isELIgnored="false" pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<title>Employee Home</title>
<link href="./resources/images/documents-icon.png " rel="shortcut icon"
	type="image/png" />
<link rel="stylesheet" href="./resources/css/bootstrap.css">
</head>
<body>
	<div class="container">
		<form:form action="save" method="post" modelAttribute="employee">
			<div class="form-group">
				<label>First Name:</label>
				<form:input path="fname" />
			</div>
			<div class="form-group">
				<label>Last Name:</label>
				<form:input path="lname" />
			</div>
			<div class="form-group">
				<label>Password:</label>
				<form:password path="password" />
			</div>
<!-- 			<div class="form-group"> -->
				<button type="submit" class="btn btn-primary">Submit</button>
			<!-- 			</div> -->
		</form:form>
	</div>
</body>
</html>
