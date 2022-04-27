<script setup lang="ts">

const Title = 'LoneStar'
const role = 'student'
const bio = 'wefwf'

</script>

<template>
  <div class="pl-scrollbar bg-secondary-bg">
    <div class="max-w-screen-xl mx-auto">
      <div id="#about" class="lg:w-3/4 mx-auto px-6 md:px-8 xl:px-12 py-12">
        <div class="flex flex-col md:flex-row items-center justify-center mb-12">
          <div class="flex-none w-48 mx-auto md:ml-0 md:mr-8 md:pr-8 md:border-r">
            <img src="https://blog.wangjialei.xyz/images/avatar.jpg" class="rounded-full" alt="Avatar">
          </div>
          <div class="flex-grow mt-4 md:mt-0">
            <div class="text-3xl py-4">{{ Title }}</div>
            <div class="w-3/12 xl:w-2/12 border-b"></div>
            <div class="flex items-center pt-4">
              <font-awesome-icon icon="user" />
              <div class="flex flex-wrap">
                <span class="pl-4">{{ role }}</span>
              </div>
            </div>
            <div class="py-8 text-lg leading-normal">
              {{ bio }}
            </div>
          </div>
          <div class="flex md:flex-col justify-center items-end ml-8">
            <div class="pb-2 pr-4 md:pr-0 pt-4 md:pt-0">
              <a href="">
                <font-awesome-icon icon="envelope" />
              </a>
            </div>
          </div>
        </div>
        <div class="content">
          <h2 id="关于我">👨‍💻关于我</h2>
          <p>半个技术宅😎，喜欢尝试新事物，想法很多</p>
          <p>HHU计算机专业在读</p>
          <p>全栈修炼中，对深度学习感兴趣</p>
          <p>审美在线，偶尔画画😙</p>
          <h2 id="关于博客">关于博客</h2>
          <p>本博客基于 hugo 搭建</p>
          <p>利用博客写下学习生活过程中的笔记、过程、想法</p>
          <p>希望写博客能提高自己的技术水平</p>
          <h2 id="github-contributions">Github Contributions</h2>
          <p><img src="https://ghchart.rshah.org/wjl-lab" alt=""></p>
          <h2 id="开源项目">开源项目</h2>
          <ul>
            <li>
              <p><a href="https://github.com/wjl-lab/walk-with-you">wjl-lab/walk-with-you:【与你同行】校网赛项目</a></p>
            </li>
            <li>
              <p><a href="https://github.com/wjl-lab/lblog">wjl-lab/lblog: 前后端分离个人博客，支持markdown渲染，图片上传下载</a></p>
            </li>
            <li>
              <p><a href="https://github.com/wjl-lab/vue-stack">wjl-lab/vue-stack: 随便写的 Vue 个人博客模板，仅供参考</a></p>
            </li>
            <li>
              <p><a href="https://github.com/wjl-lab/hugo-theme-stack">wjl-lab/hugo-theme-stack: 魔改的 hugo-theme-stack 主题</a></p>
            </li>
            <li>
              <p>…</p>
            </li>
          </ul>
          <h2 id="其他">其他</h2>
          <p>GitHub：<a href="https://github.com/wjl-lab">wjl-lab</a></p>
          <p>B站up主，佛系更新： <a href="https://space.bilibili.com/433694656">-lonestar-</a></p>
        </div>
      </div>
    </div>
  </div>
</template>

<style scoped>

</style>
