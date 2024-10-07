<template>
    <div>
<h1 class="h1-red">TheFileUpload</h1>
<div class="p-5">
<input type="file" name="file" @change="onFileChange"> 
</div>
<button @click="save">전송</button>
    </div>
    <div>myfile = {{myfile}}</div>
</template>

<script setup>
import axios from 'axios';
// import { useRouter } from 'vue-router';
import { ref } from 'vue';

// const router = useRouter();
const myfile = ref(null);

  const save = () => {
    console.log("save");

     if(!myfile.value){
        alert("파일을 선택하세욯ㅎ");
        return;
        }

        const formData = new FormData();
        formData.append("file",myfile.value);
        formData.append("fileDto",
        new Blob(
            [JSON.stringify({name:'filename' , desc: 'aValue'})],
            {type:'application/json'}
        )
    );  
    //http통신규약에 의해 실물로 보여줄 바디


        axios.post(`http://localhost:8080/file/upload`,formData, {  //http통신규약에 의해 보여줄 헤더
        headers: {'content-Type':'multipart/form-data'}
        })
        .then((res) => {
            console.log(res);
        })
        .catch((e) => {
            console.log(e);
        })
        ;

    }

const onFileChange = (e) => {

myfile.value = e.target.files[0];

}



</script>

<style lang="scss" scoped>

</style>