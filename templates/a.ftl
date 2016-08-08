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
	<form action="UpdateFilmServlet">
	<div class="write">
	<#list film as f>
	<tr>
		<div class="word"><span>title:</span> <input type="text" name ="title" value="${f.title}"></div>
	</tr>
	<tr>
		<div class="word"><span>description:</span><input type="text" name="description" value="${f.description}"></div>
	</tr>
	<tr>
	
		<div class="word"><span>language:</span><select name="language" >
		<#list lan as l>
		<% 
		for(int i=0;i<${l}.size();i++){
		%>
		 <option value="${l.name}">${l.name}</option>
		  <% } %>  
		 </#list>	
	  </select></tr></div>

	  <input type="submit" value="ÐÞ¸Ä" /> 
	</#list>
	   </div>
	</form>
	<a href="ShowFilmServlet">·µ»ØFilm±í</a>
	</div>
</body>
</html>