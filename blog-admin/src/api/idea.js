import request from '../utils/request'

// 分页查询分类
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

// 查询所有分类
export function getAllIdea () {
  return request({
    url: '/idea/all',
    method: 'get'
  })
}

// 根据 id 查询分类
export function getIdea (id) {
  return request({
    url: '/idea/',
    method: 'get',
    params: {
      id: id
    }
  })
}

// 增加分类
export function addIdea (idea) {
  return request({
    url: '/idea/',
    method: 'post',
    data: idea
  })
}

// 根据 id 更新分类
export function updateIdea (id, idea) {
  return request({
    url: '/idea/',
    method: 'put',
    params: {
      id: id
    },
    data: idea
  })
}

// 根据 id 删除分类
export function deleteIdea (id) {
  return request({
    url: `/idea/${id}`,
    method: 'delete'
  })
}
