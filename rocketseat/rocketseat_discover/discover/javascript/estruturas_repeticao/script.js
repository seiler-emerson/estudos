/* 
    ∞ Buscando e contando dados em Arrays ∞
    Baseado no Array de Livros por Categoria abaixo, faça os seguintes desafios
        • Contar o número de categorias e o número de livros em cada categoria
        • Contar o número de autores
        • Mostrar livros do autor Auguto Cury
        • Transformar a função acima em uma função que irá receber o nome do autor e devolver os livros desse autor.
*/

const booksByCategory = [
    {
        category: "Riqueza",
        books: [
            {
                title: "Os segredos da mente milionária",
                author: "T. Harv Eker",
            },
            {
                title: "O homem mais rico da Babilônia",
                author: "George S. Clason",
            },
            {
                title: "Pai rico, pai pobre",
                author: "Robert T. Kiyosaki e Sharon L. Lechter",
            },
            
        ],
    },
    {
        category: "Inteligência Emocional",
        books: [
            {
                title: "Você é Insubstituível",
                author: "Augusto Cury",
            },
            {
                title: "Ansiedade – Como enfrentar o mal do século",
                author: "Augusto Cury",
            },
        ],
    },
];

// • Contar o número de categorias e o número de livros em cada categoria

const totalCategories = booksByCategory.length
console.log(`O total de categorias é ${totalCategories}`)

for (let category of booksByCategory) {
    console.log(`Total de livros da categoria ${category.category} é ${category.books.length}`)
}

// • Contar o número de autores

function countAuthors() {
    let authors = [];

    for (let category of booksByCategory) {
        for (let book of category.books) {
            if (authors.indexOf(book.author) == -1)
                authors.push(book.author)
        } 
    }
    console.log(`O total de autores é ${authors.length}`)
}

countAuthors()


// • Mostrar livros do autor Auguto Cury

function booksOfAugustoCury() {
    let books = [];

    for (let category of booksByCategory) {
        for (let book of category.books) {
            if (book.author === "Augusto Cury")
                books.push(book.title)
        } 
    }
    console.log(`Livros do autor Augusto Cury ${books.length}`)
}

booksOfAugustoCury()


// • Transformar a função acima em uma função que irá receber o nome do autor e devolver os livros desse autor.

function booksOfAuthor(author) {
    let books = [];

    for (let category of booksByCategory) {
        for (let book of category.books) {
            if (book.author === author)
                books.push(book.title)
        } 
    }
    console.log(`Livros do ${author}: ${books.join(", ")}`)    
}

booksOfAuthor('Augusto Cury')