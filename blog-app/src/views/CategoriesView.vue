<script setup lang="ts">
import HeaderItem from '@/components/header/HeaderItem.vue'
import FooterItem from '@/components/footer/FooterItem.vue'
import CategoriesList from '@/components/list/CategoriesList.vue'

const title = '分类'

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
          <CategoriesList />
        </div>
      </div>
    </main>
    <FooterItem />
  </div>
</template>

<style scoped>

</style>
