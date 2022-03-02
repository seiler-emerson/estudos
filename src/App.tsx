import { Routes, Route } from 'react-router-dom'
import { Home } from './pages/Home'
import { AlbumInfo } from './pages/AlbumInfo'
import { PhotoPage } from './pages/PhotoPage'


const App = () => {

  
  return (
    <Routes>
      <Route path="/" element={<Home />} />
      <Route path="/album/:album" element={<AlbumInfo />} />
      <Route path="/photo/:photo" element={<PhotoPage />} />
    </Routes>

  
    )
}

export default App
