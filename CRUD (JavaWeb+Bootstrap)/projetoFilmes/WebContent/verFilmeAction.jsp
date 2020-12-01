<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<jsp:include page="inc/header.jsp"></jsp:include>

<main>
	<div class="card">
		<div class="card-body">
    	<h5 class="card-title"> Título: <c:out value="${objFilme.titulo}" /></h5>
			<ul style="list-style: none;">
				<li>id: <b><c:out value="${objFilme.id}" /></b>
				</li>
				<li>Classificação: <b><c:out value="${objFilme.classificacao}" /></b>
				</li>
				<li>Gênero: <b><c:out value="${objFilme.genero}" /></b>
				</li>
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