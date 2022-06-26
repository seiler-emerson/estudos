let lista = [45, 4, 9, 16, 25];
let lista2 = [];


// OPÇÃO 01 Dobrar valor dos números no array
// lista2 = lista.map(function(item) {
//     return item * 2;
// });

//OPÇÃO 02 Dobrar valor dos números no array
// for(let i in lista) {
//     lista2.push(lista[i] * 2);
// }

//OPÇÃO 03 FILTRAR INFORMAÇÕES E EXIBIR APENAS FILTRADAS
// lista2 = lista.filter(function(item) {
//     if (item < 20) {
//         return true;
//     } else {
//         return false;
//     }
// });

//OPÇÃO 04 FILTRAR INFORMAÇÕES E APENAS VERIFICA SE TODOS OS ITENS DO ARRAY ATENDE O FILTRO TRUE/FALSE
// lista2 = lista.every(function(item) {
//     if (item > 20) {
//         return true;
//     } else {
//         return false;
//     }
// });

//OPÇÃO 05 FILTRAR INFORMAÇÕES E APENAS VERIFICA SE ALGUM DOS ITENS DO ARRAY ATENDE O FILTRO TRUE/FALSE
lista2 = lista.some(function(item) {
    return (item >20)? true : false;  //TERNÁRIO
});

let res = lista2;

console.log(res); 