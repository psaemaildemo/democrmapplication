<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>lead</title>
</head>
<body>
	
	<h2>Create new lead</h2>
	<form action="saveLead" method="post">
	<pre>
		first name<input type="text" name="firstName"/>
		last name<input type="text" name="lastName"/>
		email<input type="text" name="email"/>
		source:
		<select name="source" >
  			 <option value="News Paper">News Paper</option>
 			 <option value="TV Commercial">TV Commercial</option>
 			 <option value="online">Online</option>
  			 <option value="radio">radio</option>
		</select>
		mobile<input type="text" name="mobile"/>
		<input type="Submit" value="save"/>
	</pre>
	</form>
${msg}
</body>
</html>