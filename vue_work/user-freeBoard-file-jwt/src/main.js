import './assets/main.css'

import { createPinia } from 'pinia'
import { createApp } from 'vue'
import App from './App.vue'
import router from './router/index.js'
import VueSweetalert2 from 'vue-sweetalert2';
import 'sweetalert2/dist/sweetalert2.min.css';

const app = createApp(App)
const piniaStore = createPinia();






// app.use(createPinia())
app.use(piniaStore)
app.use(router)
app.use(VueSweetalert2);

app.mount('#QWER')