$(document).ready(function() {

	console.log("JQuery is ready!");
});

function deleteFilme(id) {
	let urlAction = "filme?action=delFilme&id=" + id;

	$.ajax({
		url: urlAction,
		method: 'GET',
		success: function(response) {
			if (response === 'OK') {
				alert('filme deletado com sucesso');
				window.location.reload();
			} else {
				alert(response);
			}
		},
		erro: function(response) {
			alert(response);
		}
	});
}