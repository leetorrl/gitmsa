import { createRouter, createWebHistory } from 'vue-router'
import calindar from '@/views/calindar.vue'
import cal2 from '@/views/cal2.vue'

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/calindar',
      name: 'calindar',
      component: calindar
    },
    {
      path: '/cal2',
      name: 'cal2',
      component: cal2
    },
  ]
})

export default router
