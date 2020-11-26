<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lista usuarios</title>
</head>
<body>
	<header>
		<h1>Lista de Usuarios</h1>
		<hr>
	</header>
	<main>
		<table style="width: 80%;">
			<thead>
				<tr>
					<th>Id</th>
					<th>Login</th>
					<th>Senha</th>
				</tr>
			</thead>
		</table>
		<tbody>
			<c:forEach var="user" items="${listausuarios}" />
			<tr>
				<td><c:out value="${usuario.id}" /></td>
				<td><c:out value="${usuario.login}" /></td>
				<td><c:out value="${usuario.senha}" /></td>
				<td><button>Ver</button> |
					<button>Apagar</button></td>
			</tr>
			
		</tbody>
	</main>
</body>
</html>