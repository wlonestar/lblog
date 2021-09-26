<template>
  <div class="section-card">
    <div class="section-details">
      <h1 class="section-term">分类</h1>
<!--      <h3 class="section-count">5</h3>-->
    </div>
  </div>
  <section class="article-list--compact">
    <article v-for="category in categories" :key="category">
      <a :href="'/category/' + category.id">
        <div class="article-details">
          <h2 class="article-title">{{ category.name }}</h2>
          <footer class="article-time">
            <time class="article-time--published">{{ category.createTime }}</time>
          </footer>
        </div>
      </a>
    </article>
  </section>
</template>

<script>
export default {
  name: 'CategoryList',
  setup () {
    return {
      categories: [
        {
          id: 0,
          name: '开源项目',
          createTime: 'Sep 20 2021'
        },
        {
          id: 0,
          name: '开源项目',
          createTime: 'Sep 20 2021'
        },
        {
          id: 0,
          name: '开源项目',
          createTime: 'Sep 20 2021'
        }
      ]
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
