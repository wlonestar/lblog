<template>
  <div class="archives-group" id="2021">
    <h2 class="archives-date section-title">
      <a href="#2021">2021</a>
    </h2>
    <div class="article-list--compact">
      <article v-for="article in articles" :key="article">
        <a @click="redirectToArticle(article.title)">
          <div class="article-details">
            <h2 class="article-title">{{ article.title }}</h2>
            <footer class="article-time">
              <time class="article-time--published">{{ new Date(article.createTime).toLocaleString() }}</time>
            </footer>
          </div>
        </a>
      </article>
    </div>
  </div>
</template>

<script>
import { getAllArticle } from '@/api/article'

export default {
  name: 'Archive',
  data () {
    return {
      articles: []
    }
  },
  created () {
    this.load()
  },
  methods: {
    load () {
      getAllArticle().then(res => {
        console.log(res.data.data)
        this.articles = res.data.data
      })
    },
    redirectToArticle (title) {
      this.$router.push(`/p/${title}`)
    }
  }
}
</script>

<style scoped>

</style>
