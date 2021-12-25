function pegarTemperatura() {
    return new Promise(function(resolve, reject) {
        console.log("Pegando temperatura...");

        setTimeout(function(){
            resolve('40 na sombra');
        }, 2000);
    });
}

//USANDO A PROMISE
console.log("Código antes.")

let temp = pegarTemperatura();

console.log("Código durante.")

temp.then(function(resultado) {
    console.log("TEMPERATURA: "+resultado)
});
temp.catch(function(error){
    console.log("Foram encontrados erros.")
});

console.log("Código depois.")