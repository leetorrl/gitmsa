<template>
  <div>
    <h1>-문의 게시판-</h1>
    <br />
    <div>
      <h1>자주하는 질문</h1>
      <ul>
        <li>Q.출결 증빙자료 머시기</li>
        <li>Q.당일에 증빙자료 머시기</li>
        <li>Q.휴가신청 제출 머시기..</li>
      </ul>
    </div>
    <div>
      <h1>학생문의</h1>




      <div class="flex flex-col">
  <div class="overflow-x-auto sm:-mx-6 lg:-mx-8">
    <div class="inline-block min-w-full py-2 sm:px-6 lg:px-8">
      <div class="overflow-hidden">
        <table
          class="min-w-full text-left text-sm font-light text-surface dark:text-white">
          <thead
            class="border-b border-neutral-200 font-medium dark:border-white/10">
            <tr>
              <th scope="col" class="px-6 py-4">#</th>
              <th scope="col" class="px-6 py-4">First</th>
              <th scope="col" class="px-6 py-4">Last</th>
              <th scope="col" class="px-6 py-4">Handle</th>
            </tr>
          </thead>
          <tbody>
            <tr
              class="border-b border-neutral-200 transition duration-300 ease-in-out hover:bg-neutral-100 dark:border-white/10 dark:hover:bg-neutral-600">
              <td class="whitespace-nowrap px-6 py-4 font-medium">1</td>
              <td class="whitespace-nowrap px-6 py-4">Mark</td>
              <td class="whitespace-nowrap px-6 py-4">Otto</td>
              <td class="whitespace-nowrap px-6 py-4">@mdo</td>
            </tr>
            <tr
              class="border-b border-neutral-200 transition duration-300 ease-in-out hover:bg-neutral-100 dark:border-white/10 dark:hover:bg-neutral-600">
              <td class="whitespace-nowrap px-6 py-4 font-medium">2</td>
              <td class="whitespace-nowrap px-6 py-4">Jacob</td>
              <td class="whitespace-nowrap px-6 py-4">Thornton</td>
              <td class="whitespace-nowrap px-6 py-4">@fat</td>
            </tr>
            <tr
              class="border-b border-neutral-200 transition duration-300 ease-in-out hover:bg-neutral-100 dark:border-white/10 dark:hover:bg-neutral-600">
              <td class="whitespace-nowrap px-6 py-4 font-medium">3</td>
              <td class="whitespace-nowrap px-6 py-4">Larry</td>
              <td class="whitespace-nowrap px-6 py-4">Wild</td>
              <td class="whitespace-nowrap px-6 py-4">@twitter</td>
            </tr>
          </tbody>
        </table>
      </div>
    </div>
  </div>
</div>






      <div class="w-1280 bg-slate-300">
        <ul class="flex w-full bg-slate-50">
          <li class="w-1/4 text-center border-t-2 border-b-2">{{ title }}</li>
          <li class="w-1/4 text-center border-t-2 border-b-2">{{ user }}</li>
          <li class="w-1/4 text-center border-t-2 border-b-2">{{ wdate }}</li>
          <li class="w-1/4 text-center border-t-2 border-b-2">{{ response }}</li>
        </ul>
        <ul v-for="item in arr" :key="item.id" class="hover:cursor-pointer">
          <li class="w-1/4 text-center border-t-2 border-b-2">{{ item.title }}</li>
          <li class="w-1/4 text-center border-t-2 border-b-2">{{ item.user }}</li>
          <li class="w-1/4 text-center border-t-2 border-b-2">{{ item.wdate }}</li>
          <li class="w-1/4 text-center border-t-2 border-b-2">{{ item.response }}</li>
        </ul>
      </div>
      <button class="border border-red-500 cursor-pointer hover:bg-red-500" @click="GofreeBoardInput" >문의접수</button>
    </div>
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
const wdate = ('작성일')
const response = ref('요청사항')

const pageNum = ref(0)
const totalpages = ref(5)
// const GoBoardView = (id) => {
//   router.push({ name: 'boardview', params: { id } })
// }

// const Viewlist = async () => {

//   try {

//     // const res = await axios.get(`http://localhost:8080/Board`)

// const res = await axios.post(`http://192.168.0.67:8080/question?${pageNum=2&size=5}`)

//     arr.value = res.data.list
//     totalpages.value = res.data.totalpages

//   } catch (e) {
//     console.log(e)
//     return e
//   }
// }

// // watchEffect( async() => {

// // js따로 팔때 쓰는걸로
// // })

const GofreeBoardInput = () => {
  router.push({ name: 'freeboardinput' })
}


watchEffect(async () => {
  const res = await axios.get(`http://192.168.0.67:8080/question?${pageNum.value, size=5}`, {
    headers: {
      'Content-Type': 'application/json'
    }
  })

  arr.value = res.data.list
  totalpages.value = res.data.totalpages
})
</script>

<style lang="scss" scoped></style>
