/*

  ###Celsius e Fahrenheit

  Crie uma função que receba uma string em celsius ou fahrenheit e
  faça a transformação de uma unidade para outra

  C = (F - 32) * 5/9
  F = C * 9/5 +32

*/

let temperatureEntra = '35'

let celsius = (Number(temperatureEntra) - 32) * 5/9

let fahrenheit = Number(temperatureEntra) * 9/5 + 32

console.log(celsius)
console.log(fahrenheit)