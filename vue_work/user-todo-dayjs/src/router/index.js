import { createRouter, createWebHistory } from 'vue-router';

import Home from '@/views/Home.vue';
import About from '@/views/About.vue';
import Month from '@/views/Month.vue';
import Login from '@/views/login/Login.vue';
import Oauth from '@/views/login/Oauth.vue';

const loginRouter = [
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
	{
		path: '/Oauth',
		name: 'oauth',
		component: Oauth,
	},
];
const freeBoardRouter = [];

const router = createRouter({
	history: createWebHistory(import.meta.env.BASE_URL),
	routes: [
		...loginRouter,
		...freeBoardRouter,
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
	],
});

export default router;
