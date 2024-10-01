<template>
    <div>
        <button @click="bbtn" class="bg-blue-600" >뒤로가기</button>
<h1>테스트3</h1>
<h1> list = {{listnum}}</h1>
<br>
<br>
<nav>
    <h1>라우터 기능을 넣은 a링크 모음집..(forward는 앞으로 버튼인데 잘안됨)</h1>
    <a href="#" @click.prevent="router.push('/')" class="border border-red-500 hover:bg-red-500 " >.push
    </a>
    <a href="#" @click.prevent="router.replace('/about')" class="border border-red-500 hover:bg-red-500 " >.replace

    </a>
    <a href="#" @click.prevent="router.go(-1)" class="border border-red-500 hover:bg-red-500 " >.go

    </a>
    <a href="#" @click.prevent="router.forward()" class="border border-red-500 hover:bg-red-500 " >.forward

    </a>
    <a href="#" @click.prevent="router.back()" class="border border-red-500 hover:bg-red-500 " >.back

    </a>
</nav>

<div>
    <router-link :to="{name:'homeview'}">Home</router-link>
</div>
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
const replaceWithAbout = () => {
    router.replace('/about')
}
const go =()=>{
    router.go(1)
}
const goForward = () => {
    router.forward();
}
const goBack = () => {
    router.back();
}





</script>

<style lang="scss" scoped>

</style>