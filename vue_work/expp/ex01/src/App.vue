
<template>
  <div>
<h1 class="bg-slate-600" @click="CC">시작</h1>
<form action="">
<input type="text" v-model="scr" class="border" name="scr" id="" readonly />
<input class="border bg-red-200 p-1 cursor-pointer m-2 " type="button" value="C" @click="operation" />
<input class="border bg-red-200 p-1 cursor-pointer m-2 " type="button" value="/" @click="operation" />
<input class="border bg-red-200 p-1 cursor-pointer m-2 " type="button" value="1" @click="operation" />
<input class="border bg-red-200 p-1 cursor-pointer m-2 " type="button" value="2" @click="operation" />
<input class="border bg-red-200 p-1 cursor-pointer m-2 " type="button" value="3" @click="operation" />
<input class="border bg-red-200 p-1 cursor-pointer m-2 " type="button" value="*" @click="operation" />
<input class="border bg-red-200 p-1 cursor-pointer m-2 " type="button" value="4" @click="operation" />
<input class="border bg-red-200 p-1 cursor-pointer m-2 " type="button" value="5" @click="operation" />
<input class="border bg-red-200 p-1 cursor-pointer m-2 " type="button" value="6" @click="operation" />
<input class="border bg-red-200 p-1 cursor-pointer m-2 " type="button" value="+" @click="operation" />
<input class="border bg-red-200 p-1 cursor-pointer m-2 " type="button" value="7" @click="operation" />
<input class="border bg-red-200 p-1 cursor-pointer m-2 " type="button" value="8" @click="operation" />
<input class="border bg-red-200 p-1 cursor-pointer m-2 " type="button" value="9" @click="operation" />
<input class="border bg-red-200 p-1 cursor-pointer m-2 " type="button" value="-" @click="operation" />
<input class="border bg-red-200 p-1 cursor-pointer m-2 " type="button" value="." @click="operation" />
<input class="border bg-red-200 p-1 cursor-pointer m-2 " type="button" value="0" @click="operation" />
<input class="border bg-red-200 p-1 cursor-pointer m-2 " type="button" value="=" @click="operation" />
</form>
<!-- <div v-for="item in arr" :key="item"> -->
<div class="inline-block"><h1>{{scrr}}</h1></div>
<div class="inline-block"><h1>{{curr}}</h1></div>
<br>
<br>
<br>

<h1 class="cursor-pointer inline-block border border-red-600 hover:bg-red-600" @click="text">클릭!</h1>
<h1 class="cursor-pointer inline-block border border-red-600 hover:bg-red-600" @click="text2(scr)">클릭!!</h1>
<h1 class="cursor-pointer inline-block border border-red-600 hover:bg-red-600" @click="text3(scr)">클릭!!!</h1>



<RouterView />

</div>


</template>

<script setup>

import { RouterView } from 'vue-router';
import { ref } from 'vue';
import { useRouter } from 'vue-router';




const scr = ref(null)
const prev = ref(null)
const cur = ref(null)
const operatour = ref(null) 

const router = useRouter();

const scrr = ref('')
const curr = ref('')
const count = ref(1)
const arr = ref([])
// const stt = ref('')

const CC = () => {
  router.push({name:'app'})
}


const text = () => {

  router.push({name : 'text'})
}


const operation = (e) => {

  const n = e.currentTarget.value; //클릭한 버튼값 가져오기 $event람다문..
console.log("=============================")
  console.log(" 누른n값 = "+n)

  scrr.value += n;


if(n==='C'){
  scrr.value = ''
       scr.value = null
 prev.value = null
 cur.value = null
 operatour.value = null
 curr.value = null;
      return;
}


  if(['+','-','*','/','='].includes(n)){ 
    //n 배열안에 지명한 배열의 기호들이 존재한다면 true를 반환, 없다면 falue를 반환(대소문자 구분함)
    console.log(" scr in includes = "+true)

    if(!cur.value && !prev.value){
      alert('숫자를 먼저 입력하세요.');
      scrr.value = ''
       scr.value = null
 prev.value = null
 cur.value = null
 operatour.value = null
 
      return;
    }

    if(operatour.value !== '' && !cur.value){
      alert('사칙연산 기호를 연달아 누를 수 없습니다.')
      scrr.value = ''
       scr.value = null
 prev.value = null
 cur.value = null
 operatour.value = null
 
      return;
    }
    
    if(n === '=' && prev.value === cur.value){
      scrr.value = ''
       scr.value = null
 prev.value = null
 cur.value = null
 operatour.value = null
 
      return;
    }

    cur.value = Number(cur.value)

    if(operatour.value !==null){

      switch (operatour.value){


        case '+':
        console.log(prev.value +"+"+ cur.value)

        arr.value = prev.value +"+"+ cur.value;
        
        console.log("arr값 = "+ arr.value)
          prev.value = prev.value + cur.value
          
          break;

        case '-':
        console.log(prev.value +"-"+ cur.value)
          prev.value = prev.value - cur.value
          
          break;

        case '*':
        console.log(prev.value +"*"+ cur.value)
          prev.value = prev.value * cur.value
         
          break;

        case '/':
        console.log(prev.value +"/"+ cur.value)
          prev.value = prev.value / cur.value
       
          break;
      }
      
      if(n==='='){
        

count.value++;
console.log(" 최종값 prev = "+prev.value)
curr.value += prev.value
operatour.value = null;
prev.value = null;
scr.value = null;
cur.value = null;
// cur.value = prev.value;

      }else{
        scr.value = null;
        operatour.value = n;
        console.log("저장된 oper 값 = "+operatour.value)
        cur.value = null;
      }


    }else{
      scr.value = null;
      operatour.value = n;
      console.log("저장된 oper 값 = "+operatour.value)
      prev.value = cur.value;
      console.log("prev에 저장된 cur값 = "+prev.value)
      cur.value = null;
    }
    return;

  }
  cur.value = cur.value === null ? n : cur.value += n;
//cur.value 는 cur.value가 null값이면 n , 아니라면 cur.value += n 으로 지정

// if(cur.value === null){cur.value = n}
// else{cur.value = cur.value += n} 과 같음


  scr.value = cur.value;

  
  


  //   scr.value = null;
  //   console.log(" scr = "+scr.value)
  //   operatour.value = n;
  //   console.log("n값이였던것...operatour = "+operatour.value)
  //   prev.value = Number(cur.value);
  //   console.log(" prev = "+prev.value)
  //   cur.value = null;
  //   console.log(" cur = "+cur.value)
  //   return;
  // }


console.log(" cur = "+cur.value)
  

  // output.value = this.cur;
  }

  // GGchild = () => {

  //   router.push({name:'child'})
  // }

  
  // console.log(this.cur)
  // output = this.cur;

  

  const text2 = (list) =>{ //index에서 지명한 path를 메개변수로 받을때 변수명은 path내부의 /:list와 동일하게

if(list==2){ router.push({name:'text2', params:{list}})
}else{
  
  scr.value = null



}
  }

  
const text3 = (list) =>{
if(list==3){
      router.push({name:'text3', params:{list}})
    }
    else{
      alert("숫자를 눌러주세요 ㅎㅎ")
 

      scr.value = null
    }

   
  }
  



</script>

<style lang="scss" scoped>

</style>