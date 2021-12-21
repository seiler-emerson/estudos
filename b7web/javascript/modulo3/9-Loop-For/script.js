//FOR LOOP
/*

let texto = '';

for(let i = 0; i < 50; i++) {
    texto = texto + i + '<br/>'
}

document.getElementById('demo').innerHTML = texto;

*/



//FOR LOOP ARRAY

let carros = ['Ferrari', 'Fusca', 'Palio', 'Corolla']; //Monta um array

let html = '<ul>';                                     //adiciona <ul> na variavel html

for(let i in carros) {                                 //varre o array. i = posição no array
    html += '<li>'+ carros[i] +'</li>';                //variavel html recebe ela mesma mais o conteúdo da posição do array dentro de um <li>
}

html += '</ul>';                                       //no fim html recebe ele mesmo com o for mais o fechamento do </ul>

document.getElementById('demo').innerHTML = html;      //exibe o html na página











