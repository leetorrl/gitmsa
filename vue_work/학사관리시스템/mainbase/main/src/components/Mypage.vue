<template>
  <div>
    <h1 class="bg-yellow-400">마이페이지</h1>
<button @click="gofreeboard" class="border border-red-500 hover:bg-red-500" >요청조회</button>


    
  </div>
</template>

<script setup>
import { ref } from 'vue'
import { useRouter } from 'vue-router'
import axios from 'axios'

const router = useRouter()


const gofreeboard=()=>{
router.push({name:'requestlist'})  
}






// Viewlist();
</script>

<style lang="scss" scoped></style>
