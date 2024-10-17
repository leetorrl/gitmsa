<template>
  <div>
    <h1 class="p-5 text font-bold text-3xl text-blue-800">-문의 게시판-</h1>
    <hr class="border-2 border-blue-800" />
    <br />
    <div>
      <h1 class="border-t-2 border-b-2">◎자주하는 질문</h1>
      <ul>
        <li class="hover:cursor-pointer ml-4 p-1 border-b">
          Q : 출결 증빙자료가 없어요. 어떡하죠?
        </li>
        <li class="hover:cursor-pointer ml-4 p-1 border-b">
          Q : 당일에 증빙자료 제출을 까먹었어요.
        </li>
        <li class="hover:cursor-pointer ml-4 p-1 border-b">
          Q : 휴가 신청서 제출은 어떻게 하나요?
        </li>
      </ul>
    </div>
    <div>
      <br />
      <div class="text-center font-bold text-3xl text-blue-800"><h1>학생문의</h1></div>

      <br />
      <div class="w-1280 bg-white">
        <ul class="flex w-full bg-[#eee]">
          <li class="w-1/4 text-center border-t-2 border-b-2">{{ user }}</li>
          <li class="w-1/4 text-center border-t-2 border-b-2">{{ title }}</li>
          <li class="w-1/4 text-center border-t-2 border-b-2">{{ wdate }}</li>
          <li class="w-1/4 text-center border-t-2 border-b-2">{{ response }}</li>
        </ul>
        <ul
          v-for="item in arr"
          :key="item.id"
          class="hover:cursor-pointer transition duration-300 hover:bg-[#eee] flex w-full p-3 border-b border-[#eee]"
          @click="GoBoardView(item.idx)"
        >
          <li class="w-1/4 text-center">{{ item.user }}</li>
          <li class="w-1/4 text-center">{{ item.title }}</li>
          <li class="w-1/4 text-center">{{ item.wdate }}</li>
          <li class="w-1/4 text-center">{{ item.response }}</li>
        </ul>
      </div>
      <button
        class="bg-blue-700 inline-block rounded bg-primary px-6 pb-2 pt-2.5 text-xs font-medium uppercase leading-normal text-white shadow-primary-3 transition duration-150 ease-in-out hover:bg-primary-accent-300 hover:shadow-primary-2 focus:bg-primary-accent-300 focus:shadow-primary-2 focus:outline-none focus:ring-0 active:bg-primary-600 active:shadow-primary-2 motion-reduce:transition-none dark:shadow-black/30 dark:hover:shadow-dark-strong dark:focus:shadow-dark-strong dark:active:shadow-dark-strong"
        @click="GofreeBoardInput"
      >
        문의접수
      </button>
    </div>
    <br />
    <ul class="flex space-x-2">
      <li
        class="cursor-pointer p-3"
        v-for="num in totalpages"
        v-bind:key="num"
        @click="setpageNum(num - 1)"
      >
        {{ num }}
      </li>
    </ul>
    <br />
  </div>
</template>

<script setup>
import { ref } from 'vue'
import { useRouter } from 'vue-router'
import axios from 'axios'

import { watchEffect } from 'vue'
const router = useRouter()

const arr = ref([])
const title = ref('주제')
const user = ref('작성자')
const wdate = '작성일'
const response = ref('요청사항')

const pageNum = ref(0)
const totalpages = ref(5)
// const size = ref(10)

const GofreeBoardInput = () => {
  router.push({ name: 'freeboardinput' })
}

watchEffect(async () => {
  console.log(pageNum.value)
  const res = await axios.get(`http://192.168.0.67:8080/question?${pageNum.value}`, {
    headers: {
      'Content-Type': 'application/json'
    }
  })
  arr.value = res.data.list
  totalpages.value = res.data.totalPages

  console.log(res.data.totalPages)
})

const GoBoardView = (idx) => {
  router.push({ name: 'boardview', params: { idx } })
}
</script>

<style lang="scss" scoped></style>
