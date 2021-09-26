import request from '../utils/request'

export function getInfo (username) {
  return request({
    url: '/user',
    method: 'get',
    params: {
      username: username
    }
  })
}

export function getInfoById (id) {
  return request({
    url: '/user/u',
    method: 'get',
    params: {
      id: id
    }
  })
}
