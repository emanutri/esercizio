<%@page import="it.prova.casaeditrice.model.Libro"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Libro trovato</title>
	</head>
	<body>
	<% Libro libroTrovato = (Libro) request.getAttribute("libro_attribute"); %>
		<h1>Il libro che cerchi è: <%= libroTrovato.getTitolo() %> <br>
		genere: <%= libroTrovato.getGenere() %><br>
		di pagine: <%= libroTrovato.getPagine() %><br>
		 ed è presente!</h1>
		<a href = "casaLibri.jsp">home</a>
	</body>
</html>