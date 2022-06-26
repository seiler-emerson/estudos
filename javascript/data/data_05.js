
/*

  Manipulando Strings e Números

  Separe um texto que contem espaços, em um novo array onde cada texto é uma posição do array. Depois disso, transforme o array em um texto e onde eram espaços, coloque _ .

*/


let phrases = "Programar é muito bacana!"
let myArray = phrases.split(" ")
console.log(myArray)
let phrasesWithUnderscores = myArray.join("_")
console.log(phrasesWithUnderscores)
