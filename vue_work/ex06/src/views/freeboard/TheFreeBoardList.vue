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
          <template v-if="arr && arr.length>0">
            
              <tr v-for="item in arr" :key="item.idx" class="cursor-pointer hover:bg-slate-200" @click="viewPage(item.idx)">
            <td class="border text-center text-lg p-1">{{ item.idx }}</td>
            <td class="border text-center text-lg p-1">{{ item.title }}</td>
            <td class="border text-center text-lg p-1">{{ item.creAuthor }}</td>
            <td class="border text-center text-lg p-1">{{ item.regDate }}</td>
            <td class="border text-center text-lg p-1">{{ item.viewCount }}</td>
            <template v-if="item.list[0]"> 
              <!-- 값이 있으면 true , 아니면 false로 인식 -->
                <td class="border text-center text-lg p-1">
                  <img :src="`http://localhost:8080/file/download/${item.list[0].name}`" alt="" srcset="" width="150">
                </td>
              </template>
           
            </tr>
          </template>
  
        </tbody>
      </table>

      <div class="flex justify-center mt-5">
        <ul class="flex space-x-2">
          <li class="cursor-pointer p-3" v-for="num in totalpages" v-bind:key="num" @click="setpageNum(num - 1)">
            {{ num }}
          </li>
        </ul>
      </div>
      <div v-if="temp" @click="aadd">
<h1>나올수도?</h1>
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
const viewCount = ref(0);

const temp = ref(null);

const aadd = () => {
  temp.value = true;
}


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
  axios.get(`http://localhost:8080/freeboard?pageNum=${pageNum}`)
    .then(res => {


      arr.value = res.data.list;
      totalpages.value = res.data.totalpages;
      viewCount.value = res.data.viewCount;
      console.log(res.data.list);

    })
    .catch(e => {
      console.log(e);
    })
}

//page 호출되면 자동실행
getFreeBoard();
</script>
