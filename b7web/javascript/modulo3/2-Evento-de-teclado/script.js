function digitou(e) {
    if (e.keyCode == 13) {   //Se a tecla digitada for enter
        let texto = document.getElementById("campo").value;    //armazena a informação em texto

        console.log(texto);           // mostra no console a informação de texto
    }
}
