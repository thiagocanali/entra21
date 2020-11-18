<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastrar</title>
</head>
<body>
	<header></header>
	<main class="container-fluid">
	
		<div>
			<form actrion="pessoa" method="post" onsubmit="">
					<label for="nome">Nome: </label> <input name="nome" type="text"
						class="form-control" id="exampleInputPassword1">
						<label for="nascimento">Nascimento:</label> <input type="date"
							id="nascimento" name="nascimento" min="dd-mm-aaaa" max="">
							<label for="sexo">Sexo: </label> <input name="sexo" type="RADIO"
								name="sexo" value="Masc">Masc <input name="sexo"
								type="RADIO" name="sexo" value="Fem">Fem
				</div>
				<button type="submit" class="btn btn-primary">Cadastrar</button>
			</form>
		</div>
	</main>
	
</body>
</html>