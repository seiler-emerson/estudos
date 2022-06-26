let info = ['Emerson Seiler', 'Emerson', 'Seiler', '@seiler.emerson'];

let [ nomeCompleto, nome, sobrenome, instagram ] = info;

document.querySelector('.demo').innerHTML = `${instagram} e ${sobrenome}`;