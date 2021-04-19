<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Cerca libri</title>
	</head>
	<body>
		<form action = "ExecuteRicercaLibroServlet" method="post">
			<h4>titolo: </h4><input type = "text" name = "titolo"><br>
			<h4>genere: </h4><input type = "text" name = "genere"><br>
			<h4>pagine: </h4><input type = "text" name = "pagine"><br>
			<input type = "submit" value = "cerca">
		</form>
	</body>
</html>