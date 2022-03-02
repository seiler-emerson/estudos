import { useState, useEffect } from 'react'
import { Albums } from '../types/Albums'
import { AlbumsItem } from '../components/AlbumsItem'
import { Header } from '../components/Header'
import { api } from '../api'
import { Link, useParams } from 'react-router-dom'


export const Home = () => {
    const [albums, setAlbums] = useState<Albums[]>([])
    const [loading, setLoading] = useState(false);

    useEffect(()=> {
        loadAlbums();
      }, [])

    const loadAlbums = async () => {   //carrega os albuns da api
        setLoading(true)                  //inicia com uma mensagem de carregando
        let json = await api.getAllAlbums();
        setLoading(false)                                                           //remove a mensagem de carregando ao fim do processo anterior
        setAlbums(json);                                                            //envia para albuns o json
        
  }

    return (

<div className="p-5">
      {loading &&
        <div>Carregando...</div>     //Caso os albuns não esteja carregados exibe a mensagem carregando..
      }

      {!loading && albums.length > 0 &&
        <>
          <Header />  
          <div className='font-bold font-2xl'>
            {albums.map((item, index) => (
                <Link to={`/album/${index+1}`}>
                  <AlbumsItem data={item} index={index} />
                </Link>
            ))}
          </div>
        </>
      }

      {!loading && albums.length === 0 &&
        <div>Não há albuns para exibir!</div>
      }
    </div>
    )
}



