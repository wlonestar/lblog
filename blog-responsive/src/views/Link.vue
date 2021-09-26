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
            <a :href="link.url">
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
export default {
  name: 'Link',
  setup () {
    return {
      links: [
        {
          id: 0,
          url: 'http://localhost:8080',
          image: 'https://blog.wangjialei.xyz/img/avatar_hud2f63dea884dfc84ed96fda9ff62e373_105884_300x0_resize_q75_box.jpg',
          name: 'ewvwgeg',
          slogan: 'ewfwefwefwegwegewgeg'
        },
        {
          id: 0,
          url: 'http://localhost:8080',
          image: 'https://blog.wangjialei.xyz/img/avatar_hud2f63dea884dfc84ed96fda9ff62e373_105884_300x0_resize_q75_box.jpg',
          name: 'wewe',
          slogan: 'ewfewfewfewfewfwe'
        }
      ]
    }
  }
}
</script>

<style scoped>
.n-card {
  max-width: 200px;
}
</style>
