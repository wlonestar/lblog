<template>
  <aside class="sidebar right-sidebar sticky">
    <!-- archive -->
    <section class="widget archives">
      <div class="widget-icon">
        <Infinity class="icon"></Infinity>
      </div>
      <h2 class="widget-title section-title">归档</h2>
      <div class="widget-archive--list">
        <div class="archives-year">
          <a v-for="archive in archives" :key="archive" :href="'/archive/#' + archive.year">
            <span class="year">{{ archive.year }}</span>
            <span class="count">{{ archive.count }}</span>
          </a>
        </div>
      </div>
    </section>
    <!-- tag cloud -->
    <section class="widget tagCloud">
      <div class="widget-icon">
        <Star class="icon"></Star>
      </div>
      <h2 class="widget-title section-title">最新文章</h2>
      <div class="article-list--compact">
        <article v-for="article in articles.slice(0, 5)" :key="article">
          <a :href="'/p/' + article.id">
            <div class="article-details">
              <h2 class="article-title">{{ article.title }}</h2>
              <footer class="article-time">
                <time class="article-time--published">{{ new Date(article.createTime).toLocaleString() }}</time>
              </footer>
            </div>
          </a>
        </article>
      </div>
    </section>
  </aside>
</template>

<script>
import { Star, Infinity } from '@vicons/fa'
import { getAllArticle } from '../api/article'
export default {
  name: 'Right',
  components: { Star, Infinity },
  data () {
    return {
      archives: [
        {
          year: 2020,
          count: 12
        },
        {
          year: 2021,
          count: 22
        }
      ],
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
        this.articles = data.data.data.reverse()
      })
    }
  }
}
</script>

<style scoped>
.icon {
  color: #555
}
</style>
