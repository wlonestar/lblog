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
  "status": 634,
  "msg": "oq8yxw",
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
  "status": 262,
  "msg": "ly3yn8",
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
  "status": 250,
  "msg": "6ucdoq",
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
  "status": 616,
  "msg": "9oguib",
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
curl -X GET -i http://localhost:8088/article/detail/id?id=119 --data '119'
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
  "status": 889,
  "msg": "5il8e8",
  "data": {}
}
```

### 根据标题查询文章详情
**URL:** http://localhost:8088/article/detail/title

**Type:** GET


**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 根据标题查询文章详情

**Query-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
title|string|title|true|-

**Request-example:**
```
curl -X GET -i http://localhost:8088/article/detail/title?title=9eqd0b --data '9eqd0b'
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
  "status": 782,
  "msg": "zkh3ys",
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
curl -X GET -i http://localhost:8088/article/summary?id=415 --data '415'
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
  "status": 443,
  "msg": "4f44ls",
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
  "title": "3qxtdy",
  "summary": "c6vtvw",
  "image": "x44eei",
  "content": "xkrs00",
  "category": "93npme",
  "tags": [
    "wm7iap"
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
  "status": 950,
  "msg": "duw88w",
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
curl -X PUT -H 'Content-Type: application/json; charset=utf-8' -i http://localhost:8088/article/?id=885 --data '{
  "title": "75wlv2",
  "summary": "k7wamw",
  "image": "2u7s5h",
  "content": "s6n9dl",
  "category": "4pxwmo",
  "tags": [
    "vfkcti"
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
  "status": 697,
  "msg": "usx96w",
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
curl -X DELETE -i http://localhost:8088/article/315
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
  "status": 628,
  "msg": "imfhpr",
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
  "password": "3b2ie8"
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
  "status": 109,
  "msg": "1i947y",
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
  "password": "5u4s43"
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
  "status": 589,
  "msg": "fuzuyg",
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
curl -X GET -H 'satoken' -i http://localhost:8088/auth/check?uid=158 --data '158'
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
  "status": 718,
  "msg": "p9v3tk",
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
  "status": 365,
  "msg": "216yvv",
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
  "status": 562,
  "msg": "n7g3iy",
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
  "status": 493,
  "msg": "7vycdo",
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
curl -X GET -i http://localhost:8088/category/article/id?id=53&page=1&size=7 --data '"7"'
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
  "status": 205,
  "msg": "l2php1",
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
  "status": 780,
  "msg": "jmblr3",
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
curl -X GET -i http://localhost:8088/category/id?id=94 --data '94'
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
  "status": 413,
  "msg": "nhr022",
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
  "status": 537,
  "msg": "nqg0j8",
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
curl -X POST -H 'Content-Type: application/json; charset=utf-8' -i http://localhost:8088/category/ --data 'cyie7w'
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
  "status": 666,
  "msg": "x23z7y",
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
curl -X DELETE -i http://localhost:8088/category/216
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
  "msg": "dhwyi0",
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
  "status": 695,
  "msg": "d90854",
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
  "status": 174,
  "msg": "d7cgt5",
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
curl -X GET -i http://localhost:8088/comment/?id=742 --data '742'
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
  "status": 127,
  "msg": "w2x3fk",
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
  "content": "2jzbk0",
  "username": "rhett.schneider",
  "avatar": "3qj16l",
  "site": "5exsno",
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
  "status": 896,
  "msg": "ke4g1z",
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
curl -X DELETE -i http://localhost:8088/comment/486
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
  "status": 173,
  "msg": "qjcc7u",
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
  "status": 8,
  "msg": "k1h6su",
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
  "status": 595,
  "msg": "1q0w3h",
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
  "status": 498,
  "msg": "s7tsxp",
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
  "status": 174,
  "msg": "43418i",
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
  "status": 431,
  "msg": "zpyyoh",
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
curl -X GET -i http://localhost:8088/tag/article/id?id=823&page=1&size=5 --data '"5"'
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
  "status": 466,
  "msg": "41ssxx",
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
  "status": 824,
  "msg": "phx7ff",
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
curl -X GET -i http://localhost:8088/tag/id?id=898 --data '898'
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
  "status": 672,
  "msg": "b5z5uy",
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
  "status": 843,
  "msg": "s9yir6",
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
  "status": 767,
  "msg": "u6budw",
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
curl -X DELETE -i http://localhost:8088/tag/912
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
  "status": 860,
  "msg": "hrne24",
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
  "status": 568,
  "msg": "1x6f86",
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
  "status": 695,
  "msg": "kmuzzf",
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
curl -X GET -i http://localhost:8088/idea/?id=594 --data '594'
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
  "status": 908,
  "msg": "ss5izj",
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
  "title": "luv53d",
  "content": "9sbdar"
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
  "status": 354,
  "msg": "gb8sp8",
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
curl -X PUT -H 'Content-Type: application/json; charset=utf-8' -i http://localhost:8088/idea/?id=141 --data '{
  "title": "0d835j",
  "content": "wouozp"
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
  "status": 573,
  "msg": "ph4fvn",
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
curl -X DELETE -i http://localhost:8088/idea/319
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
  "status": 123,
  "msg": "f09bij",
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
curl -X GET -i http://localhost:8088/user/user?id=886 --data '886'
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
  "msg": "nkd0qb",
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
  "password": "wn50qd",
  "avatar": "6iqqk1",
  "age": 61,
  "gender": 1,
  "location": "x8mznf",
  "signature": "37uyaf",
  "profile": "1vukp0"
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
  "status": 645,
  "msg": "gjxb2o",
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
curl -X PUT -H 'Content-Type: application/json; charset=utf-8' -i http://localhost:8088/user/?id=509 --data '{
  "username": "rhett.schneider",
  "password": "4xggq7",
  "avatar": "5p1ylu",
  "age": 61,
  "gender": 1,
  "location": "xziedz",
  "signature": "yexgdu",
  "profile": "p040lv"
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
  "status": 775,
  "msg": "xyrwsb",
  "data": {}
}
```


