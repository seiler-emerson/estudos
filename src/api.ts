import axios from 'axios';
import { useParams } from 'react-router-dom';

const http = axios.create({
    baseURL: 'https://jsonplaceholder.typicode.com'
});


export const api = {
    getAllAlbums: async ()=> {
        let response = await http.get(`/albums`); //pega os dados da api e coloca em response
        return response.data;   //retorna o json
    },
    getInfoAlbum: async (index)=> {
        let response = await http.get(`/albums/${index}`)
        return response.data;
    },
    getPhotoAlbum: async ()=> {
        let response = await http.get(`/albums/3/photos`)
        return response.data;
    },
    getPhoto: async ()=> {
        let response = await http.get(`/photos/5`)
        return response.data;
    },
}