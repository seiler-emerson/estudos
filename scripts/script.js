/* CUSTO ELABORAÇÃO

(Montagem do contrato * Valor Hora Responsável Técnico) + (Visita Avaliação * Valor Hora Responsável Técnico) + (Montagem do PMOC * Valor Hora Responsável Técnico) + Deslocamento Avaliação + Emissão ART + Envio ART + Emissão Acervo Técnico

*/

let inputHoraRT = document.getElementById("horaRT");
let inputHoraManutencao = document.getElementById("horaManutencao");

let inputTransporte = document.getElementById("transporte");

let inputLucro = document.getElementById("lucro");
let inputComissao = document.getElementById("comissao");
let inputImpostoNota = document.getElementById("impostoNota");

let inputMontagemContrato = document.getElementById("montagemContrato");
let inputVisitaAvaliacao = document.getElementById("visitaAvaliacao");
let inputMontagemPmoc = document.getElementById("montagemPmoc");
let inputTransporteAvaliacao = document.getElementById("transporteAvaliacao");
let inputEmissaoART = document.getElementById("emissaoART");
let inputEnvioDocumentacao = document.getElementById("envioDocumentacao");
let inputEmissaoAcervo = document.getElementById("emissaoAcervo");

let resultado = document.getElementById("resultado");

function calcular() {
  console.log("Calculando...")

  let horaRT = Number(inputHoraRT.value);
  let horaManutencao = Number(inputHoraManutencao.value);

  let transporte = Number(inputTransporte.value);

  let lucro = Number(inputLucro.value);
  let comissao = Number(inputComissao.value);
  let impostoNota = Number(inputImpostoNota.value);

  let montagemContrato = Number(inputMontagemContrato.value);
  let visitaAvaliacao = Number(inputVisitaAvaliacao.value);
  let montagemPmoc = Number(inputMontagemPmoc.value);
  let transporteAvaliacao = Number(inputTransporteAvaliacao.value);
  let emissaoART = Number(inputEmissaoART.value);
  let envioDocumentacao = Number(inputEnvioDocumentacao.value);
  let emissaoAcervo = Number(inputEmissaoAcervo.value);

  let custoElaboracao = ((horaRT * montagemContrato) + (horaRT * transporte) + (horaRT * montagemPmoc) + visitaAvaliacao + emissaoART + envioDocumentacao + emissaoAcervo)

  resultado.innerHTML = `<p>O custo de elaboração do PMOC é R$${custoElaboracao}.</p>`
  
  return 


  // console.log(horaRT)
  // console.log(montagemContrato)
  // console.log(visitaAvaliacao)
  // console.log(montagemPmoc)
  // console.log(transporteAvaliacao)
  // console.log(emissaoART)
  // console.log(envioDocumentacao)
  // console.log(emissaoAcervo)
  //console.log(((horaRT * montagemContrato) + (horaRT * transporte) + (horaRT * montagemPmoc) + visitaAvaliacao + emissaoART + envioDocumentacao + emissaoAcervo))
}