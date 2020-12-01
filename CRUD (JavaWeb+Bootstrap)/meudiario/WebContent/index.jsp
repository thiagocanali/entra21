<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<jsp:include page="includes/header.jsp"></jsp:include>

<main>
	
	<div class="jumbotron">
		<h1>Meu Diário</h1>
		<h3>Seja bem-vindo ao MeuDiário! Registre suas notas. </h3>
		<br>
		<hr>
		<a class="btn btn-lg btn-primary" href="notas?action=list">Minhas Notas</a>
	</div>
		
		<div class="d-flex justify-content-center">
			<div class="card">
				<form action="login" method="post"  class="card-body">
					<div class="form-group">
						<label for="login">Login</label>
						<input type="text" name="login" id="login" class="form-control">
					</div>
					<div class="form-group">
						<label for="senha">Senha</label>
						<input type="password" name="senha" id="senha" class="form-control">
					</div>
					<div class="form-group">
						<input type="submit" value="Entrar" class="btn btn-block btn-success">
					</div>
				</form>
			</div>
		</div>
</main>

<jsp:include page="includes/footer.jsp"></jsp:include>
