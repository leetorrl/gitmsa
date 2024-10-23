<template>
  <div class="float-right m-1">
    <button class="text-blue-800 font-bold p-1" @click="goVacation">
      <span class="font-bold text-blue-800">| </span>휴가신청
    </button>

    <button class="text-blue-800 font-bold p-1" @click="goQuiry">
      <span class="font-bold text-blue-800">| </span>문의게시판
    </button>

    <button class="text-blue-800 font-bold p-1" @click="goMypage()">
      <span class="font-bold text-blue-800">| </span>마이페이지
    </button>

    <button class="text-blue-800 font-bold p-1" @click="goManager()">
      <span class="font-bold text-blue-800">| </span>매니저 계정시작페이지
    </button>
    <button class="text-blue-800 font-bold p-1" @click="autologin()">
      <span class="font-bold text-blue-800">| </span>로그인
    </button>
    <button class="text-blue-800 font-bold p-1" @click="logout()">
      <span class="font-bold text-blue-800">| </span>로그아웃
    </button>
  </div>
  <br />

  <headd />

  <RouterView />

  <foott />
</template>

<script setup>
import { RouterView } from 'vue-router'
import { ref } from 'vue'
import { useRouter } from 'vue-router'
import { useBoardlistStore } from './stores/Boardlist'
// import { storeToRefs } from 'pinia'
import { watchEffect } from 'vue'
import axios from 'axios'
import { useloginPiniaStore } from './stores/Boardlist'

import header from '@/layout/header.vue'
import footer from '@/layout/footer.vue'

const headd = header
const foott = footer

const loginPinia = useloginPiniaStore()

const Boardlist = useBoardlistStore()

// const { tsetidx } = storeToRefs(Boardlist)
const router = useRouter()

// const pageNum = ref(0)

const goMypage = () => {
  router.push({ name: 'mypage' })
}

const goQuiry = () => {
  router.push({ name: 'quirylist' })
}

const goVacation = () => {
  router.push({ name: 'vacationmemory' })
}

const Mainhome = () => {
  router.push({ name: 'dayzcounter' })
}

const goManager = () => {
  router.push({ name: 'attendancelist' })
}

//토큰값 넣고 유저 권한용도로 쓸거 ex ADMIN , user
const roles = ref('')

Mainhome()

const autologin = async () => {
  console.log('로그인 시도1')

  const userid = ref('userid3')
  const password = ref('password')

  try {
    const res = await axios.get(
      `http://192.168.0.67:8080/sign/login?userid=${userid.value}&password=${password.value}`
    )
    console.log('로그인시도2')

    if (res.status == 200) {
      console.log('로그인시도3')
      console.log(res)

      localStorage.setItem('token', res.data)
      const logindata = await doLogincheck()

      loginPinia.login(logindata)

      alert('자동로그인 완료')
    } else {
      loginPinia.logout()
    }
  } catch (e) {
    console.log(e)
  }
}

const logout = () => {
  loginPinia.logout()
  alert('로그아웃')
}

const doLogincheck = async () => {
  const GLOBAL_URL = ref(`http://192.168.0.67:8080`)

  const token = localStorage.getItem('token')

  const check = `${GLOBAL_URL.value}/check`

  if (!token) {
    return false
  }

  try {
    const res = await axios.get(`${check}?jwt=${token}`)

    console.log('로그인시도4')
    return res
  } catch (e) {
    console.log(e)
    return e
  }
}
</script>

<style lang="scss" scoped></style>
