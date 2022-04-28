# lblog
Version |  Update Time  | Status | Author |  Description
---|---|---|---|---
v2022-04-28 09:18:48|2022-04-28 09:18:48|auto|@wjl15|Created by smart-doc



## 文章接口
### 分页查询文章详情
**URL:** http://localhost:8088/article/page/detail

**Type:** GET


**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 分页查询文章详情

**Query-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
page|int32|page|true|-
size|int32|size|true|-

**Request-example:**
```
curl -X GET -i http://localhost:8088/article/page/detail?page=1&size=5 --data '"5"'
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
status|int32|No comments found.|-
msg|string|No comments found.|-
data|object|No comments found.|-

**Response-example:**
```
{
  "status": 232,
  "msg": "k8tbvj",
  "data": {}
}
```

### 分页查询文章摘要
**URL:** http://localhost:8088/article/page/summary

**Type:** GET


**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 分页查询文章摘要

**Query-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
page|int32|page|true|-
size|int32|size|true|-

**Request-example:**
```
curl -X GET -i http://localhost:8088/article/page/summary?page=1&size=5 --data '"5"'
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
status|int32|No comments found.|-
msg|string|No comments found.|-
data|object|No comments found.|-

**Response-example:**
```
{
  "status": 2,
  "msg": "yd3q7o",
  "data": {}
}
```

### 查询所有文章详情
**URL:** http://localhost:8088/article/all/detail

**Type:** GET


**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 查询所有文章详情

**Request-example:**
```
curl -X GET -i http://localhost:8088/article/all/detail
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
status|int32|No comments found.|-
msg|string|No comments found.|-
data|object|No comments found.|-

**Response-example:**
```
{
  "status": 444,
  "msg": "ffoezb",
  "data": {}
}
```

### 查询所有文章摘要
**URL:** http://localhost:8088/article/all/summary

**Type:** GET


**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 查询所有文章摘要

**Request-example:**
```
curl -X GET -i http://localhost:8088/article/all/summary
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
status|int32|No comments found.|-
msg|string|No comments found.|-
data|object|No comments found.|-

**Response-example:**
```
{
  "status": 172,
  "msg": "93ebpn",
  "data": {}
}
```

### 根据 id 查询文章详情
**URL:** http://localhost:8088/article/detail

**Type:** GET


**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 根据 id 查询文章详情

**Query-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
id|int64|id|true|-

**Request-example:**
```
curl -X GET -i http://localhost:8088/article/detail?id=105 --data '105'
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
status|int32|No comments found.|-
msg|string|No comments found.|-
data|object|No comments found.|-

**Response-example:**
```
{
  "status": 13,
  "msg": "ybfina",
  "data": {}
}
```

### 根据 id 查询文章详情
**URL:** http://localhost:8088/article/detail

**Type:** GET


**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 根据 id 查询文章详情

**Query-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
title|string|title|true|-

**Request-example:**
```
curl -X GET -i http://localhost:8088/article/detail?title=8lesvk --data '8lesvk'
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
status|int32|No comments found.|-
msg|string|No comments found.|-
data|object|No comments found.|-

**Response-example:**
```
{
  "status": 976,
  "msg": "k0o1me",
  "data": {}
}
```

### 根据 id 查询文章摘要
**URL:** http://localhost:8088/article/summary

**Type:** GET


**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 根据 id 查询文章摘要

**Query-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
id|int64|id|true|-

