<template>
  <div class="header-position">
    <div class="header-title">Lblog 后台管理</div>
    <div class="header-empty"></div>
    <el-avatar shape="square" :size="45" :src="user.avatar" style="margin-top:2px;"></el-avatar>
    <div class="header-info">
      <el-dropdown size="small">
        <span class="el-dropdown-link">
          {{ user.username }} <i class="el-icon-arrow-down el-icon--right"></i>
        </span>
        <template #dropdown>
          <el-dropdown-menu>
            <el-dropdown-item @click="$router.push('/person')">个人信息</el-dropdown-item>
            <el-dropdown-item @click="logout">退出</el-dropdown-item>
          </el-dropdown-menu>
        </template>
      </el-dropdown>
    </div>
  </div>
</template>

<script>
import { getInfo } from '@/api/setting'
import { logout } from '@/api/logout'

export default {
  name: 'Header',
  data () {
    return {
      user: {}
    }
  },
  created () {
    this.load()
  },
  methods: {
    load () {
      getInfo(3).then(data => {
        this.user = data.data
      })
    },
    logout () {
      const token = localStorage.getItem('satoken')
      console.log(token)
      logout(token).then(res => {
        console.log(res)
        if (res.status === 0) {
          this.$message({ type: 'success', message: '注销成功' })
          this.$router.push('/login')
          localStorage.removeItem('satoken')
          localStorage.removeItem('user')
        } else {
          this.$message({ type: 'error', message: res.data.msg })
        }
      })
    }
  }
}
</script>

<style scoped>
.header-position {
  height: 50px;
  line-height: 50px;
  border-bottom: 1px solid #ccc;
  display: flex;
  background-color: transparent;
}

.header-title {
  width: 200px;
  padding-left: 30px;
  font-weight: bold;
  color: dodgerblue;
}

.header-empty {
  flex: 1;
}

.header-info {
  width: 100px;
}
</style>
