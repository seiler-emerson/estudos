let lista = [
    {id:1, nome:'Emerson', Sobrenome:'Seiler'},
    {id:2, nome:'Mayara', Sobrenome:'Machado'},
    {id:1, nome:'Bonieky', Sobrenome:'Lacerda'},
    {id:1, nome:'Julia', Sobrenome:'XYZ'}
];


//LOCALIZAR ITEM TODO NO ARRAY
let pessoa = lista.find(function(item){
    return (item.Sobrenome == 'XYZ')? true: false;
});


// RETORNA O PRIMEIRO ITEM QUE ELE ACHAR QUE SATISFAZ A CONDIÇÃO
// lista2 = lista.find(function(item) {
//     if(item == 16) {
//         return true
//     }
// });

// // RETORNA O A POSIÇÃO DO PRIMEIRO ITEM QUE ELE ACHAR QUE SATISFAZ A CONDIÇÃO
// lista2 = lista.findIndex(function(item) {
//     if(item == 16) {
//         return true
//     }
// });


let res = pessoa;

console.log(res); 