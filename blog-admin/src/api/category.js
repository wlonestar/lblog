import request from '../utils/request'

// 分页查询分类
export function getCategoryByPage (page, size) {
  return request({
    url: '/category',
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
    url: '/category',
    method: 'get',
    params: {
      id: id
    }
  })
}

// 增加分类
export function addCategory (category) {
  return request({
    url: '/category',
    method: 'post',
    data: category
  })
}

// 根据 id 更新分类
export function updateCategory (id, category) {
  return request({
    url: '/category',
    method: 'put',
    params: {
      id: id
    },
    data: category
  })
}

// 根据 id 删除分类
export function deleteCategory (id) {
  return request({
    url: '/category',
    method: 'delete',
    params: {
      id
    }
  })
}
