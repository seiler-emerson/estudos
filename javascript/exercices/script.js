/*

  ###TRANSFORMAR NOTAS ESCOLARES

  Crie um algoritmo que transforme notas do sistema
  numérico para sistema de notas em caracteres tipo ABC

  * de 90 pra cima - A
  * entre 80 - 89  - B
  * entre 70 - 79  - C
  * entre 60 - 69  - D
  * menor que 60   - E

*/

let noteNum = 70
let noteAlpA = noteNum >= 90
let noteAlpB = noteNum >= 80 && noteNum <= 89
let noteAlpC = noteNum >= 70 && noteNum <= 79
let noteAlpD = noteNum >= 60 && noteNum <= 69
let noteAlpF = noteNum < 60


if (noteAlpA) {
  console.log("A")
} else if (noteAlpB){
  console.log("B")
} else if (noteAlpC) {
  console.log("C")
} else if (noteAlpD) {
  console.log("D")
} else {
  console.log("E")
}