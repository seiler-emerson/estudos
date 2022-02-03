const Modal = {
    open() {
        //Abrir modal
        //Adicionar a class active ao modal
        document.querySelector('.modal-overlay').classList.add('active')
    },
    close() {
        //Fechar modal
        //Remover a class active do modal
        document.querySelector('.modal-overlay').classList.remove('active')
    }
}

//ARMAZENAR OS DADOS NO LOCAL STORAGE
const Storage = {
    get() {
        return JSON.parse(localStorage.getItem("dev.finances:transactions")) || []
    },
    set(transactions) {
        localStorage.setItem("dev.finances: transactions",
        JSON.stringify(transactions))
    }
}

// ESTRUTURA DO ARRAY COM OS DADOS DE ENTRADAS E SAÍDAS
// FUNCIONALIDADE DE SOMA/SUBTRAÇÃO DOS VALORES TOTAIS
const Transaction = {
    all: Storage.get(),

    add(transaction) {
        Transaction.all.push(transaction)

        App.reload()
    },

    remove(index) {
        Transaction.all.splice(index, 1)

        App.reload()
    },

    incomes() {
        let income = 0;
        Transaction.all.forEach(transaction => {
            if(transaction.amount > 0) {
                income += transaction.amount;
            }
        })
        return income
    },
    expenses() {
        let expense = 0;
        Transaction.all.forEach(transaction => {
            if(transaction.amount < 0) {
                expense += transaction.amount;
            }
        })
        return expense
    },
    total() {
        return Transaction.incomes() + Transaction.expenses()
    }
}


//MONTAGEM DO TEMPLATE DOS DADOS DE ENTRADA E SAÍDA
const DOM = {
    transactionContainer: document.querySelector('#data-table tbody'),

    addTransaction(transaction, index) {
        const tr = document.createElement('tr')
        tr.innerHTML = DOM.innerHTMLTransaction(transaction, index)
        tr.dataset.index = index

        DOM.transactionContainer.appendChild(tr)
        
    },
    innerHTMLTransaction(transaction, index) {
        const CSSclass = transaction.amount > 0 ? "income" : "expense";     //Verificação da classe, entrada ou saída. Se for entrada income, se for saida expense

        //CORREÇÃO DA VÍRGULA
        const amount = Utils.formatCurrency(transaction.amount)

        //TEMPLATE
        const html = `
                <td class="description">${transaction.description}</td>
                <td class="${CSSclass}">${amount}</td>
                <td class="date">${transaction.date}</td>
                <td>
                    <img onclick="Transaction.remove(${index})" src="./assets/minus.svg" alt="Remover Transação">
                </td>
        `

        return html
    },

    updateBalance() {
        document.getElementById("incomeDisplay").innerHTML = Utils.formatCurrency(Transaction.incomes())
        document.getElementById("expenseDisplay").innerHTML = Utils.formatCurrency(Transaction.expenses())
        document.getElementById("totalDisplay").innerHTML = Utils.formatCurrency(Transaction.total())
    },

    clearTransactions() {
        DOM.transactionContainer.innerHTML = "";
    }
}

//UTILIDADES
//TRATANDO OS NÚMEROS E CONVERTENDO PARA MOEDA POSITIVO E NEGATIVO
const Utils = {
    formatAmount(value) {
        value = Number(value.replace(/\,\./g, "")) * 100

        return value
    },

    formatDate(date) {
        const splitteDate = date.split("-")

        return `${splitteDate[2]}/${splitteDate[1]}/${splitteDate[0]}`
    },

    formatCurrency(value) {
        const signal = Number(value) < 0 ? "-" : "";

        value = String(value).replace(/\D/g, "")
        
        value = Number(value) / 100
        
        value = value.toLocaleString("pt-BR", {
            style: "currency",
            currency: "BRL"
        })
        
        return signal + value
    }
}

//FORMULÁRIO
const Form = {

    //Pegar os elementos do HTML
    description: document.querySelector('input#description'),
    amount: document.querySelector('input#amount'),
    date: document.querySelector('input#date'),

    //Pegar os valores
    getValues() {
        return {
            description: Form.description.value,
            amount: Form.amount.value,
            date: Form.date.value
        }
    }, 

    //Validar os campos
    validateFields() {
        const { description, amount, date } = Form.getValues();   //Pega os valores dos campos individualmente

        if( description.trim() === "" ||
            amount.trim() === "" ||
            date.trim() === "") {
                throw new Error("Por favor, preencha todos os campos")
        }
    },

    //Formatar os dados para salvar
    formateValues() {
        let { description, amount, date } = Form.getValues();   //Pega os valores dos campos individualmente
        
        amount = Utils.formatAmount(amount)

        date = Utils.formatDate(date)

        return {
            description,
            amount,
            date
        }
    },

    

    //Apagar os dados do formulário
    clearFields() {
        Form.description.value = ""
        Form.amount.value = ""
        Form.date.value = ""
    },
    
    submit(event) {
        event.preventDefault() //Prevenir comportamento padrão

        try {
            //Verificar se todas as informações foram preenchidas
            Form.validateFields()

            //Formatar os dados para salvar
            const transaction = Form.formateValues()

            //salvar
            Transaction.add(transaction)

            //apagar os dados do formulário
            Form.clearFields()

            //modal feche
            Modal.close()


        } catch (error) {
            alert(error.message)
        }

    }
}




//RELEITURA DOS DADOS
const App = {
    init() {

        // FOR PARA LISTAR TODAS AS ENTRADAS E SAÍDAS ADICIONADAS
        Transaction.all.forEach((transaction, index) => {
            DOM.addTransaction(transaction, index)
        })

        DOM.updateBalance()

        Storage.set(Transaction.all)
    },
    reload() {
        DOM.clearTransactions()
        App.init()
    },
}






App.init()
