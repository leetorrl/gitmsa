import { createRouter, createWebHistory } from 'vue-router'
import GGGG from '@/components/GGGG.vue'

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/GGGG',
      name: 'gggg',
      component: GGGG
    },
  
  ]
})

export default router
