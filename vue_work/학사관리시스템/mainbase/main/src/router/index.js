import { createRouter, createWebHistory } from 'vue-router'
import home from '@/components/home.vue'
import BoardView from '@/components/BoardView.vue'
import BoardInput from '@/components/BoardInput.vue'

import Mypage from '@/components/Mypage.vue'

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
    {
      path: '/BoardInput',
      name: 'boardinput',
      component: BoardInput
    },
    {
      path: '/Mypage',
      name: 'mypage',
      component: Mypage
    },
  ]
})

export default router
