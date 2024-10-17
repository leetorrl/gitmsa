<template>
  <div>
    <h1>dd</h1>

    <router-link to="/Home">home</router-link>
    <br />
    <router-link to="/Month">month</router-link>
    <router-view></router-view>
    <h1>dd</h1>
  </div>
</template>

<script setup>
import { RouterLink, RouterView } from 'vue-router'
</script>

<style lang="scss" scoped></style>
