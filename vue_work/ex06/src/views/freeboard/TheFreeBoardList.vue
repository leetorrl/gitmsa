<template>
  <div class="pb-10">
    <h1 class="h1-red">FreeBoardList</h1>

    <div class="px-5">
      <table class="border border-b-gray-500 w-full">
        <thead>
          <tr>
            <th class="border">IDX</th>
            <th class="border">title</th>
            <th class="border">author</th>
            <th class="border">regdate</th>
            <th class="border">viewcount</th>
          </tr>
        </thead>
        <tbody>
          <tr v-for="item in arr" :key="item.idx" class="cursor-pointer hover:bg-slate-200" @click="viewPage(item.idx)">
            <td class="border text-center text-lg p-1">{{ item.idx }}</td>
            <td class="border text-center text-lg p-1">{{ item.title }}</td>
            <td class="border text-center text-lg p-1">{{ item.creAuthor }}</td>
            <td class="border text-center text-lg p-1">{{ item.regDate }}</td>
            <td class="border text-center text-lg p-1">{{ item.viewCount }}</td>
          </tr>
        </tbody>
      </table>

      <div class="flex justify-center mt-5">
        <ul class="flex space-x-2">
          <li class="cursor-pointer p-3" v-for="num in totalpages" v-bind:key="num" @click="setpageNum(num - 1)">
            {{ num }}
          </li>
        </ul>
      </div>
    </div>
  </div>
</template>

<script setup>
import axios from 'axios';
import { ref } from 'vue';
import { useRouter } from 'vue-router';
// import { useRoute } from 'vue-router';

const arr = ref([]);
const totalpages = ref(10);
const router = useRouter();
const pageNum = ref(0);

// const route = useRoute();

const setpageNum = (num) => {

  pageNum.value = num;
  getFreeBoard(num);

}

const viewPage = (idx) => {
  const data = { name: 'freeboardview', params: { idx } };
  // router.push({ name: 'freeboardview', params: { idx } });
  router.push(data); //위에꺼랑 같음
}

const getFreeBoard = (pageNum) => {
  if (pageNum == undefined) pageNum = 0;
  axios.get(`http://localhost:10000/freeboard?pageNum=${pageNum}`)
    .then(res => {

      arr.value = res.data.list;
      totalpages.value = res.data.totalpages;
      console.log(res.data.list);

    })
    .catch(e => {
      console.log(e);
    })
}

//page 호출되면 자동실행
getFreeBoard();
</script>
