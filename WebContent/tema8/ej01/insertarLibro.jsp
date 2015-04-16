<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="<%= request.getContextPath() %>/tema8/ej01/InsertarLibro" method="post"><br/>
		ISBN<input type="text" name="isbn"><br/>
		TITULO<input type="text" name="titulo"><br/>
		CATEGORIA<input type="text" name="categoria"><br/>
		<input type="submit" ><br/>
		
	</form>
</body>
</html>