<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>
	<%
		String tenTK = request.getParameter("ten");
		String matKhau = request.getParameter("mk");
		if(tenTK.equals("ABC") && matKhau.equals("MNK")){
			response.sendRedirect("UserProfile.html");
		} else response.sendRedirect("Login.html");
	%>
</body>
</html>