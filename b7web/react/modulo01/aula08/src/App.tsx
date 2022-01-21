import { Pessoa } from './components/Pessoa'

const App = () => {
  let list = [
    {name: 'bonieky', age: 90},
    {name: 'joão', age: 20},
    {name: 'pedro', age: 50},
    {name: 'samanta', age: 15},
    {name: 'maria', age: 75}
  ];
  return (
    <div>
      <h2>Lista de Presença</h2>
      <ul>
        {list.map((item, index)=>(
          <Pessoa key={index} data={item}/>
        ))}
      </ul>
    </div>
  )
}

export default App;