import { createRouter, createWebHistory } from 'vue-router'
import TheCounter from '@/views/TheCounter.vue'
import TheWelcome from '@/views/TheWelcome.vue'
import Theinsert from '@/views/Theinsert.vue'
import Theselect from '@/views/Theselect.vue'

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/',
      name: 'counter',
      component: TheCounter
    },
    {
      path: '/welcome',
      name: 'welcome',
      component: TheWelcome
    },
    {
      path: '/insert',
      name: 'insert',
      component: Theinsert
    },
    {
      path: '/select',
      name: 'select',
      component: Theselect
    },
  ]
})

export default router
