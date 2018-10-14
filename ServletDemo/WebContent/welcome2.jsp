<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome to JSP</title>
</head>
<body>
	<c:forEach var="messageItem" items="${Welcome}">
		<c:out value="${messageItem}"></c:out>
	</c:forEach>
</body>
</html>