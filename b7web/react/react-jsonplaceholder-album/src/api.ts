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
    getInfoAlbum: async (index: string)=> {
        let response = await http.get(`/albums/${index}`)
        return response.data;
    },
    getPhotoAlbum: async (index: string)=> {
        let response = await http.get(`/albums/${index}/Photos`)
        return response.data;
    },
    getPhoto: async (index: string)=> {
        let response = await http.get(`/albums/${index}/Photos`)
        return response.data;
    },
    // getPhoto: async (index, url)=> {
    //     let response = await http.get(`/albums/${index}/photos/${url}`)
    //     return response.data;
    // },
}