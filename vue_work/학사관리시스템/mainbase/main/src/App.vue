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
    <button class="text-blue-800 font-bold p-1" @click="selecttoken()">
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
  const userid = ref('userid2')
  const password = ref('password')

  console.log('아이디 = ' + userid.value)
  console.log('비밀번호 = ' + password.value)

  try {
    const res = await axios.get(
      `http://192.168.0.67:8080/sign/login?userid=${userid.value}&password=${password.value}`
    )
    console.log('로그인 성공한 응애토큰')

    console.log('Access token =' + res.data)

    if (res.status == 200) {
      //status 리턴 안했으면 지우기

      // localStorage.setItem('token', res.data) //로컬저장방식 보안취약

      console.log(res.data)

      localStorage.setItem('token', res.data)

      const token = localStorage.getItem('token', res.data)

      console.log('로컬에 저장된 사춘기 토큰')
      console.log(token) //왜 값이 없나

      // const ttoken = await doLogincheck(token) //jwt로 바로 준거면 필요없음

      const headertoken = {
        headers: {
          //api 요청할때 마다 보내주기
          Authorization: `Bearer ${token}`
        }
      }

      console.log('헤더http에 담긴 jwt로 성장한 토큰')
      console.log('header = ' + headertoken)

      loginPinia.login(headertoken)

      alert('자동로그인 완료')
    } else {
      loginPinia.logout()
      headertoken.value = null
      alert('status not 200')
    }
  } catch (e) {
    console.log(e)
  }
}

const logout = () => {
  loginPinia.logout()
  headertoken.value = null
  alert('토큰 쥬금 ㅠㅠ')
}

const doLogincheck = async (token) => {
  try {
    const ress = await axios.get(`http://192.168.0.67:8080/check?jwt=${token}`)

    return ress
  } catch (e) {
    alert('jwt토큰이 가출함 ㅠ')
    console.log(e)
    return e
  }
}

const selecttoken = () => {
  alert('로그인됨')
}
</script>

<style lang="scss" scoped></style>
