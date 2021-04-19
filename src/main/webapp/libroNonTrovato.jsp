<%@page import="it.prova.casaeditrice.model.Libro"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Libro non trovato</title>
	</head>
	<body>
		<% Libro libroTrovato = (Libro) request.getAttribute("libro_attribute"); %>
		<h1>Il libro: <%= libroTrovato.getTitolo() %> <br>
		genere: <%= libroTrovato.getGenere() %><br>
 		di pagine: <%= libroTrovato.getPagine() %><br>
		non è stato trovato, vuoi caricarlo?</h1>
		<form action = "ExecuteAddLibroServlet" method="post">
			<h3>titolo: </h3><input type = "text" name = "titolo"><br>
			<h3>genere: </h3><input type = "text" name = "genere"><br>
			<h3>pagine: </h3><input type = "text" name = "pagine"><br>
			<input type = "submit" value = "add">
		</form>
	</body>
</html>