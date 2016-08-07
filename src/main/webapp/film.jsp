<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="com.mao.Beans.*" %>
    <%@ page import="java.util.*" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript">
function altRows(id){
	if(document.getElementsByTagName){  
		
		var table = document.getElementById(id);  
		var rows = table.getElementsByTagName("tr"); 
		 
		for(i = 0; i < rows.length; i++){          
			if(i % 2 == 0){
				rows[i].className = "evenrowcolor";
			}else{
				rows[i].className = "oddrowcolor";
			}      
		}
	}
}

window.onload=function(){
	altRows('alternatecolor');
}
</script>


<style type="text/css">
body{
	text-align: center;	
	background-color: rgb(217,217,225);
	}
table.altrowstable {
	font-family: verdana,arial,sans-serif;
	font-size:11px;
	color:#333333;
	border-width: 1px;
	border-color: #a9c6c9;
	border-collapse: collapse;
	margin: auto;
}
table.altrowstable th {
	border-width: 1px;
	padding: 8px;
	border-style: solid;
	border-color: #a9c6c9;
}
table.altrowstable td {
	border-width: 1px;
	padding: 8px;
	border-style: solid;
	border-color: #a9c6c9;
}
.oddrowcolor{
	background-color:#d4e3e5;
}
.evenrowcolor{
	background-color:#c3dde0;
}
</style>



<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
 <a href="ToAddFilmServlet">添加记录</a>
<table  class="altrowstable" id="alternatecolor">

		<tr>
			<th>film_id</th>
			<th>title</th>
			<th>description</th>
			<th>language</th>
			<th>delete</th>
			<th>edit</th>
		</tr>
<%
	List<FilmBean> list_film = (List<FilmBean>)  session.getAttribute("film");
// 	List<LanguageBean> list_lan = (List<LanguageBean> )request.getSession().getAttribute("language");
	
	for(int i =0; i < list_film.size();i++){
		FilmBean fb =list_film.get(i);
		%>
		<tr>
			<td><span><%=fb.getFilm_id()%></span></td>
			<td><span><%=fb.getTitle()%></span></td>
			<td><span><%=fb.getDescription()%></span></td>
			<td><span><%=fb.getLanguage_name()%></span></td>
			<td><a href="DeleteFilmServlet?film_id=<%= fb.getFilm_id()%>">删除</a></td>
			<td><a href="EditServlet?title=<%= fb.getTitle()%>&description=<%=fb.getDescription()%>&language= <%=fb.getLanguage_name()%>">编辑</a></td>
		</tr>
		<% 
	}
%>
</table>
</body>
</html>