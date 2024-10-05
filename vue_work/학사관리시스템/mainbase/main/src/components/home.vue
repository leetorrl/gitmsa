<template>
    <div>
<h1 class="bg-blue-500" >Board</h1>
<p>-학원생 요청사항-</p>
<div class="w-1280 bg-slate-300">
<ul class="flex w-full ">
    <li class=" w-1/4 text-center border border-black">Bid</li>
    <li class=" w-1/4 text-center border border-black" >아이디</li>
    <li class=" w-1/4 text-center border border-black" >제목</li>
    <li class=" w-1/4 text-center border border-black" >작성일</li>
    <li class=" w-1/4 text-center border border-black" >요청현황</li>
</ul>
<ul class="flex w-full bg-slate-50 hover:cursor-pointer" @click="GoBoardView(Bid)" >
<!-- <ul v-for="item in arr" key="item.Bid" > -->
    <!-- <li class=" w-1/4 text-center border border-black" >{{Bid}}</li>
    <li class=" w-1/4 text-center border border-black" >{{Uid}}</li>
    <li class=" w-1/4 text-center border border-black" >{{title}}</li>
    <li class=" w-1/4 text-center border border-black" >{{wdate}}</li>
    <li class=" w-1/4 text-center border border-black" >{{state}}</li> -->
    <li class=" w-1/4 text-center border border-black" >{{Bid}}</li>
    <li class=" w-1/4 text-center border border-black" >ㅇㅇ</li>
    <li class=" w-1/4 text-center border border-black" >병가 신청합니다</li>
    <li class=" w-1/4 text-center border border-black" >2024-10-06 11:32</li>
    <li class=" w-1/4 text-center border border-black" >(요청대기)</li>
</ul>
</div>
    </div>
</template>

<script setup>
import { ref } from 'vue';
import { useRouter } from 'vue-router';
import axios from 'axios';

const router = useRouter();
const arr = ref([])

const Bid = ref(1)
const Uid = ref('')
const title = ref('')
const wdate = ref('')
const state = ref('')



const GoBoardView =(id) => {

    router.push({name:'boardview', params:{id}})
}


const Viewlist = async() => {

    try{
    const res = await axios.get(`localhost:8080/Board`)
    .then(res => {
        console.log(res.data);
    })
    }catch(e){
        
    }

}

// Viewlist();


</script>

<style lang="scss" scoped>

</style>