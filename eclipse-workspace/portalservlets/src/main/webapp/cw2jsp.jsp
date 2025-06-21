<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>CW 2</title>
</head>
<body>


<% 
String num1Str= request.getParameter("t1");
String num2Str=request.getParameter("t2");

int num1 = Integer.parseInt(num1Str);
int num2 = Integer.parseInt(num2Str);

	out.println(num1+num2);


%>
</body>
</html>