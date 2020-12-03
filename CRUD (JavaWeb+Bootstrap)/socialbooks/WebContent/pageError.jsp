<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<jsp:include page="includes/header.jsp"></jsp:include>

<main>
	
	<div class="jumbotron">
		<h1>SocialBooks</h1>
		<h3 class="text-light bg-danger block">
		<c:out value="${mensagem }" />
		</h3>
		<br>
		<hr>
		<a href="javascript:void(0);" onclick="window.history.back();" class="btn btn-lg btn-block btn-danger" >Voltar</a>
	</div>
		
</main>

<jsp:include page="includes/footer.jsp"></jsp:include>
