import request from '../utils/request'

export function logout (satoken) {
  return request({
    url: '/auth/logout',
    method: 'POST',
    headers: {
      satoken: satoken
    }
  })
}
