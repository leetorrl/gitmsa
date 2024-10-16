<template>
    <div>
      <h1 class="bg-orange-400">문의사항작성</h1>
  
      <div>
        <h1>제목</h1>
        <input class="border-2 " type="text" name="" id="" v-model="title" placeholder="제목입력">
      </div>
      <br />
   
      <div>
        <textarea
          v-model="body"
          name=""
          id=""
          cols="30"
          rows="10"
          placeholder="내용기입"
          class="border-2 width: 500px height: 200px"
        ></textarea>
      </div>
  
      <button class="border border-red-500" @click="insert">작성완료</button>
      <button class="border border-red-500" @click="cancle">취소</button>
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
  

  const user = { //유저객체
    idx: idx.value
  }
  
  const cancle = () => {
    router.push({ name: 'quirylist' })
  }
  
  const insert = () => {
   
    const data = {
      // state: state.value,
      body: body.value,
      title: title.value,
      user: user //유저 객체안의 id값을 일단 넘김
    }
    console.log(state.value)
    console.log(body.value)
  
    axios
      .post(` http://192.168.0.67:8080/question/save`, data)
  
      .then((res) => {
        console.log(res)
        alert('요청이 접수되었습니다.')
        router.push({ name: 'quirylist' })
        return
      })
      .catch((e) => {
        console.log(e)
        alert('에러발생' + e)
      })
  }
  </script>
  
  <style lang="scss" scoped></style>
  