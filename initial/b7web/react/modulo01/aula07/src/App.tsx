import { Botao } from './components/Botao'

const App = () => {
  let textoDoBotão = 'Clicar no Botão'

  const botaoEventAction = () => {
    alert("Frase do App");
  }

  return (
    <div>
      <Botao text={textoDoBotão} clickFn={botaoEventAction}/>
    </div>
  )
}

export default App;