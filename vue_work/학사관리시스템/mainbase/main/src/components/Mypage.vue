<template>
  <div class="m-3">
    <div class="flex justify-center">
      <div class="border-2 p-3 w-6/12">
        <div class="w-full">
    <h1 class="p-5 text font-bold text-3xl text-blue-800">-마이페이지-</h1>
          <hr class="border-2 border-blue-800" />


          <div className="container mx-auto px-4">
      <div className="flex justify-center items-center h-screen">
        <div className="bg-white p-8 rounded shadow-md">
          <h1 className="text-3xl font-bold mb-4">My Profile</h1>
          <img src="" alt="Profile" className="rounded-full w-24 h-24 mb-4" />
          <p className="text-gray-700">
            Lorem ipsum dolor sit amet, consectetur adipiscing elit.
          </p>
        </div>
      </div>
    </div>


    <button @click="gofreeboard"  class="m-1 min-w-[40px] text-center text-blue-800 border border-blue-800 rounded hover:bg-blue-800 hover:text-white active:bg-blue-700 focus:outline-none focus:ring">요청조회</button>
    

  </div>
</div>
</div>
</div>
</template>

<script setup>
import { ref } from 'vue'
import { useRouter } from 'vue-router'
import axios from 'axios'

const router = useRouter()

const gofreeboard = () => {
  router.push({ name: 'requestlist' })
}

// Viewlist();
</script>

<style lang="scss" scoped></style>
