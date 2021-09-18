<template>
  <div style="margin: 20px 20px;">
    <el-card class="box-card-mid">
      <template #header>
        <div class="card-header">
          <span>开发进展</span>
        </div>
      </template>
      <el-timeline>
        <el-timeline-item v-for="idea in ideas.slice(0, 6)" :key="idea" :timestamp="new Date(idea.createTime).toLocaleString()" placement="top">
          <el-card><p>{{ idea.content }}</p></el-card>
        </el-timeline-item>
      </el-timeline>
    </el-card>
  </div>
  <div style="margin: 20px 20px;">
    <el-card class="box-card-big">
      <template #header>
        <div class="card-header">
          <span>最新文章</span>
        </div>
      </template>
      <div v-for="article in articles.slice(0, 5)" :key="article" class="text item" style="margin-bottom: 25px;">
        <p style="font-size: 18px; font-weight: 500; margin-bottom: 5px;">{{ article.title }}</p>
        <span style="color: #777777;">{{ new Date(article.updateTime).toLocaleDateString() }}</span>
        <span style="margin-left: 20px; margin-bottom: 20px;">
          <collection-tag style="width: 18px; height: 18px;" color="#777777"/>{{ article.category }}
        </span>
        <p style="font-size: 15px; font-weight: 400; margin-top: 5px;">{{ article.summary }}</p>
      </div>
    </el-card>
    <el-card class="box-card-big" style="margin-top: 20px;">
      <template #header>
        <div class="card-header">
          <span>最新留言</span>
        </div>
      </template>
      <div v-for="comment in comments.slice(0, 5)" :key="comment" class="text item">
        <el-row>
          <el-avatar :size="50" :src="comment.avatar"></el-avatar>
          <div style="margin-bottom: 20px; margin-left: 15px;">
            <p style="font-size: 18px; font-weight: 500;">{{ comment.nickname }}</p>
            <span style="color: #777777;">{{ new Date(comment.createTime).toLocaleDateString() }}</span>
          </div>
        </el-row>
        {{ comment.content }}
      </div>
    </el-card>
  </div>
  <div style="margin: 20px 20px;">
    <el-card class="box-card-small" style="margin-top: 0;">
      <template #header>
        <div class="card-header">
          <span>待办事项</span>
        </div>
      </template>
      <div v-for="todo in todos.slice(0, 5)" :key="todo" class="text item">
        <span style="color: #777777;">{{ new Date(todo.updateTime).toLocaleDateString() }}</span>
        <p style="font-size: 18px; font-weight: 500;">
          <span v-if="todo.state === 1"><close style="width: 20px; height: 20px;" color="#f56c6c"/></span>
          <span v-if="todo.state === 2"><check style="width: 20px; height: 20px;" color="#67c23a"/></span>
          {{ todo.content }}
        </p>
      </div>
    </el-card>
  </div>
</template>

<script>
import { getAllArticle } from '../api/article'
import { getAllComment } from '../api/comment'
import { getAllTodo } from '../api/todo'
import { getAllIdea } from '../api/idea'
import { CollectionTag, Check, Close } from '@element-plus/icons'

export default {
  name: 'Home',
  components: { CollectionTag, Check, Close },
  data () {
    return {
      articles: [],
      todos: [],
      comments: [],
      ideas: []
    }
  },
  created () {
    this.load()
  },
  methods: {
    load () {
      getAllArticle().then(data => {
        this.articles = data.data.reverse()
      })
      getAllComment().then(data => {
        this.comments = data.data.reverse()
      })
      getAllTodo().then(data => {
        this.todos = data.data.reverse()
      })
      getAllIdea().then(data => {
        this.ideas = data.data.reverse()
      })
    }
  }
}
</script>

<style scoped>
.card-header {
  display: flex;
  justify-content: space-between;
  align-items: center;
}

.text {
  font-size: 14px;
}

.item {
  margin-bottom: 18px;
}

.box-card-big {
  width: 850px;
}

.box-card {
  width: 780px;
}

.box-card-mid {
  width: 500px;
}

.box-card-small {
  width: 300px;
}
</style>
