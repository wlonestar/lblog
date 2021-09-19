import { createApp } from 'vue'
import App from './App.vue'
import router from './router'

import ElementPlus from 'element-plus'
import 'element-plus/dist/index.css'
import zhCn from 'element-plus/es/locale/lang/zh-cn'

import '../src/assets/css/global.css'
import 'github-markdown-css/github-markdown.css'

// import hljs from 'highlight.js'
// import 'highlight.js/styles/light.css'
import 'highlight.js/styles/github.css'
import 'highlight.js/styles/atom-one-dark.css'

const app = createApp(App)
app.use(router)
app.use(ElementPlus, {
  locale: zhCn,
  size: 'mini'
})

// app.use(hljs, {
//   hljs: hljs
// })
app.mount('#app')
