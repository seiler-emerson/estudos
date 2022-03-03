import { useState, useEffect } from 'react'
import { Albums } from '../types/Albums'
import { AlbumList } from '../components/AlbumList'
import { Header } from '../components/Header'
import { api } from '../api'
import { Link, useParams } from 'react-router-dom'


export const Home = () => {
  
  // USE STATES //
  const [albums, setAlbums] = useState<Albums[]>([])
  const [loading, setLoading] = useState(false);

  // ATUALIZAR A TELA A CADA MUDANÇA //
  useEffect(()=> {
    loadAlbums();
  }, [])

  //CARREGAR INFORMAÇÃO DO ALBUM SELECIONADA DA API - NESTE CASO TÍTULO
  const loadAlbums = async () => {
      setLoading(true)                          //inicia com uma mensagem de carregando
      let json = await api.getAllAlbums();      //Recebe os dados convertidos pela função (api.ts) e coloca em json
      setLoading(false)                         //remove a mensagem de carregando ao fim do processo anterior
      setAlbums(json);                          //envia para albuns o json
        
  }

  return (

    <div className="p-5">
      {loading &&
        <div>Carregando...</div>                //Caso os albuns NÃO ESTEJAM carregados exibe a mensagem carregando..
      }

      {!loading && albums.length > 0 &&         //Caso os albuns ESTEJAM carregados monta o a lista de titulos.
        <>
          <Header />  
          <div className='font-bold font-2xl'>
            {albums.map((item, index) => (
                <Link to={`/album/${index+1}`}>
                  <AlbumList data={item} index={index} />
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



