document.querySelector('.search').addEventListener('submit', async (event)=>{             //Cria um evento assincrono no botão de busca
    event.preventDefault();                                                               //Previne a ação padrão, evitando que a página seja atualizada

    let input = document.querySelector('#searchInput').value;                             //Pega o valor digitado no campo de busca

    if(input !== '') {                                                                    //Caso o campo de busca contenha alguma informação
        clearInfo();                                                                      //Limpa a tela
        showWarning('Carregando...')                                                      //Exibe uma mensagem de carregando, enquanto os dados não são exibidos

        let url = `https://api.openweathermap.org/data/2.5/forecast/daily?q=${encodeURI(input)}&cnt=7&appid=4f01fc5477f40bbe847d2aa09afb508a&units=metric&lang=pt_br`;
        
        //let url = `https://api.openweathermap.org/data/2.5/weather?q=${encodeURI(input)}&appid=4f01fc5477f40bbe847d2aa09afb508a&units=metric&lang=pt_br`;   //A variável recebe os dados da API do open weather
        
        let results = await fetch(url);                                                   //A variável results aguardará o resultado da variável resultado chegar. (PROMESSA)            
        let json = await results.json();                                                  //Quando o resultado chegar a variável json receberá o dados de results como JSON

        if(json.cod === 200) {                                                            //O código retornado pela API quando os dados buscados são encontrados é 200, então se o código encontrado no json for 200
            showInfo({                                                                    //Executa a função showInfo, com o template montado
                name: json.name,                                                          //Retorna o nome da cidade
                country: json.sys.country,                                                //Retorna o país
                temp: json.main.temp,                                                     //retorna a temperatura
                tempIcon: json.weather[0].icon,                                           //Retorna o icone do tempo
                tempDescription: json.weather[0].description,                             //Retorna a descrição do tempo
                windSpeed: json.wind.speed,                                               //Retorna a velocidade do vento
                windAngle: json.wind.deg                                                  //Retorna o angulo do vento
            });
        } else {                                                                          //Se o código for diferente de 200
            clearInfo();                                                                  //Limpa a tela
            showWarning('Não encontramos esta localização.');                             //Exibe a mensagem de não encontrado
        }
    } else {                                                                              //Se o input for enviado vazio
        clearInfo();                                                                      //Limpa a tela
    }
});

function showInfo(json) {                                                                                                       //Função para exibir o resultado da busca na tela
    showWarning('');                                                                                                            //Quando o resultado retornar, remove o aviso. 

    
    document.querySelector('.localTitle').innerHTML = `${json.name},${json.country}`;                                                //Exibe o nome da cidade e o país
    document.querySelector('.tempCurrent').innerHTML = `${json.temp} <sup>ºC</sup>`;                                               //Exibe a temperatura
    document.querySelector('.windSpeed').innerHTML = `${json.windSpeed} <span>km/h</span>`;                                      //Exibe a velocidade do vento

    document.querySelector('.icon img').setAttribute('src', `http://openweathermap.org/img/wn/${json.tempIcon}@2x.png`);        //Exibe o icone do estado do tempo
    document.querySelector('.windDot').style.transform = `rotate(${json.windAngle-90}deg)`;                                     //Exibe o ângulo do vento

    document.querySelector('.resultArea').style.display = 'grid';                                                                  //Após carregar as informações acima, quando houver algum resultado, mostra a area de exibição de resultados.

}

function clearInfo() {                                                                                                          //Função para limpar a tela
    showWarning('');                                                                                                            //Remove o aviso
    document.querySelector('.result').style.display = 'none';                                                                   //Oculta os resultados da tela
}

function showWarning(msg) {
    document.querySelector('.alert').innerHTML = msg;                                                                           //Mostra mensagem de status na tela
}



//https://openweathermap.org/weather-conditions