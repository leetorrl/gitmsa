<template>
  <div class="m-3">
    <div class="flex justify-center">
      <div class="border-2 p-3 w-6/12">
        <div class="w-full">
          <h1 class="bg-blue-700 text-white">문의사항작성</h1>

          <div>
            <h1 class="m-2 text-blue-700">1. 제목을 입력해주세요.</h1>
            <input
              class="border-2 w-full"
              type="text"
              name=""
              id=""
              v-model="title"
              placeholder="제목입력"
            />
          </div>
          <br />
          <h1 class="m-2 text-blue-700">2. 문의 내용을 입력하여 주십시오.</h1>
          <div>
            <textarea
              v-model="body"
              name=""
              id=""
              cols="30"
              rows="10"
              placeholder="내용기입"
              class="border-2 w-full resize-none"
            ></textarea>
          </div>

          <button
            class="m-1 min-w-[40px] text-center text-blue-800 border border-blue-800 rounded hover:bg-blue-800 hover:text-white active:bg-blue-700 focus:outline-none focus:ring"
            @click="insert"
          >
            작성완료
          </button>
          <button
            class="m-1 min-w-[40px] text-center text-blue-800 border border-blue-800 rounded hover:bg-blue-800 hover:text-white active:bg-blue-700 focus:outline-none focus:ring"
            @click="cancle"
          >
            취소
          </button>
        </div>
      </div>
    </div>
  </div>
</template>

<script setup>
import { ref } from 'vue'
import { useRouter } from 'vue-router'
import axios from 'axios'
import { useBoardlistStore } from '@/stores/Boardlist'

const boardlist = useBoardlistStore()
const router = useRouter()

const { tsetidx } = boardlist

const body = ref('')
const title = ref('')

const idx = ref(tsetidx)

const user = {
  //유저객체
  idx: idx.value
}

const cancle = () => {
  router.back()
}

const insert = () => {
  const data = {
    // state: state.value,
    body: body.value.trim(),
    title: title.value.trim(),
    user: user //유저 객체안의 id값을 일단 넘김
  }
  // console.log(state.value)
  console.log(body.value)

  if (data.title !== '' && data.title !== null) {
    if (data.body !== '' && data.body !== null) {
      axios
        .post(` http://192.168.0.67:8080/question/save`, data)
        .then((res) => {
          const idx = res.data.idx
          console.log(idx)

          alert('요청이 접수되었습니다.')

          router.push({ name: 'boardview', params: { idx } })
          return
        })
        .catch((e) => {
          console.log(e)
          alert('에러발생' + e)
        })
    } else {
      alert('내용을 입력하시길 바랍니다.')
    }
  } else {
    alert('제목을 입력하시길 바랍니다.')
  }
}
</script>

<style lang="scss" scoped></style>
