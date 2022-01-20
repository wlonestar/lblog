# lblog
Version |  Update Time  | Status | Author |  Description
---|---|---|---|---
v2022-01-20 23:05:08|2022-01-20 23:05:08|auto|@wjl|Created by smart-doc



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
curl -X GET -i http://localhost:8088/article/page/detail?size=5&page=1
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
pages|int64|当前分页总页数|-
records|array|分页记录列表|-
└─id|int64|No comments found.|-
└─createTime|string|No comments found.|-
└─updateTime|string|No comments found.|-
└─title|string|No comments found.|-
└─summary|string|No comments found.|-
└─cover|string|No comments found.|-
└─content|string|No comments found.|-
└─categoryId|int64|No comments found.|-
└─category|string|No comments found.|-
total|int64|当前满足条件总行数|-
size|int64|获取每页显示条数|-
current|int64|当前页|-

**Response-example:**
```
{
  "pages": 108,
  "records": [
    {
      "id": 784,
      "createTime": "2022-01-20 23:05:09",
      "updateTime": "2022-01-20 23:05:09",
      "title": "rfeacf",
      "summary": "7aafsg",
      "cover": "81vjkp",
      "content": "0mj6yx",
      "categoryId": 299,
      "category": "871xdh"
    }
  ],
  "total": 638,
  "size": 171,
  "current": 329
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
curl -X GET -i http://localhost:8088/article/page/summary?page=1&size=5
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
pages|int64|当前分页总页数|-
records|array|分页记录列表|-
└─id|int64|No comments found.|-
└─createTime|string|No comments found.|-
└─updateTime|string|No comments found.|-
└─title|string|No comments found.|-
└─summary|string|No comments found.|-
└─cover|string|No comments found.|-
└─categoryId|int64|No comments found.|-
└─category|string|No comments found.|-
total|int64|当前满足条件总行数|-
size|int64|获取每页显示条数|-
current|int64|当前页|-

**Response-example:**
```
{
  "pages": 71,
  "records": [
    {
      "id": 991,
      "createTime": "2022-01-20 23:05:09",
      "updateTime": "2022-01-20 23:05:09",
      "title": "g1hwnx",
      "summary": "jrdbbw",
      "cover": "gt7tsl",
      "categoryId": 196,
      "category": "ywk1l5"
    }
  ],
  "total": 493,
  "size": 711,
  "current": 686
}
```

### 分页查询文章标题
**URL:** http://localhost:8088/article/page/title

**Type:** GET


**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 分页查询文章标题

**Query-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
page|int32|page|true|-
size|int32|size|true|-

**Request-example:**
```
curl -X GET -i http://localhost:8088/article/page/title?page=1&size=5
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
pages|int64|当前分页总页数|-
records|array|分页记录列表|-
└─id|int64|No comments found.|-
└─createTime|string|No comments found.|-
└─title|string|No comments found.|-
total|int64|当前满足条件总行数|-
size|int64|获取每页显示条数|-
current|int64|当前页|-

**Response-example:**
```
{
  "pages": 907,
  "records": [
    {
      "id": 953,
      "createTime": "2022-01-20 23:05:09",
      "title": "y9r37w"
    }
  ],
  "total": 527,
  "size": 755,
  "current": 112
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
id|int64|No comments found.|-
createTime|string|No comments found.|-
updateTime|string|No comments found.|-
title|string|No comments found.|-
summary|string|No comments found.|-
cover|string|No comments found.|-
content|string|No comments found.|-
categoryId|int64|No comments found.|-
category|string|No comments found.|-

**Response-example:**
```
[
  {
    "id": 434,
    "createTime": "2022-01-20 23:05:09",
    "updateTime": "2022-01-20 23:05:09",
    "title": "uvlu5o",
    "summary": "dtskhm",
    "cover": "muw8l9",
    "content": "il2915",
    "categoryId": 698,
    "category": "2kjfq0"
  }
]
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
id|int64|No comments found.|-
createTime|string|No comments found.|-
updateTime|string|No comments found.|-
title|string|No comments found.|-
summary|string|No comments found.|-
cover|string|No comments found.|-
categoryId|int64|No comments found.|-
category|string|No comments found.|-

