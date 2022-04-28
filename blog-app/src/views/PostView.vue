<script setup lang="ts">
import { onMounted, ref } from 'vue'
// import MarkdownIt from 'markdown-it'
// import hljs from 'highlight.js'

import HeaderItem from '@/components/header/HeaderItem.vue'
import FooterItem from '@/components/footer/FooterItem.vue'
import { getDetailById } from '@/api/article'

const props = defineProps(['id'])

const Title = 'fwenifw'
const article = ref()

function loadArticle (id: number) {
  // console.log(1)
  // getDetailById(id).then(res => {
  //   console.log(article)
  //   article.value = res.data
  //   console.log(article)
  //   // const md = MarkdownIt({
  //   //   highlight: function (str, lang) {
  //   //     if (lang && hljs.getLanguage(lang)) {
  //   //       try {
  //   //         return hljs.highlight(str, { language: lang }).value
  //   //       } catch (__) {}
  //   //     }
  //   //     return ''
  //   //   }
  //   // })
  //   // article.value.content = md.render(article.value.content)
  // })
}

onMounted(() => {
  const id = parseInt(props.id)
  console.log(id)
  // loadArticle(id)
  // console.log(1)
  getDetailById(id).then(res => {
    console.log(article)
    article.value = res.data
    console.log(article)
    // const md = MarkdownIt({
    //   highlight: function (str, lang) {
    //     if (lang && hljs.getLanguage(lang)) {
    //       try {
    //         return hljs.highlight(str, { language: lang }).value
    //       } catch (__) {}
    //     }
    //     return ''
    //   }
    // })
    // article.value.content = md.render(article.value.content)
  })
})

</script>

<template>
  <div class="flex flex-col min-h-screen">
    <HeaderItem/>
    <main class="flex-grow pt-16">
      <div class="pl-scrollbar">
        <div class="w-full max-w-screen-xl lg:px-4 xl:px-8 mx-auto">
          <div class="grid grid-cols-2 lg:grid-cols-8 gap-4 lg:pt-12">
            <div class="col-span-2 lg:col-span-6 bg-secondary-bg rounded px-6 py-8">
              <h1 class="font-bold text-3xl text-primary-text">
                {{ article.title }}
              </h1>

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

              <div class="my-4">
                <img :src="article.image" class="w-full" alt="Featured Image">
              </div>

              <div class="content">
                <div v-html="article.content"></div>
<!--                <div class="markdown-body" v-html="content"></div>-->
<!--                                <Markdown :source="content"/>-->
              </div>

              <div class="my-4">
                <a href="#" v-for="tag in article.tags" :key="tag"
                   class="inline-block bg-tertiary-bg text-sm rounded px-3 py-1 my-1 mr-2 hover:text-eureka">
                  #{{ tag }}
                </a>
              </div>

              <div class="flex flex-col md:flex-row md:justify-between -mx-2 mt-4 px-2 pt-4 border-t">
                <div>
                  <span class="block font-bold"> previous </span>
                  <a href="#" class="block">{{ Title }}</a>
                </div>
                <div class="md:text-right mt-4 md:mt-0">
                  <span class="block font-bold"> next </span>
                  <a href="#" class="block">{{ Title }}</a>
                </div>
              </div>
            </div>

<!--            <div class="col-span-2">-->
<!--              <div class="sticky top-16 z-10 hidden lg:block px-6 py-4 bg-primary-bg">-->
<!--                <span class="text-lg font-semibold">本页内容</span>-->
<!--              </div>-->
<!--              <div class="sticky-toc hidden lg:block px-6 pb-6">-->
<!--                TableOfContents-->
<!--              </div>-->
<!--            </div>-->

          </div>
        </div>
      </div>
    </main>
    <FooterItem/>
  </div>
</template>

<style scoped>

</style>
