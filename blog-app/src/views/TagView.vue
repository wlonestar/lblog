<script setup lang="ts">
import HeaderItem from '@/components/header/HeaderItem.vue'
import FooterItem from '@/components/footer/FooterItem.vue'
import ArticleList from '@/components/list/ArticleList.vue'
import { onMounted, ref } from 'vue'

const props = defineProps(['name'])
const title = ref()

onMounted(() => {
  const name = props.name
  title.value = name
  console.log(name)
})

</script>

<template>
  <div class="flex flex-col min-h-screen">
    <HeaderItem />
    <main class="flex-grow pt-16">
      <div class="pl-scrollbar">
        <div class="w-full max-w-screen-xl lg:px-4 xl:px-8 mx-auto">
          <article class="mx-6 my-8">
            <h1 class="font-bold text-3xl text-primary-text">{{ title }}</h1>
            <div class="content">
            </div>
          </article>
          <ArticleList type="tag" :attr="props.name" />
        </div>
      </div>
    </main>
    <FooterItem />
  </div>
</template>

<style scoped>
a:hover {
  cursor: pointer;
}
</style>