**Response-example:**
```
[
  {
    "id": 626,
    "createTime": "2022-01-20 23:05:09",
    "updateTime": "2022-01-20 23:05:09",
    "title": "qtwbsb",
    "summary": "01hx0w",
    "cover": "df9gin",
    "categoryId": 886,
    "category": "btyk2p"
  }
]
```

### 查询所有文章标题
**URL:** http://localhost:8088/article/all/title

**Type:** GET


**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 查询所有文章标题

**Request-example:**
```
curl -X GET -i http://localhost:8088/article/all/title
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
id|int64|No comments found.|-
createTime|string|No comments found.|-
title|string|No comments found.|-

**Response-example:**
```
[
  {
    "id": 164,
    "createTime": "2022-01-20 23:05:09",
    "title": "npf0re"
  }
]
```

### 根据 id 查询文章
**URL:** http://localhost:8088/article/detail/id

**Type:** GET


**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 根据 id 查询文章

**Query-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
id|int64|id|true|-

**Request-example:**
```
curl -X GET -i http://localhost:8088/article/detail/id?id=555
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
any object|object|any object.|-

**Response-example:**
```
{}
```

### 根据 id 查询文章
**URL:** http://localhost:8088/article/summary/id

**Type:** GET


**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 根据 id 查询文章

**Query-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
id|int64|id|true|-

**Request-example:**
```
curl -X GET -i http://localhost:8088/article/summary/id?id=951
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
any object|object|any object.|-

**Response-example:**
```
{}
```

### 根据 id 查询文章
**URL:** http://localhost:8088/article/title/id

**Type:** GET


**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 根据 id 查询文章

**Query-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
id|int64|id|true|-

**Request-example:**
```
curl -X GET -i http://localhost:8088/article/title/id?id=484
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
any object|object|any object.|-

**Response-example:**
```
{}
```

### 根据标题查询文章
**URL:** http://localhost:8088/article/detail/title

**Type:** GET


**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 根据标题查询文章

**Query-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
title|string|title|true|-

**Request-example:**
```
curl -X GET -i http://localhost:8088/article/detail/title?title=0os7as
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
any object|object|any object.|-

**Response-example:**
```
{}
```

### 根据标题查询文章
**URL:** http://localhost:8088/article/summary/title

**Type:** GET


**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 根据标题查询文章

**Query-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
title|string|title|true|-

**Request-example:**
```
curl -X GET -i http://localhost:8088/article/summary/title?title=2vwvxy
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
any object|object|any object.|-

**Response-example:**
```
{}
```

### 根据标题查询文章
**URL:** http://localhost:8088/article/title/title

**Type:** GET


**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 根据标题查询文章

**Query-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
title|string|title|true|-

**Request-example:**
```
curl -X GET -i http://localhost:8088/article/title/title?title=l2mu0z
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
any object|object|any object.|-

**Response-example:**
```
{}
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
cover|string|No comments found.|false|-
content|string|No comments found.|false|-
category|string|No comments found.|false|-

**Request-example:**
```
curl -X POST -H 'Content-Type: application/json; charset=utf-8' -i http://localhost:8088/article/ --data '{
  "title": "8tlyw3",
  "summary": "owz943",
  "cover": "rzqpyw",
  "content": "6sw62v",
  "category": "zr2wx9"
}'
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
any object|object|any object.|-

**Response-example:**
```
{}
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
cover|string|No comments found.|false|-
content|string|No comments found.|false|-
category|string|No comments found.|false|-

**Request-example:**
```
curl -X PUT -H 'Content-Type: application/json; charset=utf-8' -i http://localhost:8088/article/?id=666 --data '{
  "title": "f31of0",
  "summary": "gy9p2r",
  "cover": "qdnvov",
  "content": "0bq3jl",
  "category": "5bregs"
}'
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
any object|object|any object.|-

**Response-example:**
```
{}
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
curl -X DELETE -i http://localhost:8088/article/641
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
any object|object|any object.|-

