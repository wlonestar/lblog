import { createApp } from 'vue'
import { createPinia } from 'pinia'

import App from './App.vue'
import router from './router'

// element plus
import ELementPlus from 'element-plus'
import 'element-plus/dist/index.css'
import zhCn from 'element-plus/es/locale/lang/zh-cn'

// global css
import './assets/css/base.css'

const app = createApp(App)

app.use(createPinia())
app.use(router)
// user element plus
app.use(ELementPlus, {
  locale: zhCn
})

app.mount('#app')
