<template>
  <div>
<h1>APPvue</h1>
<h1>count = {{count}}</h1>
<button @click="inerment" > inerment</button>

  </div>
</template>

<script setup>
import { useCountStore } from './stores/counter';

const usecountstore = useCountStore();

const {count, inerment} = usecountstore;

</script>

<style lang="scss" scoped>

</style>