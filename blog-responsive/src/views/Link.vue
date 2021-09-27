<template>
  <section class="article-page">
    <article class="main-article">
      <header class="article-header">
        <div class="article-details">
          <h2 class="article-title"><a href="/link">友链</a></h2>
          <h3 class="article-subtitle">31424414</h3>
        </div>
      </header>
      <section class="article-content">
        <n-card v-for="link in links" :key="link" :title="link.name" style="margin-bottom: 20px;">
          <template #cover>
            <a :href="link.url" target="_blank">
              <img :src="link.image" alt="" />
            </a>
          </template>
          {{ link.slogan }}
        </n-card>
        <p>to be continued…</p>
      </section>
      <footer class="article-footer">
      </footer>
    </article>
  </section>
</template>

<script>
import { NCard } from 'naive-ui'
import { getAllLink } from '../api/link'
export default {
  name: 'Link',
  components: { NCard },
  data () {
    return {
      links: [
        {
          id: 0,
          url: '',
          image: '',
          name: '',
          slogan: ''
        }
      ]
    }
  },
  created () {
    this.load()
  },
  methods: {
    load () {
      getAllLink().then(data => {
        this.links = data.data.data.reverse()
      })
    }
  }
}
</script>

<style scoped>
.n-card {
  max-width: 200px;
}
</style>
