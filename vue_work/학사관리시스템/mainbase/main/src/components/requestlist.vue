<template>
  <div class="m-3">
    <div class="flex justify-center">
      <div class="border-2 p-3 w-6/12">
        <div class="w-full">
          <h1 class="p-5 text font-bold text-3xl text-blue-800">-출결요청여부-</h1>
          <hr class="border-2 border-blue-800" />
          <br>
    <div class="w-1280 bg-slate-300">
      <ul class="flex w-full bg-slate-50">
        <li class="w-1/4 text-center border-t-2 border-b-2">{{ Bid }}</li>
        <li class="w-1/4 text-center border-t-2 border-b-2">{{ Uid }}</li>
        <li class="w-1/4 text-center border-t-2 border-b-2">{{ reason }}</li>
        <li class="w-1/4 text-center border-t-2 border-b-2">작성일</li>
        <li class="w-1/4 text-center border-t-2 border-b-2">{{ type }}</li>
      </ul>
      <ul v-for="item in arr" :key="item.id" class="hover:cursor-pointer" @click="GoBoardView()">
        <li class="w-1/4 text-center border-t-2 border-b-2">{{ item.Bid }}</li>
        <li class="w-1/4 text-center border-t-2 border-b-2">{{ item.Uid }}</li>
        <li class="w-1/4 text-center border-t-2 border-b-2">{{ item.reason }}</li>
        <li class="w-1/4 text-center border-t-2 border-b-2">{{ item.adate }}</li>
        <li class="w-1/4 text-center border-t-2 border-b-2">{{ item.type }}</li>
      </ul>
    </div>
    <button  @click="GoBoardInput"  class="m-1 min-w-[40px] text-center text-blue-800 border border-blue-800 rounded hover:bg-blue-800 hover:text-white active:bg-blue-700 focus:outline-none focus:ring">요청접수</button>
    
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
  </div>
</div>
</div>
</div>
</template>

<script setup>
import { ref } from 'vue'
import { useRouter } from 'vue-router'
import dayjs from 'dayjs'
import { watchEffect } from 'vue'
import axios from 'axios'
const router = useRouter()

const arr = ref([])

const pageNum = ref(0)
const totalpages = ref(10)
const size = ref(10)

const Bid = ref('Bid')
const Uid = ref('작성자')
const reason = ref('제목')
const adate = String(dayjs().format('YYYY-MM-DD'))
console.log(adate)
const type = ref('요청상태')

const GoBoardInput = () => {
  router.push({ name: 'boardinput' })
}

const GoBoardView = () => {
  router.push({ name: 'boardview' })
}

const setpageNum = (num) => {
  pageNum.value = num
}

watchEffect(async () => {
  const res = await axios.get(`http://192.168.0.67:8080/question?${pageNum.value}`, {
    headers: {
      'Content-Type': 'application/json'
    }
  })

  arr.value = res.data.list
  totalpages.value = res.data.totalpages
})
</script>

<style lang="scss" scoped></style>
