
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<jsp:include page="inc/header.jsp"></jsp:include>

<main>
	<fieldset>
		<legend>Cadastrando filme:</legend>
		<div>
			<form action="filme" method="post">
				<ul style="list-style: none;">
					<li><label>Titulo:</label> <input class="form-control col-5"
						type="text" name="titulo" placeholder="Informe o titulo do filme...">
						<span id="tituloValidate"></span></li>
					<li><label>Classificacao:</label> <input
						class="form-control col-5" type="number" name="classificacao"
						placeholder="0 - 18 anos"> <span id="classificacaoValidate"></span>
					</li>
					<li><label>Genero:</label> <input class="form-control col-5"
						type="text" name="genero" placeholder="Ex.: Ação, Aventura, Comédia, Romance..."> 
						<span id="generoValidate"></span></li>
					<li>
					<input class="btn btn-dark" type="submit"
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