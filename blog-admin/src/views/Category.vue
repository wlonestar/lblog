<template>
  <div style="margin: 10px 20px;">
    <div style="margin: 10px 10px;">
      <el-button type="primary" @click="add">新增</el-button>
    </div>
    <el-table :data="tableData" border stripe style="width: 100%">
      <el-table-column prop="name" label="名称" sortable></el-table-column>
      <el-table-column prop="createTime" label="创建时间" sortable></el-table-column>
      <el-table-column prop="updateTime" label="更新时间" sortable></el-table-column>
      <el-table-column prop="description" label="描述" sortable></el-table-column>
      <el-table-column prop="number" label="文章数" sortable></el-table-column>
      <el-table-column label="操作">
        <template #default="scope">
          <el-button @click="handleEdit(scope.row)" size="mini">编辑</el-button>
          <el-popconfirm title="确定删除分类吗？请确定该分类下文章数为零" @confirm="handleDelete(scope.row.id)">
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
          <el-form-item label="名称">
            <el-input v-model="form.name" style="width: 60%;"></el-input>
          </el-form-item>
          <el-form-item label="描述">
            <el-input v-model="form.description" style="width: 60%;"></el-input>
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
import { addCategory, deleteCategory, getCategoryByPage, updateCategory } from '../api/category'

export default {
  name: 'Category',
  data () {
    return {
      form: {},
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
      getCategoryByPage(this.pageNum, this.pageSize).then(data => {
        this.tableData = data.data.content
        this.total = data.data.totalElements
      })
    },
    add () {
      this.dialogVisible = true
      this.form = {}
    },
    save () {
      if (this.form.id) {
        updateCategory(this.form.id, this.form).then(data => {
          // console.log(data)
          if (data.code === 200) {
            this.$message({
              type: 'success',
              message: '更新成功'
            })
          } else {
            this.$message({
              type: 'error',
              message: data.msg
            })
          }
          this.load()
          this.dialogVisible = false
        })
      } else {
        addCategory(this.form).then(data => {
          // console.log(data)
          if (data.code === 200) {
            this.$message({
              type: 'success',
              message: '更新成功'
            })
          } else {
            this.$message({
              type: 'error',
              message: data.msg
            })
          }
          this.load()
          this.dialogVisible = false
        })
      }
    },
    update (id, form) {
      updateCategory(id, form).then(res => {
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
      // console.log(this.form)
      this.dialogVisible = true
    },
    handleDelete (id) {
      deleteCategory(id).then(res => {
        if (res.code === 200) {
          this.$message({
            type: 'success',
            message: '删除分类成功'
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
