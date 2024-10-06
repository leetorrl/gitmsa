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
    <!-- <li class=" w-1/4 text-center border border-black" >{{item.Bid}}</li>
    <li class=" w-1/4 text-center border border-black" >{{item.Uid}}</li>
    <li class=" w-1/4 text-center border border-black" >{{item.title}}</li>
    <li class=" w-1/4 text-center border border-black" >{{item.wdate}}</li>
    <li class=" w-1/4 text-center border border-black" >{{item.state}}</li> -->
    <li class=" w-1/4 text-center border border-black" >{{Bid}}</li>
    <li class=" w-1/4 text-center border border-black" >{{Uid}}</li>
    <li class=" w-1/4 text-center border border-black" >{{title}}</li>
    <li class=" w-1/4 text-center border border-black" >{{wdate}}</li>
    <li class=" w-1/4 text-center border border-black" >{{state}}</li>
</ul>
</div>
<button class="border border-red-500 cursor-pointer" @click="GoBoardInput">글작성</button>
    </div>
</template>

<script setup>
import { ref, watchEffect } from 'vue';
import { useRouter } from 'vue-router';
import axios from 'axios';

const router = useRouter();

const arr = ref([])
const totalpages = ref(10)

const Bid = ref(1)
const Uid = ref('get uid')
const title = ref('get title')
const wdate = ref('get wdate')
const state = ref('get state')



const GoBoardView =(id) => {

    router.push({name:'boardview', params:{id}})
}

// watchEffect( async() => {

// js따로 팔때 쓰는걸로
// })

const GoBoardInput = () => {

    router.push({name:'boardinput'})

}

const Viewlist = async() => {

    try{
    const res = await axios.get(`http://localhost:8080/Board`)

    arr.value = res.data.list
    totalpages.value = res.data.totalpages

    }catch(e){
        console.log(e)
        return e;
    }

}

// Viewlist();


</script>

<style lang="scss" scoped>

</style>