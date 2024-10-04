<template>
  <div>
    <br>
<h1 class=" font-bold">App뷰</h1>
<br>
<button @click="gohome" > 클릭</button>
<RouterView/>

  </div>
</template>

<script setup>
import { RouterView} from 'vue-router';

import { useRouter } from 'vue-router';

const router = useRouter();

const gohome =() => {

  router.push({name:'homeview'})

}

</script>

<style lang="scss" scoped>

</style>