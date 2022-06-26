let timer;
function rodar() {
    timer = setTimeout(function() {
        document.querySelector('.demo').innerHTML = 'Rodou!'
    }, 2000);
}
function parar() {
    clearTimeout(timer);
}