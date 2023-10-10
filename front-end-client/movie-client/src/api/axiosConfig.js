import axios from 'axios';

export default axios.create({
    baseURL:'https://99b4-156-196-103-177.ngrok-free.app',
    headers: {"ngrok-skip-browser-warning": "true"}
});