import { useState, useEffect } from 'react'
import { PhotoType } from '../types/PhotoType'
import { Header } from '../components/Header'
import { PhotoPageComponent } from '../components/PhotoPageComponent'
import { api } from '../api'
import { useNavigate, useParams } from 'react-router-dom'


export const Photo = () => {

  // USE STATES //
  const [photo, setPhoto] = useState<PhotoType>()
  const [loading, setLoading] = useState(false);

  // PEGAR NUMERO DO ALBUM SELECIONADO //
  const navigate = useNavigate();
  let params = useParams()
  console.log(params)

  // ATUALIZAR A TELA A CADA MUDANÇA //
  useEffect(()=> {
    loadPhoto();
  }, [])

  //CARREGAR INFORMAÇÃO DA FOTO SELECIONADA DA API
  const loadPhoto = async () => {                     //carrega as fotos da api
    setLoading(true)                                  //inicia com uma mensagem de carregando
    let json = await api.getPhoto(params.album);      //Recebe os dados convertidos pela função (api.ts) e coloca em json  .album pq a informação vem em um objeto {album: 2, photo: 1}
    setLoading(false)                                 //remove a mensagem de carregando ao fim do processo anterior
    setPhoto(json);                                   //envia para fotos o json
  }

  // AÇÃO DE VOLTAR UMA PÁGINA DO BOTÃ
  const handleBackButton = () => {
    navigate(-1)
  }

  return (
    <div className="p-5">
      {loading &&
        <div>Carregando...</div>     //Caso os albuns não esteja carregados exibe a mensagem carregando..
      }

      {!loading && photo &&
        <>
          <Header />  
          <button onClick={handleBackButton} className='my-2 border px-2 rounded border-gray bg-gray-100'>Voltar</button>
         <PhotoPageComponent data={photo[params.photo-1]} />
        </> 
      }

      {!loading && photo === null &&
        <div>Não há albuns para exibir!</div>
      }
    </div>   
  )
}