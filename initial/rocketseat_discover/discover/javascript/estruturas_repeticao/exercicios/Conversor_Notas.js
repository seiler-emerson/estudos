// Crie um algoritmo que transforme as notas do sistema
// numérico para sistema de notas em caracteres tipo A B C

// * de 90 para cima -   A
// * entre 80 - 89   -   B
// * entre 70 - 79   -   C
// * entre 60 - 69   -   D
// * menor que 60    -   F

// RESOLUÇÃO 01

let grade = -1

if (grade >= 90 && grade <= 100) {
    console.log('Nota A')
} else if ( grade >= 80 && grade <= 89) {
    console.log('Nota B')
} else if ( grade >= 70 && grade <= 79) {
    console.log('Nota C')
} else if ( grade >= 60 && grade <= 69) {
    console.log('Nota D')
} else if ( grade < 60 && grade >= 0) {
    console.log('Nota F')
} else {
    console.log('Nota inválida')
}
