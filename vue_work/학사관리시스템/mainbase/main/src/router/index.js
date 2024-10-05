import { createRouter, createWebHistory } from 'vue-router'
import home from '@/components/home.vue'
import BoardView from '@/components/BoardView.vue'

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/home',
      name: 'home',
      component: home
    },
    {
      path: '/BoardView/:id',
      name: 'boardview',
      component: BoardView
    },
  ]
})

export default router
