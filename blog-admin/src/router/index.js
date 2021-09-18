import { createRouter, createWebHistory } from 'vue-router'
import Layout from '../layout/Layout'

const routes = [
  {
    path: '/',
    name: 'Layout',
    component: Layout,
    meta: {
      auth: true
    },
    redirect: '/login',
    children: [
      {
        path: 'home',
        name: 'Home',
        component: () => import('../views/Home.vue')
      },
      {
        path: 'article',
        name: 'Article',
        component: () => import('../views/Article.vue')
      },
      {
        path: 'article/edit',
        name: 'EditArticle',
        component: () => import('../views/EditArticle.vue')
      },
      {
        path: 'category',
        name: 'Category',
        component: () => import('../views/Category.vue')
      },
      {
        path: 'comment',
        name: 'Comment',
        component: () => import('../views/Comment.vue')
      },
      {
        path: 'idea',
        name: 'Idea',
        component: () => import('../views/Idea.vue')
      },
      {
        path: 'todo',
        name: 'Todo',
        component: () => import('../views/Todo.vue')
      },
      {
        path: 'file',
        name: 'File',
        component: () => import('../views/File.vue')
      }
    ]
  },
  {
    path: '/login',
    name: 'Login',
    component: () => import('../views/Login')
  }
]

const router = createRouter({
  history: createWebHistory(process.env.BASE_URL),
  routes
})

router.beforeEach((to, from, next) => {
  if (to.matched.some((item) => {
    return item.meta.auth
  })) {
    if ((sessionStorage.getItem('satoken'))) {
      next()
    } else {
      next({
        path: '/login'
      })
    }
  } else {
    next()
  }
})

export default router
