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
import { useRouter } from 'vue-router';
import { ref } from 'vue';

const router = useRouter();
const myfile = ref(null);

const save = () => {
    console.log("save");

if(!myfile.value){
alert("파일을 선택하세욯ㅎ");
return;
}

    if(myfile)
    axios.post(`http://localhost:8080/file/upload`)

}

const onFileChange = (e) => {

myfile.value = e.target.value;

}



</script>

<style lang="scss" scoped>

</style>