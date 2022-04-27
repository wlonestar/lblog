<script setup lang="ts">

const categories = [
  'category1',
  'category2',
  'category3',
  'category4',
  'category5'
]

</script>

<template>
  <div class="bg-secondary-bg rounded px-6 py-8">
    <h2 v-for="category in categories" :key="category" class="text-lg text-primary-text my-2">
      <a href="#" class="text-eureka hover:underline">
        {{ category }}
      </a>
    </h2>
  </div>
</template>

<style scoped>

</style>
