function h1click(){
  console.log("Executando a função")
}

function changeH1(input){
  let h1 = document.getElementsByTagName("h1")[0]
  h1.innerText = input.value
}