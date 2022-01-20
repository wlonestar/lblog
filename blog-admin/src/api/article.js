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
    url: '/article',
    method: 'get',
    params: {
      id: id
    }
  })
}

// 增加文章
export function addArticle (article) {
  return request({
    url: '/article',
    method: 'post',
    data: article
  })
}

// 根据 id 更新文章
export function updateArticle (id, article) {
  return request({
    url: '/article',
    method: 'put',
    params: {
      id: id
    },
    data: article
  })
}

// 根据 id 删除文章
export function deleteArticle (id) {
  return request({
    url: '/article',
    method: 'delete',
    params: {
      id
    }
  })
}
