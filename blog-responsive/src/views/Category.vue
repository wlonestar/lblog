<template>
  <div class="section-card">
    <div class="section-details">
      <h3 class="section-count">{{ category.number }} 篇文章</h3>
      <h1 class="section-term">{{ category.name }}</h1>
      <h2 class="section-description">{{ category.description }}</h2>
    </div>
    <div class="section-image">
      <img :src="category.image" width="60px" height="60px" loading="lazy" alt="">
    </div>
  </div>
  <section class="article-list--compact">
    <article v-for="article in category.articles" :key="article">
      <a :href="'/p/' + article.id">
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
export default {
  name: 'Category',
  setup () {
    return {
      category: {
        id: 0,
        image: 'https://blog.wangjialei.xyz/images/2021-09-20.png',
        number: 3,
        name: '开源项目',
        description: '我的开源项目的README',
        articles: [
          {
            id: 0,
            title: '个人博客项目开发完成',
            createTime: 'Sep 20 2021'
          },
          {
            id: 0,
            title: '个人博客项目开发完成',
            createTime: 'Sep 20 2021'
          },
          {
            id: 0,
            title: '个人博客项目开发完成',
            createTime: 'Sep 20 2021'
          }
        ]
      }
    }
  }
}
</script>

<style scoped>

</style>
