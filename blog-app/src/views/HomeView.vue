<script setup lang="ts">
import '../api/article'
import { getAllDetail } from '@/api/article'
import { onMounted, ref } from 'vue'

const articles = ref()

onMounted(() => {
  getAllDetail().then(res => {
    articles.value = res.data
    console.log(articles.value)
  })
})

</script>

<template>
  <main>
    <li v-for="article in articles" :key="article">
      <p>{{ article.id }}</p>
      <p>{{ article.createTime }}</p>
      <p>{{ article.title }}</p>
      <p>{{ article.summary }}</p>
      <p>{{ article.cover }}</p>
      <p>{{ article.category }}</p>
      <p v-for="tag in article.tags" :key="tag">
        {{ tag }}
      </p>
    </li>
  </main>
</template>
