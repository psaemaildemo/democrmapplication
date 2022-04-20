<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>details</title>
</head>
<body>
	<h2>Lead Details</h2>

	First Name:${lead.firstName}<br/>
	Last Name:${lead.lastName}<br/>
	Email:${lead.email}<br/>
	source:${lead.source}<br/>
	mobile:${lead.mobile}<br/>
	<form action="converLead" method="post">
		<input type="hidden" name="id" value="${lead.id}"/>
		<input type="Submit" value="convert"/>
	</form>
	<form action="sendEmail" method="post">
		<input type="hidden" name="email" value="${lead.email}" />
		<input type="Submit" value="send email"/>
	</form>
</body>
</html>