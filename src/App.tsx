import { Routes, Route } from 'react-router-dom'
import { Home } from './pages/Home'
import { AlbumDetails } from './pages/AlbumDetails'
import { Photo } from './pages/Photo'

const App = () => {

  return (
    <Routes>
      <Route path="/" element={<Home />} />
      <Route path="/album/:album" element={<AlbumDetails />} />
      <Route path="/album/:album/:photo" element={<Photo />} />
      {/* <Route path="/photo/:photo" element={<Photo />} /> */}
    </Routes>
  )
}

export default App
