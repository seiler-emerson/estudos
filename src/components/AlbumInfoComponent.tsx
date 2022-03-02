import { InfoAlbum } from '../types/InfoAlbum'
 
type Props = {
    data: InfoAlbum    //Recebe a estrutura de 1 item de Albums
}

export const AlbumInfoComponent = ({data}: Props) => {
    return (
        <div className='font-bold text-3xl'>
            {data.title} 
        </div>
    )
}