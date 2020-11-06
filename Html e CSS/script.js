$(document).ready(function() {
    console.log('Jquery iniciado');

    let objRamon = {
        nome: 'Ramon',
        idade: 30,
        peso: 95,
        altura: 1.71
    };

    let arrObjPessoa = [
        { nome: 'Thiago', idade: 21, peso: 82, altura: 1.82 },
        { nome: 'Suyanne', idade: 17, peso: 68, altura: 1.65 },
        { nome: 'Matheus', idade: 16, peso: 65, altura: 1.70 }
    ];

    arrObjPessoa.push(objRamon);

    $('#lista-ordenada').append();
    $('#lista-ordenada').html(montaLista(arrObjPessoa));


});

// Functions
function calculaIMC(altura, peso) {
    let imc = peso / (altura * altura);
    return imc;
}

function montaLista(objeto) {
    let htmlList = "";
    for (let i = 0; i < objeto.length; i++) {
        const pessoa = objeto[i];
        htmlList += "<li>" + pessoa.nome + "</li>";

    }

    return htmlList;
}