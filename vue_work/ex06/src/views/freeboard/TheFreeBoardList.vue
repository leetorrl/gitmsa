<template>
    <div class="pb-10">

<h1 class="h1-red">FreeBoardList</h1>
<div class="px-5">
<table class="border border-b-gray-500 w-full">
    <thead>
        <tr>
            <th class="border">idx</th>
            <th class="border">title</th>
            <th class="border">author</th>
            <th class="border">regdate</th>
            <th class="border">viewcount</th>
        </tr>
    </thead>
<tbody>
    <tr v-for="item in arr" :key="item.idx">
        <td class="border text-center">{{item.idx}}</td>
        <td class="border text-center">{{item.title}}</td>
        <td class="border text-center">{{item.creAuthor}}</td>
        <td class="border text-center">{{item.regDate}}</td>
        <td class="border text-center">{{item.viewCount}}</td>
    </tr>
</tbody>

</table>
{{ this.$route.params.aa }}

</div>

<div class="flex justify-center mt-5">
    <ul class="flex space-x-5">
        <li v-for="num in totalPages" v-bind:key="num">{{num}}</li>
    </ul>
</div>


    </div>
</template>

<script setup>

import axios from 'axios';
import { ref } from 'vue';
import { useRoute } from 'vue-router';

const totalPages = 10;

const route = useRoute();

const arr = ref([]);


console.log("route.params.aa = " + route.params.aa);
console.log("route.params.bb = " + route.params.bb);


axios.get('http://localhost:8080/freeboard')
    .then(res => {
          arr.value = res.data.content;
        console.log(res.data.totalPages);
      
    })
    .catch(e => {
        console.log(e);
    })

</script>

<style lang="scss" scoped>


</style>
