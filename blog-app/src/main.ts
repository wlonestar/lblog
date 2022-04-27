import { createApp } from 'vue'
import { createPinia } from 'pinia'

import App from './App.vue'
import router from './router'

// element plus
import ELementPlus from 'element-plus'
import 'element-plus/dist/index.css'
import zhCn from 'element-plus/es/locale/lang/zh-cn'

// global css
import './assets/css/eureka.css'
import './assets/css/base.css'
import './assets/css/markdown.css'
import './assets/css/site.css'

import 'highlight.js/styles/github.css'

import { FontAwesomeIcon } from '@fortawesome/vue-fontawesome'
import { library } from '@fortawesome/fontawesome-svg-core'
import {
  faSun,
  faMoon,
  faAdjust,
  faCalendar,
  faFolder,
  faUser,
  faEnvelope,
  faCaretRight
} from '@fortawesome/free-solid-svg-icons'

library.add(
  faSun,
  faMoon,
  faAdjust,
  faCalendar,
  faFolder,
  faUser,
  faEnvelope,
  faCaretRight
)

const app = createApp(App)

app.use(createPinia())
app.use(router)
app.use(ELementPlus, {
  locale: zhCn
})
app.component('font-awesome-icon', FontAwesomeIcon)

app.mount('#app')
