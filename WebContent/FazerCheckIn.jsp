<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.*,
        dao.*,
        entidades.*,
        servlets.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>CheckIN</title>
</head>
<body>
<form action="FazerCheckIn" method="post">
	<label>Nome:</label>
	<input type="text" name="nome"><br><br>
	
	<input type="submit" value="Enviar">
</form>
	
	
	

</body>
</html>