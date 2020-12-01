<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<jsp:include page="includes/header.jsp"></jsp:include>

<main>
	
	<div class="jumbotron row">
		<h1>Meu Diário</h1>
		<br>
		<h3>Adicionar Nova Nota </h3>
	</div>
	
	<div class="row">
		<form class="col" action="notas" method="post">
			<div class="form-group">
				<label for="assunto">Assunto</label>
				<input type="text" name="assunto" id="assunto" class="form-control" placeholder="Informe o assunto" >
			</div>
			<div class="form-group">
				<label for="dt_notas">Data</label>
				<input type="date" name="dt_notas" id="dt_notas" class="form-control" placeholder="Informe a data" >
			</div>
			<div class="form-group">
				<label for="texto">Texto</label>
				<textarea name="texto" id="texto" class="form-control" placeholder="Informe o texto" ></textarea>
			</div>
			<div class="form-group">
				<input type="submit" id="btnSubmit" class="btn btn-lg btn-block btn-success" value="Enviar" >
				<a href="javascript:void(0);" onclick="window.history.back();" class="btn btn-lg btn-block btn-danger" >Cancelar</a>
			</div>
		</form>
	</div>
		
</main>

<jsp:include page="includes/footer.jsp"></jsp:include>
