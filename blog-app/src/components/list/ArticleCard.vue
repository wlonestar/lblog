<script setup lang="ts">
import { onMounted, ref } from 'vue'
import { getAllSummary } from '@/api/article'

const title = '文章'
const articles = ref()

onMounted(() => {
  getAllSummary().then(res => {
    articles.value = res.data.slice(0, 3)
    console.log(articles.value)
  })
})

</script>

<template>
  <div class="pl-scrollbar bg-primary-bg">
    <div class="max-w-screen-xl mx-auto">
      <div id="pages" class="lg:w-3/4 mx-auto px-6 md:px-8 xl:px-12 py-12">
        <h2 class="font-bold text-3xl my-4">{{ title }}</h2>
        <div class="overflow-hidden">
          <div class="mb-6" v-for="article in articles" :key="article">
            <div class="bg-secondary-bg rounded border hover:shadow-lg transition ease-in-out duration-200 px-6 pt-6 pb-4">
              <div class="flex flex-col-reverse lg:flex-row justify-between">
                <div class="w-full lg:w-2/3">
                  <div class="mb-4">
                    <a href="#" class="font-bold text-xl hover:text-eureka">{{ article.title }}</a>
                  </div>
                  <div class="content">
                    {{ article.summary }}
                  </div>
                  <div class="flex flex-wrap flex-row items-center mt-2 text-tertiary-text">
                    <div class="mr-6 my-2">
                      <font-awesome-icon icon="calendar" class="mr-1"/>
                      <span>{{ new Date(article.createTime).toLocaleString() }}</span>
                    </div>
                    <div class="mr-6 my-2">
                      <font-awesome-icon icon="folder" class="mr-1"/>
                      <a href="#" class="hover:text-eureka">{{ article.category }}</a>
                    </div>
                  </div>
                </div>
                <div class="w-full lg:w-1/3 mb-4 lg:mb-0 lg:ml-8">
                  <img :src="article.image" class="w-full" alt="Featured Image">
                </div>
              </div>
            </div>
          </div>
          <div class="px-8 pt-2 hover:text-eureka">
            <a href="/posts" class="font-semibold">阅读更多</a>
            <font-awesome-icon icon="caret-right" />
          </div>
        </div>
      </div>
    </div>
  </div>
</template>

<style scoped>

</style>
