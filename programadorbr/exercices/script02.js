/*

  ###SISTEMA DE GASTOS FAMILIAR

  Crie um objeto que possuirá 2 propriedades, ambos do tipo array:
    * receitas: []
    * despesas: []
  
  Agora, crie uma função que irá calcular o total de receitas
  e despesas e irá mostrar uma mensagem se a família está com
  saldo positivo ou negativo, seguido do valor do saldo.

*/

const caixa = {
  receitas: [5235, 250, 245],
  despesas: [1500, 1200, 987]
}

let totalReceitas = caixa.receitas[0] + caixa.receitas[1] + caixa.receitas[2]

console.log(totalReceitas)

let totalDespesas = caixa.despesas[0] + caixa.despesas[1] + caixa.despesas[2]

console.log(totalDespesas)

let saldoFinal = totalReceitas - totalDespesas

if (saldoFinal > 0) {
  console.log('Saldo Positivo')
} else if (saldoFinal == 0){
  console.log('Você está com saldo Zero')
} else {
  console.log('Saldo Negativo')
}