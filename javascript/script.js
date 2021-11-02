let weight

console.log(typeof weight)

var datas = {
    name: "Emerson",
    age: 26,
    stars: 5.8,
    isSubscribed: true

}

console.log(datas.name)
console.log(datas.age)
console.log(datas.stars)
console.log(datas.isSubscribed)

var student = {
  name: "Emerson",
    age: 26,
    stars: 5.8,
    isSubscribed: true
}

console.log(`${student.name} de idade ${student.age} anos e ${student.stars} pelos valores de propriedade do objeto`)


students = [
  student
]

console.log(students)
console.log(students[0])

const john = {
  name: "john",
  age: 23,
  weight: 74.8,
  isSubscribed: true
}

students = [
  student,
  john
]
console.log(students)

students[1] = john
console.log(students)
