import { useState } from "react";

const App = () => {
  const [show, setShow] = useState(false)

  const handleClick = ()=> {
    setShow(!show);
  }
  return (
    <div>
      <button onClick={handleClick}>{show ? 'Ocultar' : 'Mostrar'}</button>

      {show === true && 
        <div>Blá, blá, blá...</div>
      }
    </div>
  )
}

export default App;