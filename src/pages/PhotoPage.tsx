import { useState, useEffect } from 'react'
import { Photo } from '../types/Photo'
import { Header } from '../components/Header'
import { PhotoPageComponent } from '../components/PhotoPageComponent'
import { api } from '../api'
import { useNavigate, useParams } from 'react-router-dom'


export const PhotoPage = () => {
    const [photo, setPhoto] = useState<Photo>({})
    const [loading, setLoading] = useState(false);

    const navigate = useNavigate();
    let params = useParams()

    useEffect(()=> {
        loadPhoto();
      }, [])

    const loadPhoto = async () => {   //carrega os albuns da api
        setLoading(true)                  //inicia com uma mensagem de carregando
        let json = await api.getPhoto();
        setLoading(false)                                                           //remove a mensagem de carregando ao fim do processo anterior
        setPhoto(json);                                    //envia para albuns o json
    }

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
         
         <PhotoPageComponent data={photo} />
        </> 
      }

      {!loading && photo === null &&
        <div>Não há albuns para exibir!</div>
      }



      </div>   
    )
}