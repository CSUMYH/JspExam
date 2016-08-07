<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>
	<#list film as f>
		<tr>
			<td>${f.title}</td>
			<td>${f.description}</td>
			<td>${f.language_name}</td>
		</tr>
	</#list >
</body>
</html>
