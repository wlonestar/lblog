import request from '@/util/request'
import type { AxiosResponse } from 'axios'

const timePrefix = '/idea'

export function getByPage (page: number, size: number) : Promise<AxiosResponse> {
  return request({
    url: timePrefix + '/page',
    method: 'GET',
    params: {
      page,
      size
    }
  })
}

export function getAll () : Promise<AxiosResponse> {
  return request({
    url: timePrefix + '/all',
    method: 'GET'
  })
}

export function getById (id: number) : Promise<AxiosResponse> {
  return request({
    url: timePrefix + '/',
    method: 'GET',
    params: {
      id
    }
  })
}

export function add (timeline: object) : Promise<AxiosResponse> {
  return request({
    url: timePrefix + '/',
    method: 'POST',
    data: timeline
  })
}

export function updateById (id: number, timeline: object) : Promise<AxiosResponse> {
  return request({
    url: timePrefix + '/',
    method: 'PUT',
    params: {
      id
    },
    data: timeline
  })
}

export function deleteById (id: number) : Promise<AxiosResponse> {
  return request({
    url: timePrefix + `/${id}`,
    method: 'DELETE'
  })
}
