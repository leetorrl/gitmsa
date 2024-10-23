<template>
  <div class="m-3">
    <div class="flex justify-center">
      <div class="border-2 p-3 w-6/12">
        <div class="w-full">
          <h1 class="p-5 text font-bold text-3xl text-blue-800">-출결리스트-</h1>
          <hr class="border-2 border-blue-800" />

          <h1 class="m-3 text-blue-800 flex justify-center text-3xl">
            <button @click="downdate(tesst)"><</button> {{ tesst }}
            <button @click="update(tesst)">></button>
          </h1>
          <div class="w-full overflow-auto">
            <table class="w-full">
              <tr class="border">
                <th class="w-10 p-10">이름</th>
                <td
                  class="p-6"
                  v-for="item in arr"
                  :key="item"
                  :style="{ color: isWeekend(getDayName(item)) }"
                >
                  {{ getDayName(item) }}
                </td>
              </tr>

              <!-- vfor사용 -->

              <tr v-for="item in arrr" :key="item.arrr" class="border bg-blue-300" style="">
                <th class="bg-red-400 w-10 p-10">{{ q }}</th>
                <td class="p-6" v-for="item in arr" :key="item">{{ w }}</td>
              </tr>
            </table>
          </div>
        </div>
      </div>
    </div>
  </div>
</template>

<script setup>
import { ref, onMounted } from 'vue'
import axios from 'axios'
import dayjs from 'dayjs'
import 'dayjs/locale/ko'

dayjs.locale('ko')

const arr = ref([])

const arrr = ref([1])

const tesst = ref(dayjs().format('YYYY-MM'))

const q = ref('철수')
const w = ref(' ○ ')
const e = ref(' 영희 ')
const r = ref(' X ')

const getDaysInMonth = (month, year) => {
  return new Date(year, month + 1, 0).getDate() // 해당 월의 일 수 반환
}

const currentMonth = dayjs().month() // 현재 월
const currentYear = dayjs().year() // 현재 연도

onMounted(() => {
  const daysInMonth = getDaysInMonth(currentMonth, currentYear)
  arr.value = Array.from({ length: daysInMonth }, (_, i) => i) // 1부터 일수까지의 배열 생성
})

const getDayName = (offset) => {
  const dayName = dayjs().startOf('month').add(offset, 'day').format(`ddd-DD`).replace('-', '\n') //줄바꿈 명령어 참고
  return dayName
}

const isWeekend = (test) => {
  if (test === '일') {
    return 'red'
  } else if (test === '토') {
    return 'blue'
  } else {
    return 'black'
  }
}

const downdate = (tesst) => {
  tesst.value = dayjs().add(1, 'month')
}

const update = (tesst) => {
  tesst.value = dayjs().subtract(1, 'month')
}
</script>

<style lang="scss" scoped></style>
