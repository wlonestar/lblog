<template>
  <div>
    <Header></Header>
    <div class="main" style="display: flex;">
      <router-view style="flex: 1; margin: 30px 30px 30px 0;"/>
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
@media (max-width: 1920px) {
  .main {
    margin-left: 20%;
    margin-right: 20%;
  }
}

@media (max-width: 1440px) {
  .main {
    margin-left: 5%;
    margin-right: 5%;
  }
}

@media (max-width: 700px) {
  .main {
    margin-left: 5%;
    margin-right: 5%;
  }
}
</style>
