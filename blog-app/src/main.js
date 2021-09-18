import { createApp } from 'vue'
import App from './App.vue'
import router from './router'

import ElementPlus from 'element-plus'
import 'element-plus/dist/index.css'
import zhCn from 'element-plus/es/locale/lang/zh-cn'

// import { VueSimpleMarkdown } from 'vue-simple-markdown'
// import 'vue-simple-markdown/dist/vue-simple-markdown.css'

import '../src/assets/css/global.css'

import hljs from 'highlight.js'
import 'highlight.js/styles/dark.css'

// createApp(App).use(router).use(ElementPlus, { locale: zhCn, size: 'mini' }).use(VueSimpleMarkdown).use(hljs).mount('#app')

const app = createApp(App)
app.use(router)
app.use(ElementPlus, {
  locale: zhCn,
  size: 'mini'
})

app.use(hljs)
app.mount('#app')
