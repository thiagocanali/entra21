<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lista pessoas</title>
</head>
<body>
	<header>
		<h1>Lista de Pessoas</h1>
		<hr>
	</header>
	<main>
	<div id="cad-pessoa-container">
	
	<a href=></a>
	
	</div>
		<table style="width: 80%;">
			<thead>
				<tr>
					<th>#</th>
					<th>Nome</th>
					<th>Nascimento</th>
					<th>Sexo</th>
					<th>Ações</th>
				</tr>
			</thead>
		</table>
		<tbody>
			<c:forEach var="pessoa" items="${listaPessoas}">
				<tr>
					<td><c:out value="${pessoa.id}" /></td>
					<td><c:out value="${pessoa.nome}" /></td>
					<td><c:out value="${pessoa.dtNascimento}" /></td>
					<td><c:out value="${pessoa.sexo}" /></td>
					<td><button>
							<a href="pessoa?action=verPessoa&id=${pessoa.id}"> Ver </a>
						</button> |
						<button onclick="apagarPessoa(${pessoa.id})">Apagar</button></td>
				</tr>
			</c:forEach>
		</tbody>
	</main>
</body>
</html>