**Response-example:**
```
{}
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
curl -X GET -i http://localhost:8088/category/page?page=1&size=5
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
pages|int64|当前分页总页数|-
records|array|分页记录列表|-
└─id|int64|No comments found.|-
└─createTime|string|创建时间|-
└─updateTime|string|更新时间|-
└─name|string|分类名称|-
└─description|string|分类说明|-
└─number|int32|分类下文章数量|-
total|int64|当前满足条件总行数|-
size|int64|获取每页显示条数|-
current|int64|当前页|-

**Response-example:**
```
{
  "pages": 377,
  "records": [
    {
      "id": 6,
      "createTime": "2022-01-20 23:05:10",
      "updateTime": "2022-01-20 23:05:10",
      "name": "luella.gerhold",
      "description": "zomx1w",
      "number": 606
    }
  ],
  "total": 737,
  "size": 764,
  "current": 445
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
id|int64|No comments found.|-
createTime|string|创建时间|-
updateTime|string|更新时间|-
name|string|分类名称|-
description|string|分类说明|-
number|int32|分类下文章数量|-

**Response-example:**
```
[
  {
    "id": 521,
    "createTime": "2022-01-20 23:05:10",
    "updateTime": "2022-01-20 23:05:10",
    "name": "luella.gerhold",
    "description": "fnd0i9",
    "number": 258
  }
]
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
curl -X GET -i http://localhost:8088/category/article/id?page=1&size=7&id=448
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
any object|object|any object.|-

**Response-example:**
```
{}
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
curl -X GET -i http://localhost:8088/category/article/name?name=luella.gerhold&size=7&page=1
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
any object|object|any object.|-

**Response-example:**
```
{}
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
curl -X GET -i http://localhost:8088/category/id?id=909
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
any object|object|any object.|-

**Response-example:**
```
{}
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
curl -X GET -i http://localhost:8088/category/name?name=luella.gerhold
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
any object|object|any object.|-

**Response-example:**
```
{}
```

### 增加分类
**URL:** http://localhost:8088/category/

**Type:** POST


**Content-Type:** application/json; charset=utf-8

**Description:** 增加分类

**Body-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
name|string|No comments found.|false|-
description|string|No comments found.|false|-
number|int32|No comments found.|false|-

**Request-example:**
```
curl -X POST -H 'Content-Type: application/json; charset=utf-8' -i http://localhost:8088/category/ --data '{
  "name": "luella.gerhold",
  "description": "vysl70",
  "number": 924
}'
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
any object|object|any object.|-

**Response-example:**
```
{}
```

### 根据 id 更新分类
**URL:** http://localhost:8088/category/

**Type:** PUT


**Content-Type:** application/json; charset=utf-8

**Description:** 根据 id 更新分类

**Query-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
id|int64|id|true|-

**Body-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
name|string|No comments found.|false|-
description|string|No comments found.|false|-
number|int32|No comments found.|false|-

**Request-example:**
```
curl -X PUT -H 'Content-Type: application/json; charset=utf-8' -i http://localhost:8088/category/?id=587 --data '{
  "name": "luella.gerhold",
  "description": "aymgp3",
  "number": 793
}'
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
any object|object|any object.|-

