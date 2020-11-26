$(document).ready(function(){

console.log("JQuery is ready!");
});

function deletePessoa(id) {
let urlAction = "pessoa?action=delPessoa&id=" + id;

$.ajax({
    url: urlAction,
    method: 'GET',
    success: function(response) {
        if(response === 'OK') {
            alert('Pessoa Deletada com Sucesso!');
            window.location.reload();
        } else {
            alert(response);
        }
    },
    error: function(response) {
        alert(response);
    }
});
}