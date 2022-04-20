<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>billing</title>
</head>
<body>
	<h2>New Bill</h2>
	<form>
	<pre>
		Customer id<input type="text" name="id" value="${contact.id}" readonly />
		First Name<input type="text" name="firstName" value="${contact.firstName}" readonly />
		Last Name<input type="text" name="lastName" value="${contact.lastName}" readonly />
		Email<input type="text" name="email" value="${contact.email}" readonly />
		mobile<input type="text" name="mobile" value="${contact.mobile}" readonly />
	</pre>
	</form>
</body>
</html>