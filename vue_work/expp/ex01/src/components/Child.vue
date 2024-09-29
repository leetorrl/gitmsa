<template>
    <div>
<h1>child number = {{number}}</h1>
<h1>child doubleNumber = {{doubleNumber}}</h1>
    </div>
</template>

<script setup>

import { computed, ref } from 'vue';

const number = ref(5)
const doubleNumber = computed(() => number.value*2)

defineExpose({ //defineExpose로 지정된 값만 부모 컴포넌트에서 접근가능
    number,
    doubleNumber,
});

</script>

<style lang="scss" scoped>

</style>