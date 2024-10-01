<template>
    <div>
        <button @click="bbtn" class="bg-blue-600" >뒤로가기</button>
<h1>테스트3</h1>
<h1> list = {{listnum}}</h1>
<br>
<br>


    </div>
</template>

<script setup>
import { useRoute } from 'vue-router';
import { useRouter } from 'vue-router';

const route = useRoute();

const router = useRouter();

const listnum = route.params.list
console.log(listnum)

const bbtn =() => {
    alert("뒤로가기 버튼")
    router.back();
}

const bavigateToHome = () => {
    router.push(6);
}


</script>

<style lang="scss" scoped>

</style>