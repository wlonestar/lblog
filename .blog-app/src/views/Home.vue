<template>
  <div>
    <el-card v-for="article in articles.slice(0, 5)" :key="article.id" class="text item" style="margin-bottom: 25px;">
        <p style="font-size: 24px; font-weight: 500; margin-bottom: 5px;">
          <a @click="redirectToArticle(article.id)">{{ article.title }}</a>
        </p>
        <span style="color: #777777;">{{ new Date(article.updateTime).toLocaleDateString() }}</span>
        <span style="margin-left: 20px; margin-bottom: 20px;">
          <collection-tag style="width: 18px; height: 18px;" color="#777777"/>{{ article.category }}
        </span>
        <img :src="article.image" style="width: 100%; margin-top: 10px; margin-bottom: 10px;" alt="">
        <p style="font-size: 15px; font-weight: 400; margin-top: 5px;">{{ article.summary }}</p>
    </el-card>
    <div style="text-align: center;">
      <el-button @click="$router.push('/archive')" type="primary" size="small" style="font-size: 18px;">
        more
      </el-button>
    </div>
  </div>
</template>

<script>
import { getAllArticle } from '../api/article'
import { CollectionTag } from '@element-plus/icons'

export default {
  name: 'Home',
  components: { CollectionTag },
  data () {
    return {
      currentPage: 1,
      pageNum: 1,
      pageSize: 5,
      total: 0,
      articles: []
    }
  },
  created () {
    this.load()
  },
  methods: {
    load () {
      getAllArticle().then(data => {
        this.articles = data.data.data.reverse()
      })
    },
    redirectToArticle (id) {
      this.$router.push(`/p/${id}`)
    },
    handleSizeChange (pageSize) {
      this.pageSize = pageSize
      this.load()
    },
    handleCurrentChange (pageNum) {
      this.pageNum = pageNum
      this.load()
    }
  }
}
</script>

<style scoped>
a {
  cursor: pointer;
  color: #000;
}
</style>
