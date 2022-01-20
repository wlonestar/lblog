import request from '../utils/request'

// 分页查询分类
export function getCommentByPage (page, size) {
  return request({
    url: '/comment',
    method: 'get',
    params: {
      page: page,
      size: size
    }
  })
}

// 查询所有分类
export function getAllComment () {
  return request({
    url: '/comment/all',
    method: 'get'
  })
}

// 根据 id 查询分类
export function getComment (id) {
  return request({
    url: '/comment',
    method: 'get',
    params: {
      id: id
    }
  })
}

// 增加分类
export function addComment (Comment) {
  return request({
    url: '/Comment',
    method: 'post',
    data: Comment
  })
}

// 根据 id 更新分类
export function updateComment (id, comment) {
  return request({
    url: '/comment',
    method: 'put',
    params: {
      id: id
    },
    data: comment
  })
}

// 根据 id 删除分类
export function deleteComment (id) {
  return request({
    url: '/comment',
    method: 'delete',
    params: {
      id
    }
  })
}
