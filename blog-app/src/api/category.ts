import request from '@/util/request'
import type { AxiosResponse } from 'axios'

const categoryBase = '/category'

export function getByPage (page: number, size: number) : Promise<AxiosResponse> {
  return request({
    url: categoryBase + '/page',
    method: 'GET',
    params: {
      page,
      size
    }
  })
}

export function getAll () : Promise<AxiosResponse> {
  return request({
    url: categoryBase + '/all',
    method: 'GET'
  })
}

export function getArticlesByCidPage (id: number, page: number, size: number) : Promise<AxiosResponse> {
  return request({
    url: categoryBase + '/article/id',
    method: 'GET',
    params: {
      id,
      page,
      size
    }
  })
}

export function getArticlesByNamePage (name: string, page: number, size: number) : Promise<AxiosResponse> {
  return request({
    url: categoryBase + '/article/name',
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
    url: categoryBase + '/id',
    method: 'GET',
    params: {
      id
    }
  })
}

export function getByName (name: string) : Promise<AxiosResponse> {
  return request({
    url: categoryBase + '/name',
    method: 'GET',
    params: {
      name
    }
  })
}

export function add (category: object) : Promise<AxiosResponse> {
  return request({
    url: categoryBase + '/',
    method: 'POST',
    data: category
  })
}

export function deleteById (id: number) : Promise<AxiosResponse> {
  return request({
    url: categoryBase + '/',
    method: 'DELETE',
    params: {
      id
    }
  })
}
