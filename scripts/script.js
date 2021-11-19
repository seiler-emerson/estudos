/* CUSTO ELABORAÇÃO

(Montagem do contrato * Valor Hora Responsável Técnico) + (Visita Avaliação * Valor Hora Responsável Técnico) + (Montagem do PMOC * Valor Hora Responsável Técnico) + Deslocamento Avaliação + Emissão ART + Envio ART + Emissão Acervo Técnico

*/

//CUSTOS OPERACIONAIS
let inputHoraRT = document.getElementById("horaRT");
let inputHoraManutencao = document.getElementById("horaManutencao");
let inputTransporte = document.getElementById("transporte");
let inputLucro = document.getElementById("lucro");
let inputComissao = document.getElementById("comissao");
let inputImpostoNota = document.getElementById("impostoNota");

//ELABORACAO DOCUMENTAL - PMOC
let inputMontagemContrato = document.getElementById("montagemContrato");
let inputVisitaAvaliacao = document.getElementById("visitaAvaliacao");
let inputMontagemPmoc = document.getElementById("montagemPmoc");
let inputMaterialGrafico = document.getElementById("materialGrafico");
let inputEmissaoART = document.getElementById("emissaoART");
let inputEnvioDocumentacao = document.getElementById("envioDocumentacao");

//ACOMPANHAMENTO DO CONTRATO RT
let inputQuantidadeVisitasRT = document.getElementById("quantidadeVisitasRT");
let inputTempoVisitaRT = document.getElementById("tempoVisitaRT");
let inputElaboracaoRelatorios = document.getElementById("elaboracaoRelatorios");

//CUSTO MANUTENCAO
let inputQuantidadeVisitasMan = document.getElementById("quantidadeVisitasMan");
let inputTempoVisitaMan = document.getElementById("tempoVisitaMan");
let inputPreenchimentoOs = document.getElementById("preenchimentoOS");
let inputCustoMateriais = document.getElementById("custoMateriais");

//ANALISE LABORATORIAL
let inputCustoAnalise = document.getElementById("custoAnalise");


//RESULTADO
let resultado = document.getElementById("resultado");



function calcular() {
  console.log("Calculando...")

  //Armazenar dados do formulário como números

  let horaRT = Number(inputHoraRT.value);
  let horaManutencao = Number(inputHoraManutencao.value);
  let transporte = Number(inputTransporte.value);
  let lucro = Number(inputLucro.value);
  let comissao = Number(inputComissao.value);
  let impostoNota = Number(inputImpostoNota.value);

  let montagemContrato = Number(inputMontagemContrato.value);
  let visitaAvaliacao = Number(inputVisitaAvaliacao.value);
  let montagemPmoc = Number(inputMontagemPmoc.value);
  let materialGrafico = Number(inputMaterialGrafico.value);
  let emissaoART = Number(inputEmissaoART.value);
  let envioDocumentacao = Number(inputEnvioDocumentacao.value);
  
  let quantidadeVisitasRT = Number(inputQuantidadeVisitasRT.value);
  let TempoVisitaRT = Number(inputTempoVisitaRT.value);
  let ElaboracaoRelatorios = Number(inputElaboracaoRelatorios.value);
  
  let quantidadeVisitasMan = Number(inputQuantidadeVisitasMan.value);
  let tempoVisitaMan = Number(inputTempoVisitaMan.value);
  let preenchimentoOS = Number(inputPreenchimentoOs.value);
  let custoMateriais = Number(inputCustoMateriais.value);

  
  let custoAnalise = Number(inputCustoAnalise.value);

  //CALCULOS

  //Custo Elaboração
  let custoElaboracao = (montagemContrato * horaRT) + (visitaAvaliacao * horaRT) + (montagemPmoc * horaRT) + materialGrafico + emissaoART + envioDocumentacao

  //Custo Acompanhamento (((Hora RT * Tempo Visitas)+(Hora RT* Elaboração Relatórios)) * Visitas)+(Visitas * Transporte)
  let custoAcompanhamento = ((horaRT * TempoVisitaRT)+(horaRT * ElaboracaoRelatorios))* quantidadeVisitasRT +(quantidadeVisitasRT * transporte)

  //Custo Manutenção (((Hora Manutenção * Tempo Visitas)+(Hora Man * Preenc OS)) * Visitas)+(Visitas * Transporte)+Materiais
  let custoManutencao = (((horaManutencao * tempoVisitaMan) + (horaManutencao*preenchimentoOS))*quantidadeVisitasMan) + (quantidadeVisitasMan * transporte) + custoMateriais

  //Custo Responsável Técnico = HoraRT * (Montagem Contrato + Visita Avaliação + Montagem PMOC+ (Visita x Tempo Visita) +(Elab Rel * Visitas)
  let custoRT = horaRT *(montagemContrato + visitaAvaliacao + montagemPmoc + (quantidadeVisitasRT*TempoVisitaRT) + (ElaboracaoRelatorios * quantidadeVisitasRT))

  //Valor PMOC = (Custo Elaboração+Custo Acompanhamento+Custo Manutenção+Custo Laboratorio+((Custo Elaboração+Custo Acompanhamento+Custo Manutenção+Custo Laboratorio)*lucro))/(1-Imposto)
  let valorPMOC = (custoElaboracao + custoAcompanhamento + custoManutencao + custoAnalise +
                  ((custoElaboracao + custoAcompanhamento + custoManutencao + custoAnalise)*(lucro/100)))/
                  (1-(impostoNota/100))



  resultado.innerHTML = `<p>O custo de elaboração do PMOC é R$${custoElaboracao}</p>`
  resultado.innerHTML += `<p>O custo de acompanhamento do PMOC é R$${custoAcompanhamento}</p>`
  resultado.innerHTML += `<p>O custo de manutenção do PMOC é R$${custoManutencao}</p>`
  resultado.innerHTML += `<p>O custo com análise laboratorial do PMOC é R$${custoAnalise}</p>`
  resultado.innerHTML += `<p>O custo com Responsável Técnico é R$${custoRT}</p>`
  resultado.innerHTML += `<p>O valor a cobrar do PMOC é R$${valorPMOC}</p>`
}

teste