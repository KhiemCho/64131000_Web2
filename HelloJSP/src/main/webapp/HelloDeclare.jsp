<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hello Declare + Code + Expression</title>
</head>
<body>
	<%
		int x = 200, y = 10;
		int z = x + y;
		out.append(String.valueOf(z));
	%>
	<hr>
	<h2>Hoặc ta có thể xuất kiểu Expression</h2>
	<hr>
	<%= z%>
</body>
</html>