<template>
	<div class="flex flex-col justify-center items-center min-height-80">
		<h1>Oauth</h1>
		<template v-if="logincheck">
			<div>
				<h1>로그인에 성공하셨습니다.</h1>
				<router-link to="/Home">홈으로</router-link>
			</div>
		</template>

		<template v-else>
			<div>
				<h1>로그인하세요</h1>
			</div>
		</template>
	</div>
</template>

<script setup>
import { watchEffect } from 'vue';
import { useRoute } from 'vue-router';
import { login } from '@/api/loginapi';
import { ref } from 'vue';
import { RouterLink } from 'vue-router';
const route = useRoute();

const logincheck = ref(false);

watchEffect(async () => {
	console.log('code = ', route.query.code);
	//값이 있으면  true 값이 undefinde false

	if (route.query.code) {
		const data = await login(route.query.code);
		//리턴값 data 존속됨
		console.log('data = ', data);
		localStorage.setItem('token', data);
		logincheck.value = true;
		console.log('loginCheck.value = ' + logincheck.value);
	}
});
</script>

<style lang="scss" scoped></style>
