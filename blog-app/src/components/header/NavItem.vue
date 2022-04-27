<script setup lang="ts">
import { ref } from 'vue'

const stored = localStorage.getItem('menuSelected')

let selected = ref(-1)

const SiteTitle: string = 'LoneStar\'s blog'

if (stored) {
  selected = ref(parseInt(stored))
}

const changeSelected = (i: number) => {
  selected.value = i
  localStorage.setItem('menuSelected', JSON.stringify(i))
}

</script>

<template>
  <nav class="flex items-center justify-between flex-wrap px-4 py-4 md:py-0">
    <a href="/" @click="changeSelected(-1)" class="mr-6 text-primary-text text-xl font-bold">
      {{ SiteTitle }}
    </a>
    <div id="target" class="hidden block md:flex md:flex-grow md:justify-between md:items-center w-full md:w-auto text-primary-text z-20">
      <div class="md:flex md:h-16 text-sm md:flex-grow pb-4 md:pb-0 border-b md:border-b-0">
        <a href="/posts" @click="changeSelected(0)" :class='{"selected-menu-item": selected === 0}'
           class="block mt-4 md:inline-block md:mt-0 md:h-(16-4px) md:leading-(16-4px) box-border md:border-t-2 md:border-b-2 border-transparent mr-4">
          文章
        </a>
        <a href="/categories" @click="changeSelected(1)" :class='{"selected-menu-item": selected === 1}'
           class="block mt-4 md:inline-block md:mt-0 md:h-(16-4px) md:leading-(16-4px) box-border md:border-t-2 md:border-b-2 border-transparent mr-4">
          分类
        </a>
        <a href="/tags" @click="changeSelected(2)" :class='{"selected-menu-item": selected === 2}'
           class="block mt-4 md:inline-block md:mt-0 md:h-(16-4px) md:leading-(16-4px) box-border md:border-t-2 md:border-b-2 border-transparent mr-4">
          标签
        </a>
        <a href="/about" @click="changeSelected(3)" :class='{"selected-menu-item": selected === 3}'
           class="block mt-4 md:inline-block md:mt-0 md:h-(16-4px) md:leading-(16-4px) box-border md:border-t-2 md:border-b-2 border-transparent mr-4">
          关于
        </a>
      </div>
    </div>
  </nav>
</template>

<style scoped>

</style>
