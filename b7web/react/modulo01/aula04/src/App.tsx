import {Header} from './components/Header'

const App = () => {
  let name: string = "Emerson"
  let lastName: string = "Seiler"

  return (
    <div>
      <Header title="Este é um exemplo" />
      Olá mundo!
      </div>
  )
}

export default App;