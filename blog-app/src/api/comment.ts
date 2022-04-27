import request from '@/util/request'
import type { AxiosResponse } from 'axios'

const commentPrefix = '/comment'

export function getByPage (page: number, size: number) : Promise<AxiosResponse> {
  return request({
    url: commentPrefix + '/page',
    method: 'GET',
    params: {
      page,
      size
    }
  })
}

export function getAll () : Promise<AxiosResponse> {
  return request({
    url: commentPrefix + '/all',
    method: 'GET'
  })
}

export function getById (id: number) : Promise<AxiosResponse> {
  return request({
    url: commentPrefix + `/${id}`,
    method: 'GET'
  })
}

export function add (comment: object) : Promise<AxiosResponse> {
  return request({
    url: commentPrefix + '/',
    method: 'POST',
    data: comment
  })
}

export function deleteById (id: number) : Promise<AxiosResponse> {
  return request({
    url: commentPrefix + '/',
    method: 'DELETE',
    params: {
      id
    }
  })
}
