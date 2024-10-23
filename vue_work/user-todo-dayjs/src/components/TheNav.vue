<template>
	<div>
		<nav class="bg-white shadow-md fixed w-full z-10">
			<div class="container mx-auto px-4 sm:px-6 lg:px-8">
				<div class="flex justify-between items-center py-4">
					<!-- Logo -->
					<div class="text-2xl font-bold text-gray-800">MyLogo</div>
					<!-- Hamburger Menu (for mobile) -->
					<div class="sm:hidden">
						<button @click="menuDisply" id="menu-btn" class="text-gray-800 focus:outline-none">
							<svg
								class="w-6 h-6"
								fill="none"
								stroke="currentColor"
								viewBox="0 0 24 24"
								xmlns="http://www.w3.org/2000/svg"
							>
								<path stroke-linecap="round" stroke-linejoin="round" stroke-width="2" d="M4 6h16M4 12h16m-7 6h7"></path>
							</svg>
							버튼..
						</button>
					</div>
					<!-- Navigation Links (hidden on small screens) -->
					<div class="hidden sm:flex space-x-8 text-gray-800">
						<router-link to="/Home" class="hover:text-blue-500">Home</router-link>
						<router-link to="/About" class="hover:text-blue-500">About</router-link>
						<router-link to="/Month" class="hover:text-blue-500">Month</router-link>
						<router-link to="/Login" class="hover:text-blue-500">Login</router-link>
						<router-link to="/message" class="hover:text-blue-500">message</router-link>
					</div>
				</div>
				<!-- Mobile Menu (hidden by default) -->
				<template v-if="mobileMenu">
					<div id="mobile-menu" class="bg-white">
						<router-link to="/Home" class="block px-4 py-2 text-gray-800 hover:bg-gray-100">Home</router-link>
						<router-link to="/About" class="block px-4 py-2 text-gray-800 hover:bg-gray-100">About</router-link>
						<router-link to="/Month" class="block px-4 py-2 text-gray-800 hover:bg-gray-100">Month</router-link>
						<router-link to="/Login" class="block px-4 py-2 text-gray-800 hover:bg-gray-100">Login</router-link>
						<router-link to="/message" class="hover:text-blue-500">message</router-link>
					</div>
				</template>
			</div>
		</nav>
	</div>
</template>

<script setup>
import { ref } from 'vue';

const mobileMenu = ref(false);

const menuDisply = () => {
	mobileMenu.value = !mobileMenu.value;
};
</script>

<style lang="scss" scoped></style>
