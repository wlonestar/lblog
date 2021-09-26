<template>
  <aside class="sidebar left-sidebar sticky">
    <button class="hamburger hamburger--spin" type="button" id="toggle-menu" aria-label="">
        <span class="hamburger-box">
            <span class="hamburger-inner"></span>
        </span>
    </button>
    <header class="site-info">
      <figure class="site-avatar">
        <img :src="info.avatar" class="site-logo" loading="lazy" alt="Avatar">
        <span class="emoji">3</span>
      </figure>
      <h1 class="site-name"><a href="#">{{ info.title }}</a></h1>
      <h2 class="site-description">{{ info.subtitle }}</h2>
    </header>
    <ol class="menu" id="main-menu">
      <li>
        <router-link to="/">
          <Home class="icon"></Home><span>首页</span>
        </router-link>
      </li>
      <li>
        <router-link to="/archive">
          <Archive class="icon"></Archive><span>归档</span>
        </router-link>
      </li>
      <li>
        <router-link to="/category">
          <Bookmark class="icon"></Bookmark><span>分类</span>
        </router-link>
      </li>
      <li>
        <router-link to="/link">
          <Link class="icon"></Link><span>友链</span>
        </router-link>
      </li>
      <li>
        <router-link to="/about">
          <User class="icon"></User><span>关于</span>
        </router-link>
      </li>
    </ol>
  </aside>
</template>

<script>
import { Home, Archive, Bookmark, Link, User } from '@vicons/fa'
import { getInfoById } from '../api/user'
export default {
  name: 'Left',
  components: {
    Home,
    Archive,
    Bookmark,
    Link,
    User
  },
  data () {
    return {
      info: {}
    }
  },
  created () {
    this.load()
  },
  methods: {
    load () {
      getInfoById(1).then(data => {
        this.info = data.data.data
      })
    }
  }
}
</script>

<style scoped>
.icon {
  color: #555
}
</style>
