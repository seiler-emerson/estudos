//SELECIONAR OS ELEMENTOS DO HTML

let digitalElement = document.querySelector('.digital');  
let sElement = document.querySelector('.p_s');
let mElement = document.querySelector('.p_m');
let hElement = document.querySelector('.p_h');

//FUNÇÃO PARA INSERIR AS INFORMAÇÕES NO RELÓGIO
function updateClock() { 
    let now = new Date();                                       //Pegar a data
    let hour = now.getHours();                                  //Pegar a hora
    let minute = now.getMinutes();                              //Pegar os minutos
    let second = now.getSeconds();                              //Pegar os segundos

    digitalElement.innerHTML = `${fixZero(hour)}:${fixZero(minute)}:${fixZero(second)}`; //Exibir o relógio digital

    //CALCULO PARA IDENTIFICAR QUANTOS GRAUS CADA MOMENTO EQUIVALE
    let sDeg = ((360 / 60) * second) - 90;
    let mDeg = ((360 / 60) * minute) - 90;
    let hDeg = ((360 / 12) * hour) - 90;

    //MANIPULAÇÃO DO CSS PARA DEIXAR O ANGULO DINÂMICO EM FUNÇÃO DAS HORAS
    sElement.style.transform = `rotate(${sDeg}deg)`;
    mElement.style.transform = `rotate(${mDeg}deg)`;
    hElement.style.transform = `rotate(${hDeg}deg)`;
}

//FUNÇÃO PARA CORRIGIR A AUSÊNCIA DO ZERO NOS PRIMEIROS 9 SEGUNDOS/MINUTOS/HORAS
function fixZero(time) {                                        
    if(time < 10) {
        return '0'+time;
    } else {
        return time;
    }
}

setInterval(updateClock, 1000);             //ATUALIZAR OS DADOS A CADA SEGUNDO
updateClock();                              //INICIAR OS DADOS NO MOMENTO EM QUE A PÁGINA SEJA ABERTA, CASO NÃO TENHA LEVARÁ 1 SEGUNDO PARA OS DADOS APARECEREM
