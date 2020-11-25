<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:include page="inc/header.jsp"></jsp:include>

<main>
<div class="container">
	<div class="row" id="cad-filme-container">
		<a class="btn btn-success" href="filme?action=cadFilme"> <i class="fas fa-plus"></i>Cadastrar Filmes</a>
	</div>
</div>
<div class="row">
	<br>
	<table class="table table-hover">
		<thead>
			<tr>
				<td>Titulo</td>
				<td>Classificacao</td>
				<td>Genero</td>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="filme" items="${listaFilmes}">
				<tr>
					<td><c:out value="${filme.titulo}" /> </td>
					<td><c:out value="${filme.classificacao}" /> </td>
					<td><c:out value="${filme.genero}" /> </td>
					<td> <a class="btn btn-sm btn-info" href="filme?action=verFilme&id=${filme.id}">
							<i class="fas fa-search"></i>
						</a> | 
						<a class="btn btn-sm btn-primary" href="filme?action=editFilme&id=${filme.id}" >
						<i class="fas fa-edit"></i>
						</a>
						|
						 <a onclick="deleteFilme(${filme.id});" class="btn btn-sm btn-danger" href="filme?action=delFilme&id=${filme.id}" >
						 <i class="fas fa-trash"></i>
						 </a>
					</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</div>
</main>
</div>

<!--  Scripts -->
<jsp:include page="inc/scripts.jsp"></jsp:include>

</body>
</html>