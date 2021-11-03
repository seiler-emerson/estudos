//Callback function

function sayMyName(name){
  console.log(name)
}

sayMyName(
  () => {
    console.log('estou em uma callback')
  }
)