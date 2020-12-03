<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<jsp:include page="includes/header.jsp"></jsp:include>

<main>
	
	<div class="jumbotron row">
		<h1>SocialBooks</h1>
		<br>
		<h3>Listagem de Livros </h3>
	</div>
	
	<div class="row mb-3">
		<a href="livro?action=cad" class="btn btn-success"> <i class="fas fa-plus"></i> Adicionar</a>
	</div>
	
	<div class="row">
		<c:if test="${listSize > 0 }">
			<ul class="list-group d-flex col">
				<c:forEach var="livro" items="${listaLivros }"  >
					<li style="cursor: pointer;" class="list-group-item d-flex justify-content-between align-items-center"> 
						<span class="badge badge-dark">
							<c:out value="${livro.id }" />
						</span>
						<span class="">
							<c:out value="${livro.titulo }" />
						</span> 
						<span class="badge badge-info">
							<c:out value="${livro.autor }" />
						</span>
						<div class="d-flex align-items-center">
							<button class="btn btn-primary" onclick="editRegModal(${nota.id})">
							  <i class="fas fa-edit"></i>
							</button>
							<form action="livro" method="get" onsubmit="return confirm('Deseja apagar a nota ${livro.titulo} ?');">
							<input type="hidden" name="action" value="del">
							<input type="hidden" name="id" value="${livro.id }">
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
				<h2>Não há livros cadastrados ainda!</h2>
			</div>
		</c:if>
	</div>
		
		<c:forEach var="livro"vitems="${listaLivros }">
			<
		
		
</main>

<jsp:include page="includes/footer.jsp"></jsp:include>
