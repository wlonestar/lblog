<template>
  <div style="margin: 20px 20px 20px 20px;">
    <el-col :span="8">
      <el-card :body-style="{ padding: '0px' }">
        <img :src="user.avatar" class="image" alt=""/>
        <div style="padding: 14px">
          <h3>{{ user.title }}</h3>
          <span>{{ user.subtitle }}</span>
        </div>
      </el-card>
    </el-col>
  </div>
</template>

<script>
import { getInfo, update } from '../api/setting'

export default {
  name: 'Person',
  data () {
    return {
      user: {
        username: '',
        title: '',
        subtitle: '',
        avatar: ''
      }
    }
  },
  created () {
    this.load()
  },
  methods: {
    load () {
      getInfo(localStorage.getItem('user')).then(data => {
        this.user = data.data
      })
    },
    edit () {
      update().then(data => {
      })
    }
  }
}
</script>

<style scoped>

</style>
