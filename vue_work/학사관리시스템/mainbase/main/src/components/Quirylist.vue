<template>
  <div class="m-3">
    <div class="flex justify-center">
      <div class="border-2 p-3 w-6/12">
        <div class="w-full">
          <h1 class="p-5 text font-bold text-3xl text-blue-800">-문의 게시판-</h1>
          <hr class="border-2 border-blue-800" />
          <br />
          <div class="border border-blue-800 ml-10 w-5/12">
            <h1 class="border-t-2 border-b-2">◎자주하는 질문</h1>
            <ul class="">
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
              @click="GofreeBoardInput"
              class="m-1 min-w-[40px] text-center text-blue-800 border border-blue-800 rounded hover:bg-blue-800 hover:text-white active:bg-blue-700 focus:outline-none focus:ring"
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
      </div>
    </div>
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
const totalpages = ref(10)

const GofreeBoardInput = () => {
  router.push({ name: 'freeboardinput' })
}

const setpageNum = async (num) => {
  //  const token = localStorage.getItem('token')

  // if (pageNum.value == undefined) pageNum.value = 0 피니아 쓸때 사용
  try {
    const res = await axios.get(`http://192.168.0.67:8080/question/manager?pageNum=${num}`, {
      headers: {
        'Content-Type': 'application/json'
        // Authorization: 'Bearer ' + token
      }
    })

    arr.value = res.data.list
    // totalpages.value = res.data.totalpages
  } catch (e) {
    console.log(e)
    return e
  }
}

watchEffect(async () => {
  console.log(pageNum.value)
  const res = await axios.get(`http://192.168.0.67:8080/question/manager?${pageNum.value}`, {
    headers: {
      'Content-Type': 'application/json'
    }
  })
  arr.value = res.data.list
  totalpages.value = res.data.totalPages

  console.log(res.data.totalPages)
})

const GoBoardView = (pageidx) => {
  router.push({ name: 'boardview', params: { pageidx } })
}
</script>

<style lang="scss" scoped></style>
