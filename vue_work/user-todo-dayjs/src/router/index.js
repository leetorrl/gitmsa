import { createRouter, createWebHistory } from 'vue-router';

import Home from '@/views/Home.vue';
import About from '@/views/About.vue';
import Month from '@/views/Month.vue';
import Login from '@/views/Login.vue';

const router = createRouter({
	history: createWebHistory(import.meta.env.BASE_URL),
	routes: [
		{
			path: '/Home',
			name: 'home',
			component: Home,
		},
		{
			path: '/About',
			name: 'about',
			component: About,
		},
		{
			path: '/Month',
			name: 'month',
			component: Month,
		},
		{
			path: '/Login',
			name: 'login',
			component: Login,
		},
	],
});

export default router;
