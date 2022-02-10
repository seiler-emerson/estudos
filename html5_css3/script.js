let lines = 8;

let num = parseInt(lines)


let init = num % 2 === 0 ? num + 1 : num;

for (let i = 0; i < 6; i++) {
    console.log(init)
    init += 2
}