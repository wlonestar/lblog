<template>
  <div class="container main-container flex on-phone--column extended">
    <Left></Left>
    <main class="main full-width">
      <router-view></router-view>
      <Footer></Footer>
    </main>
    <Right></Right>
  </div>
</template>

<script>
import Left from './components/Left.vue'
import Right from './components/Right.vue'
import Footer from './components/Footer.vue'
export default {
  name: 'App',
  components: { Left, Right, Footer }
}
</script>

<style>

</style>
