import { createApp } from 'vue'
import App from './App.vue'
import router from './router'

import './assets/scss/style.scss'

import 'github-markdown-css/github-markdown.css'
import 'highlight.js/styles/github.css'

createApp(App).use(router).mount('#app')
