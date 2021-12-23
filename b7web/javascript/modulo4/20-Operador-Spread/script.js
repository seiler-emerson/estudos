// let info = {
//     nome:'Emerson',
//     sobrenome:'Seiler',
//     idade:26
// };

// let novaInfo = {
//     ...info,
//     cidade:"São Paulo",
//     estado:"São Paulo"
// };

// console.log(novaInfo)

function adicionarInfo(info) {
    let novasInfo = {
        ...info,
        cidade:"São Paulo",
        estado:"São Paulo"
    };
    return novasInfo;
} 

console.log(adicionarInfo({nome:'Emerson', sobrenome:'Seiler'}));
