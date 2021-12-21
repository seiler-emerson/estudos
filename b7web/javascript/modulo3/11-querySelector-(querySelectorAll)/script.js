let html = '';

let c = 1;         //c é igual a 1

while(c <= 10) {                     //enquanto c for menor ou igual a 10
    html += "Número: "+c+"<br/>";    //html recebe ele mesmo mais o valor de c
    c++;                             //ao final de cada leitura o c recebe ele mesmo mais 1
}

document.getElementById('demo').innerHTML = html;    //mostrar no navegador