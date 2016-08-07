<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="java.util.*" %>
    <%@page import="com.mao.Beans.*" %>
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
		span{
		width: 20px;
		float: left;
	}
 </style>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<div class="login">
	<form action="AddFilmServlet">
	<div class="write">
	<tr>
		<div class="word"><span>title:</span> <input type="text" name ="title"></div>
	</tr>
	<tr>
		<div class="word"><span>description:</span><input type="text" name="description"></div>
	</tr>
	<tr>

		<div class="word"><span>language:</span><select name="language">
	<% 
		List<LanguageBean> list=(List<LanguageBean>)session.getAttribute("language"); 
		for(int i=0;i<list.size();i++){
		LanguageBean lan = list.get(i);
		%>
		 <option value="<%=lan.getName()%>"><%=lan.getName()%></option>
		  <% } %>  
		
	  </select></tr></div>
	 
	  <input type="submit" value="提交" /> 
	   </div>
	</form>
	<a href="ShowFilmServlet">返回Film表</a>
	</div>
</body>
</html>
