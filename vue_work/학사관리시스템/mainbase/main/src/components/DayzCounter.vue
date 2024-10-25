<template>
  <div class="m-3">
    <div class="flex justify-center">
      <div class="border-2 p-3 w-6/12">
        <div class="w-full">
          <h1 class="p-5 text font-bold text-3xl text-blue-800">-출결현황-</h1>
          <hr class="border-2 border-blue-800" />
          <br />
          <div class="">
            <input class="border-2 rounded w-full h-10 text-center" type="text" v-model="wdate" />
          </div>

          <div class="w-full mt-2">
            <ul class="w-full flex" style="justify-content: space-around">
              <li class="inline-block text-center w-2/12 border-2 rounded bg-blue-800">
                <span class="text-white"
                  ><p class="font-bold">0</p>
                  전체</span
                >
              </li>
              <li class="inline-block text-center w-2/12 border-2 rounded">
                <span class="text-gray-500"
                  ><p class="font-bold">0</p>
                  미처리</span
                >
              </li>
              <li class="inline-block text-center w-2/12 border-2 rounded">
                <span
                  ><p class="font-bold">0</p>
                  출석</span
                >
              </li>
              <li class="inline-block text-center w-2/12 border-2 rounded">
                <span class="text-blue-700"
                  ><p class="font-bold">0</p>
                  조퇴</span
                >
              </li>
              <li class="inline-block text-center w-2/12 border-2 rounded">
                <span class="text-red-700"
                  ><p class="font-bold">0</p>
                  결석</span
                >
              </li>
            </ul>

            <div class="w-full flex mt-3" style="justify-content: space-around">
              <button
                style="width: 47%"
                class="h-12 min-w-[40px] text-center bg-blue-800 text-white border border-blue-800 rounded"
                @click="godayzview"
              >
                상세출석조회
              </button>
              <button
                style="width: 47%"
                class="h-12 min-w-[40px] text-center bg-gray-500 text-white border border-gray-500 rounded"
                @click="gorequestlist"
              >
                출결승인요청
              </button>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
</template>

<script setup>
import dayjs from 'dayjs'
import { ref } from 'vue'
import { useRouter } from 'vue-router'

const router = useRouter()

const wdate = ref(new dayjs().format('YYYY-MM-DD'))

const godayzview = () => {
  router.push({ name: 'calender' })
}

const gorequestlist = () => {
  router.push({ name: 'requestlist' })
}
</script>

<style lang="scss" scoped></style>
