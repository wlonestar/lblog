<script setup lang="ts">
import { onMounted } from 'vue'
// import MarkdownIt from 'markdown-it'
// import hljs from 'highlight.js'

import HeaderItem from '@/components/header/HeaderItem.vue'
import FooterItem from '@/components/footer/FooterItem.vue'
import PostItem from '@/components/post/PostItem.vue'

const props = defineProps(['title'])

onMounted(() => {
  const id = props.title
  console.log(id)
})

</script>

<template>
  <div class="flex flex-col min-h-screen">
    <HeaderItem/>
    <main class="flex-grow pt-16">
      <PostItem :title="props.title" />
    </main>
    <FooterItem/>
  </div>
</template>

<style scoped>

</style>
