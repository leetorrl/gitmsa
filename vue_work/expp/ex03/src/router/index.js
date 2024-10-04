import { createRouter, createWebHistory } from 'vue-router'
import HomeView from '@/views/HomeView.vue'
import CartView from '@/views/CartView.vue';

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/HomeView',
      name: 'homeview',
      component: HomeView,
    },
    {
      path: '/CartView',
      name: 'cartview',
      component: CartView,
      // component: () => import('@/views/CartView.vue'),
    },
  ],
});

export default router
