<template>
  <div>
    <footer class="flex flex-col items-center bg-[#eee] text-center">
      <div class="container p-6">
        <div class=""></div>
      </div>

      <!--Copyright section-->
      <div @click="gohome" class="w-full bg-black/20 p-4 text-center cursor-pointer">
        © 2024 Green505Room
        <p>Home</p>
      </div>
    </footer>
  </div>
</template>

<script setup>
import { useRouter } from 'vue-router'

const router = useRouter()

const gohome = () => {
  router.push({ name: 'dayzcounter' })
}
</script>

<style lang="scss" scoped></style>
