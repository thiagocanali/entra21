$(document).ready(function(){
	console.log('JQuery is Ready!');
});

function editRegModal(id) {
	$.ajax({
		url: 'notas?action=edit&id=' + id,
		method: 'GET',
		dataType: 'json',
		success: function(obj) {
			if(obj) {
				console.log(obj);
				$('#id').val(obj.id);
				$('#assunto').val(obj.assunto);
				$('#dt_notas').val(obj.dtNota);
				$('#texto').val(obj.texto);
				$('#editNotaModal').modal('show');
			}
		}
	});
}

function verNota(id){
	window.location.href = "notas?action=ver&id=" + id;
}
