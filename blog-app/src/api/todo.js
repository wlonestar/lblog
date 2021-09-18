import request from '../utils/request'

// 分页查询分类
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

// 查询所有分类
export function getAllTodo () {
  return request({
    url: '/todo/all',
    method: 'get'
  })
}

// 根据 id 查询分类
export function getTodo (id) {
  return request({
    url: '/todo',
    method: 'get',
    params: {
      id: id
    }
  })
}

// 增加分类
export function addTodo (todo) {
  return request({
    url: '/todo',
    method: 'post',
    data: todo
  })
}

// 根据 id 更新分类
export function updateTodo (id, todo) {
  return request({
    url: '/todo',
    method: 'put',
    params: {
      id: id
    },
    data: todo
  })
}

// 根据 id 删除分类
export function deleteTodo (id) {
  return request({
    url: '/todo',
    method: 'delete',
    params: {
      id
    }
  })
}
