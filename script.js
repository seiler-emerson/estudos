//ATALHO PARA O QUERYSELCTOR / ALL 
//Função que recebe um elemento em c, e envia o elemento para dentro do querySelector
const c = (el)=>{
    return document.querySelector(el);
}
const cs = (el)=>{
    return document.querySelectorAll(el);
}


// LISTAR AS PIZZAS
//Mapear os itens, fazer uma cópia e mostrar na tela com o modelo de exibição criado no HTML


//Busca a váriavel pizzaJson que contem o JSON ficticio e mapeia ela. A partir de uma arrow function seleciona os item dentro do JSON.
pizzaJson.map((item, index)=>{ 

    //Clonar estrutura de exibição do HTML, preenche os dados com as informações do JSON e mostra na tela em cada item do JSON.
    //Selecionando a class .pizza-item dentro da class .models e clonando para dentro de uma variável, assim criando uma forma de digitar menos códigos, armazendo o trecho de código que se repetirá dentro de uma variável.
    let pizzaItem = c('.models .pizza-item').cloneNode(true);
    
    //Adicionar a imagem da pizza extraido do JSON na tela adicionando informações ao src da tag img no html
    pizzaItem.querySelector('.pizza-item--img img').src = item.img;

    //Adicionar o preço da pizza extraido do JSON na tela e padroniza a exibição do número com duas casas decimais após a vírgula
    pizzaItem.querySelector('.pizza-item--price').innerHTML = `R$ ${item.price.toFixed(2)}`;

    //Adicionar o nome da pizza extraido do JSON na tela
    pizzaItem.querySelector('.pizza-item--name').innerHTML = item.name;

    //Adicionar a descrição da pizza extraido do JSON na tela
    pizzaItem.querySelector('.pizza-item--desc').innerHTML = item.description;

    //Cancelar o evento padrão de atualizar a página quando clicado nos elementos da tag a e adicionar o evento de abrir a caixa de seleção sem atualizar a tela
    pizzaItem.querySelector('a').addEventListener('click', (e)=>{  
        e.preventDefault(); //Cancelar o evento padrão, no caso atualizar a página.

        //Animação ao abrir a caixa de seleção
        c('.pizzaWindowArea').style.opacity = 0; //Para a animação funcionar é necessário que a opacidade inicial seja 0
        c('.pizzaWindowArea').style.display = 'flex'; //A caixa de seleção está pronta, porém não tem exibição definida no css, para isso o evento de click irá alterar o css para o display ser exibido. 
        
        setTimeout(()=>{ //É necessário gerar um delay para a vizualização da mudança de opacidade da caixa de seleção seja percebida
            c('.pizzaWindowArea').style.opacity = 1; // Opacidade em 100%
        }, 200);
        
    });

    //.apend() pega o conteúdo que há dentro do elemento selecionado e adiciona mais um conteúdo.
    //Exibir o item clonado em pizzaItem, porém sem exibir as informações ainda.
    c('.pizza-area').append( pizzaItem );
      
    


});

