<template>
  <div>
    <footer
  class="flex flex-col items-center bg-[#eee] text-center">
  <div class="container p-6">
    <div class="">
      <p class="flex items-center justify-center">
        <span class="me-4">로그인 하기</span>
        <button
          type="button"
          class="inline-block rounded-full border-2 border-gray-950 px-6 pb-[6px] pt-2 text-xs font-medium uppercase leading-normal text-gray-950 transition duration-150 ease-in-out hover:border-gray-700 hover:text-gray-700 focus:border-gray-600 focus:text-gray-600 focus:outline-none focus:ring-0 active:border-gray-450 active:text-gray-450 dark:hover:bg-neutral-600 dark:focus:bg-neutral-600"
          data-twe-ripple-init
          data-twe-ripple-color="light">
          push!
        </button>
      </p>
    </div>
  </div>

  <!--Copyright section-->
  <div  @click="gohome" class="w-full bg-black/20 p-4 text-center cursor-pointer">
    © 2024 Green505Room
    <p>Home</p>
  </div>
</footer>
  </div>
</template>

<script setup>
import { useRouter } from 'vue-router';

const router = useRouter()

const gohome =() =>{
  router.push({name:'home'})
}

</script>

<style lang="scss" scoped></style>
