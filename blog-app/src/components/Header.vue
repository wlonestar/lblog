<template>
  <div class="header-position">
    <div style="flex: 0.25;"></div>
    <div class="header-title"> Lblog </div>
    <router-link to="/"><i class="fas fa-home" style="margin-right: 7px;"></i>首 页</router-link>
    <router-link to="/archive"><i class="fas fa-archive" style="margin-right: 7px;"></i>归 档</router-link>
    <router-link to="/category"><i class="far fa-bookmark" style="margin-right: 11px;"></i>分 类</router-link>
    <router-link to="/comment"><i class="far fa-comment-alt" style="margin-right: 7px;"></i>留 言</router-link>
    <router-link to="/about"><i class="fas fa-user-alt" style="margin-right: 7px;"></i>关 于</router-link>
    <div style="flex: 0.45;"></div>
    <div class="header-info">
      <router-link to="/about">
        <img src="../assets/img/avatar.jpg" alt="" style="width: 45px; height: 45px; border-radius: 20%; margin-top: 5px;">
      </router-link>
    </div>
  </div>
</template>

<script>
export default {
  name: 'Header'
}
</script>

<style scoped>
.header-position {
  height: 55px;
  line-height: 55px;
  border-bottom: 1px solid #ccc;
  display: flex;
  background-color: transparent;
}

.header-title {
  width: 60px;
  font-weight: bold;
  font-size: 20px;
  color: dodgerblue;
  margin-left: 10px;
  margin-right: 10px;
}

.header-info {
  width: 50px;
}

a:hover {
  color: #000;
}

a {
  font-size: 17px;
  margin-right: 10px;
  margin-left: 10px;
}

</style>
