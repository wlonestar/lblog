import request from '../utils/request'

export function getAllLink () {
  return request({
    url: '/link',
    method: 'get'
  })
}