**Request-example:**
```
curl -X GET -i http://localhost:8088/article/summary?id=578 --data '578'
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
status|int32|No comments found.|-
msg|string|No comments found.|-
data|object|No comments found.|-

**Response-example:**
```
{
  "status": 649,
  "msg": "clrl69",
  "data": {}
}
```

### 增加文章
**URL:** http://localhost:8088/article/

**Type:** POST


**Content-Type:** application/json; charset=utf-8

**Description:** 增加文章

**Body-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
title|string|No comments found.|false|-
summary|string|No comments found.|false|-
image|string|No comments found.|false|-
content|string|No comments found.|false|-
category|string|No comments found.|false|-
tags|array|No comments found.|false|-

**Request-example:**
```
curl -X POST -H 'Content-Type: application/json; charset=utf-8' -i http://localhost:8088/article/ --data '{
  "title": "vxyb0a",
  "summary": "ggob1d",
  "image": "4sklds",
  "content": "rzb41p",
  "category": "luu8pb",
  "tags": [
    "u7a3s0"
  ]
}'
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
status|int32|No comments found.|-
msg|string|No comments found.|-
data|object|No comments found.|-

**Response-example:**
```
{
  "status": 942,
  "msg": "99u5ta",
  "data": {}
}
```

### 根据 id 更新文章
**URL:** http://localhost:8088/article/

**Type:** PUT


**Content-Type:** application/json; charset=utf-8

**Description:** 根据 id 更新文章

**Query-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
id|int64|id|true|-

**Body-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
title|string|No comments found.|false|-
summary|string|No comments found.|false|-
image|string|No comments found.|false|-
content|string|No comments found.|false|-
category|string|No comments found.|false|-
tags|array|No comments found.|false|-

**Request-example:**
```
curl -X PUT -H 'Content-Type: application/json; charset=utf-8' -i http://localhost:8088/article/?id=66 --data '{
  "title": "iggueu",
  "summary": "i45gl5",
  "image": "9dq0ls",
  "content": "hy1vda",
  "category": "c2jb86",
  "tags": [
    "bgkdrb"
  ]
}'
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
status|int32|No comments found.|-
msg|string|No comments found.|-
data|object|No comments found.|-

**Response-example:**
```
{
  "status": 433,
  "msg": "6ptlks",
  "data": {}
}
```

### 根据 id 删除文章
**URL:** http://localhost:8088/article/{id}

**Type:** DELETE


**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 根据 id 删除文章

**Path-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
id|int64|id|true|-

**Request-example:**
```
curl -X DELETE -i http://localhost:8088/article/565
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
status|int32|No comments found.|-
msg|string|No comments found.|-
data|object|No comments found.|-

**Response-example:**
```
{
  "status": 767,
  "msg": "ya18tr",
  "data": {}
}
```

## 认证接口
### 登录
**URL:** http://localhost:8088/auth/login

**Type:** POST


**Content-Type:** application/json; charset=utf-8

**Description:** 登录

**Body-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
username|string|No comments found.|false|-
password|string|No comments found.|false|-

**Request-example:**
```
curl -X POST -H 'Content-Type: application/json; charset=utf-8' -i http://localhost:8088/auth/login --data '{
  "username": "rhett.schneider",
  "password": "aqenk2"
}'
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
status|int32|No comments found.|-
msg|string|No comments found.|-
data|object|No comments found.|-

**Response-example:**
```
{
  "status": 683,
  "msg": "m8of8j",
  "data": {}
}
```

### 注册
**URL:** http://localhost:8088/auth/register

**Type:** POST


**Content-Type:** application/json; charset=utf-8

**Description:** 注册

**Body-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
username|string|No comments found.|false|-
password|string|No comments found.|false|-

**Request-example:**
```
curl -X POST -H 'Content-Type: application/json; charset=utf-8' -i http://localhost:8088/auth/register --data '{
  "username": "rhett.schneider",
  "password": "5mr7n3"
}'
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
status|int32|No comments found.|-
msg|string|No comments found.|-
data|object|No comments found.|-

**Response-example:**
```
{
  "status": 188,
  "msg": "syxc0w",
  "data": {}
}
```

### 验证是否登录
**URL:** http://localhost:8088/auth/check

**Type:** GET


**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 验证是否登录

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
satoken|string|token|true|-


**Query-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
uid|int64|username|true|-

