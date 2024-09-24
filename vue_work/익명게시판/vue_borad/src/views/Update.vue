<template>
    <div id="wrap">
      <h1>글수정</h1>
      <div>
        <label for="" style="display: inline-block; text-align: center; width: 80px"> 아이디 </label
        ><input style="width: 100px" v-model="f_nickname" type="text" name="" id="bid" />
      </div>
      <div>
        <label style="display: inline-block; text-align: center; width: 80px" for="">비밀번호 </label>
        <input style="width: 100px" v-model="f_password" type="password" name="" id="bpa" />
      </div>
      <br />
      <div>
        <p>제목</p>
        <textarea
          placeholder="바르고 고운말!."
          v-model="f_title"
          name=""
          id="bti"
          style="margin: 2px; padding: 2px 0 0 2px; width: 500px; height: 23px; resize: none"
        ></textarea>
      </div>
      <p>내용</p>
      <div>
        <textarea
          placeholder="싸우지 말고 서로서로 즐겁게 지내요."
          v-model="f_body"
          name=""
          id="bte"
          style="margin: 2px; padding: 2px 0 0 2px; width: 500px; height: 200px; resize: none"
        ></textarea>
      </div>
  
      <p id="btn" @click="insert">완료</p>
    </div>
  </template>

<script setup>
import axios from 'axios'
import { ref } from 'vue'
import { useRoute ,useRouter } from 'vue-router'

const f_nickname = ref('')
const f_password = ref('')
const f_title = ref('')
const f_body = ref('')
const f_idx = ref(0)


const route = useRoute()
const router = useRouter()

const insert = () => {

  console.log('c. 글수정버튼')
  console.log(`1. f_idx = ${f_idx.value}`)
  console.log(`2. f_nickname = ${f_nickname.value}`)
  console.log(`3. f_password = ${f_password.value}`)
  console.log(`4. f_title = ${f_title.value}`)
  console.log(`5. f_body = ${f_body.value}`)

const data = {
    f_idx:f_idx.value,
    f_nickname: f_nickname.value,
    f_password: f_password.value,
    f_title: f_title.value,
    f_body: f_body.value,
    

  }

  axios
    // .post('http://localhost:8080/user/insert', data)
    .post(`http://localhost:8080/freeboard`, data) //학원꺼
    .then(res => {
      console.log(res)
      alert('수정하였습니다.')

      router.push({ name: 'list',params: { pagenum: 0 } })
    })
    // router.push({ name: 'home' })
    // alert('저장되었습니다.')
    .catch((e) => {
      console.log(e)
      alert('에러' + e)
      // alert('에러' + e.response.data.message)
    })
}


const get_board = () => {
axios.get(`http://localhost:8080/freeboard/view/${route.query.f_idx}`)
.then((res) => {
    console.log(res)
    f_idx.value - res.data.f_idx;
    f_nickname.value = res.data.f_nickname;
    f_password.value = res.data.f_password;
    f_title.value = res.data.f_title;
    f_body.value = res.data.f_body;

})


}



get_board()


</script>

<style lang="scss" scoped>

</style>