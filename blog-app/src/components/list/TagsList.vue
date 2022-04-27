<script setup lang="ts">
import { onMounted, ref } from 'vue'
import { getAll } from '@/api/tag'

const tags = ref()

onMounted(() => {
  getAll().then(res => {
    tags.value = res.data
    console.log(res.data)
  })
})

</script>

<template>
  <div class="bg-secondary-bg rounded px-6 py-8">
    <h2 v-for="tag in tags" :key="tag" class="text-lg text-primary-text my-2">
      <a href="#" class="text-eureka hover:underline">
        {{ tag.name }}
      </a>
    </h2>
  </div>
</template>

<style scoped>

</style>
