<template>
  <div class="container">
    <div class="login-form">
      <div class="h1-title">Lblog 后台管理系统</div>
      <div class="h2-title">登录</div>
      <el-form ref="form" :model="form" size="normal" :rules="rules">
        <el-form-item prop="username">
          <el-input v-model="form.username" prefix-icon="el-icon-user-solid"></el-input>
        </el-form-item>
        <el-form-item prop="password">
          <el-input v-model="form.password" prefix-icon="el-icon-lock" show-password></el-input>
        </el-form-item>
        <el-form-item label="">
          <el-button style="width: 100%;" type="primary" @click="login">登录</el-button>
        </el-form-item>
      </el-form>
    </div>
    <el-footer>
      powerby vue
    </el-footer>
  </div>
</template>

<script>
import request from '../utils/request'

export default {
  name: 'Login',
  data () {
    return {
      form: {},
      rules: {
        username: [{ required: true, message: 'please enter username', trigger: 'blur' }],
        password: [{ required: true, message: 'length is more than 6 but less than 16', triggr: 'blur' }]
      }
    }
  },
  created () {
    sessionStorage.removeItem('satoken')
  },
  methods: {
    login () {
      this.$refs.form.validate((valid) => {
        if (valid) {
          request.post('/login', this.form).then(res => {
            if (res.code === 200) {
              this.$message({ type: 'success', message: '登录成功' })
              sessionStorage.setItem('satoken', JSON.stringify(res.data.satoken))
              console.log(sessionStorage.getItem('satoken'))
              this.$router.push('/home')
            } else {
              this.$message({ type: 'error', message: res.msg })
            }
          })
        }
      })
    }
  }
}
</script>

<style scoped>
.container {
  width: 100%;
  height: 100vh;
  overflow: hidden;
  background-image: url("../assets/img/background.jpg");
}

.login-form {
  width: 400px;
  margin: 150px auto;
}

.h1-title {
  color: #eaeaea;
  font-size: 30px;
  text-align: center;
  padding: 30px 0;
}

.h2-title {
  color: #eaeaea;
  font-size: 20px;
  text-align: center;
  padding: 20px 0;
}

.el-footer {
  color: #777777;
  text-align: center;
  line-height: 60px;
  margin-top: 200px;
}
</style>
