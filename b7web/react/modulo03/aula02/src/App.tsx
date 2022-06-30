import { useState } from "react";
const App = () => {
  const [padding, setPadding] = useState(0);

  const handleClick = () => {
    setPadding(20);
  }

  return (
    <div>
      <button
        onClick={handleClick}
        style={{backgroundColor: '#FF0000', color: '#FFF', border: '0', padding}}>Clique aqui!</button>
    </div>
  )
}

export default App;