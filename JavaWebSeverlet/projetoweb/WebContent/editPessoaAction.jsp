<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:include page="inc/header.jsp"></jsp:include>
		
	<main>
		<fieldset>
			<legend>Editando Cadastro de <c:out value="${objPessoa.nome }" /> </legend>
			<div>
				<form action="pessoa" method="post">
					<ul style="list-style: none;">
						<li>
							<label>Nome:</label>
							<input class="form-control col-5" type="text" name="nome" value="${objPessoa.nome }">
							<span id="nomeValidate"></span>
						</li>
						<li>
							<label>Nascimento:</label>
							<input class="form-control col-5" type="date" name="dataNascimento" value="${objPessoa.dtNascimento }">
							<span id="dateNascValidate"></span>
						</li>
						<li>
							<label>Sexo:</label>
							<input type="radio" name="sexo" value="M"> Masc
							<input type="radio" name="sexo" value="F"> Fem
							<span id="sexoValidate"></span>
						</li>
						<li>
							<input type="hidden" name="id" value="${objPessoa.id }">
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