**Response-example:**
```
{}
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
curl -X DELETE -i http://localhost:8088/category/?id=865
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
any object|object|any object.|-

**Response-example:**
```
{}
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
curl -X GET -i http://localhost:8088/comment/page?size=5&page=1
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
totalPages|int32|Returns the number of total pages.|-
totalElements|int64|Returns the total amount of elements.|-
number|int32|Returns the number of the current {@link Slice}. Is always non-negative.|-
size|int32|Returns the size of the {@link Slice}.|-
numberOfElements|int32|Returns the number of elements currently on this {@link Slice}.|-
content|array|Returns the page content as {@link List}.|-
└─id|int64|No comments found.|-
└─createTime|string|创建时间|-
└─updateTime|string|更新时间|-
└─content|string|留言正文|-
└─username|string|昵称|-
└─avatar|string|头像|-
└─site|string|个人网站|-
└─email|string|邮箱|-
sort|object|Returns the sorting parameters for the {@link Slice}.|-
└─empty|boolean|Returns whether the current {@link Streamable} is empty.|-
└─orders|array|No comments found.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─direction|enum|null(See: Enumeration for sort directions.)|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─property|string|No comments found.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─ignoreCase|boolean|No comments found.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─nullHandling|enum|null(See: Enumeration for null handling hints that can be used in {@link Order} expressions.)|-
first|boolean|Returns whether the current {@link Slice} is the first one.|-
last|boolean|Returns whether the current {@link Slice} is the last one.|-
pageable|object|Returns the {@link Pageable} that's been used to request the current {@link Slice}.|2.0
└─paged|boolean|Returns whether the current {@link Pageable} contains pagination information.|-
└─unpaged|boolean|Returns whether the current {@link Pageable} does not contain pagination information.|-
└─pageNumber|int32|Returns the page to be returned.|-
└─pageSize|int32|Returns the number of items to be returned.|-
└─offset|int64|Returns the offset to be taken according to the underlying page and page size.|-
└─sort|object|Returns the sorting parameters.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─empty|boolean|Returns whether the current {@link Streamable} is empty.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─orders|array|No comments found.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─direction|enum|null(See: Enumeration for sort directions.)|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─property|string|No comments found.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─ignoreCase|boolean|No comments found.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─nullHandling|enum|null(See: Enumeration for null handling hints that can be used in {@link Order} expressions.)|-
empty|boolean|Returns whether the current {@link Streamable} is empty.|-

**Response-example:**
```
{
  "totalPages": 941,
  "totalElements": 210,
  "number": 43,
  "size": 10,
  "numberOfElements": 638,
  "content": [
    {
      "id": 353,
      "createTime": "2022-01-20 23:05:10",
      "updateTime": "2022-01-20 23:05:10",
      "content": "nas7d2",
      "username": "luella.gerhold",
      "avatar": "me8yv1",
      "site": "oenux9",
      "email": "lloyd.jacobi@gmail.com"
    }
  ],
  "sort": {
    "empty": true,
    "orders": [
      {
        "direction": "ASC",
        "property": "b3t23q",
        "ignoreCase": true,
        "nullHandling": "NATIVE"
      }
    ]
  },
  "first": true,
  "last": true,
  "pageable": {
    "paged": true,
    "unpaged": true,
    "pageNumber": 30,
    "pageSize": 10,
    "offset": 1,
    "sort": {
      "empty": true,
      "orders": [
        {
          "direction": "ASC",
          "property": "or2ki1",
          "ignoreCase": true,
          "nullHandling": "NATIVE"
        }
      ]
    }
  },
  "empty": true
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
id|int64|No comments found.|-
createTime|string|创建时间|-
updateTime|string|更新时间|-
content|string|留言正文|-
username|string|昵称|-
avatar|string|头像|-
site|string|个人网站|-
email|string|邮箱|-

**Response-example:**
```
[
  {
    "id": 54,
    "createTime": "2022-01-20 23:05:10",
    "updateTime": "2022-01-20 23:05:10",
    "content": "hobiqi",
    "username": "luella.gerhold",
    "avatar": "1y070u",
    "site": "z4dppl",
    "email": "lloyd.jacobi@gmail.com"
  }
]
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
curl -X GET -i http://localhost:8088/comment/17
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
id|int64|No comments found.|-
createTime|string|创建时间|-
updateTime|string|更新时间|-
content|string|留言正文|-
username|string|昵称|-
avatar|string|头像|-
site|string|个人网站|-
email|string|邮箱|-

**Response-example:**
```
{
  "id": 879,
  "createTime": "2022-01-20 23:05:10",
  "updateTime": "2022-01-20 23:05:10",
  "content": "nv01sy",
  "username": "luella.gerhold",
  "avatar": "5y6dod",
  "site": "eqe3sz",
  "email": "lloyd.jacobi@gmail.com"
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
createTime|string|创建时间|false|-
updateTime|string|更新时间|false|-
content|string|留言正文|false|-
username|string|昵称|false|-
avatar|string|头像|false|-
site|string|个人网站|false|-
email|string|邮箱|false|-

**Request-example:**
```
curl -X POST -H 'Content-Type: application/json; charset=utf-8' -i http://localhost:8088/comment/ --data '{
  "id": 751,
  "createTime": "2022-01-20 23:05:10",
  "updateTime": "2022-01-20 23:05:10",
  "content": "mshhcb",
  "username": "luella.gerhold",
  "avatar": "1cd289",
  "site": "xmmtk2",
  "email": "lloyd.jacobi@gmail.com"
}'
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
id|int64|No comments found.|-
createTime|string|创建时间|-
updateTime|string|更新时间|-
content|string|留言正文|-
username|string|昵称|-
avatar|string|头像|-
site|string|个人网站|-
email|string|邮箱|-

