import request from '../utils/request'

// 分页查询文章
export function getArticleByPage (page, size) {
  return request({
    url: '/article',
    method: 'get',
    params: {
      page: page,
      size: size
    }
  })
}

// 查询所有文章
export function getAllArticle () {
  return request({
    url: '/article/all',
    method: 'get'
  })
}

// 根据 id 查询文章
export function getArticle (id) {
  return request({
    url: `/article/${id}`,
    method: 'get',
    data: id
  })
}

// 根据标题查询文章
export function getByTitle (title) {
  return request({
    url: '/article/p',
    method: 'get',
    params: {
      title: title
    }
  })
}
