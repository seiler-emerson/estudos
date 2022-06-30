import { useRoutes } from 'react-router-dom'
import { Home } from '../pages/Home'
import { AlbumDetails } from '../pages/AlbumDetails'
import { Photo } from '../pages/Photo'

export const RouteList = () => {
    return useRoutes([
        { path: '/', element: <Home />},
        { path: '/album/:album', element: <AlbumDetails />},
        { path: '/album/:album/:photo', element: <Photo />},
    ]);
}