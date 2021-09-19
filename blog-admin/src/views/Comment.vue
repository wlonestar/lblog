<template>
  <div style="margin: 20px 20px;">
    <el-table :data="tableData" border stripe style="width: 100%">
      <el-table-column prop="createTime" label="创建时间" sortable width="180px;">
        <template #default="scope">
          <i class="el-icon-time"></i>
          <span style="margin-left: 10px">{{ new Date(scope.row.createTime).toLocaleString() }}</span>
        </template>
      </el-table-column>
      <el-table-column prop="updateTime" label="头像" sortable width="180px;">
        <template #default="scope">
          <el-image fit="contain" style="height: 100px;" :src="scope.row.avatar" :preview-src-list="[scope.row.image]"></el-image>
        </template>
      </el-table-column>
      <el-table-column prop="content" label="内容" sortable></el-table-column>
      <el-table-column prop="site" label="网站" sortable></el-table-column>
      <el-table-column prop="email" label="邮箱" sortable></el-table-column>
      <el-table-column label="操作"  width="155px;">
        <template #default="scope">
          <el-popconfirm title="确定删除文章吗？" @confirm="handleDelete(scope.row.id)">
            <template #reference>
              <el-button type="danger" size="mini">删除</el-button>
            </template>
          </el-popconfirm>
        </template>
      </el-table-column>
    </el-table>
    <div style="margin: 10px 0;">
      <el-pagination
        @size-change="handleSizeChange"
        @current-change="handleCurrentChange"
        :current-page="currentPage"
        :page-sizes="[5, 10, 20]"
        :page-size="pageSize"
        layout="total, sizes, prev, pager, next, jumper"
        :total="total">
      </el-pagination>
      <el-dialog title="编辑" v-model="dialogVisible" width="50%" center>
        <el-form :model="form" label-width="100px">
          <el-form-item label="图片">
            <el-input v-model="form.image" style="width: 100%;"></el-input>
          </el-form-item>
          <el-form-item label="内容">
            <el-input type="textarea" :autosize="{ minRows: 5, maxRows: 10 }" v-model="form.content" style="width: 100%;"></el-input>
          </el-form-item>
        </el-form>
        <template #footer>
          <span class="dialog-footer">
            <el-button @click="dialogVisible = false">取 消</el-button>
            <el-button type="submit" @click="save">确 定</el-button>
          </span>
        </template>
      </el-dialog>
    </div>
  </div>
</template>

<script>
import { deleteComment, getCommentByPage } from '../api/comment'

export default {
  name: 'Comment',
  data () {
    return {
      form: {
        id: '',
        title: '',
        image: '',
        category: '',
        summary: '',
        content: ''
      },
      dialogVisible: false,
      currentPage: 1,
      pageNum: 1,
      pageSize: 5,
      total: 0,
      tableData: []
    }
  },
  created () {
    this.load()
  },
  methods: {
    load () {
      getCommentByPage(this.pageNum, this.pageSize).then(data => {
        this.tableData = data.data.content
        this.total = data.data.totalElements
      })
    },
    add () {
      this.dialogVisible = true
      this.form = {}
    },
    handleEdit (row) {
      this.form = JSON.parse(JSON.stringify(row))
      // console.log(this.form)
      this.dialogVisible = true
    },
    handleDelete (id) {
      deleteComment(id).then(res => {
        if (res.code === 200) {
          this.$message({
            type: 'success',
            message: '删除动态成功'
          })
        } else {
          this.$message({
            type: 'error',
            message: res.msg
          })
        }
        this.load()
        this.dialogVisible = false
      })
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
