<template>
  <div class="m-3">
    <div class="flex justify-center">
      <div class="border-2 p-3 w-6/12">
        <div class="w-full">
          <h1 class="p-5 text font-bold text-3xl text-blue-800">-휴가신청-</h1>
          <hr class="border-2 border-blue-800" />
          <br />
          <div class="border-2">
            <div class="">
              <div class="m-3">
                <br />
                <label for=""
                  >내용
                  <br />
                  <input class="border-2 w-full" type="text" name="" id="" v-model="reason"
                /></label>
                <br />
                <br />
                <label for=""
                  >신청날짜
                  <br />
                  <input class="border-2 w-full" readonly name="" id="" v-model="startdate"
                /></label>
                <br />
                <br />
                <label for=""
                  >end날짜
                  <br />
                  <input class="border-2 w-full" name="" id="" v-model="enddate"
                /></label>
                <br />
                <br />

                <label for=""
                  >비상연락처
                  <br />
                  <input
                    class="border-2 w-full"
                    type="text"
                    name=""
                    id=""
                    placeholder="예시 : 010-1234-5678"
                    v-model="phonecall"
                /></label>
              </div>
              <br />
              <br />
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
import dayjs from 'dayjs'
import { vacation } from '@/api/vacation'

const router = useRouter()

const personalNum = ref('123456-789012')
const reason = ref('몰디브가서 모히또 한잔 할려고')
const startdate = ref(String(new dayjs().format('YYYY-MM-DD')))
const phonecall = ref('010-1234-5678')
const enddate = ref(String(new dayjs().add(4, 'day').format('YYYY-MM-DD')))

const cancle = () => {
  router.back()
}

const Vacationinsert = async () => {
  const vadata = {
    personalNum: personalNum.value,
    reason: reason.value.trim(),
    startdate: startdate.value,
    phonecall: phonecall.value,
    enddate: enddate.value
  }

  console.log(vadata)

  const res = await vacation(vadata)

  alert('휴가신청이 제출되었습니다.')
  console.log(res)
  // router.push({ name: 'vacationmemory' })
}
</script>

<style lang="scss" scoped></style>
