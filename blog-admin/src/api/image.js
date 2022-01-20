import request from '../utils/request'

// 获取已上传的图片列表
export function getAllImage () {
  return request({
    url: '/files',
    method: 'get'
  })
}

export function getAllByPage (page, size) {
  return request({
    url: '/files',
    method: 'get',
    params: {
      page,
      size
    }
  })
}
