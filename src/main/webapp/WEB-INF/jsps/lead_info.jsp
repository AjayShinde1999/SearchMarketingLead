<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lead Info</title>
</head>
<body>
<h2>Lead Details</h2>
<table>
<tr>
<td>Lead Id</td>
<td>${lead.id }</td>
</tr>
<tr>
<td>First Name</td>
<td>${lead.firstName }</td>
</tr>
<tr>
<td>Last Name</td>
<td>${lead.lastName }</td>
</tr>
<tr>
<td>Email</td>
<td>${lead.email }</td>
</tr>
<tr>
<td>Mobile</td>
<td>${lead.mobile }</td>
</tr>
</table>
</body>
</html>