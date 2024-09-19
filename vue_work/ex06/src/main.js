import './assets/main.css'

import { aa } from './AA'
import { createApp } from 'vue'
import App from './App.vue'
import router from './router/index.js'

const app = createApp(App)

aa();

app.use(router)

app.mount('#QWER')