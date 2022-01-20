<template>
  <div>
    <el-form style="padding: 30px 10px;"
      :model="ruleForm"
      :rules="rules"
      ref="ruleForm"
      label-width="60px"
      class="demo-ruleForm">
      <el-form-item label="标题" prop="title" style="width: 600px;">
        <el-input v-model="ruleForm.title"></el-input>
      </el-form-item>
      <el-form-item label="题图" prop="image" style="width: 700px;">
        <el-input v-model="ruleForm.image" placeholder="请输入上传的图片链接"></el-input>
      </el-form-item>
      <el-form-item label="分类" prop="category" style="width: 300px;">
        <el-input v-model="ruleForm.category" placeholder="请选择文章分类"></el-input>
      </el-form-item>
      <el-form-item label="摘要" prop="summary">
        <el-input type="textarea" v-model="ruleForm.summary" placeholder="请输入文章摘要" style="width: 800px;"></el-input>
      </el-form-item>
      <el-form-item label="正文" prop="content">
        <md-editor theme="light" toolbarsExclude="save" id="content" v-model="ruleForm.content"></md-editor>
      </el-form-item>
      <el-form-item>
        <el-button type="primary" @click="submitForm('ruleForm')">提交</el-button>
        <el-button @click="resetForm('ruleForm')">重置</el-button>
      </el-form-item>
    </el-form>
  </div>
</template>

<script>
import MdEditor from 'md-editor-v3'
import 'md-editor-v3/lib/style.css'
import { addArticle } from '../api/article'

export default {
  name: 'EditArticle',
  components: {
    MdEditor
  },
  data () {
    return {
      ruleForm: {
        title: '',
        image: '',
        category: '',
        summary: '',
        content: ''
      },
      rules: {
        title: [{ required: true, message: '请输入标题', trigger: 'change' }],
        image: [{ required: true, message: '请输入图片的url或先上传图片', trigger: 'change' }],
        category: [{ required: true, message: '请选择文章分类', trigger: 'change' }],
        summary: [{ required: true, message: '请输入摘要', trigger: 'change' }],
        content: [{ required: true, message: '请输入正文', trigger: 'change' }]
      }
    }
  },
  methods: {
    submitForm (formName) {
      this.$refs[formName].validate((valid) => {
        if (valid) {
          addArticle(this.ruleForm).then(data => {
            // console.log(this.fileList)
            this.$router.push('/article')
          })
          alert('文章保存成功')
        }
      })
    },
    resetForm (formName) {
      this.$refs[formName].resetFields()
    }
    // filesUploadSuccess (res) {
    //   this.form.cover = res.data
    // }
  }
}
</script>

<style scoped>

</style>
