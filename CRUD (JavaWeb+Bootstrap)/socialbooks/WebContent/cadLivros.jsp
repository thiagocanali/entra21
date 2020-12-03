<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<jsp:include page="includes/header.jsp"></jsp:include>

<main>
	
	<div class="jumbotron row">
		<h1>Social Books</h1>
		<br>
		<h3>Adicione o Livro Desejado</h3>
	</div>
	
	<div class="row">
		<form class="col" action="livro" method="post">
			<div class="form-group">
				<label for="titulo">Titulo</label>
				<input type="text" name="titulo" id="titulo" class="form-control" placeholder="Informe o titulo do livro" >
			</div>
			<div class="form-group">
				<label for="autor">Autor</label>
				<input type="text" name="autor" id="autor" class="form-control" placeholder="Informe o autor do livro" >
			</div>
			<div class="form-group">
				<input type="submit" id="btnSubmit" class="btn btn-lg btn-block btn-success" value="Enviar" >
				<a href="javascript:void(0);" onclick="window.history.back();" class="btn btn-lg btn-block btn-danger" >Cancelar</a>
			</div>
		</form>
	</div>
		
</main>

<jsp:include page="includes/footer.jsp"></jsp:include>
