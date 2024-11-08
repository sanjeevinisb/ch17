<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>x-workz</title>
</head>
<body>
<h1>This is Register Page using JSP</h1>
<h2>
<span style="color: green;"> ${success}</span>
<span style="color: red;"> ${failure}</span>
</h2>
<form action="registration" method="post">
<pre>
Name<input type="text" name="name" value="${dto.name}"/>
Email<input type="text" name="email" value="${dto.email}"/>
Age<input type="number" name="age" value="${dto.age}"/>
City<select class="form-select"  name="city" value="${dto.city}">
<option>--Select--</option>
  <option>Dharwad</option>
  <option>Haveri</option>
  <option>Gadag</option>
</select>
State<select class="form-select"  name="state" value="${dto.state}">
<option>--Select--</option>
  <option>Karnataka</option>
  <option>Maharashtra</option>
  <option>Kerala</option>
</select>

Country<select class="form-select"  name="country" value="${dto.country}">
<option>--Select--</option>
  <option>India</option>
  <option>China</option>
  <option>Bangladesh</option>
</select>
<input type="submit"  value="registration"/>
</pre>
</form>
</body>
</html>