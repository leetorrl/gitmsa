<template>
  <div>
    <h1 class="bg-orange-400">글작성</h1>
    <form action="">
      <div>
        <label for=""
          ><input class="border-2" v-model="title" type="text" name="" id="" placeholder="제목기입"
        /></label>
        <select class="border-2" v-model="selectstate" name="" id="">
          <option value="0">조퇴</option>
          <option value="1">퇴실</option>
          <option value="2">결석</option>
        </select>
      </div>
      <div>
        <textarea
          v-model="content"
          name=""
          id=""
          cols="30"
          rows="10"
          placeholder="내용기입"
          class="border-2 width: 500px height: 200px resize-none"
        ></textarea>
      </div>
    </form>
    <button class="border border-red-500" @click="insert">작성완료</button>
    <button class="border border-red-500" @click="cancle">취소</button>
  </div>
</template>

<script setup>
import { ref } from 'vue'
import { useRouter } from 'vue-router'
import axios from 'axios'

const router = useRouter()

const title = ref('')
const content = ref('')
// const state = ref(0)

const selectstate = ref('0')

const cancle = () => {
  router.push({ name: 'home' })
}

const insert = () => {
  //   alert('요청접수가 되었습니다')
  //   router.push({ name: 'home' })

  const data = {
    title: title.value,
    content: content.value
    // state: state.value
  }

  axios
    .post(`http://localhost:8080/freeboard/insert`, data)
    .then((res) => {
      console.log(res)
      alert('요청이 접수되었습니다.')
      router.push({ name: 'home' })
    })
    .catch((e) => {
      console.log(e)
      alert('에러발생' + e)
    })
}
</script>

<style lang="scss" scoped></style>
