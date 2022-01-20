import { useState } from "react";

const App = () => {
  const[name, setName] = useState('Emerson');



  const handleButtonClick = () => {
    setName('Seiler')
  }

  return (
    <div>
      Meu nome é: {name}
      <button onClick={handleButtonClick}>Clique aqui!</button>
    </div>
  )
}

export default App;