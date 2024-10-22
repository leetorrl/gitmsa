<template>
  <div class="m-3">
    <div class="flex justify-center">
      <div class="border-2 p-3 w-6/12">
        <div class="w-full">
          <h1 class="p-5 text font-bold text-3xl text-blue-800">-휴가신청 기록-</h1>
          <hr class="border-2 border-blue-800" />
          <br />

          <!-- 리스트 요기에 가도록 -->
          <div class="w-1280 bg-white">
            <ul class="flex w-full bg-[#eee]" style="justify-content: space-around">
              <li class="w-1/4 text-center border-t-2 border-b-2">idx</li>
              <li class="w-1/4 text-center border-t-2 border-b-2">작성일</li>
              <li class="w-1/4 text-center border-t-2 border-b-2">내용</li>
            </ul>
            <ul
              v-for="item in arr"
              :key="item.id"
              class="hover:cursor-pointer transition duration-300 hover:bg-[#eee] flex w-full p-3 border-b border-[#eee]"
            >
              <li class="w-1/4 text-center">{{ item.idx }}</li>
              <li class="w-1/4 text-center">{{ item.wdate }}</li>
              <li class="w-1/4 text-center">{{ item.reason }}</li>
            </ul>
          </div>

          <ul class="flex space-x-2">
            <li
              class="cursor-pointer p-3"
              v-for="num in totalpages"
              v-bind:key="num"
              @click="setpageNum(num - 1)"
            >
              {{ num }}
            </li>
          </ul>

          <button
            class="m-1 min-w-[40px] text-center text-blue-800 border border-blue-800 rounded hover:bg-blue-800 hover:text-white active:bg-blue-700 focus:outline-none focus:ring"
            @click="Vacationinsert"
          >
            휴가신청
          </button>
        </div>
      </div>
    </div>
  </div>
</template>

<script setup>
import { useRouter } from 'vue-router'
import { watchEffect } from 'vue'
import { ref } from 'vue'
import axios from 'axios'
import dayjs from 'dayjs'

const router = useRouter()

const arr = ref([])
const pageNum = ref(0)
const totalpages = ref(10)
const size = ref(10)

const idx = ref('3')
const wdate = new dayjs().format('YYYY-MM-DD')
const reason = ref('')

const Vacationinsert = () => {
  router.push({ name: 'vacationinput' })
}

const setpageNum = async (num) => {
  //  const token = localStorage.getItem('token')

  // if (pageNum.value == undefined) pageNum.value = 0 피니아 쓸때 사용
  try {
    const res = await axios.get(`http://192.168.0.67:8080/question?pageNum=${num}`, {
      headers: {
        'Content-Type': 'application/json'
        // Authorization: 'Bearer ' + token
      }
    })

    arr.value = res.data.list
    // totalpages.value = res.data.totalpages
  } catch (e) {
    console.log(e)
    return e
  }
}

const user = {
  idx: idx.value
}

const lecture = {
  idx: idx.value
}

const data = {
  user: user,
  lecture: lecture
}

watchEffect(async () => {
  const userid = ref('userid3')
  const password = ref('password')

  axios
    .get(`http://192.168.0.67:8080/sign/login?userid=${userid.value}&password=${password.value}`)
    .then((respons) => {
      const token = respons.data

      console.log(token)

      const res = axios.get(`http://192.168.0.67:8080/vacation/student`, data, {
        headers: {
          // 'Content-Type': 'application/json',
          Authorization: `Bearer ${token}`
        }
      })

      // arr.value = res.data.list
      // totalpages.value = res.data

      // console.log(arr.value)
    })
})
</script>

<style lang="scss" scoped></style>