**Response-example:**
```
{
  "id": 259,
  "createTime": "2022-01-20 23:05:10",
  "updateTime": "2022-01-20 23:05:10",
  "content": "yw59ub",
  "username": "luella.gerhold",
  "avatar": "xzbb27",
  "site": "8au4y7",
  "email": "lloyd.jacobi@gmail.com"
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
createTime|string|创建时间|false|-
updateTime|string|更新时间|false|-
content|string|留言正文|false|-
username|string|昵称|false|-
avatar|string|头像|false|-
site|string|个人网站|false|-
email|string|邮箱|false|-

**Request-example:**
```
curl -X PUT -H 'Content-Type: application/json; charset=utf-8' -i http://localhost:8088/comment/?id=372 --data '{
  "id": 835,
  "createTime": "2022-01-20 23:05:10",
  "updateTime": "2022-01-20 23:05:10",
  "content": "ca50ye",
  "username": "luella.gerhold",
  "avatar": "z5xu73",
  "site": "j504w7",
  "email": "lloyd.jacobi@gmail.com"
}'
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
id|int64|No comments found.|-
createTime|string|创建时间|-
updateTime|string|更新时间|-
content|string|留言正文|-
username|string|昵称|-
avatar|string|头像|-
site|string|个人网站|-
email|string|邮箱|-

**Response-example:**
```
{
  "id": 921,
  "createTime": "2022-01-20 23:05:10",
  "updateTime": "2022-01-20 23:05:10",
  "content": "8mooyu",
  "username": "luella.gerhold",
  "avatar": "c05bc9",
  "site": "p2iroe",
  "email": "lloyd.jacobi@gmail.com"
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
curl -X DELETE -i http://localhost:8088/comment/?id=930
```

**Response-example:**
```
955
```

### 删除所有留言
**URL:** http://localhost:8088/comment/delete

**Type:** DELETE


**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 删除所有留言

**Request-example:**
```
curl -X DELETE -i http://localhost:8088/comment/delete
```

**Response-example:**
```
Return void.
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
id|int64|No comments found.|-
createTime|string|上传时间|-
name|string|名称|-
url|string|路径|-

**Response-example:**
```
[
  {
    "id": 71,
    "createTime": "2022-01-20 23:05:10",
    "name": "luella.gerhold",
    "url": "www.david-bogan.us"
  }
]
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
curl -X GET -i http://localhost:8088/files/page?size=10&page=1
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
totalPages|int32|Returns the number of total pages.|-
totalElements|int64|Returns the total amount of elements.|-
number|int32|Returns the number of the current {@link Slice}. Is always non-negative.|-
size|int32|Returns the size of the {@link Slice}.|-
numberOfElements|int32|Returns the number of elements currently on this {@link Slice}.|-
content|array|Returns the page content as {@link List}.|-
└─id|int64|No comments found.|-
└─createTime|string|上传时间|-
└─name|string|名称|-
└─url|string|路径|-
sort|object|Returns the sorting parameters for the {@link Slice}.|-
└─empty|boolean|Returns whether the current {@link Streamable} is empty.|-
└─orders|array|No comments found.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─direction|enum|null(See: Enumeration for sort directions.)|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─property|string|No comments found.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─ignoreCase|boolean|No comments found.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─nullHandling|enum|null(See: Enumeration for null handling hints that can be used in {@link Order} expressions.)|-
first|boolean|Returns whether the current {@link Slice} is the first one.|-
last|boolean|Returns whether the current {@link Slice} is the last one.|-
pageable|object|Returns the {@link Pageable} that's been used to request the current {@link Slice}.|2.0
└─paged|boolean|Returns whether the current {@link Pageable} contains pagination information.|-
└─unpaged|boolean|Returns whether the current {@link Pageable} does not contain pagination information.|-
└─pageNumber|int32|Returns the page to be returned.|-
└─pageSize|int32|Returns the number of items to be returned.|-
└─offset|int64|Returns the offset to be taken according to the underlying page and page size.|-
└─sort|object|Returns the sorting parameters.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─empty|boolean|Returns whether the current {@link Streamable} is empty.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─orders|array|No comments found.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─direction|enum|null(See: Enumeration for sort directions.)|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─property|string|No comments found.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─ignoreCase|boolean|No comments found.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─nullHandling|enum|null(See: Enumeration for null handling hints that can be used in {@link Order} expressions.)|-
empty|boolean|Returns whether the current {@link Streamable} is empty.|-

