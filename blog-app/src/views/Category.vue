<template>
  <div>
    <el-card style="margin-bottom: 25px; background-color: #eeeeee;">
      <p style="font-size: 24px; font-weight: 500; margin-bottom: 5px;">
        {{ category.name }}
        <span style="margin-left: 1%">({{ category.number }})</span>
      </p>
      <p style="font-size: 15px; font-weight: 400; margin-top: 5px;">{{ category.description }}</p>
    </el-card>
    <el-card v-for="article in category.articleList" :key="article.id" class="text item" style="margin-bottom: 15px;">
      <p style="font-size: 22px; font-weight: 500; margin-bottom: 5px;">{{ article.title }}</p>
      <span style="color: #777777;">{{ new Date(article.updateTime).toLocaleDateString() }}</span>
      <p style="font-size: 15px; font-weight: 400; margin-top: 5px;">{{ article.summary }}</p>
    </el-card>
  </div>
</template>

<script>
import { getCategory } from '../api/category'
export default {
  name: 'Category',
  data () {
    return {
      category: {}
    }
  },
  created () {
    this.load()
  },
  methods: {
    load () {
      getCategory(this.$route.params.id).then(data => {
        this.category = data.data.data
      })
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
