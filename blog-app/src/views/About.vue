<template>
  <div>
    <el-card>
      <div class="markdown-body" v-html="m2h()" style="margin: 20px 20px;"></div>
    </el-card>
  </div>
</template>

<script>

import 'vue-simple-markdown/dist/vue-simple-markdown.css'
export default {
  name: 'About',
  data () {
    return {
      content: '# Lblog\n' + '\n' +
        'Springboot + Vue 前后端分离个人博客项目\n' + '\n' +
        '后端技术：\n' + '\n' +
        '- SpringBoot\n' + '\n' +
        '- Spring Data JPA\n' + '\n' +
        '- Sa-token\n' + '\n' +
        '- smart-doc\n' + '\n' +
        '前端技术：\n' + '\n' +
        '- Vue3\n' + '\n' +
        '- axios\n' + '\n' +
        '- markdown-it\n' + '\n' +
        '- ElementPlus\n' + '\n' +
        '- md-editor-v3\n' + '\n' +
        '## Install\n' + '\n' +
        '```shell\n' +
        'git clone https://github.com/wjl-lab/lblog\n' +
        '```\n' + '\n' +
        '## Usage\n' + '\n' +
        '- 数据库\n' + '\n' +
        '创建 `lblog` 数据库，修改 `yml` 配置文件，表会在项目启动时自动生成\n' + '\n' +
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
        '2. 文章详情页没有代码高亮，布局丑陋\n' + '\n' +
        '3. 登录密码未加密，明文存储在数据库\n' + '\n' +
        '4. 图片上传后图片在服务器中的路径显示方式不方便复制\n' + '\n' +
        '5. 关于页面需要完善内容，加上开发进展时间线\n' + '\n' +
        '6. README 还需要完善\n' + '\n' +
        '## Contributing\n' + '\n' +
        'PRs accepted.\n' + '\n' +
        '## License\n' + '\n' +
        '[GPL-3.0](LICENSE) © wjl\n' + '\n'
    }
  },
  methods: {
    m2h (result) {
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
      result = md.render(this.content)
      return result
    }
  }
}
</script>

<style scoped>

</style>
