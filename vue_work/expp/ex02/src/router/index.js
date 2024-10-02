import { createRouter, createWebHistory } from 'vue-router'
import HomeView from '@/components/HomeView.vue'
import AboutView from '@/components/AboutView.vue'

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/HomeView',
      name: 'homeview',
      component: HomeView
    },
    {
      path: '/AboutView',
      name: 'aboutview',
      component: AboutView
    },
  ]
})

export default router
