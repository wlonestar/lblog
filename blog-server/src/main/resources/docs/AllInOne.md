# lblog
Version |  Update Time  | Status | Author |  Description
---|---|---|---|---
v2022-04-25 15:21:59|2022-04-25 15:21:59|auto|@wjl15|Created by smart-doc



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
  "status": 602,
  "msg": "zna1x9",
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
  "status": 866,
  "msg": "qn8d6g",
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
  "status": 650,
  "msg": "4tc25t",
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
  "status": 925,
  "msg": "o7f43v",
  "data": {}
}
```

### 根据 id 查询文章详情
**URL:** http://localhost:8088/article/detail/id

**Type:** GET


**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 根据 id 查询文章详情

**Query-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
id|int64|id|true|-

**Request-example:**
```
curl -X GET -i http://localhost:8088/article/detail/id?id=667 --data '667'
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
  "status": 722,
  "msg": "5l7v6w",
  "data": {}
}
```

### 根据 id 查询文章摘要
**URL:** http://localhost:8088/article/summary/id

**Type:** GET


**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 根据 id 查询文章摘要

**Query-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
id|int64|id|true|-

**Request-example:**
```
curl -X GET -i http://localhost:8088/article/summary/id?id=439 --data '439'
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
  "status": 389,
  "msg": "2909n9",
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
  "title": "myxbc3",
  "summary": "elo4gf",
  "image": "o8c4bv",
  "content": "w8t1qd",
  "category": "kz0dnu",
  "tags": [
    "a4ub39"
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
  "status": 342,
  "msg": "7vfeoh",
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
curl -X PUT -H 'Content-Type: application/json; charset=utf-8' -i http://localhost:8088/article/?id=937 --data '{
  "title": "abrgzt",
  "summary": "sxrudq",
  "image": "88j5zx",
  "content": "3bu8yz",
  "category": "aj89g4",
  "tags": [
    "08jbcm"
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
  "status": 755,
  "msg": "qfnd8n",
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
curl -X DELETE -i http://localhost:8088/article/58
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
  "status": 202,
  "msg": "vs3ed4",
  "data": {}
}
```

## 登录接口
### 登录
**URL:** http://localhost:8088/admin/login

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
curl -X POST -H 'Content-Type: application/json; charset=utf-8' -i http://localhost:8088/admin/login --data '{
  "username": "tora.aufderhar",
  "password": "0jjte5"
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
  "status": 877,
  "msg": "hmby02",
  "data": {}
}
```

### 验证是否登录
**URL:** http://localhost:8088/admin/check

**Type:** GET


**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 验证是否登录

**Query-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
username|string|username|true|-
tokenValue|string|token|true|-

**Request-example:**
```
curl -X GET -i http://localhost:8088/admin/check?username=tora.aufderhar&tokenValue=knayhu --data 'knayhu'
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
  "status": 539,
  "msg": "38uyku",
  "data": {}
}
```

### 注销
**URL:** http://localhost:8088/admin/logout

**Type:** POST


**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 注销

**Query-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
tokenValue|string|token|true|-

**Request-example:**
```
curl -X POST -i http://localhost:8088/admin/logout --data 'tokenValue=22uqnd'
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
  "status": 555,
  "msg": "ex5o6f",
  "data": {}
}
```

### 注册
**URL:** http://localhost:8088/admin/register

**Type:** POST


**Content-Type:** application/json; charset=utf-8

**Description:** 注册

**Body-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
username|string|No comments found.|false|-
password|string|No comments found.|false|-
passwordRepeat|string|No comments found.|false|-

**Request-example:**
```
curl -X POST -H 'Content-Type: application/json; charset=utf-8' -i http://localhost:8088/admin/register --data '{
  "username": "tora.aufderhar",
  "password": "ynubmq",
  "passwordRepeat": "0r7h0c"
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
  "status": 309,
  "msg": "k4t0sy",
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
  "status": 587,
  "msg": "i19ji8",
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
  "status": 597,
  "msg": "utcwwj",
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
curl -X GET -i http://localhost:8088/category/article/id?id=178&page=1&size=7 --data '"7"'
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
  "status": 637,
  "msg": "muzuk4",
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
curl -X GET -i http://localhost:8088/category/article/name?name=tora.aufderhar&page=1&size=7 --data '"7"'
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
  "status": 467,
  "msg": "wfbvj2",
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
curl -X GET -i http://localhost:8088/category/id?id=301 --data '301'
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
  "status": 487,
  "msg": "q6mbcb",
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
curl -X GET -i http://localhost:8088/category/name?name=tora.aufderhar --data 'tora.aufderhar'
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
  "status": 573,
  "msg": "0kexyf",
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
curl -X POST -H 'Content-Type: application/json; charset=utf-8' -i http://localhost:8088/category/ --data 'twahj2'
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
  "status": 240,
  "msg": "9qb3ir",
  "data": {}
}
```

### 根据 id 删除分类
**URL:** http://localhost:8088/category/

**Type:** DELETE


**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 根据 id 删除分类

**Query-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
id|int64|id|true|-

**Request-example:**
```
curl -X DELETE -i http://localhost:8088/category/?id=342 --data '342'
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
  "status": 533,
  "msg": "4y5tqq",
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
  "status": 864,
  "msg": "qgxsfk",
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
  "status": 215,
  "msg": "auxasm",
  "data": {}
}
```

### 根据 id 查询留言
**URL:** http://localhost:8088/comment/{id}

**Type:** GET


**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 根据 id 查询留言

**Path-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
id|int64|id|true|-

**Request-example:**
```
curl -X GET -i http://localhost:8088/comment/919
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
  "status": 449,
  "msg": "mxaz53",
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
id|int64|No comments found.|false|-
createTime|object|创建时间|false|-
content|string|留言正文|false|-
username|string|昵称|false|-
avatar|string|头像|false|-
site|string|个人网站|false|-
email|string|邮箱|false|-

**Request-example:**
```
curl -X POST -H 'Content-Type: application/json; charset=utf-8' -i http://localhost:8088/comment/ --data '{
  "id": 737,
  "createTime": "2022-04-25 15:58:19",
  "content": "r4099v",
  "username": "tora.aufderhar",
  "avatar": "9y2u7t",
  "site": "l34tw8",
  "email": "wayne.schimmel@gmail.com"
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
  "status": 951,
  "msg": "xu6a8n",
  "data": {}
}
```

### 更新留言
**URL:** http://localhost:8088/comment/

**Type:** PUT


**Content-Type:** application/json; charset=utf-8

**Description:** 更新留言

**Query-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
id|int64|id|true|-

**Body-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
id|int64|No comments found.|false|-
createTime|object|创建时间|false|-
content|string|留言正文|false|-
username|string|昵称|false|-
avatar|string|头像|false|-
site|string|个人网站|false|-
email|string|邮箱|false|-

**Request-example:**
```
curl -X PUT -H 'Content-Type: application/json; charset=utf-8' -i http://localhost:8088/comment/?id=200 --data '{
  "id": 77,
  "createTime": "2022-04-25 15:58:19",
  "content": "jzpz9f",
  "username": "tora.aufderhar",
  "avatar": "ghz1q4",
  "site": "70yyrk",
  "email": "wayne.schimmel@gmail.com"
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
  "status": 487,
  "msg": "668ao0",
  "data": {}
}
```

### 根据 id 删除留言
**URL:** http://localhost:8088/comment/

**Type:** DELETE


**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 根据 id 删除留言

**Query-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
id|int64|id|true|-

**Request-example:**
```
curl -X DELETE -i http://localhost:8088/comment/?id=570 --data '570'
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
  "status": 570,
  "msg": "l3adou",
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
  "status": 619,
  "msg": "38y0kp",
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
  "status": 3,
  "msg": "mvt6si",
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
  "status": 675,
  "msg": "l28qjj",
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
  "status": 633,
  "msg": "0vcxpi",
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
  "status": 630,
  "msg": "4qrq8l",
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
curl -X GET -i http://localhost:8088/tag/article/id?id=588&page=1&size=5 --data '"5"'
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
  "status": 828,
  "msg": "d8iah5",
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
curl -X GET -i http://localhost:8088/tag/article/name?name=tora.aufderhar&page=1&size=5 --data '"5"'
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
  "status": 751,
  "msg": "94m4ul",
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
curl -X GET -i http://localhost:8088/tag/id?id=411 --data '411'
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
  "status": 281,
  "msg": "oxmqaa",
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
curl -X GET -i http://localhost:8088/tag/name?name=tora.aufderhar --data 'tora.aufderhar'
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
  "status": 55,
  "msg": "fejrne",
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
curl -X POST -H 'Content-Type: application/json; charset=utf-8' -i http://localhost:8088/tag/ --data 'tora.aufderhar'
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
  "status": 143,
  "msg": "wkbtvt",
  "data": {}
}
```

### 根据 id 删除标签
**URL:** http://localhost:8088/tag/

**Type:** DELETE


**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 根据 id 删除标签

**Query-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
id|int64|id|true|-

**Request-example:**
```
curl -X DELETE -i http://localhost:8088/tag/?id=68 --data '68'
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
  "status": 505,
  "msg": "im8bs1",
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
  "status": 340,
  "msg": "4iafi3",
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
  "status": 513,
  "msg": "0se1hb",
  "data": {}
}
```

### 根据 id 查询时间线
**URL:** http://localhost:8088/idea/{id}

**Type:** GET


**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 根据 id 查询时间线

**Path-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
id|int64|id|true|-

**Request-example:**
```
curl -X GET -i http://localhost:8088/idea/896
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
  "status": 319,
  "msg": "wstjrl",
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
id|int64|No comments found.|false|-
createTime|object|创建时间|false|-
modifyTime|object|更新时间|false|-
title|string|标题|false|-
content|string|正文|false|-

