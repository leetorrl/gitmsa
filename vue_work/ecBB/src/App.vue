


<template>
  <div>

    
<p>내 이름은 {{name}} 입니다.</p>
<p>나이는 {{age}} 살입니다.</p>


<div>{{10*20*30}}</div>
<p>{{name.toUpperCase()}}</p>
<div id="aa" v-html="message"></div>

<div v-pre>{{message2}}</div>

<h1 :class="className">안녕하세요</h1>

<p v-if="visible">이 요소는 렌더링됩니다.</p>
<p v-if="unvisible" >이 요소는 렌더링되지 않습니다.</p>


<div>
<p v-if="condition === 'A'">condition 데이터의 값은 A입니다.</p>
<p v-else-if="condition === 'B'">condition 데이터의 값은 B입니다.</p>
<p v-else-if="condition === 'C'">condition 데이터의 값은 C입니다.</p>
<p v-else-if="condition === 'D'">condition 데이터의 값은 D입니다.</p>
<p v-else>어떤 조건에도 해당되지 않습니다.</p>

<p v-show="condition2">v-show 디렉티브는 조건이 참입니다.</p>
<p v-show="!condition2">v-show 디렉티브는 조건이 거짓입니다.</p>

</div>

<div>
<h1>fruits 데이터의 반복 결과</h1>
<ul>
  <li v-for="(fruit, index) in fruits" :key="index">인덱스:{{index}},값:{{fruit}}</li>
</ul>

<h1>user 데이터의 반복 결과</h1>
<ul>
  <li v-for="(value, key, index) in user" :key="index">{{index}}:{{key}}:{{value}}</li>
<!-- 인덱스가 prim key id , key가 차트, value가 insert할 내용들.. -->
</ul>

<button type="button" @click="clickHandler">한번클릭</button>
<button type="button" @dblclick="clickHandler">두번클릭</button>

<button type="button" @click="clickHandler2($event)">클릭3</button>

<button type="button" @click="($event) => clickHandler2($event) " >클릭4</button>

<button type="button" @click="clickHandler3($event,'Hello')" >클릭5</button>


<button type="button" @click="clickHandler4($event)" >클릭6</button>

<input type="text" @keyup="($event) => onKeyupHandler($event)" value="엔터쳐보시오" >

<input type="text" @keyup.enter="onKeyupHandler2" value="엔터쳐보시오2">
</div>

<div>
  <h1>{{numder}}</h1>
<h1 v-once>{{numder}}</h1>
<button type="button" @click="increasement()">증가</button>

</div>

<div>
<div v-memo="[name1,gender1]">
  <p>이름 : {{name1}}</p>
<p>성별 : {{gender1}} </p>
<p> 나이 : {{age1}}</p>
</div>
<button @click="name1 = '영희'">이름 변경</button>
<button @click="gender1 = '여자'" >성별 변경</button>
<button @click="age1 = 30 ">나이 변경</button>

</div>

<div>
  <h1>로그인 콘솔로그</h1>
  <form action="loginForm">
    <label for="uid">아이디: <input type="text" v-model="uid2" id="uid"></label>
    <label for="upw">비밀번호: <input type="text" v-model="upw" id="upw"></label>
    <button type="button" @click="login">로그인</button>
  </form>
</div>

<div>
  <form action="">
<textarea v-model="message3" name="" id="" style="width: 200px; resize: none;"></textarea>
<button type="button" @click="printData">데이터 출력</button>
  </form>
</div>

<div>
  <form action="">
    <label for="banana1">
      <input type="checkbox" id="banana1" v-model="fruits" value="banana1">banana1
    </label>
  </form>
</div>
<div>
  <form action="loginForm">
    <label for="banana2">
      <input type="checkbox" id="banana2" v-model="fruits1" value="banana2">banana2
    </label>
    <label for="orange2">
      <input type="checkbox" id="orange" v-model="fruits1" value="orange2">orange2
    </label>
    <label for="apple">
      <input type="checkbox" id="apple" v-model="fruits1" value="apple">apple
    </label>
    <button type="button" @click="printData1">확인</button>
  </form>
</div>

<form action="">
  <label for="male2">
    <input type="radio" id="male2" name="gender2" v-model="gender2" value="male">male
  </label>
  <label for="female2">
    <input type="radio" id="female2" name="gender2" v-model="gender2" value="female">female
  </label>
  <button type="button" @click="printData2">확인</button>
