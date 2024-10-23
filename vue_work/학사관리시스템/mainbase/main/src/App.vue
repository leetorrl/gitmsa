<template>
  <div class="float-right m-1">
    <button class="text-blue-800 font-bold p-1" @click="goVacation">
      <span class="font-bold text-blue-800">| </span>휴가신청
    </button>

    <button class="text-blue-800 font-bold p-1" @click="goQuiry">
      <span class="font-bold text-blue-800">| </span>문의게시판
    </button>

    <button class="text-blue-800 font-bold p-1" @click="goMypage()">
      <span class="font-bold text-blue-800">| </span>마이페이지
    </button>

    <button class="text-blue-800 font-bold p-1" @click="goManager()">
      <span class="font-bold text-blue-800">| </span>매니저 계정시작페이지
    </button>
  </div>
  <br />

  <headd />

  <RouterView />

  <foott />
</template>

<script setup>
import { RouterView } from 'vue-router'
import { ref } from 'vue'
import { useRouter } from 'vue-router'
import { useBoardlistStore } from './stores/Boardlist'
import { storeToRefs } from 'pinia'

import header from '@/layout/header.vue'
import footer from '@/layout/footer.vue'

const headd = header
const foott = footer

const Boardlist = useBoardlistStore()

// const { tsetidx } = storeToRefs(Boardlist)
const router = useRouter()

// const pageNum = ref(0)

const goMypage = () => {
  router.push({ name: 'mypage' })
}

const goQuiry = () => {
  router.push({ name: 'quirylist' })
}

const goVacation = () => {
  router.push({ name: 'vacationmemory' })
}

const Mainhome = () => {
  router.push({ name: 'dayzcounter' })
}

const goManager = () => {
  router.push({ name: 'attendancelist' })
}

//토큰값 넣고 유저 권한용도로 쓸거 ex ADMIN , user
const roles = ref('')

Mainhome()
</script>

<style lang="scss" scoped></style>
