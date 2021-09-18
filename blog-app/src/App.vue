<template>
  <div>
    <Header></Header>
    <div style="display: flex; margin-left: 15%; width: 70%;">
      <router-view style="flex: 1; margin: 15px 5% 30px 5%;"/>
      <Aside/>
    </div>
    <Footer />
  </div>
</template>

<script>
import Aside from './components/Aside'
import Footer from './components/Footer'
import Header from './components/Header'
export default {
  name: 'App',
  components: {
    Header,
    Footer,
    Aside
  }
}
</script>

<style scoped>

</style>
