<template>
    <div>
<h1 class="bg-green-400" >-BoardView-</h1>

<div class="bg-blue-300" >
    <div class="border-2" > <div>{{title}} (요청상태 = {{state}})</div>
    <div>작성자 : {{Uid}} 작성일 : {{wdate}}</div></div>
   
<div class="border-2">{{content}} + Lorem ipsum dolor sit amet consectetur, 
    adipisicing elit. Expedita, quo mollitia 
    cum dolorum fuga blanditiis quos atque neque. Delectus 
    veniam sunt dicta adipisci vero iste voluptate non
     veritatis aut cumque!</div>
</div>
<button class="border border-red-500 cursor-pointer" @click="GoBoardInput">새글작성</button>
<button class="border border-red-500" @click="cancle" >목록버튼</button>
<br>
<br>
<div>
    <h1>댓글</h1>
    <div>
        <ul class="flex border-2 w-100% bg-gray-200">
            <!-- <ul v-for="Item in arr" :key="Item.Cid?" > -->
            <!-- <li>{{Item.Cid}}</li>
            <li>{{{Item.Ccontent}}</li>
            <li>{{{Item.Cwdate}}</li> -->
            <li class="bg-gray-200 w-1/12 m-auto" >{{Cid}}</li>
            <li class="w-10/12 m-auto bg-slate-50 " >{{Ccontent}}</li>
            <li class=" w-1/12 m-auto bg-slate-50 " >{{Cwdate}}</li>
        </ul>
    </div>
    <div class="w-100%">
        <textarea placeholder="댓글내용입력" name="" id="" class="w-10/12 border-2 resize-none" ></textarea>
        <button class="bg-yellow-200 w-2/12 h-full" @click="Cinsert" >댓글등록</button>
    </div>
</div>

    </div>
</template>

<script setup>
import axios from 'axios';
import { ref } from 'vue';
import { useRoute } from 'vue-router';
import { useRouter } from 'vue-router';

const router = useRouter();
const route = useRoute();

const title = ref('get title');
const Uid = ref('get Uid');
const content = ref('get content');
const wdate = ref('get wdate');
const state = ref('get state');

const arr = ref([])

const Cid = ref('get Cid')
const Ccontent = ref('get Ccontent')
const Cwdate = ref('get Cwdate')

const cancle = () => {
router.push({name:'home'})

}
const GoBoardInput = () => {

router.push({name:'boardinput'})

}

const getBoardView = async() => {

    const res = await axios.get(`http://localhost:8080/Board/view/${route.params.id}`)

    if(res.status==200){

        title.value = res.data.title
        Uid.value = res.data.Uid
        content.value = res.data.content
        wdate.value = res.data.wdate
        state.value =res.data.state
        
    }else{
        alert(res.response.data.message)
        router.push({name:'home'})
    }
}

const Cinsert = () => {

    alert('요청접수 완료')

}

// getBoardView();

</script>

<style lang="scss" scoped>

</style>