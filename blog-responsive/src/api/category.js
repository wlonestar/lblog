import request from '../utils/request'

// 分页查询分类
export function getCategoryByPage (page, size) {
  return request({
    url: '/category/page',
    method: 'get',
    params: {
      page: page,
      size: size
    }
  })
}

// 查询所有分类
export function getAllCategory () {
  return request({
    url: '/category/all',
    method: 'get'
  })
}

// 根据 id 查询分类
export function getCategory (id) {
  return request({
    url: '/category/article/id',
    method: 'get',
    params: {
      id: id
    }
  })
}

// 根据标题查询分类
export function getByName (name) {
  return request({
    url: '/category/article/name',
    method: 'get',
    params: {
      name: name
    }
  })
}
