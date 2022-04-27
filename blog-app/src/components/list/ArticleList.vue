<script setup lang="ts">
import { onMounted, ref } from 'vue'
import { getSummaryByPage } from '@/api/article'
import { useRouter } from 'vue-router'
import { getArticlesByCategoryPage } from '@/api/category'
import { getArticlesByNamePage } from '@/api/tag'

const props = defineProps(['type', 'attr'])
const router = useRouter()

const total = ref()
const currentPage = ref(1)
const pageSize = ref(7)
const articles = ref()

function loadArticles () {
  console.log(props.type)
  console.log(props.attr)
  if (props.type === 'posts') {
    getSummaryByPage(currentPage.value, pageSize.value).then(res => {
      total.value = res.data.total
      articles.value = res.data.records
      console.log(res.data)
    })
  } else if (props.type === 'category') {
    const name = props.attr
    getArticlesByCategoryPage(name, currentPage.value, pageSize.value).then(res => {
      total.value = res.data.total
      articles.value = res.data.articles.records
      console.log(res.data)
    })
  } else if (props.type === 'tag') {
    const name = props.attr
    getArticlesByNamePage(name, currentPage.value, pageSize.value).then(res => {
      total.value = res.data.total
      articles.value = res.data.articles.records
      console.log(res.data)
    })
  }
}

function redirectToArticle (id: number) {
  console.log(id)
  router.push(`/posts/${id}`)
}

const handleCurrentChange = (val: number) => {
  currentPage.value = val
  loadArticles()
}

const handleSizeChange = (val: number) => {
  pageSize.value = val
  loadArticles()
}

onMounted(() => {
  loadArticles()
})

</script>

<template>
  <div class="bg-secondary-bg rounded px-6">
    <div class="overflow-hidden divide-y">
      <div class="py-6" v-for="article in articles" :key="article">
        <div class="flex flex-col-reverse lg:flex-row justify-between">
          <div class="w-full lg:w-2/3">
            <div class="mb-4">
              <a @click="redirectToArticle(article.id)" class="font-bold text-xl hover:text-eureka">{{ article.title }}</a>
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
                <font-awesome-icon icon="folder" class="mr-1" />
                <a href="#" class="hover:text-eureka">{{ article.category }}</a>
              </div>
            </div>
          </div>
          <div class="w-full lg:w-1/3 mb-4 lg:mb-0 lg:ml-8">
            <img :src="article.image" loading="lazy" class="w-full" alt="Featured Image">
          </div>
        </div>
      </div>
    </div>
  </div>
  <div class="pagination pagination-default my-page-item">
    <el-pagination
      v-model:current-page="currentPage"
      v-model:page-size="pageSize"
      :total="total"
      background
      layout="prev, pager, next"
      @current-change="handleCurrentChange"
      @size-change="handleSizeChange"
    />
  </div>
</template>

<style scoped>
.my-page-item {
  padding-top: 20px;
}
a:hover {
  cursor: pointer;
}
</style>
