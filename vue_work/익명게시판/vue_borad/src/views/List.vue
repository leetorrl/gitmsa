<template>
  <div id="wrap">
    <h1>게시글 리스트</h1>
    <div id="div_ul">
      <ul id="list_ul">
        <li id="list_ul_list" style="width: 10%">f_id</li>
        <li id="list_ul_list" style="width: 50%">제목</li>
        <li id="list_ul_list" style="width: 15%">글쓴이</li>
        <li id="list_ul_list" style="width: 10%">조회</li>
        <li id="list_ul_list" style="width: 15%">날짜</li>
      </ul>
      <ul v-for="item in list_arr" :key="item.f_idx" @click="list_page(item.f_idx)">
        <li>{{ item.f_idx }}</li>
        <li>{{ item.f_title }}</li>
        <li>{{ item.f_nickname }}</li>
        <li>{{ item.f_avail }}</li>
        <li>{{ item.f_timestamp }}</li>
      </ul>
    </div>
    <div>
      <ul>
        <li
          style="
            cursor: pointer;
            display: inline-block;
            padding: 1px 5px;
            margin: 2px;
            border: 1px solid black;
          "
          v-for="num in totalpages"
          v-bind:key="num"
          @click="setpageNum(num - 1)"
        >
          {{ num }}
        </li>
      </ul>
    </div>
  </div>
</template>

<script setup>
import axios from 'axios'
import { ref } from 'vue'
import { useRouter } from 'vue-router'

const list_arr = ref([])
const router = useRouter()
const pageNum = ref(0)
const totalpages = ref(10)

const setpageNum = (num) => {
  pageNum.value = num
  get_board(num)
}

const list_page = (f_idx) => {
  //게시글 보기
  const data = { name: 'view', params: { f_idx } }
  router.push(data)
}

const get_board = (pageNum) => {
  if (pageNum == undefined) pageNum = 0
  axios
    .get(`http://localhost:8080/free_board?pageNum=${pageNum}`)
    .then((res) => {
      list_arr.value = res.data.list
      totalpages.value = res.data.totalpages
      console.log(res.data.list)
    })
    .catch((e) => {
      console.log(e)
    })
}

get_board()
</script>

<style lang="scss" scoped></style>
