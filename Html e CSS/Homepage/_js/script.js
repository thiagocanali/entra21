$(document).ready(function() {
    console.log("JQuery ready!");

    // hide form
    $("#complete-address").hide();

    // event CEP
    $("#cep").on("blur", function() {
        // verifica dados CEP
        $.ajax({
            url: "https://viacep.com.br/ws/" + $(this).val() + "/json/",
            dataType: "jsonp",
            success: function(response) {
                if (response != "") {
                    $("#rua").val(response.logradouro);
                    $("#bairro").val(response.bairro);
                    $("#cidade").val(response.localidade);
                    $("#uf").val(response.uf);

                    // mostra o form endereco
                    $("#complete-address").show();
                }
            }

        });

    });
});