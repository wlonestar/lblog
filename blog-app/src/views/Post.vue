<template>
  <div style="width: 70%">
    <el-card class="text item" style="margin-bottom: 25px;">
      <p style="font-size: 18px; font-weight: 500; margin-bottom: 5px;">{{ article.title }}</p>
      <span style="color: #777777;">{{ new Date(article.updateTime).toLocaleDateString() }}</span>
      <span style="margin-left: 20px; margin-bottom: 20px;">
          <collection-tag style="width: 18px; height: 18px;" color="#777777"/>{{ article.category }}
        </span>
      <img :src="article.image" style="width: 100%; margin-top: 10px; margin-bottom: 10px;" alt="">
      <p style="font-size: 15px; font-weight: 400; margin-top: 5px;">{{ article.summary }}</p>
<!--      <p>{{ article.content }}</p>-->
<!--      <vue-simple-markdown :source="article.content"></vue-simple-markdown>-->
      <div v-html="article.content" style="margin: 20px 20px;"></div>
    </el-card>
  </div>
</template>

<script>
import 'highlight.js/styles/default.css'
import { getArticle } from '../api/article'
import { CollectionTag } from '@element-plus/icons'

export default {
  name: 'Post',
  components: { CollectionTag },
  data () {
    return {
      article: {}
    }
  },
  created () {
    this.load()
  },
  methods: {
    load () {
      getArticle(this.$route.params.id).then(data => {
        this.article = data.data.data
        const md = require('markdown-it')()
        this.article.content = md.render(this.article.content)
      })
    }
  }
}
</script>

<style scoped>

</style>
