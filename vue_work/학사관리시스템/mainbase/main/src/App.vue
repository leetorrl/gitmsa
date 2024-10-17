<template>
  <div>
    <h1 class="bg-red-500 sm:390px">시작!</h1>
    <p>밑에 라우터뷰</p>
    <p>2xl xl lg md sm 테일윈드 미디아 크기</p>
    <button class="text-blue-800 font-bold float-right m-1" @click="goQuiry">
      <span class="font-bold text-blue-800">| </span>문의게시판
    </button>

    <button class="text-blue-800 font-bold float-right m-1" @click="goMypage()">
      <span class="font-bold text-blue-800">| </span>마이페이지
    </button>
    <br />

    <headd />

    <RouterView />

    <foott />
  </div>
</template>

<script setup>
import { RouterView } from 'vue-router'

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
const Mainhome = (tsetidx) => {
  router.push({ name: 'home', params: { tsetidx } })
}

Mainhome()
</script>

<style lang="scss" scoped></style>
