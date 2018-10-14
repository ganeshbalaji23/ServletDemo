<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome to JSP</title>
</head>
<body>
 <%
 	String[] msgs = (String[])request.getAttribute("Welcome");
 	StringBuilder message = new StringBuilder();
 	for(String msg : msgs) {
 		message.append(msg).append(" ");
 	}
  out.println(message);
 %>
</body>
</html>