<template>
  <div class="archives-group" id="2021">
    <h2 class="archives-date section-title">
      <a href="#2021">2021</a>
    </h2>
    <div class="article-list--compact">
      <article v-for="article in articles" :key="article">
        <a :href="'/p/' + article.id">
          <div class="article-details">
            <h2 class="article-title">{{ article.title }}</h2>
            <footer class="article-time">
              <time class="article-time--published">{{ article.createTime }}</time>
            </footer>
          </div>
        </a>
      </article>
    </div>
  </div>
</template>

<script>
export default {
  name: 'Archive',
  setup () {
    return {
      articles: [
        {
          id: 0,
          image: 'https://blog.wangjialei.xyz/images/2021-09-20.png',
          categoryId: 0,
          category: '开源项目',
          title: '个人博客项目开发完成',
          subtitle: 'SpringBoot + Vue 个人博客',
          createTime: 'Sep 20 2021',
          readTime: '2'
        },
        {
          id: 0,
          image: 'https://blog.wangjialei.xyz/images/2021-09-20.png',
          categoryId: 0,
          category: '开源项目',
          title: '个人博客项目开发完成',
          subtitle: 'SpringBoot + Vue 个人博客',
          createTime: 'Sep 20 2021',
          readTime: '2'
        }
      ]
    }
  }
}
</script>

<style scoped>

</style>
