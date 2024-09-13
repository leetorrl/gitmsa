import { createRouter, createWebHistory } from 'vue-router'

import TheHome from '../views/TheHome.vue'
import TheUser from '@/views/TheUser.vue'
import TheFreeBoard from '@/views/TheFreeBoard.vue'

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [

    {
      path: '/',
      name: 'TheHome',
      component: TheHome
    },

    {
      path: '/user',
      name: 'TheUser',
      component: TheUser
    },
    {
      path: '/freeboard',
      name: 'TheFreeBoard',
      component: TheFreeBoard
    }
  ]
});

export default router;

