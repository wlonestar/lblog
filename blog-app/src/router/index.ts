import { createRouter, createWebHistory } from 'vue-router'
import HomeView from '../views/HomeView.vue'

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
      path: '/posts/:id',
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
    }
  ]
})

export default router
