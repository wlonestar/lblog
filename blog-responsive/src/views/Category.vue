<template>
  <div class="section-card">
    <div class="section-details">
<!--      <h3 class="section-count">{{ category.number }} 篇文章</h3>-->
      <h1 class="section-term">{{ category.name }}</h1>
<!--      <h2 class="section-description">{{ category.description }}</h2>-->
    </div>
<!--    <div class="section-image">-->
<!--      <img :src="category.image" width="60px" height="60px" loading="lazy" alt="">-->
<!--    </div>-->
  </div>
  <section class="article-list--compact">
    <article v-for="article in category.articles.records" :key="article">
      <a @click="redirectToArticle(article.title)">
        <div class="article-details">
          <h2 class="article-title">{{ article.title }}</h2>
          <footer class="article-time">
            <time datetime="2021-09-20T21:47:22+08:00">{{ article.createTime }}</time>
          </footer>
        </div>
      </a>
    </article>
  </section>
</template>

<script>
import { getByName } from '@/api/category'

export default {
  name: 'Category',
  data () {
    return {
      category: {}
    }
  },
  created () {
    this.load()
  },
  methods: {
    load () {
      getByName(this.$route.params.name).then(res => {
        this.category = res.data.data
        console.log(res.data.data)
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
