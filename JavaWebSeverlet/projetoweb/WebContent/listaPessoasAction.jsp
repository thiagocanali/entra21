<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:include page="inc/header.jsp"></jsp:include>

<main>
<div class="container">
	<div class="row" id="cad-pessoa-container">
		<a class="btn btn-success" href="pessoa?action=cadPessoa"> <i class="fas fa-plus"></i> Cadastrar Pessoa</a>
	</div>
</div>
<div class="row">
	<br>
	<table class="table table-hover">
		<thead>
			<tr>
				<td>#</td>
				<td>Nome</td>
				<td>Nascimento</td>
				<td>Sexo</td>
				<td>Ações</td>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="pessoa" items="${listaPessoas}">
				<tr>
					<td><c:out value="${pessoa.id}" /> </td>
					<td><c:out value="${pessoa.nome}" /> </td>
					<td><c:out value="${pessoa.dtNascimento}" /> </td>
					<td><c:out value="${pessoa.sexo}" /> </td>
					<td> <a class="btn btn-sm btn-info" href="pessoa?action=verPessoa&id=${pessoa.id}">
							<i class="fas fa-search"></i>
						</a> | 
						<a class="btn btn-sm btn-primary" href="pessoa?action=editPessoa&id=${pessoa.id}" >
						<i class="fas fa-edit"></i>
						</a>
						|
						 <a onclick="deletePessoa(${pessoa.id});" class="btn btn-sm btn-danger" href="pessoa?action=delPessoa&id=${pessoa.id}" >
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