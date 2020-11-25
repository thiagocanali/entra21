<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<jsp:include page="inc/header.jsp"></jsp:include>

<main>
	<div class="card">
		<div class="card-body">
    	<h5 class="card-title"><c:out value="${objPessoa.nome}" /></h5>
			<ul style="list-style: none;">
				<li>ID: <b><c:out value="${objPessoa.id}" /></b>
				</li>
				<li>Nome: <b><c:out value="${objPessoa.nome}" /></b>
				</li>
				<li>Nascimento: <b><c:out value="${objPessoa.dtNascimento}" /></b>
				</li>
				<li>Sexo: <b><c:out value="${objPessoa.sexo}" /></b></li>
			</ul>
		</div>
	</div>
</main>
</div>

<footer>
	<button onclick="window.history.back();">Voltar</button>
</footer>

<!--  Scripts -->
<jsp:include page="inc/scripts.jsp"></jsp:include>

</body>
</html>