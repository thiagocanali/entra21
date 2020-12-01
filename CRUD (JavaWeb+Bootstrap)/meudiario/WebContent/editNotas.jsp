<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!-- Modal -->
<div class="modal fade" id="editNotaModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title" id="exampleModalLabel">Editar Nota</h5>
        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
          <span aria-hidden="true">&times;</span>
        </button>
      </div>
      <div class="modal-body">
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
				<input type="hidden" name="id" id="id">
				<input type="submit" id="btnSubmit" class="btn btn-lg btn-block btn-success" value="Enviar" >
			</div>
		</form>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-danger" data-dismiss="modal">Cancelar</button>
      </div>
    </div>
  </div>
</div>