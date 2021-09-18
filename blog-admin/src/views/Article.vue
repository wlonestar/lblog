<template>
  <div style="margin: 10px 20px;">
    <div style="margin: 10px 10px;">
      <el-button type="primary" @click="$router.push('/article/edit')">新增</el-button>
    </div>
    <el-table :data="tableData" border stripe style="width: 100%">
      <el-table-column prop="createTime" label="创建时间" sortable width="180px;">
        <template #default="scope">
          <i class="el-icon-time"></i>
          <span style="margin-left: 10px">{{ new Date(scope.row.createTime).toLocaleString() }}</span>
        </template>
      </el-table-column>
      <el-table-column prop="updateTime" label="更新时间" sortable width="180px;">
        <template #default="scope">
          <i class="el-icon-time"></i>
          <span style="margin-left: 10px">{{ new Date(scope.row.updateTime).toLocaleString() }}</span>
        </template>
      </el-table-column>
      <el-table-column prop="title" label="标题" sortable></el-table-column>
      <el-table-column prop="summary" label="摘要" sortable></el-table-column>
      <el-table-column label="题图">
        <template #default="scope">
          <el-image fit="contain" style="height: 100px;" :src="scope.row.image" :preview-src-list="[scope.row.image]"></el-image>
        </template>
      </el-table-column>
      <el-table-column prop="category" label="分类" sortable></el-table-column>
      <el-table-column label="操作"  width="155px;">
        <template #default="scope">
          <el-button @click="handleEdit(scope.row)" size="mini">编辑</el-button>
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
      <el-dialog title="编辑" v-model="dialogVisible" width="90%" center>
        <el-form :model="form" label-width="100px">
          <el-form-item label="标题">
            <el-input v-model="form.title" style="width: 80%;"></el-input>
          </el-form-item>
          <el-form-item label="题图">
            <el-input v-model="form.image" style="width: 80%;"></el-input>
          </el-form-item>
          <el-form-item label="分类">
            <el-input v-model="form.category" style="width: 80%;"></el-input>
          </el-form-item>
          <el-form-item label="摘要">
            <el-input v-model="form.summary" style="width: 80%;"></el-input>
          </el-form-item>
          <el-form-item label="正文">
            <md-editor theme="light" toolbarsExclude="save" id="content" v-model="form.content"></md-editor>
          </el-form-item>
        </el-form>
        <template #footer>
          <span class="dialog-footer">
            <el-button @click="dialogVisible = false">取 消</el-button>
            <el-button type="submit" @click="update(form.id, form)">确 定</el-button>
          </span>
        </template>
      </el-dialog>
    </div>
  </div>
</template>

<script>
import MdEditor from 'md-editor-v3'
import 'md-editor-v3/lib/style.css'
import { deleteArticle, getArticleByPage, updateArticle } from '../api/article'

export default {
  name: 'Article',
  components: {
    MdEditor
  },
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
      pageNum: 0,
      pageSize: 10,
      total: 0,
      tableData: []
    }
  },
  created () {
    this.load()
  },
  methods: {
    load () {
      getArticleByPage(this.pageNum, this.pageSize).then(data => {
        this.tableData = data.data.content
        this.total = data.data.totalElements
      })
    },
    update (id, form) {
      updateArticle(id, form).then(res => {
        if (res.code === 200) {
          this.$message({
            type: 'success',
            message: 'add success'
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
    handleEdit (row) {
      this.form = JSON.parse(JSON.stringify(row))
      console.log(this.form)
      this.dialogVisible = true
    },
    handleDelete (id) {
      deleteArticle(id).then(res => {
        if (res.code === 200) {
          this.$message({
            type: 'success',
            message: '删除文章成功'
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
