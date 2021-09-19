# Lblog

Springboot + Vue 前后端分离个人博客项目

后端技术：

- SpringBoot

- Spring Data JPA
- Sa-token
- smart-doc

前端技术：

- Vue3
- axios
- markdown-it
- ElementPlus
- md-editor-v3



![Snipaste_2021-09-18_23-22-45](https://gitee.com/wang-jia-lei/mypic/raw/master/Snipaste_2021-09-18_23-22-45.png)

![Snipaste_2021-09-18_23-22-54](https://gitee.com/wang-jia-lei/mypic/raw/master/Snipaste_2021-09-18_23-22-54.png)

![Snipaste_2021-09-18_23-23-04](https://gitee.com/wang-jia-lei/mypic/raw/master/Snipaste_2021-09-18_23-23-04.png)

![Snipaste_2021-09-18_23-31-39](https://gitee.com/wang-jia-lei/mypic/raw/master/Snipaste_2021-09-18_23-31-39.png)

![Snipaste_2021-09-18_23-31-55](https://gitee.com/wang-jia-lei/mypic/raw/master/Snipaste_2021-09-18_23-31-55.png)

![Snipaste_2021-09-18_23-32-14](https://gitee.com/wang-jia-lei/mypic/raw/master/Snipaste_2021-09-18_23-32-14.png)

![Snipaste_2021-09-18_23-34-00](https://gitee.com/wang-jia-lei/mypic/raw/master/Snipaste_2021-09-18_23-34-00.png)

![Snipaste_2021-09-18_23-34-07](https://gitee.com/wang-jia-lei/mypic/raw/master/Snipaste_2021-09-18_23-34-07.png)

![Snipaste_2021-09-18_23-34-38](https://gitee.com/wang-jia-lei/mypic/raw/master/Snipaste_2021-09-18_23-34-38.png)



## Install

```shell
git clone https://github.com/wjl-lab/lblog
```



## Usage

- 数据库

  创建 `lblog` 数据库，修改 `yml` 配置文件，表会在项目启动时自动生成

- 后端

```shell

$ cd blog-server
$ mvn clean package
$ cd target
$ java -jar lblog-0.0.1.jar
```

- 博客页面

```shell

$ cd blog-app
$ npm install
$ npm run serve
```

- 博客后台管理

```shell
$ cd blog-admin
$ npm install
$ npm run serve
```



## API

```
https://wangjialei.xyz/lblog
```



## Todo

1. 前端页面不是响应式布局，需要修改
2. ~~文章详情页没有代码高亮，布局丑陋~~
3. 登录密码未加密，明文存储在数据库
4. ~~图片上传后图片在服务器中的路径显示方式不方便复制~~
5. 关于页面需要完善内容，加上开发进展时间线
6. README 还需要完善



## Contributing

PRs accepted.



## License

[GPL-3.0](LICENSE) © wjl