<template>
  <div class="m-3">
    <div class="flex justify-center">
      <div class="border-2 p-3 w-6/12">
        <div class="w-full">
          <h1 class="bg-blue-800 text-[#eee]">-BoardView-</h1>

          <div class="">
            <div class="border-t border-b">
              <div>{{ title }} (요청상태 = {{ response }})</div>
              <div>작성자 : {{ user }} 작성일 : {{ wdate }}</div>
            </div>

            <div class="border min-h-80 pt-10 pr-10 pb-20 pl-10">
              {{ body }}
            </div>
          </div>
          <div>
            <button
              class="m-3 min-w-[40px] text-center text-blue-800 border border-blue-800 rounded hover:bg-blue-800 hover:text-white active:bg-blue-700 focus:outline-none focus:ring"
              @click="GoBoardInput"
            >
              문의접수
            </button>
            <button
              class="min-w-[40px] text-center text-blue-800 border border-blue-800 rounded hover:bg-blue-800 hover:text-white active:bg-blue-700 focus:outline-none focus:ring"
              @click="cancle()"
            >
              요청리스트
            </button>
          </div>
          <br />
          <br />
          <div v-if="responsebl">
            <textarea
              v-model="comment"
              class="border w-full resize-none"
              name=""
              id=""
              placeholder="답변기입"
            ></textarea>
            <button
              @click="insetcomment"
              class="min-w-[40px] text-center text-blue-800 border border-blue-800 rounded hover:bg-blue-800 hover:text-white active:bg-blue-700 focus:outline-none focus:ring float-right"
            >
              답글입력
            </button>
          </div>
          <br />
          <br />
        </div>
      </div>
    </div>
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

const responsebl = ref(true)

const comment = ref('')

const cancle = () => {
  router.back()
}
const GoBoardInput = () => {
  router.push({ name: 'freeboardinput' })
}

const insetcomment = async () => {
  // const res = await axios.post(`http://192.168.0.67:8080/    /${route.params.idx}`)

  // if(res.status == 200){

  // }

  responsebl.value = false
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
