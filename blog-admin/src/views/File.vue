<template>
  <div style="margin: 20px 20px;">
    <el-upload class="upload-demo"
      action="http://localhost:8088/files/"
      :on-success="fileUploadSuccess">
      <el-button size="small" type="primary">点击上传</el-button>
      <template #tip style="margin-top: 20px;">
        <div class="el-upload__tip">只能上传 jpg/png 文件，且不超过 5mb</div>
      </template>
    </el-upload>
  </div>
</template>

<script>
export default {
  name: 'File',
  methods: {
    fileUploadSuccess (data) {
      console.log(data.data)
      this.$message({
        type: 'success',
        message: '您的图片路径为: ' + data.data
      })
    }
  }
}
</script>

<style scoped>

</style>
