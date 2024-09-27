<template>
    <div>
        <h1 class="h1-red">FreeBoardUpdate</h1>



        <div class="p-5">

            title = {{ title }}
            content = {{ content }}

            <input type="text" v-model="title" placeholder="Enter your title here"
                class="w-11/12 p-3 border border-gray-300 rounded-lg shadow-sm focus:outline-none focus:ring-2 focus:ring-blue-500 focus:border-transparent text-gray-700 placeholder-gray-400 bg-white">

            <textarea v-model="content"
                class="m-4 w-11/12 h-40 p-4 border border-gray-300 rounded-lg shadow-sm focus:outline-none focus:ring-2  focus:ring-blue-400 focus:border-transparent resize-none text-gray-700 placeholder-gray-400  bg-white "
                placeholder="Enter your title here" name="" id="" cols="30" rows="10"></textarea>

                <div class="my-3">
        <input type="file" @change="onFileChange" />
      </div>
            <button
                class="px-4 py-2 bg-blue-500 text-white font-semibold rounded-lg shadow-md hover:bg-blue-600 focus:outline-none focus:ring-2 focus:ring-blue-300"
                @click="save" >수정</button>
        </div>



    </div>
</template>

<script setup>
import axios from 'axios';
import { ref } from 'vue';
import { useRoute ,useRouter } from 'vue-router';
// import { useRoute } from 'vue-router';
// const arr = ref([]);


const title = ref('');
const content = ref('');
const regDate = ref('');
const creAuthor = ref('');
const idx = ref(0);

const router = useRouter();
const route = useRoute();

const myfile = ref(null);


const onFileChange = (e) => {

    myfile.value = e.target.files[0]

}

const getFreeBoard = () => {

    axios.get(`http://localhost:8080/freeboard/view/${route.query.idx}`)
        .then(res => {
            console.log(res);
            title.value = res.data.title;
            content.value = res.data.content;
            regDate.value = res.data.regDate;
            creAuthor.value = res.data.creAuthor;
            idx.value = res.data.idx;
        })
        .catch(e => {
            console.log(e);
            alert(e.response.data.message);
            router.push({ name: "freeboardlist" });



        })

    }

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


const save = () => {

    const data = {
        idx: idx.value,
        title: title.value,
        content: content.value

    }
    const formData = new FormData()
  formData.append('data', new Blob([JSON.stringify(data)],
   { type: 'application/json' }))
  formData.append('file', myfile.value)
  axios
    .post('http://localhost:8080/freeboard', formData, {
      headers: {
        'Content-Type': 'multipart/form-data'
      }
    }) //데이터 가져오는명령어
    .then((res) => {
      console.log(res)
      alert('저장하였습니다.')
      router.push({ name: 'freeboardlist', params: { pagenum: 0 } })
    })
    .catch((e) => {
      console.log(e)
      alert('에러' + e.response.data.message)
    })


    // console.log(data);
    axios.post('http://localhost:8080/freeboard', data) //데이터 가져오는명령어
        .then(res => {
            console.log(res);
            alert('저장하였습니다.')
            router.push({ name: "freeboardlist", params: { pagenum: 0 } });
        })
        .catch(e => {
            console.log(e);
            alert('에러' + e.response.data.message);
        })
}

getFreeBoard()

</script>

<style lang="scss" scoped></style>
