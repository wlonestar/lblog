<script setup lang="ts">

const LinkTitle = 'fsdufb'
const Summary = 'fehufnerifnwifw'
const Time = '2022-04-26'
const category = 'catebdfi'

</script>

<template>
  <div class="bg-secondary-bg rounded px-6">
    <div class="overflow-hidden divide-y">
      <div class="py-6" v-for="i in 10" :key="i">
        <div class="flex flex-col-reverse lg:flex-row justify-between">
          <div class="w-full lg:w-2/3">
            <div class="mb-4">
              <a href="#" class="font-bold text-xl hover:text-eureka">{{ LinkTitle }}</a>
            </div>
            <div class="content">
              {{ Summary }}
            </div>
            <div class="flex flex-wrap flex-row items-center mt-2 text-tertiary-text">
              <div class="mr-6 my-2">
                <font-awesome-icon icon="calendar" class="mr-1"/>
                <span>{{ Time }}</span>
              </div>
              <div class="mr-6 my-2">
                <font-awesome-icon icon="folder" class="mr-1" />
                <a href="#" class="hover:text-eureka">{{ category }}</a>
              </div>
            </div>
          </div>
          <div class="w-full lg:w-1/3 mb-4 lg:mb-0 lg:ml-8">
            <img src="https://mypic-1305118058.cos.ap-hongkong.myqcloud.com/img/Snipaste_2022-04-09_21-28-25.png" class="w-full" alt="Featured Image">
          </div>
        </div>
      </div>
    </div>
  </div>
  <ul class="pagination pagination-default">
    <li class="page-item disabled">
      <a aria-disabled="true" aria-label="First" class="page-link" role="button" tabindex="-1"><span aria-hidden="true">««</span></a>
    </li>
    <li class="page-item disabled">
      <a aria-disabled="true" aria-label="Previous" class="page-link" role="button" tabindex="-1"><span aria-hidden="true">«</span></a>
    </li>
    <li class="page-item active">
      <a aria-current="page" aria-label="Page 1" class="page-link" role="button">1</a>
    </li>
    <li class="page-item">
      <a href="/posts/page/2/" aria-label="Page 2" class="page-link" role="button">2</a>
    </li>
    <li class="page-item">
      <a href="/posts/page/3/" aria-label="Page 3" class="page-link" role="button">3</a>
    </li>
    <li class="page-item">
      <a href="/posts/page/2/" aria-label="Next" class="page-link" role="button"><span aria-hidden="true">»</span></a>
    </li>
    <li class="page-item">
      <a href="/posts/page/8/" aria-label="Last" class="page-link" role="button"><span aria-hidden="true">»»</span></a>
    </li>
  </ul>
</template>

<style scoped>

</style>
