let b7validator = {     //Ação para previnir o envio das informações do formulário, possibilitando a verificação do mesmo antes.
    handleSubmit:(event)=>{
        event.preventDefault();
        let send = true;

        let inputs = form.querySelectorAll('input');
        
        for(let i=0;i<inputs.length;i++) {
            let input = inputs[i];
            let check = b7validator.checkInput(input);
            if(check !== true) {
                send = false;
                //exibir o erro
            }
        }

        if(send) {
            form.submit();
        }
    },
    checkInput:(input)=>{
        let rules = input.getAttribute('data-rules');
        if(rules !== null) {
            rules = rules.split('|');
        }
        return true;
    }
};


let form = document.querySelector('.b7validator');

form.addEventListener('submit', b7validator.handleSubmit);
