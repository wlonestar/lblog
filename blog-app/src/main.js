import { createApp } from 'vue'
import App from './App.vue'
import router from './router'

// element-plus
import ElementPlus from 'element-plus'
import 'element-plus/dist/index.css'
import zhCn from 'element-plus/es/locale/lang/zh-cn'

// css style
import '../src/assets/css/global.css'
import 'github-markdown-css/github-markdown.css'

// highlight.js
import 'highlight.js/styles/github.css'

const app = createApp(App)
app.use(router)
app.use(ElementPlus, {
  locale: zhCn,
  size: 'mini'
})
app.mount('#app')
