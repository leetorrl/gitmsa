<template>
  <div class="m-3">
    <div class="flex justify-center">
      <div class="border-2 p-3 w-6/12">
        <div class="w-full">
          <h1 class="p-5 text font-bold text-3xl text-blue-800">-문의사항작성-</h1>
          <hr class="border-2 border-blue-800" />
          <br />
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

          <div class="w-full flex flex-col justify-center items-center">
            <button
              class="w-full h-10 m-1 min-w-[40px] text-center bg-blue-800 text-white border border-blue-800 rounded"
              @click="insert"
            >
              작성완료
            </button>
            <button
              class="w-full h-10 m-1 min-w-[40px] text-center text-blue-800 border border-blue-800 rounded"
              @click="cancle"
            >
              취소
            </button>
          </div>
        </div>
      </div>
    </div>
  </div>
</template>

<script setup>
import { ref } from 'vue'
import { useRouter } from 'vue-router'
import { freeBoardinput } from '@/api/freeboardapi'

const router = useRouter()

const body = ref('')
const title = ref('')
const idx = ref('')

// console.log(state.value)

const cancle = () => {
  router.back()
}

const insert = async () => {
  const data = {
    body: body.value.trim(),
    title: title.value.trim()
  }

  console.log(data)

  const res = await freeBoardinput(data)

  console.log('게시판 작성 성공' + res)

  idx.value = res.data.idx

  const pageidx = idx.value

  alert('요청이 접수되었습니다.')

  router.push({ name: 'boardview', params: { pageidx } })
}
</script>

<style lang="scss" scoped></style>
