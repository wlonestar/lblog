<script setup lang="ts">
import HeaderItem from '@/components/header/HeaderItem.vue'
import FooterItem from '@/components/footer/FooterItem.vue'
import AboutView from '@/components/about/AboutItem.vue'
import ArticleCard from '@/components/list/ArticleCard.vue'
import BannerItem from '@/components/about/BannerItem.vue'

</script>

<template>
  <div class="flex flex-col min-h-screen">
    <HeaderItem/>
    <main class="flex-grow pt-16">
      <AboutView />
      <ArticleCard />
      <BannerItem />
    </main>
    <FooterItem/>
  </div>
</template>
