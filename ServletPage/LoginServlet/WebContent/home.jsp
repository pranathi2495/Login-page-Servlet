<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin page</title>
</head>
<body>
  <div style="text-align: center">
        <h1>Welcome to Login Page</h1>
        <b>${user.username} (${user.email})</b>
        <br><br>
        <a href="/logout">Logout</a>
    </div>
</body>
</html>