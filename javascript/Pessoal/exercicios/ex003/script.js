function somar() {
var num1 = document.getElementById("n1")
var num2 = document.getElementById("n2")
var n1 = Number(num1.value)
var n2 = Number(num2.value)
var resultado = n1 + n2
  res.innerHTML = `O RESULTADO DA SOMA ENTRE <strong>${n1}</strong> e <strong>${n2}</strong> é <strong>${resultado}</strong>`
}