let b7validator = {     //Ação para previnir o envio das informações do formulário, possibilitando a verificação do mesmo antes.
    handleSubmit:(event)=>{
        event.preventDefault();
        let send = true;

        let inputs = form.querySelectorAll('input');
        
        for(let i=0;i<inputs.length;i++) {
            let input = inputs[i];
            let check = b7validator.checkInput(input);
            if(check !== true) {
                console.log(check);
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
            for(let k in rules) {
                let rDetails = rules[k].split('=');
                switch(rDetails[0]) {
                    case 'required':
                        if(input.value == '') {
                            return 'Campo não pode ser vazio'
                        }
                    break;
                    case 'min':

                    break;
                }
            }
        }
        return true;
    }
};


let form = document.querySelector('.b7validator');

form.addEventListener('submit', b7validator.handleSubmit);
