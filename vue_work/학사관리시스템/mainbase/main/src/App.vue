<template>
  <div>
<h1 class="bg-red-500">시작!</h1>
<p>밑에 라우터뷰</p>
<button class="border border-red-500 float-right" @click="goMypage" >마이페이지(조퇴요청 조회기능)</button>
<br>

<RouterView/>
  </div>
</template>

<script setup>
import {  RouterView } from 'vue-router';
// import { ref } from 'vue';
import { useRouter } from 'vue-router';

const router = useRouter();

// const pageNum = ref(0)

const goMypage = ()=> {

  router.push({name:'mypage'})

}

const Mainhome = () => {

  router.push({name:'home'})
}

Mainhome();

</script>

<style lang="scss" scoped>

</style>