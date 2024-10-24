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
    <button v-if="loginPinia.loginCheck" class="text-blue-800 font-bold p-1" @click="logout()">
      <span class="font-bold text-blue-800">| </span>로그아웃
    </button>
    <button v-else class="text-blue-800 font-bold p-1" @click="autologin()">
      <span class="font-bold text-blue-800">| </span>로그인
    </button>
    <button class="text-blue-800 font-bold p-1" @click="selecttoken(token)">
      <span class="font-bold text-blue-800">| </span>토큰확인
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

import { useloginPiniaStore } from './stores/Boardlist'
import { login, loginCheck } from './api/logapi'

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
  const userid = ref('userid4')
  const password = ref('password')

  console.log('아이디 = ' + userid.value)
  console.log('비밀번호 = ' + password.value)

  const userdata = {
    userid: userid.value,
    password: password.value
  }

  try {
    const apitoken = await login(userdata)

    if (apitoken.status == 200) {
      //status 리턴 안했으면 지우기

      console.log('조금 성장한 청소년 토큰' + apitoken.data)

      localStorage.setItem('token', apitoken.data)

      const token = localStorage.getItem('token')

      console.log('로컬 저장된 어른 토큰')
      console.log(token)

      loginPinia.login(token)

      alert('로그인 완료')
    } else {
      loginPinia.logout()
      localStorage.removeItem('token')

      alert('status not 200')
    }
  } catch (e) {
    console.log(e)
  }
}

const logout = () => {
  loginPinia.logout()
  localStorage.removeItem('token')

  alert('토큰 쥬금 ㅠㅠ')
}

const selecttoken = () => {
  if (loginPinia.loginCheck) {
    alert('로그인중')
  } else {
    alert('로그아웃되있음')
  }
}

// watchEffect(async () => {
//   const res = await loginCheck()

//   if (res == false) {
//     loginPinia.logout()
//   } else {
//     console.log('로그인 유지되는중 ' + res)

//     if (res.status !== 200) {
//       localStorage.removeItem('token')
//       loginPinia.logout()
//     } else {
//       loginPinia.login(res.data)
//     }
//   }
// })
</script>

<style lang="scss" scoped></style>
