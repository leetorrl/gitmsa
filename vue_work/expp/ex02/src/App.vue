<template>
  <div>
<h1 class="bg-blue-500" >메인</h1>
<br>
<button > 홈(기능없음 누르지마셈..) </button>
<br>
<br>
<nav>
  <div class="border border-red-500 inline-block "><RouterLink to="/HomeView" >Home</RouterLink></div>
 <div class="border border-red-500 inline-block"><RouterLink to="/AboutView" >About</RouterLink></div> 
</nav>

<br>
<RouterView/>
  </div>
</template>

<script setup>
import { RouterView, RouterLink } from 'vue-router';
// import { useRouter } from 'vue-router';



</script>

<style lang="scss" scoped>

</style>