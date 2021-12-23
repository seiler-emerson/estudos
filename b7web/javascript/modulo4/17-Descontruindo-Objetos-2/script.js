let pessoa = {
    nome: 'Emerson',
    sobrenome: 'Seiler',
    idade: 26,
    social:{
        linkedin: 'seiler.emerson',
        instagram: {
            url: '@seiler.emerson',
            seguidores: 250
        },
    },
    // nomeCompleto: function() {
    //     return `${this.nome} ${this.sobrenome}`;
    // }
};


// let {linkedin, instagram} = pessoa.social;
// let { nome, idade, social:{instagram:{url:instagram, seguidores}} } = pessoa;

// console.log(nome, idade, instagram, seguidores);

function pegarNomeCompleto({nome, sobrenome = 'Silva', social:{instagram:{url}}}) {
    return `${nome} ${sobrenome} (Siga em ${url})`;
}

document.querySelector('.demo').innerHTML = pegarNomeCompleto(pessoa);