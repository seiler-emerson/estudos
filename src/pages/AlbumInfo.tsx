import { useState, useEffect } from 'react'
import { InfoAlbum } from '../types/InfoAlbum'
import { PhotoAlbum } from '../types/PhotoAlbum'
import { AlbumInfoComponent } from '../components/AlbumInfoComponent'
import { Home } from './Home'
import { PhotoAlbumComponent } from '../components/PhotoAlbumComponent'
import { Header } from '../components/Header'
import { api } from '../api'
import { useNavigate, Link, useParams } from 'react-router-dom'
import { AlbumsItem } from '../components/AlbumsItem'

export const AlbumInfo = () => {
    const [albumInfo, setAlbumInfo] = useState<InfoAlbum>({})
    const [photoAlbum, setPhotoAlbum] = useState<PhotoAlbum[]>([])
    const [loading, setLoading] = useState(false);

    const navigate = useNavigate();
    let params = useParams()

    useEffect(()=> {
        loadAlbumInfo();
        loadingPhotoAlbum();
      }, [])

    const loadAlbumInfo = async () => {   //carrega os albuns da api
      
        setLoading(true)                  //inicia com uma mensagem de carregando
        let json = await api.getInfoAlbum(params.album);
        setLoading(false)                                                           //remove a mensagem de carregando ao fim do processo anterior
        setAlbumInfo(json);                                    //envia para albuns o json
    }

    const loadingPhotoAlbum = async () => {
      setLoading(true)                  //inicia com uma mensagem de carregando
      let json = await api.getPhotoAlbum();
      setLoading(false)                                                           //remove a mensagem de carregando ao fim do processo anterior
      setPhotoAlbum(json);                                    //envia para albuns o json
    }

    const handleBackButton = () => {
      navigate(-1)
    }

    return (
      <div className="p-5">
{loading &&
        <div>Carregando...</div>     //Caso os albuns não esteja carregados exibe a mensagem carregando..
      }

      {!loading && albumInfo &&
        <>
          <Header />  
          <button onClick={handleBackButton} className='my-2 border px-2 rounded border-gray bg-gray-100'>Voltar</button>
          <AlbumInfoComponent data={albumInfo} />

          <div className='grid grid-cols-5'>
            {photoAlbum.map((item, index) => (
              <Link to={`/photo/${index+1}`}>
                <PhotoAlbumComponent data={item} /> 
              </Link>
            ))}
          </div>
          

        </> 
      }

      {!loading && albumInfo === null &&
        <div>Não há albuns para exibir!</div>
      }



      </div>   
    )
}