**Response-example:**
```
{
  "totalPages": 719,
  "totalElements": 574,
  "number": 14,
  "size": 10,
  "numberOfElements": 387,
  "content": [
    {
      "id": 715,
      "createTime": "2022-01-20 23:05:10",
      "name": "luella.gerhold",
      "url": "www.david-bogan.us"
    }
  ],
  "sort": {
    "empty": true,
    "orders": [
      {
        "direction": "ASC",
        "property": "b0rq5n",
        "ignoreCase": true,
        "nullHandling": "NATIVE"
      }
    ]
  },
  "first": true,
  "last": true,
  "pageable": {
    "paged": true,
    "unpaged": true,
    "pageNumber": 411,
    "pageSize": 10,
    "offset": 1,
    "sort": {
      "empty": true,
      "orders": [
        {
          "direction": "ASC",
          "property": "ojv4kf",
          "ignoreCase": true,
          "nullHandling": "NATIVE"
        }
      ]
    }
  },
  "empty": true
}
```

### 图片上传
**URL:** http://localhost:8088/files/upload

**Type:** POST


**Content-Type:** multipart/form-data

**Description:** 图片上传

**Query-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
file|file|file|true|-

**Request-example:**
```
curl -X POST -H 'Content-Type: multipart/form-data' -i http://localhost:8088/files/upload
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
any object|object|any object.|-

**Response-example:**
```
{}
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
  "username": "luella.gerhold",
  "password": "2q3p58"
}'
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
any object|object|any object.|-

**Response-example:**
```
{}
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
curl -X GET -i http://localhost:8088/admin/check?username=luella.gerhold&tokenValue=5bhxmm
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
any object|object|any object.|-

**Response-example:**
```
{}
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
curl -X POST -i http://localhost:8088/admin/logout --data 'tokenValue=dh3449'
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
status|int32|No comments found.|-
msg|string|No comments found.|-
data|object|No comments found.|-
└─id|int64|No comments found.|-
└─username|string|用户名|-
└─password|string|密码|-
└─token|string|token|-
└─avatar|string|头像|-
└─age|int32|年龄|-
└─gender|boolean|性别|-
└─location|string|地址|-
└─signature|string|个性签名|-
└─profile|string|简介|-

