import request from '@/util/request'
import type { AxiosResponse } from 'axios'

const articleBase = '/article'

export function getDetailByPage (page: number, size: number) : Promise<AxiosResponse> {
  return request({
    url: articleBase + '/page/detail',
    method: 'GET',
    params: {
      page,
      size
    }
  })
}

export function getSummaryByPage (page: number, size: number) : Promise<AxiosResponse> {
  return request({
    url: articleBase + '/page/summary',
    method: 'GET',
    params: {
      page,
      size
    }
  })
}

export function getAllDetail () : Promise<AxiosResponse> {
  return request({
    url: articleBase + '/all/detail',
    method: 'GET'
  })
}

export function getAllSummary () : Promise<AxiosResponse> {
  return request({
    url: articleBase + '/all/summary',
    method: 'GET'
  })
}

export function getDetailById (id: number) : Promise<AxiosResponse> {
  return request({
    url: articleBase + '/detail/id',
    method: 'GET',
    params: {
      id
    }
  })
}

export function getSummaryById (id: number) : Promise<AxiosResponse> {
  return request({
    url: articleBase + '/summary/id',
    method: 'GET',
    params: {
      id
    }
  })
}

export function add (article: object) : Promise<AxiosResponse> {
  return request({
    url: articleBase + '/',
    method: 'POST',
    data: article
  })
}

export function updateById (id: number, article: object) : Promise<AxiosResponse> {
  return request({
    url: articleBase + '/',
    method: 'PUT',
    params: {
      id
    },
    data: article
  })
}

export function deleteById (id: number) : Promise<AxiosResponse> {
  return request({
    url: `/${id}`,
    method: 'DELETE'
  })
}
