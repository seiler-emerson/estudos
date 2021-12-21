//OBJETOS EXEMPLO 01
let carro = {
    nome:'Fiat',
    modelo:'Uno',
    peso:'800kg',
    ligado:false,
    ligar:function() {
        this.ligado = true;
        console.log("Ligando o "+this.modelo)
        console.log("VRUM VRUM!")
    },
    acelerar:function() {
        if(this.ligado == true) {
            console.log("Riiiiiihhhih!")
        } else {
            console.log(this.nome+" "+this.modelo+" não está ligado")
        }
    }
};

//carro.ligar();
carro.acelerar();


//OBJETOS EXEMPLO 02

let carros = [
    {nome:'Fiat', modelo:'Palio'},
    {nome:'Fiat', modelo:'Uno'},
    {nome:'Toyota', modelo:'Corolla'},
    {nome:'Ferrari', modelo:'Spider'}
];

console.log(carros[2].nome)
console.log(carros[3].modelo)