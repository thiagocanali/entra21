<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Ver pessoa</title>
</head>
<body>
	<header>
		<h1>Dados de <b><c:out value="objPessoa.nome" /></b></h1>
		<hr>
	</header>
	<main>
	<ul style="list-style: nome;">
		<li> ID: <b><c:out value="${objPessoa.id}" /></b></li>
		<li>Nome: <b><c:out value="${objPessoa.nome}" /></b></li>
		<li>Nascimento: <b><c:out value="${objPessoa.dtNascimento}" /></b></li>
		<li>Sexo: <b><c:out value="${objPessoa.sexo}" /></b></li>
	</ul>
	</main>
	
	<footer>
		<button onclick="widow.history.back();">Voltar</button>
	</footer>
	
</body>
</html>