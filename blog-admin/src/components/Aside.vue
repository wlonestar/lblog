<template>
  <div>
    <el-menu
      style="width: 150px; min-height: calc(100vh - 50px); text-align: center;"
      default-active=""
      router
      class="el-menu-vertical-demo">
      <el-menu-item index="/home">管理首页</el-menu-item>
      <el-menu-item index="/idea">动态管理</el-menu-item>
      <el-menu-item index="/article">文章管理</el-menu-item>
      <el-menu-item index="/category">分类管理</el-menu-item>
      <el-menu-item index="/comment">留言管理</el-menu-item>
      <el-menu-item index="/file">图片上传</el-menu-item>
    </el-menu>
  </div>
</template>

<script>
export default {
  name: 'Aside'
}
</script>

<style scoped>

</style>
