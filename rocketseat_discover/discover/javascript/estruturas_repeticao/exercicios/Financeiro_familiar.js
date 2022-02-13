// Crie um objeto que possuirá 2 propriedades, ambas do tipo array:
//     * receitas: [] 
//     * despesas: []
// Agora, crie uma função que irá calcular o total de receitas e 
// despesas e irá mostrar uma mensagem se a família está com 
// saldo positivo ou negativo, seguido do valor do saldo.

// RESOLUÇÃO 01

let object = {
    incomes: [
        1500, 150, 95, 134.45
    ],
    expenses: [
        36.8, 137, 600
    ],
}

const calc = (incomes, expenses) => {

    let totalIncomes = 0
    for (i = 0; i < incomes.length; i++) {
        totalIncomes += incomes[i]
    }
    
    let totalExpenses = 0
    for (i = 0; i < expenses.length; i++) {
        totalExpenses += expenses[i]
    }
    
    let total = totalIncomes - totalExpenses

    const msg = () => {
        if(total > 0) {
           console.log(`O saldo final é positivo, você possui ainda R$${total}`)
       } else {
           console.log(`O saldo final é negativo, você deve ainda deve R$${total}`)
       }
    }
    
    return msg()
} 

calc(object.incomes, object.expenses)


// RESOLUÇÃO 02

let family = {
    incomes: [2500, 3200, 250, 360],
    expenses: [320, 129, 176, 1450, 2000]
}

function sum(array) {
    let total = 0

    for(let value of array) {
        total += value
    }
    return total
}

function calculateBalance() {
    const calculateIncomes = sum(family.incomes)
    const calculateExpenses = sum(family.expenses)

    const total = calculateIncomes - calculateExpenses
    const itsOk = total >= 0

    let balanceText = "negativo"
    if(itsOk) {
        balanceText = "positivo"
    }

    console.log(`Seu saldo é ${balanceText}: R$${total.toFixed(2)}`)
}

calculateBalance()