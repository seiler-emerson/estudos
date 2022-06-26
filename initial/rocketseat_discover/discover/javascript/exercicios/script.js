// 1
let weight;

//2
console.log(typeof weight);

//3
let name = 'Emerson'
let age = 26
let stars = 4.9
let isSubscribed = true


//4
//let student = {};
//console.log(typeof student)

//5
let student = {
    name: 'Emerson',
    age: 26,
    stars: 4.9,
    isSubscribed: true,
    weight: 66
};

console.log(`${student.name} tem ${student.age} de idade e pesa ${student.weight} kg`)

//6
let students = []

//7
// students = [
//     student
// ]

// console.log(students)

// //8
// console.log(students[0])

//9
let student1 = {
    name: 'João',
    age: 23,
    stars: 4.4,
    isSubscribed: true,
    weight: 62
};

students = [
    student,
    student1
]
console.log(students)