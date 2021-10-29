function enviar() {
  var msg = document.getElementById("entrada")
  msg = String(msg.value)

  if (msg != "") {
    window.alert('Olá mundo!')
    res.innerHTML = `<p>Ola, Mundo!</p>`
  } else {
    res.innerHTML = `<p>Não quer conversar? Não se acanhe!</p>`

  }
}