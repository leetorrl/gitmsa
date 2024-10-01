
import { createRouter, createWebHistory } from 'vue-router'
import Text from './Text.vue'
import App from '@/App.vue'
import Child from '@/components/Child.vue'
import Text2 from '@/components/Text2.vue'

import Text3 from '@/components/Text3.vue'
import Text4 from '@/components/Text4.vue';

import HomeView from '@/components/view/HomeView.vue'

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
    {
      path: '/Text2/:list',
      name: 'text2',
      component: Text2
    },
    {
      path: '/Text3/:list',
      name: 'text3',
      component: Text3
    },
    {
      path: '/Text4',
      name: 'Green MSA',
      component: Text4
    },
    {
      path: '/HomeView',
      name: 'homeview',
      component: HomeView
    },
  ]
})

export default router