**Response-example:**
```
{
  "status": 620,
  "msg": "n5icib",
  "data": {
    "id": 531,
    "username": "luella.gerhold",
    "password": "v716nb",
    "token": "i8sndf",
    "avatar": "7rh9v5",
    "age": 32,
    "gender": true,
    "location": "qqwxre",
    "signature": "olh9ua",
    "profile": "qo04cr"
  }
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
  "username": "luella.gerhold",
  "password": "vv24ng",
  "passwordRepeat": "4jufoj"
}'
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
any object|object|any object.|-

**Response-example:**
```
{}
```

## 权限接口
## 角色接口
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
curl -X GET -i http://localhost:8088/idea/page?size=10&page=1
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
totalPages|int32|Returns the number of total pages.|-
totalElements|int64|Returns the total amount of elements.|-
number|int32|Returns the number of the current {@link Slice}. Is always non-negative.|-
size|int32|Returns the size of the {@link Slice}.|-
numberOfElements|int32|Returns the number of elements currently on this {@link Slice}.|-
content|array|Returns the page content as {@link List}.|-
└─id|int64|No comments found.|-
└─createTime|string|创建时间|-
└─updateTime|string|更新时间|-
└─title|string|标题|-
└─content|string|正文|-
sort|object|Returns the sorting parameters for the {@link Slice}.|-
└─empty|boolean|Returns whether the current {@link Streamable} is empty.|-
└─orders|array|No comments found.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─direction|enum|null(See: Enumeration for sort directions.)|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─property|string|No comments found.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─ignoreCase|boolean|No comments found.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─nullHandling|enum|null(See: Enumeration for null handling hints that can be used in {@link Order} expressions.)|-
first|boolean|Returns whether the current {@link Slice} is the first one.|-
last|boolean|Returns whether the current {@link Slice} is the last one.|-
pageable|object|Returns the {@link Pageable} that's been used to request the current {@link Slice}.|2.0
└─paged|boolean|Returns whether the current {@link Pageable} contains pagination information.|-
└─unpaged|boolean|Returns whether the current {@link Pageable} does not contain pagination information.|-
└─pageNumber|int32|Returns the page to be returned.|-
└─pageSize|int32|Returns the number of items to be returned.|-
└─offset|int64|Returns the offset to be taken according to the underlying page and page size.|-
└─sort|object|Returns the sorting parameters.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─empty|boolean|Returns whether the current {@link Streamable} is empty.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─orders|array|No comments found.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─direction|enum|null(See: Enumeration for sort directions.)|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─property|string|No comments found.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─ignoreCase|boolean|No comments found.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─nullHandling|enum|null(See: Enumeration for null handling hints that can be used in {@link Order} expressions.)|-
empty|boolean|Returns whether the current {@link Streamable} is empty.|-

**Response-example:**
```
{
  "totalPages": 452,
  "totalElements": 603,
  "number": 666,
  "size": 10,
  "numberOfElements": 208,
  "content": [
    {
      "id": 451,
      "createTime": "2022-01-20 23:05:10",
      "updateTime": "2022-01-20 23:05:10",
      "title": "4yqf56",
      "content": "1klkbf"
    }
  ],
  "sort": {
    "empty": true,
    "orders": [
      {
        "direction": "ASC",
        "property": "2yum4g",
        "ignoreCase": true,
        "nullHandling": "NATIVE"
      }
    ]
  },
  "first": true,
  "last": true,
  "pageable": {
    "paged": true,
    "unpaged": true,
    "pageNumber": 44,
    "pageSize": 10,
    "offset": 1,
    "sort": {
      "empty": true,
      "orders": [
        {
          "direction": "ASC",
          "property": "ppfnfu",
          "ignoreCase": true,
          "nullHandling": "NATIVE"
        }
      ]
    }
  },
  "empty": true
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
id|int64|No comments found.|-
createTime|string|创建时间|-
updateTime|string|更新时间|-
title|string|标题|-
content|string|正文|-

**Response-example:**
```
[
  {
    "id": 857,
    "createTime": "2022-01-20 23:05:10",
    "updateTime": "2022-01-20 23:05:10",
    "title": "mqru1i",
    "content": "m7sn91"
  }
]
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
curl -X GET -i http://localhost:8088/idea/911
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
id|int64|No comments found.|-
createTime|string|创建时间|-
updateTime|string|更新时间|-
title|string|标题|-
content|string|正文|-

**Response-example:**
```
{
  "id": 795,
  "createTime": "2022-01-20 23:05:10",
  "updateTime": "2022-01-20 23:05:10",
  "title": "2vd155",
  "content": "h3lr3f"
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
createTime|string|创建时间|false|-
updateTime|string|更新时间|false|-
title|string|标题|false|-
content|string|正文|false|-

**Request-example:**
```
curl -X POST -H 'Content-Type: application/json; charset=utf-8' -i http://localhost:8088/idea/ --data '{
  "id": 783,
  "createTime": "2022-01-20 23:05:10",
  "updateTime": "2022-01-20 23:05:10",
  "title": "3jqdz4",
  "content": "00b0nq"
}'
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
id|int64|No comments found.|-
createTime|string|创建时间|-
updateTime|string|更新时间|-
title|string|标题|-
content|string|正文|-

**Response-example:**
```
{
  "id": 336,
  "createTime": "2022-01-20 23:05:10",
  "updateTime": "2022-01-20 23:05:10",
  "title": "ctv0zb",
  "content": "gt359w"
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
createTime|string|创建时间|false|-
updateTime|string|更新时间|false|-
title|string|标题|false|-
content|string|正文|false|-

**Request-example:**
```
curl -X PUT -H 'Content-Type: application/json; charset=utf-8' -i http://localhost:8088/idea/?id=686 --data '{
  "id": 209,
  "createTime": "2022-01-20 23:05:10",
  "updateTime": "2022-01-20 23:05:10",
  "title": "68xgx8",
  "content": "ein3s7"
}'
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
id|int64|No comments found.|-
createTime|string|创建时间|-
updateTime|string|更新时间|-
title|string|标题|-
content|string|正文|-

**Response-example:**
```
{
  "id": 861,
  "createTime": "2022-01-20 23:05:10",
  "updateTime": "2022-01-20 23:05:10",
  "title": "6107di",
  "content": "8pnqfk"
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
curl -X DELETE -i http://localhost:8088/idea/375
```

**Response-example:**
```
200
```

### 删除所有时间线
**URL:** http://localhost:8088/idea/

**Type:** DELETE


**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 删除所有时间线

**Request-example:**
```
curl -X DELETE -i http://localhost:8088/idea/
```

**Response-example:**
```
Return void.
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
gender|boolean|性别|false|-
location|string|地址|false|-
signature|string|个性签名|false|-
profile|string|简介|false|-

**Request-example:**
```
curl -X POST -H 'Content-Type: application/json; charset=utf-8' -i http://localhost:8088/user/ --data '{
  "id": 279,
  "username": "luella.gerhold",
  "password": "bimdth",
  "token": "f9qvq2",
  "avatar": "iss8mn",
  "age": 32,
  "gender": true,
  "location": "msvbfq",
  "signature": "rp84yw",
  "profile": "nnqnzm"
}'
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
any object|object|any object.|-

**Response-example:**
```
{}
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
curl -X GET -i http://localhost:8088/user/user?id=167
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
id|int64|No comments found.|-
username|string|用户名|-
password|string|密码|-
token|string|token|-
avatar|string|头像|-
age|int32|年龄|-
gender|boolean|性别|-
location|string|地址|-
signature|string|个性签名|-
profile|string|简介|-

**Response-example:**
```
{
  "id": 17,
  "username": "luella.gerhold",
  "password": "oaghs1",
  "token": "jbhdbq",
  "avatar": "4o1s12",
  "age": 32,
  "gender": true,
  "location": "q8irwk",
  "signature": "wlo3zl",
  "profile": "dx50gs"
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
curl -X GET -i http://localhost:8088/user/name?username=luella.gerhold
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
id|int64|No comments found.|-
username|string|用户名|-
password|string|密码|-
token|string|token|-
avatar|string|头像|-
age|int32|年龄|-
gender|boolean|性别|-
location|string|地址|-
signature|string|个性签名|-
profile|string|简介|-

**Response-example:**
```
{
  "id": 233,
  "username": "luella.gerhold",
  "password": "2akfo4",
  "token": "gjfovj",
  "avatar": "l1gkdt",
  "age": 32,
  "gender": true,
  "location": "6p7afi",
  "signature": "dnwcyj",
  "profile": "crdabs"
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
gender|boolean|性别|false|-
location|string|地址|false|-
signature|string|个性签名|false|-
profile|string|简介|false|-

**Request-example:**
```
curl -X PUT -H 'Content-Type: application/json; charset=utf-8' -i http://localhost:8088/user/password?id=588 --data '{
  "id": 797,
  "username": "luella.gerhold",
  "password": "c7m23j",
  "token": "gk3x3g",
  "avatar": "w93ac0",
  "age": 32,
  "gender": true,
  "location": "wqwlo0",
  "signature": "a65lws",
  "profile": "fozc4m"
}'
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
any object|object|any object.|-

**Response-example:**
```
{}
```


