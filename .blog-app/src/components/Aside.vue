<template>
  <div style="margin-top: 30px;">
    <el-card class="box-card" style="width: 280px;">
      <div class="card-header">
          <router-link to="/about">
            <img src="../assets/img/avatar.jpg" alt="" style="width: 100%; height: 100%; border-radius: 2%;">
          </router-link>
        <p><i class="fas fa-user-alt"></i> lonestar <i class="fas fa-mars" style="color: steelblue;"></i></p>
        <p><i class="fas fa-map-marker-alt"></i> 常州 </p>
      </div>
    </el-card>
    <el-card class="box-card" style="width: 280px; margin-top: 30px;">
      <div class="card-header">
        <p class="title">Todo</p>
        <div v-for="todo in todos.slice(0, 5)" :key="todo" class="text item" style="margin-bottom: 10px;">
          <span style="color: #777777;">{{ new Date(todo.updateTime).toLocaleString() }}</span>
          <p style="font-size: 18px; font-weight: 500;">
            <span v-if="todo.state === 1"><close style="width: 20px; height: 20px;" color="#f56c6c"/></span>
            <span v-if="todo.state === 2"><check style="width: 20px; height: 20px;" color="#67c23a"/></span>
            {{ todo.content }}
          </p>
        </div>
      </div>
    </el-card>
  </div>
</template>

<script>
import { getAllTodo } from '../api/todo'
import { Check, Close } from '@element-plus/icons'

export default {
  name: 'Aside',
  components: { Check, Close },
  data () {
    return {
      todos: []
    }
  },
  created () {
    this.load()
  },
  methods: {
    load () {
      getAllTodo().then(data => {
        this.todos = data.data.data.reverse()
      })
    }
  }
}
</script>

<style scoped>
p {
  margin-top: 4px;
  margin-bottom: 4px;
  font-size: 18px;
  font-weight: inherit;
  color: #000;
}

i {
  margin-right: 7px;
  color: #777777;
}

.title {
  font-size: 24px;
  font-weight: 500;
  color: #111;
  margin-bottom: 15px;
}
</style>
