import { createRouter, createWebHistory } from 'vue-router'
import HomeView from '../views/HomeView.vue'
import AdminHomeView from '../views/admin/AdminHomeView.vue'

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/',
      name: 'home',
      component: HomeView
    },
    {
      path: '/posts',
      name: 'posts',
      component: () => import('../views/PostsView.vue')
    },
    {
      path: '/posts/:title',
      name: 'post',
      props: true,
      component: () => import('../views/PostView.vue')
    },
    {
      path: '/categories',
      name: 'categories',
      component: () => import('../views/CategoriesView.vue')
    },
    {
      path: '/categories/:name',
      name: 'category',
      props: true,
      component: () => import('../views/CategoryView.vue')
    },
    {
      path: '/tags',
      name: 'tags',
      component: () => import('../views/TagsView.vue')
    },
    {
      path: '/tags/:name',
      name: 'tag',
      props: true,
      component: () => import('../views/TagView.vue')
    },
    {
      path: '/about',
      name: 'about',
      component: () => import('../views/HomeView.vue')
    },
    {
      path: '/auth',
      name: 'auth',
      component: () => import('../views/admin/AuthView.vue')
    },
    {
      path: '/admin',
      name: 'admin',
      component: AdminHomeView
      // meta: {
      //   auth: true
      // },
      // redirect: '/login',
      // children: [
      //   {
      //     path: '/admin/home',
      //     name: 'home',
      //     component: () => import('../views/admin/AdminHomeView.vue')
      //   }
      // ]
    }
  ]
})

export default router
