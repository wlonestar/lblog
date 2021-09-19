import request from '../utils/request'

// 分页查询待办
export function getTodoByPage (page, size) {
  return request({
    url: '/todo',
    method: 'get',
    params: {
      page: page,
      size: size
    }
  })
}

// 查询所有待办
export function getAllTodo () {
  return request({
    url: '/todo/all',
    method: 'get'
  })
}

// 根据 id 查询待办
export function getTodo (id) {
  return request({
    url: '/todo',
    method: 'get',
    params: {
      id: id
    }
  })
}
