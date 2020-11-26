
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<jsp:include page="inc/header.jsp"></jsp:include>

<main>
	<fieldset>
		<legend>Cadastro</legend>
		<div>
			<form action="filme" method="post">
				<ul style="list-style: none;">
					<li><label>Titulo:</label> <input class="form-control col-5"
						type="text" name="titulo" placeholder="Informe um titulo...">
						<span id="tituloValidate"></span></li>
					<li><label>Classificacao:</label> <input
						class="form-control col-5" type="number" name="classificacao"
						placeholder="18 anos"> <span id="classificacaoValidate"></span>
					</li>
					<li><label>Genero:</label> <input class="form-control col-5"
						type="text" name="genero" placeholder="comedia"> 
						<span id="generoValidate"></span></li>
					<li>
					<input class="btn btn-success" type="submit"
						value="Cadastrar">
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