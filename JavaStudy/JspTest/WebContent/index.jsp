<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.*,java.text.SimpleDateFormat"%>
<html>
<head>
<title>sample_1</title>
</head>
<body>
	<h1>hello!</h1>
	<div>
		<%
		    Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		String formatDate = sdf.format(date);
		out.print(formatDate);
		%>
	</div>
</body>
</html>