**Request-example:**
```
curl -X GET -H 'satoken' -i http://localhost:8088/auth/check?uid=274 --data '274'
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
status|int32|No comments found.|-
msg|string|No comments found.|-
data|object|No comments found.|-

**Response-example:**
```
{
  "status": 357,
  "msg": "0mpgg5",
  "data": {}
}
```

### 注销
**URL:** http://localhost:8088/auth/logout

**Type:** POST


**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 注销

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
satoken|string|token|true|-


**Request-example:**
```
curl -X POST -H 'satoken' -i http://localhost:8088/auth/logout
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
status|int32|No comments found.|-
msg|string|No comments found.|-
data|object|No comments found.|-

**Response-example:**
```
{
  "status": 471,
  "msg": "v37d7u",
  "data": {}
}
```

## 分类接口
### 分页查询分类实体
**URL:** http://localhost:8088/category/page

**Type:** GET


**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 分页查询分类实体

**Query-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
page|int32|页数|true|-
size|int32|数量|true|-

**Request-example:**
```
curl -X GET -i http://localhost:8088/category/page?page=1&size=5 --data '"5"'
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
status|int32|No comments found.|-
msg|string|No comments found.|-
data|object|No comments found.|-

**Response-example:**
```
{
  "status": 404,
  "msg": "f1gpox",
  "data": {}
}
```

### 查询所有分类实体
**URL:** http://localhost:8088/category/all

**Type:** GET


**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 查询所有分类实体

**Request-example:**
```
curl -X GET -i http://localhost:8088/category/all
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
status|int32|No comments found.|-
msg|string|No comments found.|-
data|object|No comments found.|-

**Response-example:**
```
{
  "status": 38,
  "msg": "d14eij",
  "data": {}
}
```

### 分页查询某分类下文章
**URL:** http://localhost:8088/category/article/id

**Type:** GET


**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 分页查询某分类下文章

**Query-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
id|int64|id|true|-
page|int32|page|true|-
size|int32|size|true|-

**Request-example:**
```
curl -X GET -i http://localhost:8088/category/article/id?id=85&page=1&size=7 --data '"7"'
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
status|int32|No comments found.|-
msg|string|No comments found.|-
data|object|No comments found.|-

**Response-example:**
```
{
  "status": 80,
  "msg": "hwkvbd",
  "data": {}
}
```

### 分页查询某分类下文章
**URL:** http://localhost:8088/category/article/name

**Type:** GET


**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 分页查询某分类下文章

**Query-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
name|string|name|true|-
page|int32|page|true|-
size|int32|size|true|-

**Request-example:**
```
curl -X GET -i http://localhost:8088/category/article/name?name=rhett.schneider&page=1&size=7 --data '"7"'
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
status|int32|No comments found.|-
msg|string|No comments found.|-
data|object|No comments found.|-

**Response-example:**
```
{
  "status": 503,
  "msg": "li0vue",
  "data": {}
}
```

### 根据 id 查询分类实体
**URL:** http://localhost:8088/category/id

**Type:** GET


**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 根据 id 查询分类实体

**Query-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
id|int64|id|true|-

**Request-example:**
```
curl -X GET -i http://localhost:8088/category/id?id=243 --data '243'
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
status|int32|No comments found.|-
msg|string|No comments found.|-
data|object|No comments found.|-

**Response-example:**
```
{
  "status": 128,
  "msg": "h0caw5",
  "data": {}
}
```

### 根据名称查询分类实体
**URL:** http://localhost:8088/category/name

**Type:** GET


**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 根据名称查询分类实体

**Query-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
name|string|name|true|-

**Request-example:**
```
curl -X GET -i http://localhost:8088/category/name?name=rhett.schneider --data 'rhett.schneider'
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
status|int32|No comments found.|-
msg|string|No comments found.|-
data|object|No comments found.|-

**Response-example:**
```
{
  "status": 527,
  "msg": "aue98s",
  "data": {}
}
```

