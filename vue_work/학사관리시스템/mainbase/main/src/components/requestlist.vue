<template>
    <div>
        <p>-학원생 요청사항-</p>
    <div class="w-1280 bg-slate-300">
        <ul class="flex w-full bg-slate-50">
          <li class="w-1/4 text-center border-t-2 border-b-2">{{ Bid }}</li>
          <li class="w-1/4 text-center border-t-2 border-b-2">{{  Uid }}</li>
          <li class="w-1/4 text-center border-t-2 border-b-2">{{ title }}</li>
          <li class="w-1/4 text-center border-t-2 border-b-2">{{ wdate }}</li>
          <li class="w-1/4 text-center border-t-2 border-b-2">{{ state }}</li>
        </ul>
        <ul v-for="item in arr" :key="item.id" class="hover:cursor-pointer" @click="GoBoardView()" >
          <li class="w-1/4 text-center border-t-2 border-b-2">{{ item.Bid }}</li>
          <li class="w-1/4 text-center border-t-2 border-b-2">{{ item.Uid }}</li>
          <li class="w-1/4 text-center border-t-2 border-b-2">{{ item.title }}</li>
          <li class="w-1/4 text-center border-t-2 border-b-2">{{ item.wdate }}</li>
          <li class="w-1/4 text-center border-t-2 border-b-2">{{ item.state }}</li>
        </ul>
    </div>
    <button class="border border-red-500 cursor-pointer" @click="GoBoardInput">요청접수</button>
    <ul class="flex space-x-2">
      <li
        class="cursor-pointer p-3"
        v-for="num in totalpages"
        v-bind:key="num"
        @click="setpageNum(num - 1)"
      >
        {{ num }}
      </li>
    </ul>
    </div>
</template>

<script setup>
import { ref } from 'vue';
import { useRouter } from 'vue-router';

const router = useRouter()

const arr = ref([])
const totalpages = ref(10)

const Bid = ref('Bid')
const Uid = ref('작성자')
const title = ref('제목')
const wdate = ref('작성일')
const state = ref('요청상태')

const GoBoardInput = () => {
  router.push({ name: 'boardinput'})
}

const GoBoardView = () => {
  router.push({ name: 'boardview' })
}




</script>

<style lang="scss" scoped>

</style>