// for of

let person = {
    name: 'Emerson',
    age: 20,
    weight: 66.5

}
for (let property in person) {
    console.log(property)
    console.log(person[property])
}