function contar() {
  var ini = document.getElementById('txti')                                        //A variável ini recebe o conteúdo do id="txti" do HTML
  var fim = document.getElementById('txtf')                                        //A variável fim recebe o conteúdo do id="txtf" do HTML
  var passo = document.getElementById('txtp')                                      //A variável passo recebe o conteúdo do id="txtp" do HTML
  var res = document.getElementById('res')                                         //A variável res recebe o conteúdo do id="res" do HTML

  if (                                                         //MENSAGEM DE ERRO CASO NENHUM DADO SEJA DIGITADO E BOTÃO SEJA PRESSIONADO
    ini.value.length == 0 ||  fim.value.length == 0 || passo.value.length == 0 ) {         //Se a variavel ini, fim ou passo for igual a zero.
    res.innerHTML = `Impossível contar!`                                                   //Apresentar texto Impossível contar
    window.alert('[ERRO] Faltam dados!')                                                   //Apresentar alerta na tela
  } else {                                                                                 //Senão
    res.innerHTML = 'Contando: '                                                           //Apresentar texto Contando:
    let i = Number(ini.value)                                                              //A variável i recebe o dado da variavel ini como número
    let f = Number(fim.value)                                                              //A variável f recebe o dado da variavel fim como número
    let p = Number(passo.value)                                                            //A variável p recebe o dado da variavel passo como número
    if (p <= 0) {                                                                         //Se o passo for menor que 0
      window.alert('Passo inválido! Considerando PASSO 1')                                //Apresentar alerta na tela e
      p = 1                                                                               //o valor do passo passa a valer 1
    }

    //CONTAGEM
    if (i < f) {                               //Se a váriavel i for menor que f
      //CONTAGEM CRESCENTE                     //Processo de contagem crescente
      for (let c = i; c <= f; c += p) {        //Variavel c recebe o valor de i, se c for menor ou igual a f, c recebe ele mesmo mais o valor do passo
        res.innerHTML += `${c} \u{1F449}`      //Apresenta na tela a contagem seguida de um emoji
      }
    } else {                                   //Se não
      //CONTAGEM REGRESSIVA                    //É um processo de contagem decrescente
      for (let c = i;c >= f;c -= p )           //Variavel c recebe o valor de i, se c for maior ou igual a f, c recebe ele mesmo menos o valor do passo
        res.innerHTML += `${c} \u{1F449}`      //Apresenta na tela a contagem seguida de um emoji
    }
    res.innerHTML += `\u{1F3C1}`               //Apresenta emoji de bandeira ao final de cada rodada
  }
}
