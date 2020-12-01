<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<jsp:include page="includes/header.jsp"></jsp:include>

<main>

	<div class="jumbotron row">
		<h1 class="text-primary text-block">
			Bem-vindo,
			<c:out value="${usuarioName }" />
		</h1>
		<br>
		<h2>Meu Diário! Listagem de Notas. Veja suas notas.</h2>
	</div>

	<div class="row mb-3">
		<a href="notas?action=cad" class="btn btn-success"> <i
			class="fas fa-plus"></i> Adicionar
		</a>
	</div>

	<div class="row">
		<ul class="list-group col d-flex ">
			<li
				class="list-group-item d-flex justify-content-between align-items-center">
				ID: <c:out value="${nota.id }" />
			</li>
			<li
				class="list-group-item d-flex justify-content-between align-items-center">
				Assunto: <c:out value="${nota.assunto }" />
			</li>
			<li
				class="list-group-item d-flex justify-content-between align-items-center">
				Data: <c:out value="${nota.dtNota }" />
			</li>
			<li
				class="list-group-item d-flex justify-content-between align-items-center">
				<c:out value="${nota.texto }" />
			</li>
		</ul>
	</div>


</main>

<jsp:include page="includes/footer.jsp"></jsp:include>
