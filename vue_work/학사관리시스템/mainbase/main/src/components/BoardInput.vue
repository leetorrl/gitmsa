<template>
  <div class="m-3">
    <div class="flex justify-center">
      <div class="border-2 p-3 w-6/12">
        <div class="w-full">
          <h1 class="p-5 text font-bold text-3xl text-blue-800">-출결요청-</h1>
          <hr class="border-2 border-blue-800" />

    <div class="">
      <br>
      <h1 class="text-blue-800">1. 요청항목</h1>
      <form action="">
        <label for="early"
          >조퇴<input v-model="type" type="radio" name="state" id="early" value="early" checked
        /></label>
        <label for="going"
          >외출<input v-model="type" type="radio" name="state" id="going" value="going"
        /></label>
        <label for="absent"
          >결석<input v-model="type" type="radio" name="state" id="absent" value="absent"
        /></label>
      </form>
    </div>
    <br />
    <div>
      <h1 class="text-blue-800">2. 요청사유</h1>
      <form action="">
        <label for="병가"
          >병가<input v-model="conn" type="radio" name="conn" id="병가" value="병가" checked
        /></label>
        <label for="조문"
          >조문<input v-model="conn" type="radio" name="conn" id="조문" value="조문"
        /></label>
        <label for="훈련"
          >훈련<input v-model="conn" type="radio" name="conn" id="훈련" value="훈련"
        /></label>
        <label for="기타"
          >기타<input v-model="conn" type="radio" name="conn" id="기타" value="기타"
        /></label>
      </form>
      <br>
    </div>

    <div>
      <textarea
        v-model="reason"
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
        class="w-full h-10 m-1 min-w-[40px] text-center text-blue-800 border border-blue-800 rounded "
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
import axios from 'axios'
import { useBoardlistStore } from '@/stores/Boardlist'
import dayjs from 'dayjs'

const boardlist = useBoardlistStore()

const router = useRouter()

const reason = ref('')

const type = ref('early')

const conn = ref('병가')

const adate = String(new dayjs().format('YYYY-MM-DD '))
// HH:mm 시 분
console.log(adate)

const { tsetidx } = boardlist

const idx = ref(tsetidx)

const user = {
  idx: idx.value
}

const cancle = () => {
  router.push({ name: 'mypage' })
}

const insert = () => {
  const data = {
    // state: state.value,
    reason: reason.value,
    type: type.value,
    user: user, //유저 객체안의 id값을 일단 넘김
    adate: adate
  }
  console.log(type.value)
  console.log(reason.value)

  axios
    .post(` http://192.168.0.67:8080/attendance/unlogin`, data)

    .then((res) => {
      console.log(res)
      alert('요청이 접수되었습니다.')
      router.push({ name: 'home' })
      return
    })
    .catch((e) => {
      console.log(e)
      alert('에러발생' + e)
    })
}
</script>

<style lang="scss" scoped></style>
