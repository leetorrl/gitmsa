<template>
  <div class="m-3">
    <div class="flex justify-center">
      <div class="border-2 p-3 w-6/12">
        <div class="w-full">
          <h1 class="p-5 text font-bold text-3xl text-blue-800">-휴가신청-</h1>
          <hr class="border-2 border-blue-800" />
          <br>
    <div class="border-2 ">
      <div class="">
        <div class="m-3">
        <h1>user idx = {{ user.idx }}</h1>
        
        <br>
        <label for=""
          >내용
          <br>
          <input class="border-2 w-full" type="text" name="" id="" v-model="reason"
        /></label>
        <br />
        <br>
        <label for=""
          >신청날짜
          <br>
          <input class="border-2 w-full" readonly name="" id="" v-model="date"
        /></label>
        <br />
        <br>
        <label for=""
          >비상연락처
          <br>
          <input class="border-2 w-full" type="text" name="" id="" placeholder="예시 : 010-1234-5678" v-model="phonecall"
        /></label>
      </div>
        <br />
        <br>
      </div>
      
    </div>
    <div class="w-full flex flex-col justify-center items-center">
      <button
        class="w-full h-10 m-1 min-w-[40px] text-center bg-blue-800 text-white border border-blue-800 rounded"
        @click="Vacationinsert"
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
import dayjs from 'dayjs';

const router = useRouter()

const peresonalNum = ref('123456-789012')
const reason = ref('몰디브가서 모히또 한잔 할려고')
const date = new dayjs().format('YYYY-MM-DD')
const phonecall = ref('')

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
    if(data.peresonalNum !== '' && data.peresonalNum !== null){
    axios.post(`http://192.168.0.67:8080/vacation/request`, data).then((res) => {
      console.log(res)
      alert('제출되었습니다.')
      router.push({ name: 'vacationmemory' })
      return
    })
  }else if(peresonalNum.value>=13){
    alert("번호를 다시 기입 바랍니다.")
  } 
  else {
    alert('비상연락망을 입력바랍니다..')
  }
}else{
  alert("내용을 입력 바랍니다.")
}
}
</script>

<style lang="scss" scoped></style>
