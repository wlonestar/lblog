<template>
  <div>
    <el-card>
      <div v-html="m2h()" style="margin: 20px 20px;"></div>
    </el-card>
  </div>
</template>

<script>

import 'vue-simple-markdown/dist/vue-simple-markdown.css'
export default {
  name: 'About',
  data () {
    return {
      content: '#### 关于本项目\n' +
        '本项目是基于Spring Boot 和 Vue3 开发的一个前后端分离的简易博客项目\n' + '\n' +
        '实现了创建、修改、删除文章操作\n' + '\n' +
        '文章支持 markdown 语法\n' + '\n' +
        '##### 技术栈：\n' + '\n' +
        '**后端：**\n' + '\n' +
        '- Spring Boot 2.x\n' + '\n' +
        '- Spring JPA\n' + '\n' +
        '- [smart doc](https://gitee.com/smart-doc-team/smart-doc) 生成 API 文档\n' + '\n' +
        '**前端：**\n' + '\n' +
        '- Vue 3.x\n' + '\n' +
        '- [md-editor-v3](https://imzbf.github.io/md-editor-v3/) markdown 编辑器\n' + '\n' +
        '- [vue-simple-markdown](https://github.com/Vivify-Ideas/vue-simple-markdown) markdown 转 html 预览\n' + '\n' +
        '- bootstrap\n' + '\n' +
        '#### 关于我\n' + '\n' +
        '\n' +
        '半个技术宅，喜欢尝试新事物，想法很多\n' + '\n' +
        '计算机专业在读，目前对后端开发感兴趣\n' + '\n' +
        'Java 在学，为了构建完整 web 应用还准备学前端'
    }
  },
  methods: {
    m2h (result) {
      const md = require('markdown-it')()
      result = md.render(this.content)
      return result
    }
  }
}
</script>

<style scoped>

</style>
