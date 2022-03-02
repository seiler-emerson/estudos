import { PhotoAlbum } from '../types/PhotoAlbum'


type Props = {
    data: PhotoAlbum
}

export const PhotoAlbumComponent = ({data}: Props) => {
    return (
        <div className='border-2 p-2 border-black m-2 hover:bg-gray-300 flex'>
            <img src={data.thumbnailUrl} alt="" /> 
        </div>
    )
}