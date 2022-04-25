import request from '@/util/request'
import type { AxiosResponse } from 'axios'

const tagBase = '/tag'

export function getByPage (page: number, size: number) : Promise<AxiosResponse> {
  return request({
    url: tagBase + '/page',
    method: 'GET',
    params: {
      page,
      size
    }
  })
}

export function getAll () : Promise<AxiosResponse> {
  return request({
    url: tagBase + '/all',
    method: 'GET'
  })
}

export function getArticlesByCidPage (id: number, page: number, size: number) : Promise<AxiosResponse> {
  return request({
    url: tagBase + '/article/id',
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
    url: tagBase + '/article/name',
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
    url: tagBase + '/id',
    method: 'GET',
    params: {
      id
    }
  })
}

export function getByName (name: string) : Promise<AxiosResponse> {
  return request({
    url: tagBase + '/name',
    method: 'GET',
    params: {
      name
    }
  })
}

export function add (category: object) : Promise<AxiosResponse> {
  return request({
    url: tagBase + '/',
    method: 'POST',
    data: category
  })
}

export function deleteById (id: number) : Promise<AxiosResponse> {
  return request({
    url: tagBase + '/',
    method: 'DELETE',
    params: {
      id
    }
  })
}
