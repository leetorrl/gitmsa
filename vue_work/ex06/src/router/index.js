import { createRouter, createWebHistory } from 'vue-router'

import TheHome from '@/views/TheHome.vue'
import TheUser from '@/views/TheUser.vue'
import TheFreeBoardinput from '../views/freeboard/TheFreeBoardinput.vue'
import TheFreeBoardList from '../views/freeboard/TheFreeBoardList.vue'
import TheFreeBoardView from '@/views/freeboard/TheFreeBoardView.vue'
import ThefileuploadUpdate from '@/views/freeboard/ThefileuploadUpdate.vue'
import TheFreeBoardUpdate from '@/views/freeboard/TheFreeBoardUpdate.vue'

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
      path: '/freeboardinput',
      name: 'freeboardinput',
      component: TheFreeBoardinput
    },
    {
      path: '/freeboardlist',
      name: 'freeboardlist',
      component: TheFreeBoardList
    },
    {
      path: '/freeboardview/:idx', //idx값을 받음 params 사용방법
      name: 'freeboardview',
      component: TheFreeBoardView
    },
    {
      path: '/freeboardupdate',
      name: 'freeboardupdate',
      component: TheFreeBoardUpdate
    },
    {
      path: '/fileuploadUpdate',
      name: 'fileuploadUpdate',
      component: ThefileuploadUpdate
    },
  ]
});

export default router;

