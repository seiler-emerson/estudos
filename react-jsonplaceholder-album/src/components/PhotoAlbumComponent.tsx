import { PhotoAlbum } from '../types/PhotoAlbum'


type Props = {
    data: PhotoAlbum
}

export const PhotoAlbumComponent = ({data}: Props) => {
    return (
        <div className='border-2 p-2 rounded-lg border-black m-2 hover:bg-yellow-300 hover:border-yellow-300 flex w-40 '>
            <img src={data.thumbnailUrl} alt="" /> 
        </div>
    )
}