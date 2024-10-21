<template>
   <div class="m-3">
    <div class="flex justify-center">
      <div class="border-2 p-3 w-6/12">
        <div class="w-full">
          <h1 class="p-5 text font-bold text-3xl text-blue-800">-휴가신청 기록-</h1>
          <hr class="border-2 border-blue-800" />
<br>


<!-- 리스트 요기에 가도록 -->


    <button
      class="m-1 min-w-[40px] text-center text-blue-800 border border-blue-800 rounded hover:bg-blue-800 hover:text-white active:bg-blue-700 focus:outline-none focus:ring"
      @click="Vacationinsert"
    >
      휴가신청
    </button>
  </div>
</div>
</div>
</div>
</template>

<script setup>
import { useRouter } from 'vue-router'

const router = useRouter()

const Vacationinsert = () => {
  router.push({ name: 'vacationinput' })
}
</script>

<style lang="scss" scoped></style>
