


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


</div>

  </div>
</template>
<script>






export default{

  

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
  };
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
