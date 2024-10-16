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
      <div class="w-1280 bg-slate-300">
        <!-- <ul v-for="item in arr" key="item.Bid" >  -->
        <!-- <li class=" w-1/4 text-center border border-black" >{{item.Bid}}</li>
    <li class=" w-1/4 text-center border border-black" >{{item.Uid}}</li>
    <li class=" w-1/4 text-center border border-black" >{{item.title}}</li>
    <li class=" w-1/4 text-center border border-black" >{{item.wdate}}</li>
    <li class=" w-1/4 text-center border border-black" >{{item.state}}</li> -->
        <!-- <li class="w-1/4 text-center border border-black">{{ item.idx }}</li>
          <li class="w-1/4 text-center border border-black">{{ item.title }}</li>
          <li class="w-1/4 text-center border border-black">{{ item.wdate }}</li>
          <li class="w-1/4 text-center border border-black">{{ item.user }}</li>
          <li class="w-1/4 text-center border border-black">{{ item.response }}</li> -->

        <ul class="flex w-full bg-slate-50">
          <!-- <ul v-for="item in arr" key="item.Bid" >  -->
          <!-- <li class=" w-1/4 text-center border border-black" >{{item.Bid}}</li>
    <li class=" w-1/4 text-center border border-black" >{{item.Uid}}</li>
    <li class=" w-1/4 text-center border border-black" >{{item.title}}</li>
    <li class=" w-1/4 text-center border border-black" >{{item.wdate}}</li>
    <li class=" w-1/4 text-center border border-black" >{{item.state}}</li>  -->
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
      <button class="border border-red-500 cursor-pointer hover:bg-red-500">문의접수</button>
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
// import { useRouter } from 'vue-router'
import axios from 'axios'

import { watchEffect } from 'vue'
// const router = useRouter()

const arr = ref([])
// const totalpages = ref(10)
const id = ref(1)
const title = ref('주제')
const user = ref('작성자')
const wdate = new Date()
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

// const GoBoardInput = () => {
//   router.push({ name: 'boardinput' })
// }

// // Viewlist();

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
