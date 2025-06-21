<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>CW 1</title>
</head>
<body>

		<%
			String name=request.getParameter("username");
			String password = request.getParameter("password");
			if(name.equals("Karthiga") && password.equals("12345"))
			{
				out.print("Welcome karthiga !!! <br><br><br> You are logged in Successfully");
			}
			else
			{
				out.print("Please Check the Username and Password");
			}
		%>
</body>
</html>