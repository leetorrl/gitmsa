<template>
  <div>
    <h1 class="h1-red">FreeBoardinput</h1>

    <div class="p-5">
      title = {{ title }} content = {{ content }}

      <input
        type="text"
        v-model="title"
        placeholder="Enter your title here"
        class="w-11/12 p-3 border border-gray-300 rounded-lg shadow-sm focus:outline-none focus:ring-2 focus:ring-blue-500 focus:border-transparent text-gray-700 placeholder-gray-400 bg-white"
      />

      <textarea
        v-model="content"
        class="m-4 w-11/12 h-40 p-4 border border-gray-300 rounded-lg shadow-sm focus:outline-none focus:ring-2 focus:ring-blue-400 focus:border-transparent resize-none text-gray-700 placeholder-gray-400 bg-white"
        placeholder="Enter your title here"
        name=""
        id=""
        cols="30"
        rows="10"
      ></textarea>

      <div class="my-3">
        <input type="file" @change="onFileChange" />
      </div>

      <button
        class="px-4 py-2 bg-blue-500 text-white font-semibold rounded-lg shadow-md hover:bg-blue-600 focus:outline-none focus:ring-2 focus:ring-blue-300"
        @click="save"
      >
        저장
      </button>
    </div>
  </div>
</template>

<script setup>

import { ref } from 'vue'
import { useRouter } from 'vue-router'
// import { useRoute } from 'vue-router';
// const arr = ref([]);
import { saveFreeboard } from '../api/freeboardApi';


const myfile = ref(null)

const title = ref('')
const content = ref('')
// const regDate = ref('');
// const creAuthor = ref('');
// const idx = ref(0);

const router = useRouter()
// const route = useRoute();

// const getFreeBoard = () => {
//     axios.get(`http: //localhost:8080/freeboard/view/${route.params.idx}`)
//         .then(res => {

//             title.value = res.data.title;
//             content.value = res.data.content;
//             regDate.value = res.data.regDate;
//             creAuthor.value = res.data.creAuthor;
//             idx.value = res.data.idx;

//         }).catch(e => {
//             console.log(e);
//             alert(e.response.data.message);
//             router.push({ name: "freeboardlist" });
//         })
// }

const onFileChange = (e) => {
  myfile.value = e.target.files[0]
}

const save = async () => {


  const data = {
    title: title.value,
    content: content.value
  }

  const formData = new FormData()
  formData.append('data', new Blob([JSON.stringify(data)],
   { type: 'application/json' }))
  formData.append('file', myfile.value)
  // console.log(data);

  const res = await saveFreeboard(formData);

  if(res.status==200){

    console.log(res)
    alert("저장하였습니다.")
    router.push({name:'freeboardlist'})
    return;
  }

  alert("에러 = "+res.response.data.message)
}


  //해당 내용은 freeboardApi로 대처
  //인설트와 파일 업데이트 동시에....
  // axios
  //   .post('http://localhost:8080/freeboard', formData, {
  //     headers: {
  //       'Content-Type': 'multipart/form-data'
  //     }
  //   }) //데이터 가져오는명령어
  //   .then((res) => {
  //     console.log(res)
  //     alert('저장하였습니다.')
  //     router.push({ name: 'freeboardlist', params: { pagenum: 0 } })
  //   })
  //   .catch((e) => {
  //     console.log(e)
  //     alert('에러' + e.response.data.message)
  //   })
// }

</script>

<style lang="scss" scoped></style>
