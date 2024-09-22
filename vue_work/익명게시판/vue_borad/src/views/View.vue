<template>
  <div>
    <h1>View</h1>
    <div>
      <div>
        <h1>글제목 = {{ f_title }}</h1>

        <h1>글내용</h1>
        <p>{{ f_body }}</p>
        <h1>작성일자 = {{ f_timestamp }}</h1>
        <h1>작성자 = {{ f_nickname }}</h1>
      </div>
      <div>
        <button @click="pageMove(f_idx)">수정</button>
        <button @click="doDelete(f_idx)">삭제</button>
      </div>
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

const doDelete = (f_idx) => {
  axios
    .delete(`http://localhost:8080/free_board/delete/${f_idx}`)
    .then((res) => {
      alert(res.data)
      if (res.status == '200') {
        router.push({ name: 'list' })
      }
    })
    .catch((e) => console.log(e))
}

const pageMove = () => {
  router.push({ name: 'insert', query: { f_idx: f_idx.value } })
}

const get_board = () => {
  axios
    .get(`http://localhost:8080/free_board/view/${route.params.f_idx}`)
    .then((res) => {
      console.log(res)
      f_title.value = res.data.f_title
      f_body.value = res.data.f_body
      f_timestamp.value = res.data.f_timestamp
      f_nickname.value = res.data.f_nickname
      f_idx.value = res.data.f_idx
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
