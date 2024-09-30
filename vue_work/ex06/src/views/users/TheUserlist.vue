<template>
  <div class="overlay" :class="{isModal:isModal}">

  </div>
<div class="modal p-5 rounded" :class="{isView:isModal}">
  <h1 class="text-5xl" >USER 수정</h1>
  <div class="cursor-pointer bg-slate-500 p-5 m-5 w-80 text-white rounded">
<h1>idx = {{idx}}</h1>
<h1>name = <input type="text" v-model="name" class=" p-1 border border-gray-300 rounded-lg shadow-sm focus:outline-none focus:ring-2 focus:ring-blue-500 focus:border-blue-500 text-gray-700 "></h1>
<h1>email = {{email}}</h1>
<h1>가입날짜 = {{wdate}}</h1>
  </div>
  <div class="flex space-x-5 justify-center">
    <button class="border border-red-500 hover:bg-yellow-200" @click="modalUser" >취소</button>
    <button class="border border-red-500 hover:bg-yellow-200" @click="modalUser('save')" >저장</button>

  </div>
  
</div>

    <div class="pb-10">
      <h1 class="h1-blue">UserList</h1>
      <div class="flex flex-wrap">
        <div 
            @click="modalUser(item)"
            class="
            cursor-pointer
          bg-slate-500 
            p-5 
            m-5
            w-80
            text-white" 
            v-for="item in arr" :key="item.idx">
          <h1>idx = {{ item.idx }}</h1>
          <h1>name = {{ item.name }}</h1>
          <h1>email = {{ item.email }}</h1>
          <h1>가입날짜 = {{ item.wdate }}</h1>
          <h1>작성한글 = {{ item.list.length }}</h1>
          <button @click.stop="dodelete(item.idx)" >삭제</button>
        </div>
      </div>
    </div>
  </template>
  <script setup>
  //악시오스 안써서 빨간줄..
  import axios from 'axios';
  import { getUsers, saveUser } from '../api/userApi';
  import { ref, watchEffect } from 'vue';
  import { useRouter } from 'vue-router';

const router = useRouter();

const arr = ref([]);
const isModal = ref(false);
const isView = ref(false)

const idx = ref('')
const name = ref('')
const email = ref('')
const wdate = ref('')

  const modalUser = async (item)=>{

    isModal.value = !isModal.value
    isView.value = !isView.value


    if(item=='save'){
      
//result값 안써서 빨간줄...
     const result = await saveUser( {idx:idx.value, 
                                    name:name.value,
                                    email:email.value,
                                    password:'임시'
                                    } ); //userApi.js의 saveUser메서드 호출

      alert('수정이 완료되었습니다.')
       router.push({name:'userlint'}) // router써도 같은 주소라 새로고침 안됨
      const retValue = await getUsers();
      arr.value = retValue.data; //새로고침이됨
      return;
  
    }

idx.value = item.idx;
name.value = item.name;
wdate.value = item.wdate;
email.value = item.email;

    console.log(isModal.value)

   

  }
  



  watchEffect( async() => {
    const retValue = await getUsers();
    // console.log("retValue = "+JSON.stringify(retValue.data));
    arr.value = retValue.data;
    console.log(arr.value);
  });


  const dodelete = () => {
    console.log('삭제되었습니다.')
  }

  </script>

  <style scoped>
  .h1-blue {
    font-size: 5rem;
    color: blue;
  }

  .overlay{
position: fixed;
top: 0;
left: 0;
width: 100%;
height: 100%;
background-color: rgba(0, 0, 0, 0.3);
z-index: 1000;
display: none;
  }

  .isModal{

    display: block;

  }

  .modal{
    position: fixed;
    top: 50%;
    left: 50%;
    transform: translate(-50%, -50%);
    
    height: 400px;
    background-color: white;
    z-index: 1001;
    display: none;
  }

  .isView{
    display: block;
  }

  </style>