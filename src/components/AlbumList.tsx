import { Albums } from '../types/Albums'
 
type Props = {
    data: Albums    //Recebe a estrutura de 1 item de Albums
    index: number
}

export const AlbumList = ({data, index}: Props) => {  //Monta a estrutura de album para replicação
    return (
            <div className='block border-2 p-2 border-black m-2 hover:bg-gray-300'>
                {data.title}
            </div>

    );
}