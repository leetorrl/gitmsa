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
           
            class="
            
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
          <button class="border border-red-500 hover:bg-red-500 " @click.stop="modalUser(item)">수정</button>

          <button class="border border-red-500 hover:bg-red-500 " @click.stop="dodelete(item.idx)" >삭제</button>
        
        </div>
      </div>
    </div>
  </template>
  <script setup>
  //악시오스 안써서 빨간줄..
  // import axios from 'axios';
  import { deleteUser, getUsers, saveUser } from '../api/userApi';
  import { ref, watchEffect } from 'vue';
  import { useRouter } from 'vue-router';
import Swal from "sweetalert2"

const router = useRouter();

const arr = ref([]);
const isModal = ref(false);
// const isView = ref(false)

const idx = ref('')
const name = ref('')
const email = ref('')
const wdate = ref('')

  const modalUser = async (item)=>{

    isModal.value = !isModal.value
    // isView.value = !isView.value


    if(item=='save'){
      
//result값 안써서 빨간줄...
     await saveUser( {idx:idx.value, 
                                    name:name.value,
                                    email:email.value,
                                    password:'임시'
                                    } ); //userApi.js의 saveUser메서드 호출

                                    Swal.fire('수정됨');

      // alert('수정이 완료되었습니다.')
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


const dodelete = async (idx) => {
    
if(!confirm('진짜 삭제할거임?')){ //경고창 상위호환 취소 누를시..
  if(!confirm("쫄?")){

alert("zz")
    return
  }else{
    await deleteUser(idx) //userApi의 딜리트 메서드 호출

const retValue = await getUsers(); //새로고침 기능
arr.value = retValue.data; //갯유저 데이터를 arr배열에 넣음 이러면 자동 새로고침이 구현됨
console.log('삭제되고 갯유저 불러와서 새로고침완료'+ idx)
return;


  }


  

}else{ //확인누를시..
  await deleteUser(idx) //userApi의 딜리트 메서드 호출

  const retValue = await getUsers(); //새로고침 기능
arr.value = retValue.data; //갯유저 데이터를 arr배열에 넣음 이러면 자동 새로고침이 구현됨
console.log('삭제되고 갯유저 불러와서 새로고침완료'+ idx)
return;
}



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