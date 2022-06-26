import { useState, useEffect } from 'react'
import { InfoAlbum } from '../types/InfoAlbum'
import { PhotoAlbum } from '../types/PhotoAlbum'
import { AlbumInfoComponent } from '../components/AlbumInfoComponent'
import { PhotoAlbumComponent } from '../components/PhotoAlbumComponent'
import { Header } from '../components/Header'
import { api } from '../api'
import { useNavigate, Link, useParams } from 'react-router-dom'

export const AlbumDetails = () => {
  
  // USE STATES //
  const [albumDetails, setAlbumDetails] = useState<InfoAlbum>()
  const [photoAlbum, setPhotoAlbum] = useState<PhotoAlbum[]>([])
  const [loading, setLoading] = useState(false);

  // PEGAR NUMERO DO ALBUM SELECIONADO //
  const navigate = useNavigate();
  let params = useParams()
  console.log(params)

  // ATUALIZAR A TELA A CADA MUDANÇA //
  useEffect(()=> {
      loadAlbumInfo();
      loadingPhotoAlbum();
    }, [])

  //CARREGAR INFORMAÇÃO DO ALBUM SELECIONADA DA API - NESTE CASO TÍTULO
  const loadAlbumInfo = async () => {   
    setLoading(true)                                     //Inicia com uma mensagem de carregando
    let json = await api.getInfoAlbum(params.album);     //Recebe os dados convertidos pela função (api.ts) e coloca em json  .album pq a informação vem em um objeto {album: 2}
    setLoading(false)                                    //Remove a mensagem de carregando ao fim do processo anterior
    setAlbumDetails(json);                               //Envia para albuns o json
  }

  //CARREGAR FOTOS DO ALBUM SELECIONADO DA API
  const loadingPhotoAlbum = async () => {
    setLoading(true)                                     //inicia com uma mensagem de carregando
    let json = await api.getPhotoAlbum(params.album);    //Recebe os dados convertidos pela função (api.ts) e coloca em json
    setLoading(false)                                    //remove a mensagem de carregando ao fim do processo anterior
    setPhotoAlbum(json);                                 //envia para albuns o json
  }

  // AÇÃO DE VOLTAR UMA PÁGINA DO BOTÃO
  const handleBackButton = () => {
    navigate(-1)
  }


  return (
    <div className="p-5">
      {loading &&                             //Caso os albuns NÃO ESTEJAM carregados exibe a mensagem carregando..
        <div>Carregando...</div>     
      }

      {!loading && albumDetails &&            //Caso os albuns ESTEJAM carregados monta o head e a lista de fotos.
        <>
          <Header />                          
          <button onClick={handleBackButton} className='my-2 border px-2 rounded border-gray bg-gray-100'>Voltar</button>
          <AlbumInfoComponent data={albumDetails} />

          <div className='grid grid-cols-5 w-max w-fit '>     {/* Carrega todas as fotos no array json */}
            {photoAlbum.map((item, index) => (     
              <Link to={`/album/${params.album}/${index+1}`}>    {/* O link vai ser /album/NumeroAlbum/NumeroFoto */}
                <PhotoAlbumComponent data={item} />  
              </Link>
            ))}
          </div>
        </> 
      }

      {!loading && albumDetails === null &&
        <div>Não há albuns para exibir!</div>
      }
    </div>   
  )
}