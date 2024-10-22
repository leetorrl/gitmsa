<template>
	<div>
		<h1>Oauth</h1>
	</div>
</template>

<script setup>
import { watchEffect } from 'vue';
import { useRoute } from 'vue-router';
import { login } from '@/api/loginapi';

const route = useRoute();

watchEffect(async () => {
	console.log('code = ', route.query.code);
	//값이 있으면  true 값이 undefinde false

	if (route.query.code) {
		login(route.query.code);
		const data = await login(route.query.code);
		//리턴값 data 존속됨
		console.log('data = ', data);
	}
});
</script>

<style lang="scss" scoped></style>
