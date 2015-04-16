<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="tema8.ej01.model.bo.Libro" %>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="<%= request.getContextPath() %>/tema8/ej01/EditarLibroPorId" method="post"><br/>
		<input type="hidden" name="id" value="${libro.id}">
		ISBN<input type="text" name="isbn" value="${libro.isbn}"><br/>
		TITULO<input type="text" name="titulo" value="${libro.titulo}"><br/>
		CATEGORIA<input type="text" name="categoria" value="${libro.categoria}"><br/>
		<input type="submit" value="Guardar"><br/>
	</form>
</body>
</html>