# lblog
Version |  Update Time  | Status | Author |  Description
---|---|---|---|---
v2022-04-25 21:13:49|2022-04-25 21:13:49|auto|@wjl15|Created by smart-doc



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
  "status": 359,
  "msg": "g45fat",
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
  "status": 620,
  "msg": "f3m5hk",
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
  "status": 724,
  "msg": "ogdfc1",
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
  "status": 511,
  "msg": "m5s6ua",
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
curl -X GET -i http://localhost:8088/article/detail/id?id=923 --data '923'
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
  "status": 674,
  "msg": "qz0308",
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
curl -X GET -i http://localhost:8088/article/summary/id?id=886 --data '886'
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
  "status": 631,
  "msg": "8ey7av",
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
  "title": "8xhdan",
  "summary": "rjocyg",
  "image": "yojjvd",
  "content": "xot5dg",
  "category": "setm1h",
  "tags": [
    "4rxffg"
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
  "status": 873,
  "msg": "oa2yqt",
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
curl -X PUT -H 'Content-Type: application/json; charset=utf-8' -i http://localhost:8088/article/?id=32 --data '{
  "title": "yh6vly",
  "summary": "at3mvq",
  "image": "ippyc9",
  "content": "dtkdd6",
  "category": "rq2xht",
  "tags": [
    "vsnpq6"
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
  "status": 324,
  "msg": "xpsx2z",
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
curl -X DELETE -i http://localhost:8088/article/839
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
  "status": 906,
  "msg": "q0v7mz",
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
  "username": "roscoe.tromp",
  "password": "s4ly4b"
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
  "status": 943,
  "msg": "g2yme0",
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
curl -X GET -i http://localhost:8088/admin/check?username=roscoe.tromp&tokenValue=ooug0i --data 'ooug0i'
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
  "status": 670,
  "msg": "i7w4fb",
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
curl -X POST -i http://localhost:8088/admin/logout --data 'tokenValue=17aqhf'
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
  "status": 916,
  "msg": "8eht84",
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
  "username": "roscoe.tromp",
  "password": "gbuqlu",
  "passwordRepeat": "jb15am"
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
  "status": 388,
  "msg": "9ggfl5",
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
  "status": 714,
  "msg": "e8t93w",
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
  "status": 59,
  "msg": "fsf0fb",
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
curl -X GET -i http://localhost:8088/category/article/id?id=681&page=1&size=7 --data '"7"'
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
  "status": 425,
  "msg": "bgeauj",
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
curl -X GET -i http://localhost:8088/category/article/name?name=roscoe.tromp&page=1&size=7 --data '"7"'
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
  "status": 808,
  "msg": "l9nj0g",
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
curl -X GET -i http://localhost:8088/category/id?id=756 --data '756'
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
  "status": 175,
  "msg": "1xy30s",
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
curl -X GET -i http://localhost:8088/category/name?name=roscoe.tromp --data 'roscoe.tromp'
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
  "status": 676,
  "msg": "2l1e1a",
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
curl -X POST -H 'Content-Type: application/json; charset=utf-8' -i http://localhost:8088/category/ --data 'vt0kkq'
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
  "status": 97,
  "msg": "2pu0li",
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
curl -X DELETE -i http://localhost:8088/category/?id=219 --data '219'
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
  "status": 362,
  "msg": "lll0on",
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
  "status": 453,
  "msg": "xlif9y",
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
  "status": 533,
  "msg": "bfqwoy",
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
curl -X GET -i http://localhost:8088/comment/149
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
  "status": 572,
  "msg": "wtl08n",
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
  "id": 426,
  "createTime": "2022-04-25 21:13:52",
  "content": "u5scbn",
  "username": "roscoe.tromp",
  "avatar": "y4edqv",
  "site": "g1m1uw",
  "email": "asa.sipes@hotmail.com"
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
  "status": 263,
  "msg": "s4cnix",
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
curl -X PUT -H 'Content-Type: application/json; charset=utf-8' -i http://localhost:8088/comment/?id=880 --data '{
  "id": 19,
  "createTime": "2022-04-25 21:13:52",
  "content": "l7kjox",
  "username": "roscoe.tromp",
  "avatar": "dkxhcd",
  "site": "8dtit0",
  "email": "asa.sipes@hotmail.com"
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
  "status": 287,
  "msg": "drs6nc",
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
curl -X DELETE -i http://localhost:8088/comment/?id=811 --data '811'
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
  "status": 119,
  "msg": "tkf5gi",
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
  "status": 680,
  "msg": "e4utx0",
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
  "status": 247,
  "msg": "4s0o65",
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
  "status": 578,
  "msg": "34iz68",
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
  "status": 717,
  "msg": "m9yyr0",
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
  "status": 639,
  "msg": "kmwmd8",
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
curl -X GET -i http://localhost:8088/tag/article/id?id=750&page=1&size=5 --data '"5"'
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
  "status": 572,
  "msg": "urvj1m",
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
curl -X GET -i http://localhost:8088/tag/article/name?name=roscoe.tromp&page=1&size=5 --data '"5"'
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
  "status": 64,
  "msg": "ce9t2p",
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
curl -X GET -i http://localhost:8088/tag/id?id=725 --data '725'
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
  "status": 848,
  "msg": "2z192t",
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
curl -X GET -i http://localhost:8088/tag/name?name=roscoe.tromp --data 'roscoe.tromp'
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
  "status": 858,
  "msg": "xkqdc2",
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
curl -X POST -H 'Content-Type: application/json; charset=utf-8' -i http://localhost:8088/tag/ --data 'roscoe.tromp'
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
  "status": 79,
  "msg": "br0ihe",
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
curl -X DELETE -i http://localhost:8088/tag/?id=745 --data '745'
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
  "msg": "cdf38g",
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
  "status": 35,
  "msg": "h0d8gl",
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
  "status": 952,
  "msg": "3k0wle",
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
curl -X GET -i http://localhost:8088/idea/848
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
  "status": 655,
  "msg": "iga783",
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
  "id": 839,
  "createTime": "2022-04-25 21:13:52",
  "modifyTime": "2022-04-25 21:13:52",
  "title": "f316g4",
  "content": "zpqm82"
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
  "status": 551,
  "msg": "devru1",
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
curl -X PUT -H 'Content-Type: application/json; charset=utf-8' -i http://localhost:8088/idea/?id=547 --data '{
  "id": 455,
  "createTime": "2022-04-25 21:13:52",
  "modifyTime": "2022-04-25 21:13:52",
  "title": "rn2lv8",
  "content": "pzl9ti"
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
  "status": 615,
  "msg": "nl87b6",
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
curl -X DELETE -i http://localhost:8088/idea/27
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
  "msg": "s4l8zi",
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
  "id": 876,
  "username": "roscoe.tromp",
  "password": "vq8uej",
  "token": "gkv31a",
  "avatar": "1wlkid",
  "age": 56,
  "gender": 0,
  "location": "adqdcj",
  "signature": "bxefiu",
  "profile": "3st4t2"
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
  "status": 189,
  "msg": "a9oohr",
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
curl -X GET -i http://localhost:8088/user/user?id=472 --data '472'
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
  "status": 460,
  "msg": "t18pwk",
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
curl -X GET -i http://localhost:8088/user/name?username=roscoe.tromp --data 'roscoe.tromp'
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
  "status": 769,
  "msg": "mayoaj",
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
curl -X PUT -H 'Content-Type: application/json; charset=utf-8' -i http://localhost:8088/user/password?id=921 --data '{
  "id": 886,
  "username": "roscoe.tromp",
  "password": "t23q1u",
  "token": "q3peh4",
  "avatar": "xg8qsw",
  "age": 56,
  "gender": 0,
  "location": "5luge4",
  "signature": "6plx1k",
  "profile": "vtchji"
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
  "status": 530,
  "msg": "xypc0g",
  "data": {}
}
```


