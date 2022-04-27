import request from '@/util/request'
import type { AxiosResponse } from 'axios'

const userPrefix = '/user'

export function add (user: object) : Promise<AxiosResponse> {
  return request({
    url: userPrefix + '/',
    method: 'POST',
    data: user
  })
}

export function getById (id: number) : Promise<AxiosResponse> {
  return request({
    url: userPrefix + '/user',
    method: 'GET',
    params: {
      id
    }
  })
}

export function getByName (username: string) : Promise<AxiosResponse> {
  return request({
    url: userPrefix + '/name',
    method: 'GET',
    params: {
      username
    }
  })
}

export function updatePassword (id: number, user: object) : Promise<AxiosResponse> {
  return request({
    url: userPrefix + '/password',
    method: 'PUT',
    params: {
      id
    },
    data: user
  })
}
