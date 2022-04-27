<script setup lang="ts">

const title = '文章'
const LinkTitle = 'fsdufb'
const summary = 'fehufnerifnwifw'
const time = '2022-04-26'
const category = 'catebdfi'
</script>

<template>
  <div class="pl-scrollbar bg-primary-bg">
    <div class="max-w-screen-xl mx-auto">
      <div id="pages" class="lg:w-3/4 mx-auto px-6 md:px-8 xl:px-12 py-12">
        <h2 class="font-bold text-3xl my-4">{{ title }}</h2>
        <div class="overflow-hidden">

          <div class="mb-6" v-for="i in 3" :key="i">
            <div class="bg-secondary-bg rounded border hover:shadow-lg transition ease-in-out duration-200 px-6 pt-6 pb-4">
              <div class="flex flex-col-reverse lg:flex-row justify-between">
                <div class="w-full lg:w-2/3">
                  <div class="mb-4">
                    <a href="#" class="font-bold text-xl hover:text-eureka">{{ LinkTitle }}</a>
                  </div>
                  <div class="content">
                    {{ summary }}
                  </div>
                  <div class="flex flex-wrap flex-row items-center mt-2 text-tertiary-text">
                    <div class="mr-6 my-2">
                      <i class="fas fa-calendar mr-1"></i>
                      <span>{{ time }}</span>
                    </div>
                    <div class="mr-6 my-2">
                      <i class="fas fa-folder mr-1"></i>
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

          <div class="px-8 pt-2 hover:text-eureka">
            <a href="#" class="font-semibold">阅读更多</a>
            <font-awesome-icon icon="caret-right" />
          </div>

        </div>
      </div>
    </div>
  </div>
</template>

<style scoped>

</style>
