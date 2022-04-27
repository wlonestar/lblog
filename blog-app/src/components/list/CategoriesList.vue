<script setup lang="ts">
import { onMounted, ref } from 'vue'
import { getAll } from '@/api/category'

const categories = ref()

onMounted(() => {
  getAll().then(res => {
    categories.value = res.data
    console.log(res.data)
  })
})

</script>

<template>
  <div class="bg-secondary-bg rounded px-6 py-8">
    <h2 v-for="category in categories" :key="category" class="text-lg text-primary-text my-2">
      <a href="#" class="text-eureka hover:underline">
        {{ category.name }}
      </a>
    </h2>
  </div>
</template>

<style scoped>

</style>
