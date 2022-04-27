import request from '@/util/request'
import type { AxiosResponse } from 'axios'

const articlePrefix = '/article'

export function getDetailByPage (page: number, size: number) : Promise<AxiosResponse> {
  return request({
    url: articlePrefix + '/page/detail',
    method: 'GET',
    params: {
      page,
      size
    }
  })
}

export function getSummaryByPage (page: number, size: number) : Promise<AxiosResponse> {
  return request({
    url: articlePrefix + '/page/summary',
    method: 'GET',
    params: {
      page,
      size
    }
  })
}

export function getAllDetail () : Promise<AxiosResponse> {
  return request({
    url: articlePrefix + '/all/detail',
    method: 'GET'
  })
}

export function getAllSummary () : Promise<AxiosResponse> {
  return request({
    url: articlePrefix + '/all/summary',
    method: 'GET'
  })
}

export function getDetailById (id: number) : Promise<AxiosResponse> {
  return request({
    url: articlePrefix + '/detail/id',
    method: 'GET',
    params: {
      id
    }
  })
}

export function getSummaryById (id: number) : Promise<AxiosResponse> {
  return request({
    url: articlePrefix + '/summary/id',
    method: 'GET',
    params: {
      id
    }
  })
}

export function add (article: object) : Promise<AxiosResponse> {
  return request({
    url: article + '/',
    method: 'POST',
    data: article
  })
}

export function updateById (id: number, article: object) : Promise<AxiosResponse> {
  return request({
    url: article + '/',
    method: 'PUT',
    params: {
      id
    },
    data: article
  })
}

export function deleteById (id: number) : Promise<AxiosResponse> {
  return request({
    url: articlePrefix + `/${id}`,
    method: 'DELETE'
  })
}
