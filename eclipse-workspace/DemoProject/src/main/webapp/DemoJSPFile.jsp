<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP</title>
</head>
<body onload = "demoFunction2()">
	<h1>Welcome Karthiga </h1>
	
	
	<%= 12 + 4 %>
	<br>
	
	
	<%= 15 + 3 %>
	<br>
	<br>
	
	
	<%
		for(int i=1;i<=10;i++)
		{
			out.print(i+"*"+"10 = "+(i*10)+"<br>");
		}
	%>
	<br>
	<br>
	
	
	<%= new java.util.Date() %>
	<br>
	
	
	<% out.print(Math.random()+"<br>"); %>
	
	
	<% out.print(Math.abs(-54)); %>
	<br>
	<br>
	
	
	<%! 
	int addition(int n1,int n2)
	{
		return n1+n2;
	}
	%>
	<%= addition(12,12) %>
	
	
	<br><br><br><br>
	<%
		String str =request.getParameter("txtbtn");
		out.print("Hello "+str+"<br>This is from HTML File");
	%>
	
	
	<br><br>
	
	
	<script type = "text/javascript">
		function demoFunction1()
		{
			alert("Time gonna end");
		}
		
		function demoFunction2()
		{
			alert("Time started");
		}
	</script>
	
	
	<button name = "btn1" onclick = "demoFunction1()"> Click here </button>
	
	
	<%
		if(str.equals("karthiga"))
		{
			response.sendRedirect("AnotherFile.html");
		}
		else
		{
			response.sendRedirect("DemoHTMLFile.html");
		}
	%>
	
	
</body>
</html>