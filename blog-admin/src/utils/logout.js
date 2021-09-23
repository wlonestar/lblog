import axios from 'axios'

const logout = axios.create({
  baseURL: 'http://localhost:8088',
  timeout: 5000,
  headers: {
    tokenValue: localStorage.getItem('satoken')
  }
})

export default logout
