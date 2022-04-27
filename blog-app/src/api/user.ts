import request from '@/util/request'
import type { AxiosResponse } from 'axios'

const userPrefix = '/user'

export function getById (id: number) : Promise<AxiosResponse> {
  return request({
    url: userPrefix + '/user',
    method: 'GET',
    params: {
      id
    }
  })
}

export function add (user: object) : Promise<AxiosResponse> {
  return request({
    url: userPrefix + '/',
    method: 'POST',
    data: user
  })
}

export function update (id: number, user: object) : Promise<AxiosResponse> {
  return request({
    url: userPrefix + '/password',
    method: 'PUT',
    params: {
      id
    },
    data: user
  })
}
