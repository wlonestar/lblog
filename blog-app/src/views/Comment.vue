<template>
  <div>
    <div>
      <el-card class="text item" style="margin-bottom: 25px;">
        <div v-for="comment in comments" :key="comment" class="text item" style="margin-bottom: 20px;">
          <el-row>
            <el-avatar :size="50" :src="comment.avatar"></el-avatar>
            <div style="margin-bottom: 20px; margin-left: 15px;">
              <p style="font-size: 18px; font-weight: 500;">{{ comment.nickname }}</p>
              <span style="color: #777777;">{{ new Date(comment.createTime).toLocaleDateString() }}</span>
            </div>
          </el-row>
          <div>{{ comment.content }}</div>
        </div>
      </el-card>
      <el-pagination
        @size-change="handleSizeChange"
        @current-change="handleCurrentChange"
        :current-page="currentPage"
        :page-sizes="[5, 10, 20]"
        :page-size="pageSize"
        layout="prev, pager, next"
        :total="total">
      </el-pagination>
    </div>
    <div style="margin-top: 30px;">
      <el-card>
        <p style="margin-top: 10px; margin-bottom: 10px; font-size: 20px;">留下你想说的话吧</p>
        <el-form :model="form" :rules="rules" ref="form" label-width="70px">
          <el-form-item label="昵称">
            <el-input v-model="form.nickname" style="width: 25%;"></el-input>
          </el-form-item>
          <el-form-item label="头像路径">
            <el-input v-model="form.avatar" style="width: 70%;"></el-input>
          </el-form-item>
          <el-form-item label="网站">
            <el-input v-model="form.site" style="width: 50%;"></el-input>
          </el-form-item>
          <el-form-item label="邮箱">
            <el-input v-model="form.email" style="width: 40%;"></el-input>
          </el-form-item>
          <el-form-item label="留言">
            <el-input type="textarea" :autosize="{ minRows: 5, maxRows: 10 }" v-model="form.content" style="width: 100%;"></el-input>
          </el-form-item>
          <span class="dialog-footer">
            <el-button type="primary" @click="submitForm('form')">提交</el-button>
            <el-button @click="resetForm('form')">重置</el-button>
          </span>
        </el-form>
      </el-card>
    </div>
  </div>
</template>

<script>
import { getCommentByPage, addComment } from '../api/comment'
export default {
  name: 'Comment',
  data () {
    return {
      form: {
        nickname: '',
        avatar: '',
        site: '',
        email: '',
        content: ''
      },
      rules: {
        nickname: [{ required: true, message: '请输入昵称', trigger: 'change' }],
        avatar: [{ required: false, trigger: 'change' }],
        site: [{ required: false, trigger: 'change' }],
        email: [{ required: true, message: '请输入邮箱', trigger: 'change' }],
        content: [{ required: true, message: '请输入留言内容', trigger: 'change' }]
      },
      currentPage: 1,
      pageNum: 1,
      pageSize: 5,
      total: 0,
      comments: []
    }
  },
  created () {
    this.load()
  },
  methods: {
    load () {
      getCommentByPage(this.pageNum, this.pageSize).then(data => {
        this.comments = data.data.data.content.reverse()
        this.total = data.data.data.totalElements
      })
    },
    submitForm (formName) {
      this.$refs[formName].validate((valid) => {
        if (valid) {
          addComment(this.form).then(data => {
            this.load()
          })
          alert('留言成功')
        }
      })
    },
    resetForm (formName) {
      this.$refs[formName].resetFields()
    },
    handleSizeChange (pageSize) {
      this.pageSize = pageSize
      this.load()
    },
    handleCurrentChange (pageNum) {
      this.pageNum = pageNum
      this.load()
    }
  }
}
</script>

<style scoped>

</style>
