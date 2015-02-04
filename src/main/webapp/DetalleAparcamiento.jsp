<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import= "es.open4job.modelo.dao.*"%>
<%
		AparcamientoMotoDAO aparcamientoDao = (AparcamientoMotoDAO) request
				.getAttribute("aparcamientoDao");
%>
				
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form id="sessionForm" action="./MiSessionServlet" method="get">
<label>Id:<%
		session.setAttribute("aparcamientoDao", aparcamientoDao);
		session.setAttribute("id", request.getAttribute("id"));
		out.println(request.getAttribute("id"));
	%></label>
	
	<input type="submit" value="Ir a detalle">
</form>
</body>
</html>