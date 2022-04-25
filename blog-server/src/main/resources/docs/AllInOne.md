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
  "status": 103,
  "msg": "t0q5z2",
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
  "status": 222,
  "msg": "0s8hzp",
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
  "status": 376,
  "msg": "n0oazu",
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
  "status": 384,
  "msg": "zvd6aq",
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
curl -X GET -i http://localhost:8088/article/detail/id?id=410 --data '410'
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
  "status": 742,
  "msg": "ccvxj7",
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
curl -X GET -i http://localhost:8088/article/summary/id?id=20 --data '20'
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
  "status": 716,
  "msg": "tcm917",
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
  "title": "gm4xyc",
  "summary": "3iu95j",
  "image": "45p9ro",
  "content": "0k4tp1",
  "category": "dp4hcd",
  "tags": [
    "19i6oq"
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
  "status": 920,
  "msg": "6wn3s5",
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
curl -X PUT -H 'Content-Type: application/json; charset=utf-8' -i http://localhost:8088/article/?id=818 --data '{
  "title": "2dt3bs",
  "summary": "6xwfvc",
  "image": "2zh9h7",
  "content": "cff6gu",
  "category": "41kola",
  "tags": [
    "kmazyw"
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
  "status": 676,
  "msg": "c0uro9",
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
curl -X DELETE -i http://localhost:8088/article/527
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
  "status": 307,
  "msg": "5uw5eg",
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
  "status": 995,
  "msg": "30yceb",
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
  "status": 924,
  "msg": "p647gj",
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
curl -X GET -i http://localhost:8088/category/article/id?id=786&page=1&size=7 --data '"7"'
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
  "msg": "yiyw2g",
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
  "status": 434,
  "msg": "t5jak2",
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
curl -X GET -i http://localhost:8088/category/id?id=449 --data '449'
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
  "status": 171,
  "msg": "1u69w2",
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
  "status": 756,
  "msg": "kq5712",
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
curl -X POST -H 'Content-Type: application/json; charset=utf-8' -i http://localhost:8088/category/ --data 'ebixrn'
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
  "msg": "k2euf2",
  "data": {}
}
```

### 更新分类
**URL:** http://localhost:8088/category/

**Type:** PUT


**Content-Type:** application/json; charset=utf-8

**Description:** 更新分类

**Query-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
id|int64|No comments found.|true|-

**Body-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
category|string|category|false|-

**Request-example:**
```
curl -X PUT -H 'Content-Type: application/json; charset=utf-8' -i http://localhost:8088/category/?id=257 --data 'ephju7'
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
  "status": 236,
  "msg": "teu8q2",
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
curl -X DELETE -i http://localhost:8088/category/?id=535 --data '535'
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
  "status": 960,
  "msg": "qs27p7",
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
  "status": 452,
  "msg": "8gk8s2",
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
  "status": 268,
  "msg": "cjjaew",
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
curl -X GET -i http://localhost:8088/comment/938
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
  "status": 698,
  "msg": "nx3w2s",
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
  "id": 571,
  "createTime": "2022-04-25 15:24:46",
  "content": "58pb6a",
  "username": "tora.aufderhar",
  "avatar": "93r9y9",
  "site": "ek5kn5",
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
  "status": 729,
  "msg": "lucang",
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
curl -X PUT -H 'Content-Type: application/json; charset=utf-8' -i http://localhost:8088/comment/?id=346 --data '{
  "id": 967,
  "createTime": "2022-04-25 15:24:46",
  "content": "4307rt",
  "username": "tora.aufderhar",
  "avatar": "zktwff",
  "site": "0vidrf",
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
  "status": 889,
  "msg": "jneb16",
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
curl -X DELETE -i http://localhost:8088/comment/?id=339 --data '339'
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
  "status": 352,
  "msg": "4utk55",
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
  "status": 899,
  "msg": "jgqoxm",
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
  "status": 706,
  "msg": "dpf3e6",
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
  "status": 845,
  "msg": "24uw6m",
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
  "password": "z079wf"
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
  "status": 509,
  "msg": "ncfhi8",
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
curl -X GET -i http://localhost:8088/admin/check?username=tora.aufderhar&tokenValue=ag4765 --data 'ag4765'
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
  "msg": "aqx6hs",
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
curl -X POST -i http://localhost:8088/admin/logout --data 'tokenValue=uh4alq'
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
  "status": 290,
  "msg": "sa7dgo",
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
  "password": "gfhtzd",
  "passwordRepeat": "1gf19z"
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
  "status": 608,
  "msg": "itymrv",
  "data": {}
}
```

## 权限接口
## 角色接口
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
  "status": 102,
  "msg": "m428w9",
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
  "status": 307,
  "msg": "feq3xl",
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
curl -X GET -i http://localhost:8088/tag/article/id?id=569&page=1&size=5 --data '"5"'
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
  "status": 326,
  "msg": "asp6vr",
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
  "status": 625,
  "msg": "af6qtv",
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
curl -X GET -i http://localhost:8088/tag/id?id=387 --data '387'
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
  "status": 921,
  "msg": "h01bax",
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
  "status": 672,
  "msg": "vx9lbg",
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
  "status": 102,
  "msg": "con5qa",
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
curl -X DELETE -i http://localhost:8088/tag/?id=176 --data '176'
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
  "status": 933,
  "msg": "fm314g",
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
  "status": 499,
  "msg": "06doz4",
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
  "status": 275,
  "msg": "g4txi8",
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
curl -X GET -i http://localhost:8088/idea/772
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
  "status": 932,
  "msg": "s4dhj5",
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
  "id": 516,
  "createTime": "2022-04-25 15:24:46",
  "modifyTime": "2022-04-25 15:24:46",
  "title": "m6w00i",
  "content": "8fhut7"
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
  "status": 618,
  "msg": "2s5l65",
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
curl -X PUT -H 'Content-Type: application/json; charset=utf-8' -i http://localhost:8088/idea/?id=222 --data '{
  "id": 433,
  "createTime": "2022-04-25 15:24:46",
  "modifyTime": "2022-04-25 15:24:46",
  "title": "pruhu0",
  "content": "7qz2vi"
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
  "status": 625,
  "msg": "6gmdis",
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
curl -X DELETE -i http://localhost:8088/idea/586
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
  "status": 117,
  "msg": "an1shc",
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
  "id": 668,
  "username": "tora.aufderhar",
  "password": "ocxkk2",
  "token": "7r0oah",
  "avatar": "u16oqh",
  "age": 58,
  "gender": 1,
  "location": "ciexpl",
  "signature": "s5porv",
  "profile": "5wocal"
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
  "status": 782,
  "msg": "fstrij",
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
curl -X GET -i http://localhost:8088/user/user?id=867 --data '867'
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
  "status": 667,
  "msg": "0pzkp8",
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
  "status": 983,
  "msg": "6fd43i",
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
curl -X PUT -H 'Content-Type: application/json; charset=utf-8' -i http://localhost:8088/user/password?id=963 --data '{
  "id": 551,
  "username": "tora.aufderhar",
  "password": "jszzjw",
  "token": "1cmgpk",
  "avatar": "73v9qx",
  "age": 58,
  "gender": 1,
  "location": "7lbcx3",
  "signature": "dbqwni",
  "profile": "c2lq5b"
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
  "status": 999,
  "msg": "f9rs6i",
  "data": {}
}
```


