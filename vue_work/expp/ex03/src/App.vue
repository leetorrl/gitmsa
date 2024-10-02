<template>
  <div>
<h1>APPvue</h1>
<h1>count = {{count}}</h1>
<h1>doublecount = {{doublecount}}</h1>

<button @click="increment" class="border border-red-500 inline-block" > increment</button>
<button @click="unincrement" class="border border-red-500 inline-block" >unincrement </button>
<h1>usecc 의 name = {{name}}</h1>
  </div>
</template>

<script setup>
import { useCounterStore } from './stores/counter';
import { useCCSStore } from './stores/counter';
// import { ref } from 'vue';

const usecounter = useCounterStore();

const usecc = useCCSStore();

const {count,doublecount, increment, unincrement} = usecounter;
const {name} = usecc

setTimeout(()=> {

  usecc.name = 'BB'

},3000)

</script>

<style lang="scss" scoped>

</style>