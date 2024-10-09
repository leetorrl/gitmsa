<template>
  <div>
    <h1 class="bg-orange-400">요청사항</h1>
   
     
    <div>
        <h1>요청항목</h1>
        <form action="">
        <label for="조퇴">조퇴<input v-model="con" type="radio" name="con" id="조퇴" value="조퇴" checked></label>
        <label for="외출">외출<input v-model="con" type="radio" name="con" id="외출" value="외출" ></label>
        <label for="결석">결석<input v-model="con" type="radio" name="con" id="결석" value="결석" ></label>
      </form>
    </div>
<br>
<div>
        <h1>요청사유</h1>
        <form action="">
        <label for="병가">병가<input v-model="conn" type="radio" name="conn" id="병가" value="병가" checked></label>
        <label for="조문">조문<input v-model="conn" type="radio" name="conn" id="조문" value="조문" ></label>
        <label for="훈련">훈련<input v-model="conn" type="radio" name="conn" id="훈련" value="훈련" ></label>
        <label for="기타">기타<input v-model="conn" type="radio" name="conn" id="기타" value="기타" ></label>
      </form>
    </div>
    <button @click="temp" >확인버튼</button>
        <!-- <label for=""
          ><input class="border-2" v-model="title" type="text" name="" id="" placeholder="제목기입"
        /></label> -->
        <!-- <select class="border-2" v-model="selectstate" name="" id="">
          <option value="0">조퇴</option>
          <option value="1">퇴실</option>
          <option value="2">결석</option>
        </select> -->
      
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

const con = ref('조퇴')

const conn = ref('병가')

const temp = () => {

  console.log(con.value)
  console.log(conn.value)
}

const selectstate = ref('0')

const cancle = () => {
  router.push({ name: 'mypage' })
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
