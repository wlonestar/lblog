<template>
  <div style="margin: 20px 20px 20px 20px;">
    <el-upload class="upload-demo"
      action="http://localhost:8088/files/upload"
      :on-success="fileUploadSuccess">
      <el-button size="small" type="primary">点击上传</el-button>
      <template #tip style="margin-top: 20px;">
        <div class="el-upload__tip">只能上传 jpg/png 文件，且不超过 1mb</div>
      </template>
    </el-upload>
    <P style="margin-top: 20px;">已上传图片列表</p>
    <el-card v-for="image in images" :key="image" style="margin-top: 20px; width: 600px;">
      <el-image fit="contain" style="height: 150px;" :src="image.url" :preview-src-list="[image.url]"></el-image>
      <p>{{ image.name }}</p>
      <p>{{ image.url }}</p>
    </el-card>
    <el-pagination style="margin-top: 20px;"
      @size-change="handleSizeChange"
      @current-change="handleCurrentChange"
      :current-page="currentPage"
      :page-sizes="[5, 10, 20]"
      :page-size="pageSize"
      layout="total, sizes, prev, pager, next, jumper"
      :total="total">
    </el-pagination>
  </div>
</template>

<script>
import { getAllByPage } from '../api/image'

export default {
  name: 'File',
  data () {
    return {
      currentPage: 1,
      pageNum: 1,
      pageSize: 5,
      total: 0,
      images: []
    }
  },
  created () {
    this.load()
  },
  methods: {
    load () {
      getAllByPage(this.pageNum, this.pageSize).then(res => {
        this.images = res.data.records
        console.log(res.data)
        this.total = res.data.total
      })
    },
    fileUploadSuccess (data) {
      if (data.status === 0) {
        this.$message({
          type: 'success',
          message: '上传成功'
        })
      } else {
        this.$message({
          type: 'fail',
          message: '上传失败，文件过大'
        })
      }
      this.load()
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
