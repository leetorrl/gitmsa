<template>
	<div>
		<div><TheNav /></div>

		<router-view class="pt-16"></router-view>
		<h1>App</h1>
	</div>
</template>

<script setup>
import { RouterLink, RouterView } from 'vue-router';
import TheNav from './components/TheNav.vue';
</script>

<style lang="scss" scoped></style>
