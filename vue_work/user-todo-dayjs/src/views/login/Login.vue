<template>
	<div>
		<h1>LOGIN</h1>
		<div>
			<div class="flex flex-col items-center justify-center min-height-80 gap-4 p-6 bg-yellow-100 rounded-lg shadow-lg">
				<a id="custom-login-btn" @click="kakaoLogin()" class="transition-transform transform hover:scale-105">
					<img
						src="https://k.kakaocdn.net/14/dn/btroDszwNrM/I6efHub1SN5KCJqLm1Ovx1/o.jpg"
						width="222"
						alt="카카오 로그인 버튼"
						class="rounded-lg shadow-md"
					/>
				</a>
				
			</div>
		</div>
	</div>
</template>

<script setup>


const kakaoLogin = () => {
	window.Kakao.Auth.authorize({
		redirectUri: 'http://localhost:5173/oauth',
		// scope: 'account_email,talk_calendar_task',
		
	});
};


</script>

<style lang="scss" scoped></style>
