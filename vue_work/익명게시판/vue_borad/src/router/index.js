import { createRouter, createWebHistory } from 'vue-router'

import Home from '@/views/Home.vue'
import insertt from '@/views/insert.vue'
import App from '@/App.vue'
import Listt from '@/views/List.vue'
import View from '@/views/View.vue'
import Update from '@/views/Update.vue'

const router = createRouter({
  history: createWebHistory(),
  routes: [
    {
      path: '/App',
      name: 'app',
      component: App
    },
    {
      path: '/Home',
      name: 'home',
      component: Home
    },
    {
      path: '/insert',
      name: 'insert',
      component: insertt
    },
    {
      path: '/List',
      name: 'list',
      component: Listt
    },
    {
      path: '/View/:id',
      name: 'view',
      component: View
    },
    {
      path: '/Update',
      name: 'update',
      component: Update
    },
  ]
})

export default router
