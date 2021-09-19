<template>
  <div>
    <el-card>
      <p style="margin: 10px 20px 20px 20px;">时间线</p>
      <el-timeline style="margin: 20px 20px 10px 20px;">
        <el-timeline-item v-for="idea in ideas.slice(0, 5)" :key="idea" :timestamp="new Date(idea.createTime).toLocaleString()" placement="top">
          <el-card><p>{{ idea.content }}</p></el-card>
        </el-timeline-item>
      </el-timeline>
    </el-card>
    <el-card style="margin-top: 30px;">
      <div class="markdown-body" v-html="me" style="margin: 20px 20px;"></div>
    </el-card>
    <el-card style="margin-top: 30px;">
      <div class="markdown-body" v-html="content" style="margin: 20px 20px;"></div>
    </el-card>
  </div>
</template>

<script>
import { getAllIdea } from '../api/idea'

export default {
  name: 'About',
  data () {
    return {
      ideas: [],
      me: '## 关于我👨‍💻\n' +
        '\n' +
        '- 半个技术宅😎\n' +
        '- 喜欢尝试新事物，想法很多\n' +
        '- 计算机专业在读\n' +
        '- 目前对后端开发感兴趣\n' +
        '- Java 在学\n' +
        '- 为了构建完整 web 应用还准备学前端™\n' +
        '- 审美在线，偶尔画画\n' +
        '- 不想成为穿格子衫的程序员😙\n' +
        '\n' +
        '\n' +
        '\n' +
        'GitHub：[wjl-lab](https://github.com/wjl-lab)\n' +
        '\n' +
        'Bilibili：[-lonestar-](https://space.bilibili.com/433694656)\n' +
        '\n',
      content: '# Lblog\n' + '\n' +
        'Springboot + Vue 前后端分离个人博客项目\n' + '\n' +
        '后端技术：\n' + '\n' +
        '- SpringBoot\n' + '\n' +
        '- Spring Data JPA\n' + '\n' +
        '- Sa-token\n' + '\n' +
        '- hu-tool\n' + '\n' +
        '- smart-doc\n' + '\n' +
        '前端技术：\n' + '\n' +
        '- Vue3\n' + '\n' +
        '- axios\n' + '\n' +
        '- markdown-it\n' + '\n' +
        '- element-plus\n' + '\n' +
        '- @element-plus/icons\n' + '\n' +
        '- md-editor-v3\n' + '\n' +
        '- github-markdown-css\n' + '\n' +
        '- Font Awesome\n' + '\n' +
        '## Install\n' + '\n' +
        '```shell\n' +
        'git clone https://github.com/wjl-lab/lblog\n' +
        '```\n' + '\n' +
        '## Usage\n' + '\n' +
        '- 数据库\n' + '\n' +
        '创建 `lblog` 数据库，修改 `yml` 配置文件，表会在项目启动时自动生成\n' + '\n' +
        '注意修改 article 的 content 字段为 `longtext` 类型\n' + '\n' +
        '- 后端\n' + '\n' +
        '```shell\n' +
        '$ cd blog-server\n' +
        '$ mvn clean package\n' +
        '$ cd target\n' +
        '$ java -jar lblog-0.0.1.jar\n' +
        '```\n' + '\n' +
        '- 博客页面\n' + '\n' +
        '```shell\n' +
        '$ cd blog-app\n' +
        '$ npm install\n' +
        '$ npm run serve\n' +
        '```\n' + '\n' +
        '- 博客后台管理\n' + '\n' +
        '```shell\n' +
        '$ cd blog-admin\n' +
        '$ npm install\n' +
        '$ npm run serve\n' +
        '```\n' + '\n' +
        '## API\n' + '\n' +
        '```\n' +
        'https://wangjialei.xyz/lblog\n' +
        '```\n' + '\n' +
        '## Todo\n' + '\n' +
        '1. 前端页面不是响应式布局，需要修改\n' + '\n' +
        '2. ~~文章详情页没有代码高亮，布局丑陋~~\n' + '\n' +
        '3. ~~登录密码未加密，明文存储在数据库~~\n' + '\n' +
        '4. ~~图片上传后图片在服务器中的路径显示方式不方便复制~~\n' + '\n' +
        '5. ~~关于页面需要完善内容，加上开发进展时间线~~\n' + '\n' +
        '6. ~~README 还需要完善~~\n' + '\n' +
        '7. 文章、分类分页功能小问题\n' + '\n' +
        '## Contributing\n' + '\n' +
        'PRs accepted.\n' + '\n' +
        '## License\n' + '\n' +
        '[GPL-3.0](LICENSE) © wjl\n' + '\n'
    }
  },
  created () {
    this.load()
    this.m2h()
    this.md()
  },
  methods: {
    load () {
      getAllIdea().then(data => {
        this.ideas = data.data.data.reverse()
      })
    },
    m2h () {
      const hljs = require('highlight.js')
      const md = require('markdown-it')({
        highlight (str, lang) {
          if (lang && hljs.getLanguage(lang)) {
            try {
              return hljs.highlight(lang, str).value
            } catch (__) {}
          }
          return ''
        }
      })
      this.content = md.render(this.content)
    },
    md () {
      const hljs = require('highlight.js')
      const md = require('markdown-it')({
        highlight (str, lang) {
          if (lang && hljs.getLanguage(lang)) {
            try {
              return hljs.highlight(lang, str).value
            } catch (__) {}
          }
          return ''
        }
      })
      this.me = md.render(this.me)
    }
  }
}
</script>

<style scoped>

</style>
