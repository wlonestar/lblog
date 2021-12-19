# Lblog

Springboot + Vue 前后端分离个人博客项目

GitHub: [wjl-lab/lblog: 前后端分离个人博客，支持markdown渲染，图片上传下载 (github.com)](https://github.com/wjl-lab/lblog)

<!-- Gitee: [lblog: 前后端分离个人博客，支持markdown渲染，图片上传下载 (gitee.com)](https://gitee.com/wjl-lab/lblog) -->

**缓慢修改中，如果需要参考源代码请去release下载**

后端技术：

- SpringBoot
- Spring Data JPA
- Sa-token
- hu-tool
- smart-doc

前端技术：

- Vue3
- axios
- markdown-it
- element-plus
- @element-plus/icons
- md-editor-v3
- github-markdown-css
- Font Awesome



博客主页

![Snipaste_2021-09-18_23-22-45](https://gitee.com/wjl-lab/mypic/raw/master/Snipaste_2021-09-18_23-22-45.png)

分类页

![Snipaste_2021-09-18_23-22-54](https://gitee.com/wjl-lab/mypic/raw/master/Snipaste_2021-09-18_23-22-54.png)

留言页

![Snipaste_2021-09-18_23-23-04](https://gitee.com/wjl-lab/mypic/raw/master/Snipaste_2021-09-18_23-23-04.png)

后台登录页

![](https://wangjialei.xyz/lblog/login.png)



后台页面

![Snipaste_2021-09-18_23-31-55](https://gitee.com/wjl-lab/mypic/raw/master/Snipaste_2021-09-18_23-31-55.png)

文章管理

![Snipaste_2021-09-18_23-32-14](https://gitee.com/wjl-lab/mypic/raw/master/Snipaste_2021-09-18_23-32-14.png)

编辑文章，支持 markdown 编辑器

![Snipaste_2021-09-18_23-34-00](https://gitee.com/wjl-lab/mypic/raw/master/Snipaste_2021-09-18_23-34-00.png)



![Snipaste_2021-09-18_23-34-07](https://gitee.com/wjl-lab/mypic/raw/master/Snipaste_2021-09-18_23-34-07.png)

修改文章

![Snipaste_2021-09-18_23-34-38](https://gitee.com/wjl-lab/mypic/raw/master/Snipaste_2021-09-18_23-34-38.png)



## Install

```shell
git clone https://github.com/wjl-lab/lblog
```



## Usage

- 数据库

  创建 `lblog` 数据库，修改 `yml` 配置文件，表会在项目启动时自动生成

  注意修改表 `article` 的 `content` 字段为 `longtext` 类型

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

- [x] 前端页面不是响应式布局，需要修改

- [ ] 文章、分类分页功能小问题

- [ ] 编辑文章功能中，分类改成可选已有分类或者创建新分类



## Contributing

PRs accepted.



## License

[GPL-3.0](LICENSE) © wjl