### 增加分类
**URL:** http://localhost:8088/category/

**Type:** POST


**Content-Type:** application/json; charset=utf-8

**Description:** 增加分类

**Body-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
category|string|category|false|-

**Request-example:**
```
curl -X POST -H 'Content-Type: application/json; charset=utf-8' -i http://localhost:8088/category/ --data 'w1q7l6'
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
status|int32|No comments found.|-
msg|string|No comments found.|-
data|object|No comments found.|-

**Response-example:**
```
{
  "status": 76,
  "msg": "hqbs1v",
  "data": {}
}
```

### 根据 id 删除分类
**URL:** http://localhost:8088/category/{id}

**Type:** DELETE


**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 根据 id 删除分类

**Path-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
id|int64|id|true|-

**Request-example:**
```
curl -X DELETE -i http://localhost:8088/category/272
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
status|int32|No comments found.|-
msg|string|No comments found.|-
data|object|No comments found.|-

**Response-example:**
```
{
  "status": 611,
  "msg": "uuygjj",
  "data": {}
}
```

## 留言接口
### 分页查询留言
**URL:** http://localhost:8088/comment/page

**Type:** GET


**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 分页查询留言

**Query-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
page|int32|page|true|-
size|int32|size|true|-

**Request-example:**
```
curl -X GET -i http://localhost:8088/comment/page?page=1&size=5 --data '"5"'
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
status|int32|No comments found.|-
msg|string|No comments found.|-
data|object|No comments found.|-

**Response-example:**
```
{
  "status": 571,
  "msg": "mbdq7l",
  "data": {}
}
```

### 查询所有留言
**URL:** http://localhost:8088/comment/all

**Type:** GET


**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 查询所有留言

**Request-example:**
```
curl -X GET -i http://localhost:8088/comment/all
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
status|int32|No comments found.|-
msg|string|No comments found.|-
data|object|No comments found.|-

**Response-example:**
```
{
  "status": 547,
  "msg": "p2s9mi",
  "data": {}
}
```

### 根据 id 查询留言
**URL:** http://localhost:8088/comment/

**Type:** GET


**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 根据 id 查询留言

**Query-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
id|int64|id|true|-

**Request-example:**
```
curl -X GET -i http://localhost:8088/comment/?id=69 --data '69'
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
status|int32|No comments found.|-
msg|string|No comments found.|-
data|object|No comments found.|-

**Response-example:**
```
{
  "status": 76,
  "msg": "pvlndu",
  "data": {}
}
```

### 增加留言
**URL:** http://localhost:8088/comment/

**Type:** POST


**Content-Type:** application/json; charset=utf-8

**Description:** 增加留言

**Body-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
content|string|No comments found.|false|-
username|string|No comments found.|false|-
avatar|string|No comments found.|false|-
site|string|No comments found.|false|-
email|string|No comments found.|false|-

**Request-example:**
```
curl -X POST -H 'Content-Type: application/json; charset=utf-8' -i http://localhost:8088/comment/ --data '{
  "content": "k4lyf9",
  "username": "rhett.schneider",
  "avatar": "6tdy8u",
  "site": "bfby4q",
  "email": "cordell.ziemann@gmail.com"
}'
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
status|int32|No comments found.|-
msg|string|No comments found.|-
data|object|No comments found.|-

**Response-example:**
```
{
  "status": 474,
  "msg": "0eb9h0",
  "data": {}
}
```

### 根据 id 删除留言
**URL:** http://localhost:8088/comment/{id}

**Type:** DELETE


**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 根据 id 删除留言

**Path-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
id|int64|id|true|-

**Request-example:**
```
curl -X DELETE -i http://localhost:8088/comment/792
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
status|int32|No comments found.|-
msg|string|No comments found.|-
data|object|No comments found.|-

**Response-example:**
```
{
  "status": 510,
  "msg": "u2i4bz",
  "data": {}
}
```

## 图片接口
### 获取已上传的图片列表
**URL:** http://localhost:8088/files/all

**Type:** GET


**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 获取已上传的图片列表

**Request-example:**
```
curl -X GET -i http://localhost:8088/files/all
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
status|int32|No comments found.|-
msg|string|No comments found.|-
data|object|No comments found.|-

