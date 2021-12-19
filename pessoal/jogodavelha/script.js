function jogar1() {
    if (document.querySelector('#item1').classList.contains('vazio')) {
        document.querySelector('#item1').classList.remove('vazio');
        document.querySelector('#item1').classList.add('circulo');

    } else if (document.querySelector('#item1').classList.contains('circulo')) {
        document.querySelector('#item1').classList.remove('circulo');
        document.querySelector('#item1').classList.add('quadrado');

    } else {
    document.querySelector('#item1').classList.remove('quadrado');
    document.querySelector('#item1').classList.add('circulo');
    }
}

function jogar2() {
    if (document.querySelector('#item2').classList.contains('vazio')) {
        document.querySelector('#item2').classList.remove('vazio');
        document.querySelector('#item2').classList.add('circulo');

    } else if (document.querySelector('#item2').classList.contains('circulo')) {
        document.querySelector('#item2').classList.remove('circulo');
        document.querySelector('#item2').classList.add('quadrado');

    } else {
    document.querySelector('#item2').classList.remove('quadrado');
    document.querySelector('#item2').classList.add('circulo');
    }
}

function jogar3() {
    if (document.querySelector('#item3').classList.contains('vazio')) {
        document.querySelector('#item3').classList.remove('vazio');
        document.querySelector('#item3').classList.add('circulo');

    } else if (document.querySelector('#item3').classList.contains('circulo')) {
        document.querySelector('#item3').classList.remove('circulo');
        document.querySelector('#item3').classList.add('quadrado');

    } else {
    document.querySelector('#item3').classList.remove('quadrado');
    document.querySelector('#item3').classList.add('circulo');
    }
}

function jogar4() {
    if (document.querySelector('#item4').classList.contains('vazio')) {
        document.querySelector('#item4').classList.remove('vazio');
        document.querySelector('#item4').classList.add('circulo');

    } else if (document.querySelector('#item4').classList.contains('circulo')) {
        document.querySelector('#item4').classList.remove('circulo');
        document.querySelector('#item4').classList.add('quadrado');

    } else {
    document.querySelector('#item4').classList.remove('quadrado');
    document.querySelector('#item4').classList.add('circulo');
    }
}

function jogar5() {
    if (document.querySelector('#item5').classList.contains('vazio')) {
        document.querySelector('#item5').classList.remove('vazio');
        document.querySelector('#item5').classList.add('circulo');

    } else if (document.querySelector('#item5').classList.contains('circulo')) {
        document.querySelector('#item5').classList.remove('circulo');
        document.querySelector('#item5').classList.add('quadrado');

    } else {
    document.querySelector('#item5').classList.remove('quadrado');
    document.querySelector('#item5').classList.add('circulo');
    }
}

function jogar6() {
    if (document.querySelector('#item6').classList.contains('vazio')) {
        document.querySelector('#item6').classList.remove('vazio');
        document.querySelector('#item6').classList.add('circulo');

    } else if (document.querySelector('#item6').classList.contains('circulo')) {
        document.querySelector('#item6').classList.remove('circulo');
        document.querySelector('#item6').classList.add('quadrado');

    } else {
    document.querySelector('#item6').classList.remove('quadrado');
    document.querySelector('#item6').classList.add('circulo');
    }
}

function jogar7() {
    if (document.querySelector('#item7').classList.contains('vazio')) {
        document.querySelector('#item7').classList.remove('vazio');
        document.querySelector('#item7').classList.add('circulo');

    } else if (document.querySelector('#item7').classList.contains('circulo')) {
        document.querySelector('#item7').classList.remove('circulo');
        document.querySelector('#item7').classList.add('quadrado');

    } else {
    document.querySelector('#item7').classList.remove('quadrado');
    document.querySelector('#item7').classList.add('circulo');
    }
}

function jogar8() {
    if (document.querySelector('#item8').classList.contains('vazio')) {
        document.querySelector('#item8').classList.remove('vazio');
        document.querySelector('#item8').classList.add('circulo');

    } else if (document.querySelector('#item8').classList.contains('circulo')) {
        document.querySelector('#item8').classList.remove('circulo');
        document.querySelector('#item8').classList.add('quadrado');

    } else {
    document.querySelector('#item8').classList.remove('quadrado');
    document.querySelector('#item8').classList.add('circulo');
    }
}

function jogar9() {
    if (document.querySelector('#item9').classList.contains('vazio')) {
        document.querySelector('#item9').classList.remove('vazio');
        document.querySelector('#item9').classList.add('circulo');

    } else if (document.querySelector('#item9').classList.contains('circulo')) {
        document.querySelector('#item9').classList.remove('circulo');
        document.querySelector('#item9').classList.add('quadrado');

    } else {
    document.querySelector('#item9').classList.remove('quadrado');
    document.querySelector('#item9').classList.add('circulo');
    }
}
function limpar() {
    
    document.querySelector('#item1').classList.remove('quadrado');
    document.querySelector('#item1').classList.remove('circulo');

    document.querySelector('#item2').classList.remove('quadrado');
    document.querySelector('#item2').classList.remove('circulo');

    document.querySelector('#item3').classList.remove('quadrado');
    document.querySelector('#item3').classList.remove('circulo');

    document.querySelector('#item4').classList.remove('quadrado');
    document.querySelector('#item4').classList.remove('circulo');

    document.querySelector('#item5').classList.remove('quadrado');
    document.querySelector('#item5').classList.remove('circulo');

    document.querySelector('#item6').classList.remove('quadrado');
    document.querySelector('#item6').classList.remove('circulo');

    document.querySelector('#item7').classList.remove('quadrado');
    document.querySelector('#item7').classList.remove('circulo');

    document.querySelector('#item8').classList.remove('quadrado');
    document.querySelector('#item8').classList.remove('circulo');

    document.querySelector('#item9').classList.remove('quadrado');
    document.querySelector('#item9').classList.remove('circulo');
}