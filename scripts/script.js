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
let inputAvaliacao = document.getElementById("avaliacao");
let inputMontagemPmoc = document.getElementById("montagemPmoc")
let inputTransporteAvaliacao = document.getElementById("transporteAvaliacao");
let inputEmissaoART = document.getElementById("emissaoART");
let inputEnvioDocumentacao = document.getElementById("envioDocumentacao");
let inputEmissaoAcervo = document.getElementById("emissaoAcervo");

let resultado = document.getElementById("resultado");

function calcular() {
  console.log("Calculando...")

  let horaRT = inputHoraRT.value;
  let horaManutencao = inputHoraManutencao.value;

  let transporte = inputTransporte.value;

  let lucro = inputLucro.value;
  let comissao = inputComissao.value;
  let impostoNota = inputImpostoNota.value;

  let montagemContrato = inputMontagemContrato.value;
  let avaliacao = inputAvaliacao.value;
  let montagemPmoc = inputMontagemPmoc.value;
  let transporteAvaliacao = inputTransporteAvaliacao.value;
  let emissaoART = inputEmissaoART.value;
  let envioDocumentacao = inputEnvioDocumentacao.value;
  let emissaoAcervo = inputEmissaoAcervo.value;

  let custoElaboracao = (horaRT * montagemContrato) + (horaRT * transporte) + (horaRT * montagemPmoc) + transporteAvaliacao + emissaoART + envioDocumentacao + emissaoAcervo;

  resultado.innerHTML = `<p>O custo de elaboração do PMOC é R$${custoElaboracao}.</p>`

}