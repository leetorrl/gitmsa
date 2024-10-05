import { createRouter, createWebHistory } from 'vue-router'
import HomeView from '../views/HomeView.vue'
import ForecastView from '@/views/ForecastView.vue'
import SearchView from '@/views/SearchView.vue'

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/',
      name: 'home',
      component: HomeView
    },
    {
      path: '/forecast',
      name: 'forecast',
      component: ForecastView
    },
    {
      path: '/search',
      name: 'search',
      component: SearchView
    },
  ]
})

export default router
