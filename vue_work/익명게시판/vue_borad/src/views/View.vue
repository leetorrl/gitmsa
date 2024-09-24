<template>
  <div>
    <div style="background-color: #eee">
      <div style="border: 1px solid gray">
        <h2 style="margin: 5px">글제목 드갈자리 = {{ f_title }}</h2>
        <p style="margin: 10px">작성자 = {{ f_nickname }}</p>
        <p style="margin: 10px">작성일자 = {{ f_timestamp }}</p>
      </div>
      <div style="border: 1px solid gray">
        <div style="margin: 10px">
          <h3>글내용들</h3>
          <p>{{ f_body }}</p>
        </div>
      </div>
    </div>
    <div>
      <button @click="create()">글쓰기</button>
      <button @click="pageMove()">수정</button>
      <button @click="doDelete(f_idx)">삭제</button>
      <!-- <button @click="pageMove(idx)">수정</button>
      <button @click="doDelete(idx)">삭제</button> -->
    </div>
  </div>
</template>

<script setup>
import axios from 'axios'
import { ref } from 'vue'
import { useRoute, useRouter } from 'vue-router'

const route = useRoute()
const router = useRouter()
const f_title = ref('test')
const f_body = ref('test')
const f_timestamp = ref('test')
const f_nickname = ref('test')
const f_idx = ref(0)
// const idx = ref(0);

const create = () => {
  console.log('글쓰기버튼')
  router.push({ name: 'insert' })
}


// const doDelete = (id) => {

  const doDelete = (id) => {

    axios
    .delete(`http://localhost:8080/freeboard/delete/${id}`) //딜리트 명령문
    // .delete(`http://localhost:8080/freeboard/delete/${idx}`)
    .then((res) => {
      alert(res.data)
      if (res.status == '200') {
        router.push({ name: 'list' })
      }
    })
    .catch((e) => console.log(e))
}
  // router.push({ name: 'deletecheck', query: { f_idx: f_idx.value } })
  


  

const pageMove = () => {
  router.push({ name: 'update', query: { f_idx: f_idx.value } }) //f_idx
}





// const get_board = () => {
//     axios.get(`http://localhost:8080/freeboard/view/${route.params.idx}`)
//         .then(res => {
//             console.log(res);
//             title.value = res.data.title;
//             content.value = res.data.content;
//             regDate.value = res.data.regDate;
//             creAuthor.value = res.data.creAuthor;
//             idx.value = res.data.idx;
//         })
//         .catch(e => {
//             console.log(e);
//             alert(e.response.data.message);
//             router.push({ name: "freeboardlist" });
//         })





const get_board = () => {
  
  axios
    .get(`http://localhost:8080/freeboard/view/${route.params.id}`)
    // .get(`http://localhost:8080/freeboard/view/${route.params.idx}`)
    .then((res) => {
      console.log(res)
      f_title.value = res.data.f_title
      f_body.value = res.data.f_body
      f_timestamp.value = res.data.f_timestamp
      f_nickname.value = res.data.f_nickname
      f_idx.value = res.data.id
      console.log("id값 = "+res.data.id);
      // idx.value = res.data.idx;
    })
    .catch((e) => {
      console.log(e)
      alert(e.response.data.message)
      router.push({ name: 'list' })
    })
}
//페이지 열게되면 자동실행
get_board()
</script>
<style lang="scss" scoped></style>
