<template>
  <div id="wrap" style="background-color: rgb(10, 4, 135); color: #eee;">
    <h1>-그린게시판-</h1>
    <!-- <RouterLink to="/Home">글쓰기</RouterLink> -->

    <!-- <RouterLink to="/App">메인</RouterLink> -->
    <p id="btn" @click="main()">메인</p>
    <p id="btn" @click="List()">게시판</p>
    <p id="btn" @click="create()">글쓰기</p>
    <!-- <p id="btn" @click="viw()">작성글예시</p> -->

    <RouterView />
  </div>
</template>

<script setup>
// import { RouterLink, RouterView } from 'vue-router'

import { useRouter } from 'vue-router'

const router = useRouter()

const main = () => {
  console.log('a. 메인버튼')
  router.push({ name: 'home' })
}

const create = () => {
  console.log('b. 글쓰기버튼')
  router.push({ name: 'insert' })
}

const List = () => {
  console.log('c. 게시판버튼')
  router.push({ name: 'list' })
}

// const viw = () => {
//   console.log('게시글보기버튼')
//   router.push({ name: 'view' })
// }
</script>

<style lang="scss" scoped></style>
