function verificar(){
  var nome = String(txtnome.value)
  var res = document.getElementById('res')

  res.innerHTML = `É um prazer te conhecer <strong>${nome}</strong>!`
}
