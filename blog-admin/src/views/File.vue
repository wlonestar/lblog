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
    <P style="margin-top: 20px;">已上传图片列表</p>
    <div v-for="image in images" :key="image" style="margin-top: 20px;">
      <p>{{ image.name }}</p>
      <p>{{ image.url }}</p>
    </div>
  </div>
</template>

<script>
import { getAllImage } from '../api/image'

export default {
  name: 'File',
  data () {
    return {
      images: []
    }
  },
  created () {
    this.load()
  },
  methods: {
    load () {
      getAllImage().then(data => {
        console.log(data.data)
        this.images = data.data
      })
    },
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
