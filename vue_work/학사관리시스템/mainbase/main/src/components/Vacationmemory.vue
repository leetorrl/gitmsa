<template>
  <div>
    <h1>휴가신청 리스트</h1>

    <button
      class="m-1 min-w-[40px] text-center text-blue-800 border border-blue-800 rounded hover:bg-blue-800 hover:text-white active:bg-blue-700 focus:outline-none focus:ring"
      @click="Vacationinsert"
    >
      휴가신청하기
    </button>
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
