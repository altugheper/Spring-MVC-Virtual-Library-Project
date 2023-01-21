<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<%@page isELIgnored="false" %>
<title>Virtual Library</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css?version=1">

</head>


<body>
<div class="container">
<h2>VIRTUAL LIBRARY</h2>
<p><a class="normal" href="${pageContext.request.contextPath}/students/">List Books</a></p>
<p><a class="normal" href="${pageContext.request.contextPath}/students/new">Add Book</a></p>
</div>
</body>
</html>
