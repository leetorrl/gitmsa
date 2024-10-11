<template>
    <div>

        <header>
    <div class="p-5 bg-slate-500 text-white text-3xl">
      <nav class="flex space-x-5 justify-between">

        <div class="flex space-x-5">

        <h1 class="border-2 inline"> 동현네비</h1>
<div>
  <h1>안녕안녕d~~~~~</h1>
        <RouterLink to="/">Home</RouterLink>
</div>



<div>
        <RouterLink to="/Userlist">Userlist</RouterLink>
</div>
        <div class="group relative">
        <RouterLink to="/freeboardlist">FreeBoard</RouterLink>
        <div class="hidden group-hover:block absolute bg-slate-600 p-5 rounded">
          <div>
            <RouterLink to="/freeboardlist">FreeBoardList</RouterLink>
            </div>
            <div>
          <RouterLink to="/freeboardinput">FreeBoardinput</RouterLink>
          </div>
        </div>
</div>



<div class="group relative" >
<router-link to="/FileDownload">file</router-link>
<div class="opacity-0 group-hover:opacity-100 transition absolute bg-slate-700 p-5 top-8 -left-5 rounded">
    <div> <RouterLink to="/fileuploadUpdate">ThefileuploadUpdate</RouterLink>
</div>
<div>
          <RouterLink to="/FileDownload" >FileDownload</RouterLink>
        </div>
</div>
</div>
</div>


<template v-if="loginPinia.loginCheck">
    <div>
      <div>{{loginPinia.name}}로그인중</div>
        <div>
          <div><button @click="logout" class="border-2" >Logout</button></div>
      </div>
    </div>
</template>


<template v-else>
  <div class="flex space-x-5">
          <RouterLink to="/join" >join</RouterLink>
          <RouterLink to="/login" >login</RouterLink>
        </div>
</template>

      </nav>
    </div>
  </header>


    </div>
</template>

<script setup>

import { doLogincheck } from '@/views/api/loginApi';
import { watchEffect } from 'vue';
import { useLoginStore } from '@/store/loginPinia';
import { useRouter } from 'vue-router';


const router = useRouter();

const loginPinia = useLoginStore();

const logout = () => {
localStorage.removeItem('token')
loginPinia.logout
router.push({name:'login'})

}

watchEffect (async()=> {

 const result = await doLogincheck();

 if(result == false){
    loginPinia.logout();

 }else{

  if(result.status !==200){
    loginPinia.logout()
    localStorage.removeItem('token')
  }
  else{

    loginPinia.login(result.data)
  }
 }  
})


</script>

<style lang="scss" scoped>

</style>