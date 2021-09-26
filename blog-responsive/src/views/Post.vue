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
            <a href="#">{{ article.category }}</a>
          </header>
          <h2 class="article-title">
            <a href="#">{{ article.title }}</a>
          </h2>
          <h3 class="article-subtitle">{{ article.subtitle }}</h3>
          <footer class="article-time">
            <div>
              <Calendar></Calendar>
              <time class="article-time--published">{{ article.createTime }}</time>
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
<!--        {{ article.content }}-->
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
import { getArticle } from '../api/article'
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
      getArticle(this.$route.params.id).then(data => {
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
    }
  }
}
</script>

<style scoped>

</style>
