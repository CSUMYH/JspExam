<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 <style type="text/css">
 body{
	text-align: center;	
	background-color: rgb(217,217,225);
	}
	.login{
	width: 30%;
	height:200px;
	background-color: rgb(185,208,232);
 	margin: auto;
  	position: absolute;
  	top: 0; left: 0; bottom: 0; right: 0;
	border-radius: 10px;

	}
	

	.write{
		width: 80%;
		height: 30px;
		text-align: center;
		margin: auto;
  		position: absolute;
  		top: 0; left: 0; bottom: 0; right: 0;
	}
 </style>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<div class = "login">
<form action="LoginServlet">
<div class="write">

用户名：<input type="text" name ="username">
		<input type="submit" value = "登录" >
		</div>

</form>
</div>
</body>
</html>