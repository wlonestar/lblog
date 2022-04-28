<template>
  <section class="article-list">
    <article class="has-image" v-for="article in articles.slice(0, 7)" :key="article">
      <a @click="redirectToArticle(article.title)">
        <div class="article-image">
          <img :src="article.image" loading="lazy" alt=""/>
        </div>
      </a>
      <div class="article-details">
        <header class="article-category">
          <a @click="redirectToCategory(article.category)">{{article.category }}</a>
        </header>
        <h2 class="article-title">
          <a @click="redirectToArticle(article.title)">{{ article.title }}</a>
        </h2>
        <h3 class="article-subtitle">{{ article.subtitle }}</h3>
        <footer class="article-time">
          <div>
            <Calendar></Calendar>
            <time class="article-time--published">{{ new Date(article.createTime).toLocaleString() }}</time>
          </div>
<!--          <div>-->
<!--            <ClockRegular></ClockRegular>-->
<!--            <time class="article-time&#45;&#45;reading">阅读时长：{{ article.readTime }} 分钟</time>-->
<!--          </div>-->
        </footer>
      </div>
    </article>
  </section>
  <div style="text-align: center; margin-top: 20px;">
    <n-button type="info" @click="$router.push('/archive')">more</n-button>
  </div>
</template>

<script>
import { Calendar } from '@vicons/fa'
import { NButton } from 'naive-ui'
import { getAllArticle } from '@/api/article'
export default {
  name: 'Home',
  components: { Calendar, NButton },
  data () {
    return {
      articles: [
        {
          id: 0,
          image: '',
          categoryId: 0,
          category: '',
          title: '',
          subtitle: '',
          createTime: '',
          readTime: ''
        }
      ]
    }
  },
  created () {
    this.load()
  },
  methods: {
    load () {
      getAllArticle().then(data => {
        this.articles = data.data.data
      })
    },
    redirectToArticle (name) {
      this.$router.push(`/p/${name}`)
    },
    redirectToCategory (name) {
      this.$router.push(`/category/${name}`)
    }
  }
}
</script>

<style scoped lang="scss">

</style>
