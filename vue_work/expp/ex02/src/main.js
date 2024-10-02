import './assets/main.css'

import { createApp } from 'vue'
import { createPinia } from 'pinia'
import App from './App.vue'
import router from './router'

const app = createApp(App)
const pinia = createPinia();

app.use(router)
app.use(pinia) //피니아 인스턴스 등록..

app.mount('#app')

{/* <script setup>
const emits = defineEmits(['update'])
const props = defineProps({
    num: Number,
})
</script>
<template>

</template> */}