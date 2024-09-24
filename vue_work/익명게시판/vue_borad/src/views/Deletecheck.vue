<template>
    <div>
        <h1>삭제체크</h1>
        <p>비밀번호를 입력하십시오</p>
<input type="password">
<button @click="golist">취소</button><button @click="godelete" >확인</button>
    </div>
</template>

<script setup>
// import axios from 'axios'
// import { ref } from 'vue'
// import { useRoute, useRouter } from 'vue-router'

// const router = useRouter();


// const golist = () =>{

    
//     router.push({name:list});

// }


//   axios
//     .delete(`http://localhost:8080/freeboard/delete/${id}`) //딜리트 명령문
//     // .delete(`http://localhost:8080/freeboard/delete/${idx}`)
//     .then((res) => {
//       alert(res.data)
//       if (res.status == '200') {
//         router.push({ name: 'list' })
//       }
//     })
//     .catch((e) => console.log(e))
// }


// const get_board = () => {
  
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
// }



// get_board()
</script>

<style lang="scss" scoped>

</style>