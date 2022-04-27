import request from '@/util/request'
import type { AxiosResponse } from 'axios'

const imagePrefix = '/files'

export function getAll () : Promise<AxiosResponse> {
  return request({
    url: imagePrefix + '/all',
    method: 'GET'
  })
}

export function getByPage (page: number, size: number) : Promise<AxiosResponse> {
  return request({
    url: imagePrefix + '/page',
    method: 'GET',
    params: {
      page,
      size
    }
  })
}

export function upload (file: object) : Promise<AxiosResponse> {
  return request({
    url: imagePrefix + '/upload',
    method: 'POST',
    data: file
  })
}
