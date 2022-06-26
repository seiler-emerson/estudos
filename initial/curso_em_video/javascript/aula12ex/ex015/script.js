function verificar() {
  var data = new Date()
  var ano = data.getFullYear()
  var fano = document.getElementById('txtano')
  var res = document.getElementById('res')
  if (fano.value.length == 0 || Number(fano.value) > ano) {
    window.alert(`[ERRO] Verifique os dados e tente novamente!`)
  } else {
    var fsex = document.getElementsByName('radsex')
    var idade = ano - Number(fano.value)
    var genero = ''
    var img = document.createElement('img')
    img.setAttribute('id', 'foto')
  }
  if (fsex[0].checked) {
    genero = 'Homem'
    if (idade >= 0 && idade < 10) {
      //CRIANÇA
      img.setAttribute('src', 'meninoc.png')
    } else if (idade < 21) {
      //JOVEM
      img.setAttribute('src', 'meninoj.png')
    } else if (idade < 50) {
      //ADULTO
      img.setAttribute('src', 'meninoa.png')
    } else {
      //IDOSO
      img.setAttribute('src', 'meninoi.png')
    }
  } else if (fsex[1].checked) {
    genero = 'Mulher'

    if (idade >= 0 && idade < 10) {
      //CRIANÇA
      img.setAttribute('src', 'meninac.png')
    } else if (idade < 21) {
      //JOVEM
      img.setAttribute('src', 'meninaj.png')
    } else if (idade < 50) {
      //ADULTO
      img.setAttribute('src', 'meninaa.png')
    } else {
      //IDOSO
      img.setAttribute('src', 'meninai.png')
    }
  }
  res.style.textAlign = 'center'
  res.innerHTML = `Detectamos ${genero} com ${idade} anos.`
  res.appendChild(img)
}
