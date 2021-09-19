<template>
  <div>
    <el-card v-for="category in categories" :key="category.id" class="text item" style="margin-bottom: 25px;">
      <p style="font-size: 24px; font-weight: 500; margin-bottom: 5px;">
        <a @click="redirectToCategory(category.id)">{{ category.name }}</a>
        <span style="margin-left: 1%">({{ category.number }})</span>
      </p>
      <p style="font-size: 15px; font-weight: 400; margin-top: 5px;">{{ category.description }}</p>
    </el-card>
  </div>
</template>

<script>
import { getAllCategory } from '../api/category'
export default {
  name: 'CategoryList',
  data () {
    return {
      categories: []
    }
  },
  created () {
    this.load()
  },
  methods: {
    load () {
      getAllCategory().then(data => {
        this.categories = data.data.data
      })
    },
    redirectToCategory (id) {
      this.$router.push(`/category/${id}`)
    }
  }
}
</script>

<style scoped>
a {
  cursor: pointer;
  color: #000;
}
</style>
