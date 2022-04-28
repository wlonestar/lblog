import request from '../utils/request'

export function getInfo (id) {
  return request({
    url: '/user/user',
    method: 'get',
    params: {
      id: id
    }
  })
}

export function update (id, user) {
  return request({
    url: '/user/',
    method: 'put',
    params: {
      id: id
    },
    data: user
  })
}
