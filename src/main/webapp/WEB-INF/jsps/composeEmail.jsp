<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>compose</title>
</head>
<body>
	<h2>Compose Email</h2>
	<form  action="triggerEmail" method="post">
	<pre>
		to<input type="text" name="to" value="${email}"/>
		subject<input type="text" name="subject"/>
		<textarea  name="emailBody" rows="10" cols="50">

		</textarea>
		<input type="submit" value="send"/>
	</pre>
	</form>
	${msg}
</body>
</html>