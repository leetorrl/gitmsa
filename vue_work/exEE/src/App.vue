<template>
  <div>
<h1>연습연습</h1>
    
<p @click="aa" style="border: 1px solid red;">시작</p>

<RouterView />
  </div>
</template>

<script setup>
import { useRouter } from 'vue-router';

const router = useRouter();

const aa = () => {

  router.push({name:'gggg'})
}

</script>

<style lang="scss" scoped>

</style>