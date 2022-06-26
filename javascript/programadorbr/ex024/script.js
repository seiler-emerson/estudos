
function calcMedia(n1, n2) {
  return (this.notas[0] + this.notas[1]) /2;
}

var aluno = {
  nome: "Igor",
  notas: [9,8],

  media: calcMedia
}

var aluno1 = {
  nome: "Joao",
  notas: [10,8],

  media: calcMedia
}

console.log(aluno.nome)
console.log(aluno.media())

console.log(aluno1.nome)
console.log(aluno1.media())