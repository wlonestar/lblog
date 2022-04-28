<template>
  <div style="margin: 10px 20px;">
    <div style="margin: 10px 10px;">
      <el-button type="primary" @click="add">新增</el-button>
    </div>
    <el-table :data="tableData" border stripe style="width: 80%">
      <el-table-column prop="createTime" label="创建时间" sortable width="180px;">
        <template #default="scope">
          <i class="el-icon-time"></i>
          <span style="margin-left: 10px">{{ new Date(scope.row.createTime).toLocaleString() }}</span>
        </template>
      </el-table-column>
      <el-table-column prop="updateTime" label="更新时间" sortable width="180px;">
        <template #default="scope">
          <i class="el-icon-time"></i>
          <span style="margin-left: 10px">{{ new Date(scope.row.modifyTime).toLocaleString() }}</span>
        </template>
      </el-table-column>
      <el-table-column prop="content" label="内容" sortable></el-table-column>
      <el-table-column label="操作"  width="155px;">
        <template #default="scope">
          <el-button @click="handleEdit(scope.row)" size="mini">编辑</el-button>
          <el-popconfirm title="确定删除动态吗？" @confirm="handleDelete(scope.row.id)">
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
import { addIdea, deleteIdea, getIdeaByPage, updateIdea } from '@/api/idea'

export default {
  name: 'Idea',
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
      getIdeaByPage(this.pageNum, this.pageSize).then(res => {
        console.log(res)
        this.tableData = res.data.records
        this.total = res.data.total
      })
    },
    add () {
      this.dialogVisible = true
      this.form = {}
    },
    save () {
      if (this.form.id) {
        updateIdea(this.form.id, this.form).then(res => {
          if (res.status === 0) {
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
      } else {
        addIdea(this.form).then(data => {
          if (data.status === 0) {
            this.$message({
              type: 'success',
              message: 'add success'
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
    handleEdit (row) {
      this.form = JSON.parse(JSON.stringify(row))
      // console.log(this.form)
      this.dialogVisible = true
    },
    handleDelete (id) {
      deleteIdea(id).then(res => {
        if (res.status === 0) {
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
