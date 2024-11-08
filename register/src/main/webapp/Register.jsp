<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>This is Register Page using JSP</h1>
<h2>
<span style="color: green;"> ${success}</span>
<span style="color: red;"> ${failure}</span>
</h2>
<form action="register" method="post">
<pre>
Name<input type="text" name="name" value="${dto.name}"/>
Email<input type="text" name="email" value="${dto.email}"/>
<input type="submit"  value="Register"/>
</pre>
</form>
</body>
</html>

