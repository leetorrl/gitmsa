
import { createRouter, createWebHistory } from 'vue-router'
import Text from './Text.vue'
import App from '@/App.vue'
const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/Text',
      name: 'text',
      component: Text
    },
    {
      path: '/App',
      name: 'app',
      component: App
    },
  ]
})

export default router
