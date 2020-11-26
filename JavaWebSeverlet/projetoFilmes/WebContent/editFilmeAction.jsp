<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:include page="inc/header.jsp"></jsp:include>
		
	<main>
		<fieldset>
			<legend>Editando Cadastro do filme: <c:out value="${objFilme.titulo }" /> </legend>
			<div>
				<form action="filme" method="post">
					<ul style="list-style: none;">
						<li>
							<label>Titulo:</label>
							<input class="form-control col-5" type="text" name="titulo" value="${objFilme.titulo }">
							<span id="tituloValidate"></span>
						</li>
						<li>
							<label>Classificacao:</label>
							<input class="form-control col-5" type="number" name="classificacao" value="${objFilme.classificacao}">
							<span id="classificacaoValidate"></span>
						</li>
						<li>
							<label>Genero:</label>
							<input class="form-control col-5" type="text" name="genero" value="${objFilme.genero}">
							<span id="sexoValidate"></span>
						</li>
						<li>
							<input type="hidden" name="id" value="${objFilme.id }">
							<input class="btn btn-success" type="submit" value="Atualizar">
						</li>
					</ul>
				</form>
			</div>
		</fieldset>
	</main>

</div>

<!--  Scripts -->
<jsp:include page="inc/scripts.jsp"></jsp:include>

</body>
</html>