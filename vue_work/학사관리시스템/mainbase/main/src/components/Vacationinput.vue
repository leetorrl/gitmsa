<template>
  <div>
    <h1>휴가신청하기</h1>
    <div class="border-2">
      <div class="bg-blue-300">
        <h1>user idx = {{ user.idx }}</h1>
        <label for=""
          >주민번호<input class="border-2" type="text" name="" id="" v-model="peresonalNum"
        /></label>
        <br />
        <label for=""
          >내용<input class="border-2" type="text" name="" id="" v-model="reason"
        /></label>
        <br />
        <label for=""
          >신청날짜<input class="border-2" type="text" name="" id="" v-model="date"
        /></label>
        <br />
        <label for=""
          >연락처<input class="border-2" type="text" name="" id="" v-model="phonecall"
        /></label>
        <br />
      </div>
      <button
        class="m-1 min-w-[40px] text-center text-blue-800 border border-blue-800 rounded hover:bg-blue-800 hover:text-white active:bg-blue-700 focus:outline-none focus:ring"
        @click="Vacationinsert"
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
</template>

<script setup>
import { ref } from 'vue'
import { useRouter } from 'vue-router'
import axios from 'axios'

const router = useRouter()

const peresonalNum = ref('123456-789012')
const reason = ref('몰디브가서 모히또 한잔 할려고')
const date = ref('2013-10-15')
const phonecall = ref('010-1234-5678')

const cancle = () => {
  router.back()
}

const user = {
  idx: 1
}

const Vacationinsert = () => {
  const data = {
    peresonalNum: peresonalNum.value,
    reason: reason.value.trim(),
    date: date.value,
    phonecall: phonecall.value,
    user: user
  }

  if (data.reason !== '' && data.reason !== null) {
    axios.post(`http://192.168.0.67:8080/vacation/request`, data).then((res) => {
      console.log(res)
      alert('제출되었습니다.')
      router.push({ name: 'vacationmemory' })
      return
    })
  } else {
    alert('내용을 넣으시길 바랍니다.')
  }
}
</script>

<style lang="scss" scoped></style>