**Request-example:**
```
curl -X POST -H 'Content-Type: application/json; charset=utf-8' -i http://localhost:8088/idea/ --data '{
  "id": 144,
  "createTime": "2022-04-25 15:58:19",
  "modifyTime": "2022-04-25 15:58:19",
  "title": "1g2fp6",
  "content": "7bwpl6"
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
  "status": 204,
  "msg": "9ot7l7",
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
id|int64|No comments found.|false|-
createTime|object|创建时间|false|-
modifyTime|object|更新时间|false|-
title|string|标题|false|-
content|string|正文|false|-

**Request-example:**
```
curl -X PUT -H 'Content-Type: application/json; charset=utf-8' -i http://localhost:8088/idea/?id=356 --data '{
  "id": 66,
  "createTime": "2022-04-25 15:58:19",
  "modifyTime": "2022-04-25 15:58:19",
  "title": "kykbhs",
  "content": "s75fgz"
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
  "status": 874,
  "msg": "4ecoc2",
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
curl -X DELETE -i http://localhost:8088/idea/223
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
  "status": 550,
  "msg": "xsatot",
  "data": {}
}
```

## 用户接口
### 添加用户
**URL:** http://localhost:8088/user/

**Type:** POST


**Content-Type:** application/json; charset=utf-8

**Description:** 添加用户

**Body-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
id|int64|No comments found.|false|-
username|string|用户名|false|-
password|string|密码|false|-
token|string|token|false|-
avatar|string|头像|false|-
age|int32|年龄|false|-
gender|int32|性别|false|-
location|string|地址|false|-
signature|string|个性签名|false|-
profile|string|简介|false|-

**Request-example:**
```
curl -X POST -H 'Content-Type: application/json; charset=utf-8' -i http://localhost:8088/user/ --data '{
  "id": 496,
  "username": "tora.aufderhar",
  "password": "df7bx0",
  "token": "k3pgb7",
  "avatar": "iglg47",
  "age": 58,
  "gender": 1,
  "location": "kdn0rc",
  "signature": "or4f0t",
  "profile": "9zbwr0"
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
  "status": 987,
  "msg": "hyvj4l",
  "data": {}
}
```

### 根据 id 获取用户信息
**URL:** http://localhost:8088/user/user

**Type:** GET


**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 根据 id 获取用户信息

**Query-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
id|int64|No comments found.|true|-

**Request-example:**
```
curl -X GET -i http://localhost:8088/user/user?id=13 --data '13'
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
  "status": 10,
  "msg": "byvwdf",
  "data": {}
}
```

### 根据用户名获取用户信息
**URL:** http://localhost:8088/user/name

**Type:** GET


**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 根据用户名获取用户信息

**Query-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
username|string|No comments found.|true|-

**Request-example:**
```
curl -X GET -i http://localhost:8088/user/name?username=tora.aufderhar --data 'tora.aufderhar'
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
  "status": 366,
  "msg": "bhzmm2",
  "data": {}
}
```

### 更新密码
**URL:** http://localhost:8088/user/password

**Type:** PUT


**Content-Type:** application/json; charset=utf-8

**Description:** 更新密码

**Query-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
id|int64|No comments found.|true|-

**Body-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
id|int64|No comments found.|false|-
username|string|用户名|false|-
password|string|密码|false|-
token|string|token|false|-
avatar|string|头像|false|-
age|int32|年龄|false|-
gender|int32|性别|false|-
location|string|地址|false|-
signature|string|个性签名|false|-
profile|string|简介|false|-

**Request-example:**
```
curl -X PUT -H 'Content-Type: application/json; charset=utf-8' -i http://localhost:8088/user/password?id=937 --data '{
  "id": 67,
  "username": "tora.aufderhar",
  "password": "z50mn9",
  "token": "lf4s8l",
  "avatar": "pum26h",
  "age": 58,
  "gender": 1,
  "location": "n8s31f",
  "signature": "ydg374",
  "profile": "asufa1"
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
  "status": 562,
  "msg": "3blszf",
  "data": {}
}
```


