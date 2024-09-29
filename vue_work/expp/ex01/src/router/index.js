
import { createRouter, createWebHistory } from 'vue-router'
import Text from './Text.vue'
import App from '@/App.vue'
import Child from '@/components/Child.vue'

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
    {
      path: '/Child',
      name: 'child',
      component: Child
    },
  ]
})

export default router
