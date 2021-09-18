<template>
  <div style="margin-top: 15px;">
    <el-card class="box-card" style="width: 280px;">
      <div class="card-header">
<!--        <p class="title">do what you love</p>-->
        <p><i class="fas fa-user-alt" style="margin-right: 7px;"></i> lonestar <i class="fas fa-mars" style="color: steelblue;"></i></p>
        <p><i class="fas fa-map-marker-alt" style="margin-right: 7px;"></i> 常州 </p>
        <p><i class="fas fa-user-graduate" style="margin-right: 7px;"></i> college student </p>
      </div>
      <div class="card-body">
        <a href="https://github.com/wjl-lab" target="_blank"><i class="fab fa-github"></i></a>
      </div>
    </el-card>
    <el-card class="box-card" style="width: 280px; margin-top: 30px;">
      <div class="card-header">
        <p class="title">Todo</p>
        <div v-for="todo in todos.slice(0, 5)" :key="todo" class="text item">
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
  color: #777777;
}

.card-header,
.card-body {
  margin-left: 8%;
}

.title {
  font-size: 24px;
  font-weight: 500;
  /*text-align: center;*/
  color: #111;
}
</style>
