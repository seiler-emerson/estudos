//Variável que armazena a quantidade inicial da caixa de seleção
let modalQt = 1;

//ATALHO PARA O QUERYSELCTOR / ALL 
//Função que recebe um elemento em c, e envia o elemento para dentro do querySelector
const c = (el)=>{
    return document.querySelector(el);
}
const cs = (el)=>{
    return document.querySelectorAll(el);
}


// LISTAGEM DAS PIZZAS
//Mapear os itens, fazer uma cópia e mostrar na tela com o modelo de exibição criado no HTML


//Busca a váriavel pizzaJson que contem o JSON ficticio e mapeia ela. A partir de uma arrow function seleciona os item dentro do JSON.
pizzaJson.map((item, index)=>{ 

    //Clonar estrutura de exibição do HTML, preenche os dados com as informações do JSON e mostra na tela em cada item do JSON.
    //Selecionando a class .pizza-item dentro da class .models e clonando para dentro de uma variável, assim criando uma forma de digitar menos códigos, armazendo o trecho de código que se repetirá dentro de uma variável.
    let pizzaItem = c('.models .pizza-item').cloneNode(true);
    

    //Especificar com pizza está sendo selecionada, armazenando o número do index selecionado na variável data-key
    pizzaItem.setAttribute('data-key', index);

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
        let key = e.target.closest('.pizza-item').getAttribute('data-key') //Armazenar o data-key da pizza selecionada na variável key para utilizar na caixa de seleção | .closest('.pizza-item') seleciona o item mais próximo que contenha .pizza-item

        //Sempre que abrir a caixa de seleção definir a quantidade de pizza seleciona na caixa de seleção para 1.
        modalQt = 1;

        //Preencher a imagem da pizza na caixa de seleção
        c('.pizzaBig img').src= pizzaJson[key].img;

        //Preencher o nome da pizza na caixa de seleção
        c('.pizzaInfo h1').innerHTML = pizzaJson[key].name;

        //Preencher a descrição da pizza na caixa de seleção
        c('.pizzaInfo--desc').innerHTML = pizzaJson[key].description;

        //Preencher o preço da pizza na caixa de seleção
        c('.pizzaInfo--actualPrice').innerHTML = `R$ ${pizzaJson[key].price.toFixed(2)}`;
        
        //Configurar a seleção de tamanhos da pizza, para que em cada vez que seja aberto a seleção o item selecionado anteriormente seja alterado para o de maior tamanho.
        c('.pizzaInfo--size.selected').classList.remove('selected') //acessar o item selecionado, acessar a lista dele com o classList e remover a class selected que é a que configura o item selecionado.
    
        //Preencher o tamanho da pizza na caixa de seleção | forEach() para cada um dos itens ele irá executar uma função
        cs('.pizzaInfo--size').forEach((size, sizeIndex)=>{  
            if(sizeIndex == 2) { //Quando a seleção for do item com maior peso, no caso com index 2
                size.classList.add('selected'); // Acessar a class do elemento e adicionar a class que faz com que o item seja selecionado, assim o item fica selecionado por padrão.
            }
            size.querySelector('span').innerHTML = pizzaJson[key].sizes[sizeIndex]; //Vai até o JSON e busca as informações de peso para cada item. No caso os 3 disponíveis.
        });

        //Ao abrir a caixa de seleção ele vai verificar o item e adicionar a quantidade armazenada na variável modalQT, no caso 1.
        c('.pizzaInfo--qt').innerHTML = modalQt;

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

//EVENTOS DA CAIXA DE SELEÇÃO

//Evento de fechamento da caixa de seleção
function closeModal() {
    c('.pizzaWindowArea').style.opacity = 0; //Animação para fechamento, o inverso da abertura
    setTimeout(()=>{  //Espera 0.5 segundo e altera o display para none.
        c('.pizzaWindowArea').style.display = 'none';
    }, 500);
}
cs('.pizzaInfo--cancelButton, .pizzaInfo--cancelMobileButton').forEach((item)=>{ //Adicionar o evento de fechamento nos botões de cancelar(desktop) e voltar(celular). 
    item.addEventListener('click', closeModal);
});

//Botões de quantidade
c('.pizzaInfo--qtmenos').addEventListener('click', ()=>{ //Adiciona evento de click
    if (modalQt >1) {   //Se a quantidade for maior que 1 
        modalQt--;      //Diminui de 1 em 1.
        c('.pizzaInfo--qt').innerHTML = modalQt;
    }
    
});
c('.pizzaInfo--qtmais').addEventListener('click', ()=>{ //Adiciona evento de click
    modalQt++;          //Aumenta de 1 em 1
    c('.pizzaInfo--qt').innerHTML = modalQt;
});

//Configurar a seleção de pesos das pizzas
cs('.pizzaInfo--size').forEach((size, sizeIndex)=>{  
    size.addEventListener('click', (e)=>{ //Adicionar evento de click
        c('.pizzaInfo--size.selected').classList.remove('selected')   //Configurar para desmarcar o item anterior selecionado e marcar a seleção atual
        size.classList.add('selected');  //Adicionar a class de seleção no item selecionado.
    });
});