// function adicionar(...numeros) {
//     console.log(numeros);
// }

// adicionar(5,6,7,8,9,10)


function adicionar(nomes, ...novosNomes) {

    let novoConjunto = [
        ...nomes,
        ...novosNomes
    ];

    return novoConjunto;
}

let nomes = ['Emerson','Paulo'];

let outros = adicionar(nomes, "Antonio", "Maria", "Jose")

console.log(outros)