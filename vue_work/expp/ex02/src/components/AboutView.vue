<template>
    <div>
        <h1 class="bg-blue-500 inline-block " >쨔잔?!</h1>
    </div>
</template>

<script setup>
import { useCountSetupStore } from '@/stores/countSetup';
import { storeToRefs } from 'pinia';

const setupStore = useCountSetupStore();
const {doubleNum} = storeToRefs(setupStore)

console.log(setupStore.doubleNum) //게터 doubleNun

setupStore.getJSON('https://jsonplaceholder.typicode.com/posts');

console.log(setupStore.doubleNum);

</script>

<style lang="scss" scoped>

</style>