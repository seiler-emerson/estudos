// Crie uma função que receba uma string em celsius ou fahrenheit
// e faça a transformação de uma unidade para outra 
//     C = (F - 32) * 5/9 
//     F = C * 9/5 + 32


// RESOLUÇÃO 001
/*

let isCelsius = false
let temperature = "28.45"

let Converter = (format, temperature) => {
    let temperatureCelsius
    let temperatureFahrenheit
    let temperatureNumber = parseFloat(temperature)

    if (format === true) {
        //CONVERTER PARA FAHRENHEIT
        temperatureFahrenheit = ((temperatureNumber * 9/5)+ 32).toFixed(2)
        console.log(`A temperatura em Fahrenheit é ${temperatureFahrenheit}°F`)
    } else {
        //Converter para CELSIUS
        temperatureCelsius = ((temperatureNumber - 32) * (5/9)).toFixed(2)
        console.log(`A temperatura em Celsius é ${temperatureCelsius}°C`)
    }
}
Converter(isCelsius, temperature)
*/


// RESOLUÇÃO 02

// transformDegree('50f')
//teste
function transformDegree(degree) {
    const celsiusExists = degree.toUpperCase().includes('C')
    const fahrenheitExists = degree.toUpperCase().includes('F')

    //Fluxo de erro
    if(!celsiusExists && !fahrenheitExists) {
        throw new Error('Grau não identificado')
    }

    //Fluxo ideal, F -> C
    let updatedDegree = Number(degree.toUpperCase().replace("F", ""));
    let formula = (fahrenheit) => (fahrenheit - 32) * 5/9
    let degreeSign = 'C'

    //Fluxo alternativo, C -> F
    if(celsiusExists) {
        updatedDegree = Number(degree.toUpperCase().replace("C", ""));
        formula = (celsius) => celsius * 9/5 + 32
        degreeSign = 'F'
    }

    return formula(updatedDegree) + degreeSign
}

try {
    console.log(transformDegree('10c'))
    console.log(transformDegree('50f'))
    console.log(transformDegree('50Z'))
} catch (error) {
    console.log(error.message)
}