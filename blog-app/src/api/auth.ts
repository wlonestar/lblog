import request from '@/util/request'
import type { AxiosResponse } from 'axios'

const authPrefix = '/auth'

export function login (user: object) : Promise<AxiosResponse> {
  return request({
    url: authPrefix + '/login',
    method: 'POST',
    data: user
  })
}

export function register (user: object) : Promise<AxiosResponse> {
  return request({
    url: authPrefix + '/register',
    method: 'POST',
    data: user
  })
}

export function checkLogin (username: string, satoken: string) : Promise<AxiosResponse> {
  return request({
    url: authPrefix + '/check',
    method: 'GET',
    headers: {
      satoken: satoken
    },
    params: {
      username
    }
  })
}

export function logout (satoken: string) : Promise<AxiosResponse> {
  return request({
    url: authPrefix + '/logout',
    method: 'POST',
    headers: {
      satoken: satoken
    }
  })
}
