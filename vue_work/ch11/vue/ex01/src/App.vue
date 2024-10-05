<template>
  <div>
    <DefaultLayout>
<RouterView></RouterView>
</DefaultLayout>
  </div>
</template>

<script setup>
import { onBeforeMount } from 'vue'
import {RouterView} from 'vue-router'
import {onBeforeUnmount} from 'vue'
import DefaultLayout from '@/layouts/DefaultLayout.vue'

const init = () => {
  let vh = window.innerHeight * 0.01;
  document.documentElement.style.setProperty('--vh',`${vh}px`)
}

// onBeforeMount = () => {
//   init()
//   window.addEventListener('resize',init)
// }
// onBeforeUnmount = () => {
//   window.removeEventListener('resize',init)
// }

</script>

<style lang="scss" scoped>

</style>