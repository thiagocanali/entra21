<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<jsp:include page="includes/header.jsp"></jsp:include>

<main>
	
	<div class="jumbotron row">
		<h1 class="text-primary text-block">Bem-vindo, <c:out value="${usuarioName }" /> </h1>
		<br>
		<h2>Meu Diário! Listagem de Notas. Veja suas notas. </h2>
	</div>
	
	<div class="row mb-3">
		<a href="notas?action=cad" class="btn btn-success"> <i class="fas fa-plus"></i> Adicionar</a>
	</div>
	
	<div class="row">
		<c:if test="${listSize > 0 }">
			<ul class="list-group col d-flex ">
				<c:forEach var="nota" items="${listaNotas }"  >
					<li onclick="verNota(${nota.id});" style="cursor: pointer;" class="list-group-item d-flex justify-content-between align-items-center"> 
						<span class="badge badge-dark">
							<c:out value="${nota.id }" />
						</span>
						<span class="">
							<c:out value="${nota.assunto }" />
						</span> 
						<span class="badge badge-info">
							<c:out value="${nota.dtNota }" />
						</span>
						<div class="d-flex align-items-center">
							<button type="button" class="btn btn-sm btn-primary" onclick="editRegModal(${nota.id});">
							  <i class="fas fa-edit"></i>
							</button>
							<form action="notas" method="get" onsubmit="return confirm('Deseja apagar a nota ${nota.assunto} ?');">
								<input type="hidden" name="action" value="del">
								<input type="hidden" name="id" value="${nota.id }">
								<button class="btn btn-sm btn-danger">
									<i class="far fa-trash-alt"></i>
								</button>
							</form>
						</div>
					</li>
				</c:forEach>
			</ul>
		</c:if>
		<c:if test="${listSize == 0 }">
			<div class="alert alert-danger col">
				<h2>Não há itens cadastrados ainda!</h2>
			</div>
		</c:if>
	</div>
		
		
</main>

<jsp:include page="editNotas.jsp"></jsp:include>
<jsp:include page="includes/footer.jsp"></jsp:include>
