function subirTela() {
    window.scrollTo({
        top: 0,
        left: 0,
        behavior: 'smooth'
    })
}

function decidirBotaoScroll() {
    if (window.scrollY === 0) {
        // ocultar botão
        document.querySelector('.scrollButton').style.display = 'none';
    } else {
        //mostrar botão
        document.querySelector('.scrollButton').style.display = 'block';
    }

}


// setInterval(decidirBotaoScroll, 1000); //Verificar a cada 1 segundo a posição do scroll para ativar ou não o botão de home

window.addEventListener('scroll', decidirBotaoScroll);