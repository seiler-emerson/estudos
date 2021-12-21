let dia = 7;
let diaNome = '';

switch(dia) {
    case 6:
    case 7:
        diaNome = 'Final de Semana';
        break; 
    default:
        diaNome = 'Dia de semana';
        break;
}

document.getElementById("dia").innerHTML = "Hoje é: "+diaNome;