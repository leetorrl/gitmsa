<template>
    <div>
        <h1>d</h1>
<button @click="dd" style="width: 400px;" v-if="bb" >클릭!</button>
    </div>
</template>

<script setup>

import { ref } from 'vue';

const bb = ref(true);


const dd = () => {

    bb.value = false;
}


</script>

<style lang="scss" scoped>

</style>