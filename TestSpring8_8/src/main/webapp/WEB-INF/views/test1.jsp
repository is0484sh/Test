<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>test1</title>
</head>
<body>
	<form modelAttribute="dataBean" action="#">
		g\
		text: <form:input path="a2"/> <br/>
		password : <form:password path="a3" showPassword="true"/> <br/>
		textarea: <form:textarea path="a4"/> <br/>
		<form:button>확인</form:button>
		
		<button type="submit">확인</button>
	</form>
</body>
</html>