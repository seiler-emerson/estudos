/*

  ###Buscando e contando dados em Arrays

  Baseado no Array de livros por categoria abaixo, faça os seguintes desafios.

  * Contar o número de categorias e o número de livros em cada categoria
  * Contar o número de autores
  * Mostrar liveos do autor Augusto Cury
  * Transformar a função acima em uma função que irá receber o nome do autor e devolver os livros desse autor.
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
        title: "Você é insubstituível",
        author: "Augusto Cury",
      },
      {
        title: "Ansiedade - Como enfrentar o mal do século",
        author: "Augusto Cury",
      },
      {
        title: "Os 7 hábitos das pessoas altamente eficazes",
        author: "Stephen R. Covey",
      }
    ]
  }
]

let numberOfCategory = booksByCategory.length

console.log(`O número de categoria de livros é ${numberOfCategory}`)

let numberOfBooksRiqueza = booksByCategory.books.length
console.log(Number(numberOfBooksRiqueza))

console.log(`O número de livros na categoria Riqueza é ${numberOfBooksRiqueza}`)

