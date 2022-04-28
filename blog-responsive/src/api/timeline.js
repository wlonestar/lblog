import request from '../utils/request'

// 分页查询动态
export function getIdeaByPage (page, size) {
  return request({
    url: '/idea/page',
    method: 'get',
    params: {
      page: page,
      size: size
    }
  })
}

// 查询所有动态
export function getAllIdea () {
  return request({
    url: '/idea/all',
    method: 'get'
  })
}