</form>

<form action="">
  <select v-model="selectItem" name="" id="">
    <option value="americano">아메리카노</option>
    <option value="espresso">에스프레소</option>
    <option value="cafeLatte">카페라떼</option>
  </select>
  <button type="button" @click="printData3">확인</button>
</form>


<div><input type="text" v-model="message4">{{message4}}</div>
<div><input type="text" @input="onChangeHandler2($event)">{{message5}}</div>

<div>
<select v-model="selected1" @change="onChangeHandler3" name="" id="">
  <option value="banana">바나나</option>
  <option value="apple">사과</option>
</select>
가격 : {{price}}원
</div>

<div>
  <form @submit="onSubmitHandler" action="">
    <button type="submit">전송</button>
  </form>
</div>

<div>
  <input type="text" @keyup="onKeyupHandler">
</div>

<div>
  <h1>{{lastName}} {{firstName}}</h1>
  <h1>{{lastName}} {{firstName}}</h1>
</div>

<div>
<h1>{{fullName}}</h1>
<h1>{{fullName}}</h1>
</div>

<div>
<h1>{{numArr1.filter((v)=>v%2 ===0).reduce((acc, cur)=> acc+cur, 0)}}</h1>
</div>

<div>
  <h1>{{evenSum}}</h1>
</div>

  </div>
</template>
<script>

export default{

  methods:{
    clickHandler(){
      alert('click');
    },
    clickHandler2(event){
      console.log(event);
    },

    clickHandler3(event, message){
      console.log(event);
console.log(message);
    },

    clickHandler4(event){
console.log(event);
    },

onKeyupHandler(e){
if(e.keyCode === 13 ){
  console.log('Enter!');
};


  
},
login(){

 

  console.log(`id:${this.uid2}`);

  if(this.upw.length < 4 || this.upw.length > 4){
alert('비번 4자리 부탁;;');
return;
  }


  else{
    console.log(`pw:${this.upw}`);
  };


  
  
},


onKeyupHandler2(){
  console.log('Enter2!');
},

increasement(){
  this.numder++;
},

printData(){
  console.log(`id: ${this.message3}`);
},

printData1(){
  console.log(this.fruits1);
},

printData2(){
  console.log(this.gender2);
},

printData3(){
console.log(this.selectItem);
},


onChangeHandler2($event){

  this.message5 = $event.target.value;
},

onChangeHandler3($event){
if(this.selected1 === 'banana'){
  this.price = 500;
}
if(this.selected1 === 'apple'){
  this.price = 700;
}

},

onSubmitHandler(e){
e.preventDefault(); //별도의 폼 전송 처리 명령어
console.log('onSubmit Handler!');
},

onKeyupHandler(){
console.log('keyup event!');
},

  },

data(){
  return{
    name : '철수',
    age : 19,
    message : '<h1>Hello, Vue JS!</h1>',
    message2 : 'Hello, Vue JS',
    className : 'red-color',

visible: true,
unbisible: false,


condition: 'A',

condition2: 1>3, //false

fruits:['apple','banana','orange'],

user:{
  name: 'John',
  age: 20,
  gender: 'male',
},

numder : 0,

name1: '철수',
gender1:'남자',
age1: 20,

uid: 'leetorrl',
upw: '',
uid2: 'leetorrl123',

message3 : '텍스트에리어임',

fruits : true,

fruits1 : ['banana, orange'],

gender2 : 'male',

selectItem: 'americano',

message4: '',
message5: '',

selected1: 'banana',
price: 500,

firstName: 'Gildong',
lastName: 'Hong',

numArr1:[1,2,3,4,5],

  };
},

computed:{
  fullName(){
    console.log('computed fullname');
    return `${this.lastName} ${this.firstName}`;
  },
},

computed:{
  evenSum(){
    return this.numArr1
    .filter((v)=> v % 2 === 0 )
    .reduce((acc, cur) => acc + cur, 0 );
  },
},

}


</script>

<style>

[v-cloak]{
  display: none;
}


#aa{
  background-color: red;
  color: blue;
  display: inline-block; 
  margin: 3px;
}

.red-color{
  color : red;
}
</style>