**Response-example:**
```
{
  "status": 164,
  "msg": "x1ttlx",
  "data": {}
}
```

### 分页查询
**URL:** http://localhost:8088/files/page

**Type:** GET


**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 分页查询

**Query-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
page|int32|page|true|-
size|int32|size|true|-

**Request-example:**
```
curl -X GET -i http://localhost:8088/files/page?page=1&size=10 --data '"10"'
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
status|int32|No comments found.|-
msg|string|No comments found.|-
data|object|No comments found.|-

**Response-example:**
```
{
  "status": 120,
  "msg": "fgz8tv",
  "data": {}
}
```

### 图片上传
**URL:** http://localhost:8088/files/upload

**Type:** POST


**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 图片上传

**Query-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
file|file|file|true|-

**Request-example:**
```
curl -X POST -i http://localhost:8088/files/upload --data 'file='
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
status|int32|No comments found.|-
msg|string|No comments found.|-
data|object|No comments found.|-

**Response-example:**
```
{
  "status": 509,
  "msg": "wx5j2t",
  "data": {}
}
```

## 标签接口
### 分页查询标签实体
**URL:** http://localhost:8088/tag/page

**Type:** GET


**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 分页查询标签实体

**Query-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
page|int32|page|true|-
size|int32|size|true|-

**Request-example:**
```
curl -X GET -i http://localhost:8088/tag/page?page=1&size=5 --data '"5"'
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
status|int32|No comments found.|-
msg|string|No comments found.|-
data|object|No comments found.|-

**Response-example:**
```
{
  "status": 327,
  "msg": "a0m1iw",
  "data": {}
}
```

### 查询所有标签实体
**URL:** http://localhost:8088/tag/all

**Type:** GET


**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 查询所有标签实体

**Request-example:**
```
curl -X GET -i http://localhost:8088/tag/all
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
status|int32|No comments found.|-
msg|string|No comments found.|-
data|object|No comments found.|-

**Response-example:**
```
{
  "status": 938,
  "msg": "w2v48z",
  "data": {}
}
```

### 分页查询某标签下文章
**URL:** http://localhost:8088/tag/article/id

**Type:** GET


**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 分页查询某标签下文章

**Query-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
id|int64|id|true|-
page|int32|page|true|-
size|int32|size|true|-

**Request-example:**
```
curl -X GET -i http://localhost:8088/tag/article/id?id=402&page=1&size=5 --data '"5"'
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
status|int32|No comments found.|-
msg|string|No comments found.|-
data|object|No comments found.|-

**Response-example:**
```
{
  "status": 151,
  "msg": "mnfewy",
  "data": {}
}
```

### 分页查询某标签下文章
**URL:** http://localhost:8088/tag/article/name

**Type:** GET


**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 分页查询某标签下文章

**Query-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
name|string|name|true|-
page|int32|page|true|-
size|int32|size|true|-

**Request-example:**
```
curl -X GET -i http://localhost:8088/tag/article/name?name=rhett.schneider&page=1&size=5 --data '"5"'
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
status|int32|No comments found.|-
msg|string|No comments found.|-
data|object|No comments found.|-

**Response-example:**
```
{
  "status": 775,
  "msg": "0cnarb",
  "data": {}
}
```

### 根据 id 查询标签实体
**URL:** http://localhost:8088/tag/id

**Type:** GET


**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 根据 id 查询标签实体

**Query-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
id|int64|id|true|-

