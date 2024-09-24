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

      <ul v-for="item in arr" :key="item.f_idx" @click="list_page(item.f_idx)">
      <li>{{ item.f_idx }}</li>
        <li>{{ item.f_title }}</li>
        <li>{{ item.f_nickname }}</li>
        <li>{{ item.f_avail }}</li>
        <li>{{ item.f_timestamp }}</li>
        <!-- <ul v-for="item in arr" :key="item.idx"  @click="viewPage(item.idx)">
        <li >{{ item.idx }}</li>
            <li >{{ item.title }}</li>
            <li >{{ item.creAuthor }}</li>
            <li >{{ item.regDate }}</li>
            <li >{{ item.viewCount }}</li> -->
      </ul>
    </div>
    <div>
      <ul>
        <li
        id="list_btn"
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

// const list_arr = ref([])
const arr = ref([]);
const router = useRouter()
const pageNum = ref(0)
const totalpages = ref(10)




const setpageNum = (num) => {
  pageNum.value = num
  get_board(num)
}



// const viewPage = (idx) => {
//   const data = { name: 'view', params: { idx } }
//   router.push(data)
// }


const list_page = (f_idx) => { //
  //게시글 보기
  const data = { name: 'view', params: { f_idx } }
  router.push(data)
}


const get_board = (pageNum) => {
  if (pageNum == undefined) pageNum = 0
  axios
    .get(`http://localhost:8080/freeboard?pageNum=${pageNum}`)
    .then((res) => {
      arr.value = res.data.list
      totalpages.value = res.data.totalpages
      console.log(res.data.list)

    })
    .catch((e) => {
      console.log(e)
    })




// const get_board = (pageNum) => {
//   if (pageNum == undefined) pageNum = 0
//   axios
//   .get(`http://localhost:8080/free_board?pageNum=${pageNum}`) //백엔드 작성에 따라 바꿔주기

//     .then((res) => {
//       list_arr.value = res.data.list
//       totalpages.value = res.data.totalpages
//       console.log(res.data.list)


//     })
//     .catch((e) => {
//       console.log(e)
//     })
}

get_board()
</script>

<style lang="scss" scoped></style>
