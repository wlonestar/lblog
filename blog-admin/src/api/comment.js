import request from '../utils/request'

// 分页查询留言
export function getCommentByPage (page, size) {
  return request({
    url: '/comment/page',
    method: 'get',
    params: {
      page: page,
      size: size
    }
  })
}

// 查询所有留言
export function getAllComment () {
  return request({
    url: '/comment/all',
    method: 'get'
  })
}

// 根据 id 查询留言
export function getComment (id) {
  return request({
    url: '/comment/',
    method: 'get',
    params: {
      id: id
    }
  })
}

// 增加留言
export function addComment (Comment) {
  return request({
    url: '/comment/',
    method: 'post',
    data: Comment
  })
}

// 根据 id 删除留言
export function deleteComment (id) {
  return request({
    url: `/comment/${id}`,
    method: 'delete'
  })
}
