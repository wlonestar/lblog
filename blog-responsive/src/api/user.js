import request from '../utils/request'

export function getInfo (username) {
  return request({
    url: '/user/user',
    method: 'get',
    params: {
      username: username
    }
  })
}

export function getInfoById (id) {
  return request({
    url: '/user/user',
    method: 'get',
    params: {
      id: id
    }
  })
}
