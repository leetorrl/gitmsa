<template>
    <div>
<button @click="bbtn" class="bg-blue-600" >뒤로가기</button>
</div>
    <div>
<h1>테스트2</h1>
<h1> list : {{id}}</h1>


    </div>
</template>

<script setup>

import { useRouter } from 'vue-router';
import { useRoute } from 'vue-router';

const route = useRoute();
const router = useRouter();

const id = route.params.list //라우터 전 페이지에 넘긴 list를 지금 지명한 id에 주입
console.log(id)


const bbtn= () => {
    alert("뒤로갑니다.")
    router.back()
    
}

</script>

<style lang="scss" scoped>

</style>