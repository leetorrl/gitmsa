<template>
    <div>
<h1>gdgd</h1>
<p @click="hello" >눌러보셈</p>

<button @click="chg" >클릭</button>

<h1>count : {{count}} 단순변수(String, int) ref를 통한 반응성 유지</h1>
<h1>state : {{state.count}}</h1>
<h1>state1 : {{state1.countt}} ref대신 reactive 사용한 참조 자료형(배열등등) setTimeout으로 올라감</h1>

<h1>arr1 : {{arr1}}</h1>
<h1>arr2 : {{arr2}} 내부속성이나 요소가 변경될때는 ref가 반응성을 유지하지 않음</h1>

    </div>
</template>

<script setup>


import { ref } from 'vue';
import { reactive } from 'vue';

const hel = '안녕하세요'

const count = ref(0)
const state = ref({
    count: 0,
});

const state1 = reactive({
    countt:0,
});

const arr1 = ref([10])
const arr2 = ref([10])

const chg = () => {
    
    setTimeout(()=> {
arr1.value = [10,20] //배열의 값을 변경
},3000 )

setTimeout(() => {
    arr2.push(20) //배열의 요소를 변경
},1000 )


setTimeout( () => {
    count.value++;
},3000)

setTimeout( () => {
    state.count++;
},3000)


setTimeout(()=>{
state1.countt++;
},3000 )


}


const hello = () => {

    alert(hel)
    console.log(hel)

}




</script>

<style lang="scss" scoped>

</style>