// let telefone = '54546';

// console.log( telefone.padEnd(9, "*")) //DEFINE QUANTOS CARACTERES A STRING TEM QUE TER E CASO TENHA MENOS ELA PREENCHE OS FALTANTES COM O CARACTER DEFINIDO APÓS OS CARACTERES EXISTENTES

// console.log( telefone.padStart(9, "*")) //DEFINE QUANTOS CARACTERES A STRING TEM QUE TER E CASO TENHA MENOS ELA PREENCHE OS FALTANTES COM O CARACTER DEFINIDO ANTES DOS CARACTERES EXISTENTES

let cartao = '1234123412341234';

let lastDigits = cartao.slice(-4);
console.log(lastDigits);

let cartaoMascarado1 = lastDigits.padStart(16, '*');
let cartaoMascarado2 = lastDigits.padEnd(16, '*');
console.log(`Este é o seu ${cartaoMascarado1} ?`);
console.log(`Este é o seu ${cartaoMascarado2} ?`);