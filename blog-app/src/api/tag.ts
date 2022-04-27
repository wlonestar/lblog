import request from '@/util/request'
import type { AxiosResponse } from 'axios'

const tagPrefix = '/tag'

export function getByPage (page: number, size: number) : Promise<AxiosResponse> {
  return request({
    url: tagPrefix + '/page',
    method: 'GET',
    params: {
      page,
      size
    }
  })
}

export function getAll () : Promise<AxiosResponse> {
  return request({
    url: tagPrefix + '/all',
    method: 'GET'
  })
}

export function getArticlesByCidPage (id: number, page: number, size: number) : Promise<AxiosResponse> {
  return request({
    url: tagPrefix + '/article/id',
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
    url: tagPrefix + '/article/name',
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
    url: tagPrefix + '/id',
    method: 'GET',
    params: {
      id
    }
  })
}

export function getByName (name: string) : Promise<AxiosResponse> {
  return request({
    url: tagPrefix + '/name',
    method: 'GET',
    params: {
      name
    }
  })
}

export function add (category: object) : Promise<AxiosResponse> {
  return request({
    url: tagPrefix + '/',
    method: 'POST',
    data: category
  })
}

export function deleteById (id: number) : Promise<AxiosResponse> {
  return request({
    url: tagPrefix + `/${id}`,
    method: 'DELETE'
  })
}
