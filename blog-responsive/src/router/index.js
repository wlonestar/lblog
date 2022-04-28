import { createRouter, createWebHistory } from 'vue-router'
import Home from '../views/Home.vue'

const routes = [
  {
    path: '/',
    name: 'Home',
    component: Home
  },
  {
    path: '/p/:title',
    name: 'Post',
    component: () => import('../views/Post.vue')
  },
  {
    path: '/archive',
    name: 'Archive',
    component: () => import('../views/Archive.vue')
  },
  {
    path: '/category',
    name: 'CategoryList',
    component: () => import('../views/CategoryList.vue')
  },
  {
    path: '/category/:name',
    name: 'Category',
    component: () => import('../views/Category.vue')
  },
  {
    path: '/comment',
    name: 'Comment',
    component: () => import('../views/Comment.vue')
  },
  {
    path: '/about',
    name: 'About',
    component: () => import('../views/About.vue')
  }
]

const router = createRouter({
  history: createWebHistory(process.env.BASE_URL),
  routes
})

export default router
