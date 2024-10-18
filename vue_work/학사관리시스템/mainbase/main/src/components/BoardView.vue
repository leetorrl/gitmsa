<template>
  <div>
    <h1 class="bg-green-400">-BoardView-</h1>

    <div class="bg-[#eee]">
      <div class="border-2">
        <div>{{ title }} (요청상태 = {{ response }})</div>
        <div>작성자 : {{ user }} 작성일 : {{ wdate }}</div>
      </div>

      <div class="border-2 pt-10 pr-10 pb-20 pl-10">
        {{ body }}
      </div>
    </div>
    <button class="border border-red-500 cursor-pointer" @click="GoBoardInput">요청접수</button>
    <button class="border border-red-500" @click="cancle()">요청리스트</button>
    <br />
    <br />
  </div>
</template>

<script setup>
import axios from 'axios'
import { ref } from 'vue'
import { useRoute } from 'vue-router'
import { useRouter } from 'vue-router'
import { watchEffect } from 'vue'

const router = useRouter()
const route = useRoute()

const title = ref('get title')
const idx = ref('get idx')
const body = ref('get content')
const wdate = ref('get wdate')
const user = ref('get state')
const response = ref('get response')

const cancle = () => {
  router.push({ name: 'quirylist' })
}
const GoBoardInput = () => {
  router.push({ name: 'boardinput' })
}

watchEffect(async () => {
  const res = await axios.get(`http://192.168.0.67:8080/question/view/${route.params.idx}`)

  if (res.status == 200) {
    idx.value = res.data.idx
    title.value = res.data.title
    body.value = res.data.body
    wdate.value = res.data.wdate
    user.value = res.data.user
    response.value = res.data.response
  } else {
    alert(res.response.data.message)
    router.push({ name: 'home' })
  }
})
</script>

<style lang="scss" scoped></style>
