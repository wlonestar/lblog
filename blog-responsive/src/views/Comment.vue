<template>
  <section class="article-page">
    <article class="main-article">
      <header class="article-header">
        <div class="article-details">
          <h2 class="article-title"><a href="/comment">留言</a></h2>
          <h4 class="article-subtitle">在这里留下你的足迹吧~</h4>
        </div>
      </header>
      <n-form :model="model" ref="model" :rules="rules" size="small" label-width="80" style="margin: 20px 40px 20px 40px;">
        <n-form-item path="nickname" label="昵称">
          <n-input v-model:value="model.nickname" @keydown.enter.prevent :style="{ width: '40%' }" />
        </n-form-item>
        <n-form-item path="avatar" label="头像">
          <n-input v-model:value="model.avatar" @keydown.enter.prevent :style="{ width: '50%' }" />
        </n-form-item>
        <n-form-item path="email" label="邮箱">
          <n-input v-model:value="model.email" @keydown.enter.prevent :style="{ width: '50%' }" />
        </n-form-item>
        <n-form-item path="site" label="网站">
          <n-input v-model:value="model.site" @keydown.enter.prevent :style="{ width: '70%' }" />
        </n-form-item>
        <n-form-item path="content" label="留言内容">
          <n-input v-model:value="model.content" type="textarea" @keydown.enter.prevent />
        </n-form-item>
        <n-row :gutter="[0, 24]">
          <n-col :span="24">
            <div style="display: flex; justify-content: flex-end;">
              <n-button @click="handleSumit('model')" round type="primary">提交</n-button>
            </div>
          </n-col>
        </n-row>
      </n-form>
      <section class="article-content">
        <n-thing v-for="comment in comments" :key="comment" style="margin-bottom: 20px;">
          <template #avatar>
            <n-avatar :size="48" :src="comment.avatar"/>
          </template>
          <template #header>{{ comment.nickname }}</template>
          <template #description> {{ comment.email }} </template>
          <p>{{ comment.content }}</p>
        </n-thing>
      </section>
    </article>
  </section>
</template>

<script>
import { addComment, getAllComment } from '../api/comment'
import { NThing, NAvatar, NForm, NFormItem, NButton, NRow, NCol, NInput } from 'naive-ui'
export default {
  name: 'Comment',
  components: { NThing, NAvatar, NForm, NFormItem, NButton, NRow, NCol, NInput },
  data () {
    return {
      model: {
        nickname: '',
        avatar: '',
        site: '',
        email: '',
        content: ''
      },
      rules: {
        nickname: [{ required: true, message: '请输入昵称', trigger: 'change' }],
        avatar: [{ required: true, message: '请选择您的头像路径', trigger: 'change' }],
        site: [{ required: false, trigger: 'change' }],
        email: [{ required: true, message: '请输入邮箱', trigger: 'change' }],
        content: [{ required: true, message: '请输入留言内容', trigger: 'change' }]
      },
      comments: [
        {
          id: 4,
          createTime: '',
          avatar: '',
          nickname: '',
          site: '',
          email: '',
          content: ''
        }
      ]
    }
  },
  created () {
    this.load()
  },
  methods: {
    load () {
      getAllComment().then(data => {
        this.comments = data.data.data.reverse()
      })
    },
    handleSumit (form) {
      this.$refs[form].validate((valid) => {
        if (valid) {
          addComment(this.model).then(data => {
            this.load()
          })
          alert('留言成功')
        }
      })
    }
  }
}
</script>

<style scoped>

</style>
