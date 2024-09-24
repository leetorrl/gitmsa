<template>
    <div>
        <h1>수정체크</h1>
        <p>비밀번호를 입력하십시오</p>
<input type="password">
<button>취소</button><button>확인</button>
    </div>
</template>

<script setup>
import axios from 'axios'
import { ref } from 'vue'
import { useRoute, useRouter } from 'vue-router'


const get_board = () => {
  
//   axios
//     .get(`http://localhost:8080/freeboard/view/${route.params.id}`)
//     // .get(`http://localhost:8080/freeboard/view/${route.params.idx}`)
//     .then((res) => {
//       console.log(res)
//       f_title.value = res.data.f_title
//       f_body.value = res.data.f_body
//       f_timestamp.value = res.data.f_timestamp
//       f_nickname.value = res.data.f_nickname
//       f_idx.value = res.data.id
//       console.log("id값 = "+res.data.id);
//       // idx.value = res.data.idx;
//     })
//     .catch((e) => {
//       console.log(e)
//       alert(e.response.data.message)
//       router.push({ name: 'list' })
//     })
}


get_board()
</script>

<style lang="scss" scoped>

</style>