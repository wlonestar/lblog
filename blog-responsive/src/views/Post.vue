<template>
  <section class="article-page">
    <article class="has-image main-article">
      <header class="article-header">
        <div class="article-image">
          <a href="#">
            <img :src="article.image" loading="lazy" alt="" />
          </a>
        </div>
        <div class="article-details">
          <header class="article-category">
            <a @click="redirectToCategory(article.category)">{{ article.category }}</a>
          </header>
          <h2 class="article-title">
            <a href="#">{{ article.title }}</a>
          </h2>
          <h3 class="article-subtitle">{{ article.subtitle }}</h3>
          <footer class="article-time">
            <div>
              <Calendar></Calendar>
              <time class="article-time--published">{{ new Date(article.createTime).toLocaleString() }}</time>
            </div>
            <div>
              <ClockRegular></ClockRegular>
              <time class="article-time--reading">ReadingTime</time>
            </div>
          </footer>
        </div>
      </header>
      <section class="article-content">
        <div class="markdown-body" v-html="article.content"></div>
      </section>
      <footer class="article-footer">
        <section class="article-tags">
          <a href="#" v-for="tag in article.tags" :key="tag">{{ tag.name }}</a>
        </section>
      </footer>
    </article>
  </section>
</template>

<script>
import { Calendar, ClockRegular } from '@vicons/fa'
import { getByTitle } from '../api/article'
export default {
  name: 'Post',
  components: { Calendar, ClockRegular },
  data () {
    return {
      article: {
        id: 0,
        image: '',
        categoryId: 0,
        category: '',
        title: '',
        subtitle: '',
        createTime: '',
        content: ''
      }
    }
  },
  created () {
    this.load()
  },
  methods: {
    load () {
      getByTitle(this.$route.params.title).then(data => {
        this.article = data.data.data
        const hljs = require('highlight.js')
        const md = require('markdown-it')({
          highlight: function (str, lang) {
            if (lang && hljs.getLanguage(lang)) {
              try {
                return hljs.highlight(lang, str).value
              } catch (__) {}
            }
            return ''
          }
        })
        this.article.content = md.render(this.article.content)
      })
    },
    redirectToCategory (name) {
      this.$router.push(`/category/${name}`)
    }
  }
}
</script>

<style scoped>

</style>
