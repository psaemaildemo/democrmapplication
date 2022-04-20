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
	<h2>Contact Details</h2>

	First Name:${contact.firstName}<br/>
	Last Name:${contact.lastName}<br/>
	Email:${contact.email}<br/>
	source:${contact.source}<br/>
	mobile:${contact.mobile}<br/>
	
	<form action="sendEmail" method="post">
		<input type="hidden" name="email" value="${contact.email}" />
		<input type="Submit" value="send email"/>
	</form>
</body>
</html>