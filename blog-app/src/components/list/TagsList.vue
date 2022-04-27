<script setup lang="ts">

const tags = [
  'tag1',
  'tag2',
  'tag3',
  'tag4',
  'tag5',
  'tag6',
  'tag7',
  'tag8',
  'tag9'
]

</script>

<template>
  <div class="bg-secondary-bg rounded px-6 py-8">
    <h2 v-for="tag in tags" :key="tag" class="text-lg text-primary-text my-2">
      <a href="#" class="text-eureka hover:underline">
        {{ tag }}
      </a>
    </h2>
  </div>
</template>

<style scoped>

</style>