**Request-example:**
```
curl -X GET -i http://localhost:8088/tag/id?id=569 --data '569'
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
status|int32|No comments found.|-
msg|string|No comments found.|-
data|object|No comments found.|-

**Response-example:**
```
{
  "status": 779,
  "msg": "hs9he1",
  "data": {}
}
```

### 根据名称查询标签实体
**URL:** http://localhost:8088/tag/name

**Type:** GET


**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 根据名称查询标签实体

**Query-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
name|string|name|true|-

**Request-example:**
```
curl -X GET -i http://localhost:8088/tag/name?name=rhett.schneider --data 'rhett.schneider'
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
status|int32|No comments found.|-
msg|string|No comments found.|-
data|object|No comments found.|-

**Response-example:**
```
{
  "status": 518,
  "msg": "fxnxev",
  "data": {}
}
```

### 增加标签
**URL:** http://localhost:8088/tag/

**Type:** POST


**Content-Type:** application/json; charset=utf-8

**Description:** 增加标签

**Body-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
name|string|name|false|-

**Request-example:**
```
curl -X POST -H 'Content-Type: application/json; charset=utf-8' -i http://localhost:8088/tag/ --data 'rhett.schneider'
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
status|int32|No comments found.|-
msg|string|No comments found.|-
data|object|No comments found.|-

**Response-example:**
```
{
  "status": 792,
  "msg": "xct7vr",
  "data": {}
}
```

### 根据 id 删除标签
**URL:** http://localhost:8088/tag/{id}

**Type:** DELETE


**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 根据 id 删除标签

**Path-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
id|int64|id|true|-

**Request-example:**
```
curl -X DELETE -i http://localhost:8088/tag/990
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
status|int32|No comments found.|-
msg|string|No comments found.|-
data|object|No comments found.|-

**Response-example:**
```
{
  "status": 272,
  "msg": "dq4hhr",
  "data": {}
}
```

## 时间线接口
### 分页查询时间线
**URL:** http://localhost:8088/idea/page

**Type:** GET


**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 分页查询时间线

**Query-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
page|int32|页数|true|-
size|int32|数量|true|-

**Request-example:**
```
curl -X GET -i http://localhost:8088/idea/page?page=1&size=10 --data '"10"'
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
status|int32|No comments found.|-
msg|string|No comments found.|-
data|object|No comments found.|-

**Response-example:**
```
{
  "status": 689,
  "msg": "kya642",
  "data": {}
}
```

### 查询所有时间线
**URL:** http://localhost:8088/idea/all

**Type:** GET


**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 查询所有时间线

**Request-example:**
```
curl -X GET -i http://localhost:8088/idea/all
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
status|int32|No comments found.|-
msg|string|No comments found.|-
data|object|No comments found.|-

**Response-example:**
```
{
  "status": 182,
  "msg": "ivve6w",
  "data": {}
}
```

### 根据 id 查询时间线
**URL:** http://localhost:8088/idea/

**Type:** GET


**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 根据 id 查询时间线

**Query-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
id|int64|id|true|-

**Request-example:**
```
curl -X GET -i http://localhost:8088/idea/?id=992 --data '992'
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
status|int32|No comments found.|-
msg|string|No comments found.|-
data|object|No comments found.|-

**Response-example:**
```
{
  "status": 67,
  "msg": "dpodks",
  "data": {}
}
```

### 增加时间线
**URL:** http://localhost:8088/idea/

**Type:** POST


**Content-Type:** application/json; charset=utf-8

**Description:** 增加时间线

**Body-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
title|string|No comments found.|false|-
content|string|No comments found.|false|-

**Request-example:**
```
curl -X POST -H 'Content-Type: application/json; charset=utf-8' -i http://localhost:8088/idea/ --data '{
  "title": "tnyotr",
  "content": "8ctamj"
}'
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
status|int32|No comments found.|-
msg|string|No comments found.|-
data|object|No comments found.|-

**Response-example:**
```
{
  "status": 138,
  "msg": "r01bdz",
  "data": {}
}
```

### 更新时间线
**URL:** http://localhost:8088/idea/

