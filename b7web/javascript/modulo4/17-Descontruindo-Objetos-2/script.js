let pessoa = {
    nome: 'Emerson',
    sobrenome: 'Seiler',
    //idade: 26,
    social:{
        instagram: 'seiler.emerson',
        linkedin: 'seiler.emerson'
    },
    nomeCompleto: function() {
        return `${this.nome} ${this.sobrenome}`;
    }
};


let {nome, sobrenome, idade = 6} = pessoa

console.log(nome, sobrenome, idade);