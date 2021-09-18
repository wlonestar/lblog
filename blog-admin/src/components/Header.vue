<template>
  <div class="header-position">
    <div class="header-title">Lblog 后台管理</div>
    <div class="header-empty"></div>
    <div class="header-info">
      <el-dropdown size="small">
        <span class="el-dropdown-link">
          admin <i class="el-icon-arrow-down el-icon--right"></i>
        </span>
        <template #dropdown>
          <el-dropdown-menu>
<!--            <el-dropdown-item @click="$router.push('/person')">个人信息</el-dropdown-item>-->
            <el-dropdown-item @click="logout">退出</el-dropdown-item>
          </el-dropdown-menu>
        </template>
      </el-dropdown>
    </div>
  </div>
</template>

<script>
import logout from '../utils/logout'

export default {
  name: 'Header',
  props: ['user'],
  data () {
  },
  created () {
  },
  methods: {
    logout () {
      logout.post('/logout').then(data => {
        console.log(data)
        if (data.data.code === 200) {
          console.log('log2')
          this.$message({ type: 'success', message: '注销成功' })
          this.$router.push('/login')
          sessionStorage.removeItem('satoken')
        } else {
          this.$message({ type: 'error', message: data.data.msg })
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
