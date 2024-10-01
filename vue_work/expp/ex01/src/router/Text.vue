<template>
    <div>
        <button @click="bbtn" class="bg-blue-600" >뒤로버튼</button>
<h1>gdgd</h1>
<p @click="hello" class="cursor-pointer inline-block border border-red-600 hover:bg-red-600" >눌러보셈</p>
<br>
<button @click="chg" class="border border-red-600 " >클릭</button>
<br>
<h1>count : {{count}} 단순변수(String, int) ref를 통한 반응성 유지</h1>
<h1>state : {{state.count}}</h1>
<h1>state1 : {{state1.countt}} ref대신 reactive 사용한 참조 자료형(배열등등) setTimeout으로 올라감</h1>
<br>
<h1>arr1 : {{arr1}}</h1>
<h1>arr2 : {{arr2}} 내부속성이나 요소가 변경될때는 ref가 반응성을 유지하지 않음</h1>
<br>
<br>
<h1 ref="inputRef" >Hello, Ref!</h1>
<br>
<br>
<p>Child 컴포넌트의 ref값을 불러오기(h1속의 문장도 출력됨)</p>
<Child ref="componentRef" />
<br>
<h1>computed를 사용하여 내부 계산된값을 ref로 실시간 변형 = {{refDoubleCount}}</h1>
<p>다만 computed로 계산된 값은 재할당이 불가...에러뜸</p>
<p>단일변수는 .value쓰거나 배열의 경우 .count로 지명시 변경가능 혹은 get방식 set방식도 쓰긴하지만 추천안함</p>
<br>

<br>
<h1>평범하게 지명하면 nan값이뜸 = {{reactiveDoubleCount.count}}</h1>
<br>
<h1>총합 = {{numberSum}}</h1>
<h1>ref = {{counnt}}</h1>
<h1>reactive = {{statee.count}}</h1>
<button class="border border-red-400" @click="expressFunc" >ref 증가!</button>
<button class="border border-red-400" @click="arrowFunc" >reactive 증가!</button>
<br>
<br>
<h1>watch()</h1>
<p>ref = {{counnnt}}</p>
<button class="border border-red-400" @click="counnnt++" >ref 증가</button>
<br>
<br>
<h1>ref 객체값 deef사용= {{statte.count}}</h1>
<p>deef사용하여 변경은 되지만 앞뒤값은 알 수 없음</p>
<p>reactive를 사용하면 감시는 가능하지만 앞뒤값은 같게 출력됨..</p>
<button class="border border-red-400" @click="statte.count++" >ref객체값 증가</button>
<br>
<br>
<h1>ref = {{stattee.count}}</h1>
<p>이 방법쓰면 알 수 있음</p>
<button @click="stattee.count++" class="border border-red-400">ref 증가</button>
<br>
<br>
<div>
    <input v-model="messageee" placeholder="메시지를 입력하세요." type="text" name="" id="">
    <p ref="messageParagraph">{{messageee}}</p>
</div>


    </div>
</template>

<script setup>
import Child from '@/components/Child.vue';

import { ref } from 'vue';
import { watchPostEffect } from 'vue';
import { reactive } from 'vue';
import { computed } from 'vue';
import { watch } from 'vue';
import router from '.';

const componentRef = ref(null)

setTimeout(()=>{
console.log(componentRef.value.number)
console.log(componentRef.value.doubleNumber)
},3000 )



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

const inputRef = ref(null)
setTimeout(() => {
console.log(inputRef.value) //h1을 포함해서 출력
console.log(inputRef.value.innerText); //h1의 내용만 출력
},3000 )

const refCount = ref(0)
const reactiveCount = reactive({count:0})
console.log(reactiveCount.count)
const refDoubleCount = computed(()=> refCount.value*2 )
const reactiveDoubleCount = computed(()=> reactiveCount*2 )


setTimeout(()=>{
    refCount.value = 10;
    reactiveCount.count = 20;
    console.log(refDoubleCount.value)
console.log(reactiveDoubleCount.flags)
},3000 )


const counnt = ref(0)
const statee = reactive({
    count:0,
    message:'hello',
});

const numberSum = computed(()=> counnt.value + statee.count )
const expressFunc = function(){
    counnt.value +=1;
}
const arrowFunc = () => {
    statee.count +=1;
}

const counnnt = ref(0)

watch(counnnt, (currentValue, prevValue)=> {
    console.log(`지금값 = ${currentValue}, 앞의값 = ${prevValue}`);
} )


const statte = ref({
    count:0,
})

watch(statte, (currentValue, prevValue)=> {
    console.log(`객체의 지금값 = ${currentValue}, 객체의 앞의값 = ${prevValue}`);
},
{
    deep: true,
}
)

const stattee = reactive({
    count:0,
})
watch(()=>stattee.count,(currentValue, prevValue)=> {
    console.log(`객체의 지금값 = ${currentValue}, 객체의 앞의값 = ${prevValue}`)
} )


const messageee =ref('')
const messageParagraph = ref(null)
watch(messageee, ()=> {
    if(messageee.value){
        console.log(`watch:${messageParagraph.value.innerText}`);
    }
});
watchPostEffect(()=> {
    if(messageee.value){
        console.log(`watchPostEffect:${messageParagraph.value.innerText}`);
    }

} )

const bbtn= () => {
    alert("뒤로갑니다.")
    router.back()
    
}

</script>

<style lang="scss" scoped>

</style>