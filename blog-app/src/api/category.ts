import request from '@/util/request'
import type { AxiosResponse } from 'axios'

const categoryPrefix = '/category'

export function getByPage (page: number, size: number) : Promise<AxiosResponse> {
  return request({
    url: categoryPrefix + '/page',
    method: 'GET',
    params: {
      page,
      size
    }
  })
}

export function getAll () : Promise<AxiosResponse> {
  return request({
    url: categoryPrefix + '/all',
    method: 'GET'
  })
}

export function getArticlesByCidPage (id: number, page: number, size: number) : Promise<AxiosResponse> {
  return request({
    url: categoryPrefix + '/article/id',
    method: 'GET',
    params: {
      id,
      page,
      size
    }
  })
}

export function getArticlesByCategoryPage (name: string, page: number, size: number) : Promise<AxiosResponse> {
  return request({
    url: categoryPrefix + '/article/name',
    method: 'GET',
    params: {
      name,
      page,
      size
    }
  })
}

export function getById (id: number) : Promise<AxiosResponse> {
  return request({
    url: categoryPrefix + '/id',
    method: 'GET',
    params: {
      id
    }
  })
}

export function getByName (name: string) : Promise<AxiosResponse> {
  return request({
    url: categoryPrefix + '/name',
    method: 'GET',
    params: {
      name
    }
  })
}

export function add (category: object) : Promise<AxiosResponse> {
  return request({
    url: categoryPrefix + '/',
    method: 'POST',
    data: category
  })
}

export function deleteById (id: number) : Promise<AxiosResponse> {
  return request({
    url: categoryPrefix + `/${id}`,
    method: 'DELETE'
  })
}
