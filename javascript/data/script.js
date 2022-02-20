/*

  Manipulando Arrays

*/

let techs = ["html", "css", "js"]

//* Adicionar um item no fim
techs.push("nodejs")

//* Adicionar no começo
techs.unshift("sql")

//* Remover do fim
techs.pop()

//* Remover do começo
techs.shift()

//* Pegar somente alguns elementos do Array
console.log(techs.slice(1,3))

//* Remover 1 ou mais itens em qualquer posição do Array
techs.splice(1, 1)

//* Encontrar a posição de um elemento no Array
let index = techs.indexOf('css')


console.log(index)