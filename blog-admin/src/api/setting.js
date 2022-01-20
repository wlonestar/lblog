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

export function update (id, user) {
  return request({
    url: '/user',
    method: 'put',
    params: {
      id: id
    },
    data: user
  })
}
