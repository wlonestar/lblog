<template>
  <div class="section-card">
    <div class="section-details">
      <h1 class="section-term">分类</h1>
<!--      <h3 class="section-count">5</h3>-->
    </div>
  </div>
  <section class="article-list--compact">
    <article v-for="category in categories" :key="category">
      <a @click="redirectToCategory(category.name)">
        <div class="article-details">
          <h2 class="article-title">{{ category.name }}</h2>
          <footer class="article-time">
            <time class="article-time--published">{{ new Date(category.createTime).toLocaleString() }}</time>
          </footer>
        </div>
      </a>
    </article>
  </section>
</template>

<script>
import { getAllCategory } from '@/api/category'

export default {
  name: 'CategoryList',
  data () {
    return {
      categories: []
    }
  },
  created () {
    this.load()
  },
  methods: {
    load () {
      getAllCategory().then(res => {
        console.log(res.data.data)
        this.categories = res.data.data
      })
    },
    redirectToCategory (name) {
      this.$router.push(`/category/${name}`)
    }
  }
}
</script>

<style scoped>
.section-term {
  margin: 0;
  font-size: 2rem;
}
</style>