**Type:** PUT


**Content-Type:** application/json; charset=utf-8

**Description:** 更新时间线

**Query-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
id|int64|id|true|-

**Body-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
title|string|No comments found.|false|-
content|string|No comments found.|false|-

**Request-example:**
```
curl -X PUT -H 'Content-Type: application/json; charset=utf-8' -i http://localhost:8088/idea/?id=394 --data '{
  "title": "od3ud5",
  "content": "jglkcp"
}'
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
status|int32|No comments found.|-
msg|string|No comments found.|-
data|object|No comments found.|-

**Response-example:**
```
{
  "status": 902,
  "msg": "7bcdt6",
  "data": {}
}
```

### 根据 id 删除时间线
**URL:** http://localhost:8088/idea/{id}

**Type:** DELETE


**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 根据 id 删除时间线

**Path-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
id|int64|id|true|-

**Request-example:**
```
curl -X DELETE -i http://localhost:8088/idea/171
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
status|int32|No comments found.|-
msg|string|No comments found.|-
data|object|No comments found.|-

**Response-example:**
```
{
  "status": 712,
  "msg": "l0r2a6",
  "data": {}
}
```

## 用户接口
### 根据 id 获取用户信息
**URL:** http://localhost:8088/user/user

**Type:** GET


**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 根据 id 获取用户信息

**Query-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
id|int64|id|true|-

**Request-example:**
```
curl -X GET -i http://localhost:8088/user/user?id=537 --data '537'
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
status|int32|No comments found.|-
msg|string|No comments found.|-
data|object|No comments found.|-

**Response-example:**
```
{
  "status": 415,
  "msg": "n9qyym",
  "data": {}
}
```

### 添加用户
**URL:** http://localhost:8088/user/

**Type:** POST


**Content-Type:** application/json; charset=utf-8

**Description:** 添加用户

**Body-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
username|string|No comments found.|false|-
password|string|No comments found.|false|-
avatar|string|No comments found.|false|-
age|int32|No comments found.|false|-
gender|int32|No comments found.|false|-
location|string|No comments found.|false|-
signature|string|No comments found.|false|-
profile|string|No comments found.|false|-

**Request-example:**
```
curl -X POST -H 'Content-Type: application/json; charset=utf-8' -i http://localhost:8088/user/ --data '{
  "username": "rhett.schneider",
  "password": "xt89he",
  "avatar": "y4d0x8",
  "age": 61,
  "gender": 1,
  "location": "jbh906",
  "signature": "bkoahr",
  "profile": "t75lwf"
}'
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
status|int32|No comments found.|-
msg|string|No comments found.|-
data|object|No comments found.|-

**Response-example:**
```
{
  "status": 484,
  "msg": "sft53c",
  "data": {}
}
```

### 更新用户信息
**URL:** http://localhost:8088/user/

**Type:** PUT


**Content-Type:** application/json; charset=utf-8

**Description:** 更新用户信息

**Query-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
id|int64|No comments found.|true|-

**Body-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
username|string|No comments found.|false|-
password|string|No comments found.|false|-
avatar|string|No comments found.|false|-
age|int32|No comments found.|false|-
gender|int32|No comments found.|false|-
location|string|No comments found.|false|-
signature|string|No comments found.|false|-
profile|string|No comments found.|false|-

**Request-example:**
```
curl -X PUT -H 'Content-Type: application/json; charset=utf-8' -i http://localhost:8088/user/?id=500 --data '{
  "username": "rhett.schneider",
  "password": "ol8rhj",
  "avatar": "x45ua6",
  "age": 61,
  "gender": 1,
  "location": "6i0lrl",
  "signature": "gstqze",
  "profile": "o40imp"
}'
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
status|int32|No comments found.|-
msg|string|No comments found.|-
data|object|No comments found.|-

**Response-example:**
```
{
  "status": 652,
  "msg": "q8sj2x",
  "data": {}
}
```


