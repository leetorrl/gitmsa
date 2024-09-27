<script setup>
import { RouterLink, RouterView } from 'vue-router'
</script>

<template>
  <header>
    <div class="p-5 bg-slate-500 text-white text-3xl">
      <nav class="flex space-x-5">
        <h1 class="border-2 inline"> 동현네비</h1>
<div>
  <h1>안녕안녕d~~~~~</h1>
        <RouterLink to="/">Home</RouterLink>
</div>
<div>
        <RouterLink to="/user">User</RouterLink>
</div>
        <div class="group relative">
        <RouterLink to="/freeboardlist">FreeBoard</RouterLink>
        <div class="hidden group-hover:block absolute bg-slate-600 p-5 rounded">
          <div>
            <RouterLink to="/freeboardlist">FreeBoardList</RouterLink>
            </div>
            <div>
          <RouterLink to="/freeboardinput">FreeBoardinput</RouterLink>
          </div>
        
        </div>
        
</div>
<div> <RouterLink to="/fileuploadUpdate">ThefileuploadUpdate</RouterLink></div>
      </nav>
    </div>
  </header>

  <RouterView />
</template>

<style scoped>
</style>