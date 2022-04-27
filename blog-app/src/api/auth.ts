import request from '@/util/request'
import type { AxiosResponse } from 'axios'

const authPrefix = '/admin'

export function login (user: object) : Promise<AxiosResponse> {
  return request({
    url: authPrefix + '/login',
    method: 'POST',
    data: user
  })
}

export function checkLogin (username: string, tokenValue: string) : Promise<AxiosResponse> {
  return request({
    url: authPrefix + '/check',
    method: 'GET',
    params: {
      username,
      tokenValue
    }
  })
}

export function logout (tokenValue: string) : Promise<AxiosResponse> {
  return request({
    url: authPrefix + '/logout',
    method: 'POST',
    data: tokenValue
  })
}

export function register (user: object) : Promise<AxiosResponse> {
  return request({
    url: authPrefix + '/register',
    method: 'POST',
    data: user
  })
}
