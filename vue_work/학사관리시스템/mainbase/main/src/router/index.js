import { createRouter, createWebHistory } from 'vue-router'
import home from '@/components/home.vue'
import BoardView from '@/components/BoardView.vue'
import BoardInput from '@/components/BoardInput.vue'

import Mypage from '@/components/Mypage.vue'
import Quirylist from '@/components/Quirylist.vue'

import tttest from '@/components/tttest.vue'

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/home',
      name: 'home',
      component: home
    },
    {
      path: '/BoardView',
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
    {
      path: '/Quirylist',
      name: 'quirylist',
      component: Quirylist
    },
    {
      path: '/tttest',
      name: 'tttest',
      component: tttest
    }
  ]
})

export default router
