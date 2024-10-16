<template>
    <div>
<h1>홈</h1>

<p>{{count}}</p>
<button style="border: 1px solid black;" v-show="countt" @click="aa()">클릭</button>
<br>
<h3>20까지 찍으면 놀라운 일이...</h3>
<h1>도커 서버구축 연습중...</h1>
<button @click="gott" class="border border-red-500 hover:bg-red-500" > 부트스트랩</button>
    </div>
</template>

<script setup>
import { ref } from 'vue';

const count = ref(0);
let countt = ref(true);

const aa = () =>{
    count.value++
    console.log("오른닸")

    if(count.value == 20){
       countt.value = false;

    }
}



import { useRouter } from 'vue-router';


const router = useRouter()

const gott = () => {

  router.push({name:'ttest'})
}


</script>

<style lang="scss" scoped>

</style>