import axios from 'axios'
import router from '../router'

const request = axios.create({
  baseURL: 'http://127.0.0.1:8088',
  timeout: 6000
})

// request 拦截器
// 可以自请求发送前对请求做一些处理
// 比如统一加token，对请求参数统一加密
request.interceptors.request.use(config => {
  const token = localStorage.getItem('satoken')
  // eslint-disable-next-line no-empty
  if (!token) {
  } else {
    const headers = config.headers
    if (headers) {
      headers['Content-Type'] = 'application/json;charset=utf-8'
      headers.satoken = token
    }
    config.headers = headers
  }
  return config
}, error => {
  return Promise.reject(error)
})

// response 拦截器
// 可以在接口响应后统一处理结果
request.interceptors.response.use(response => {
  let res = response.data
  // 如果是返回的文件
  if (response.config.responseType === 'blob') {
    return res
  }
  // 兼容服务端返回的字符串数据
  if (typeof res === 'string') {
    res = res ? JSON.parse(res) : res
  }
  return res
}, error => {
  console.log('err' + error)
  return Promise.reject(error)
})

export default request
