<template>
  <div class="m-3">
    <div class="flex justify-center">
      <div class="border-2 p-3 w-6/12">
        <div class="w-full">
          <h1 class="p-5 text font-bold text-3xl text-blue-800">-출결리스트-</h1>
          <hr class="border-2 border-blue-800" />

          <h1 class="m-3 text-blue-800 flex justify-center text-3xl font-bold">
            <button @click="downdate()"><</button> {{ nowDat }}
            <button @click="update()">></button>
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
              <tr v-for="item in arrr" :key="item.arrr" class="border bg-blue-300">
                <th class="bg-red-400 w-10 p-10">{{ item.name }}</th>
                <td class="p-6" v-for="item in arr" :key="item">{{ item.check }}</td>
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
import dayjs from 'dayjs'
import 'dayjs/locale/ko'

dayjs.locale('ko')

const arr = ref([])
const arrr = ref([])

const nowDat = ref(dayjs().format('YYYY-MM'))
const currentMonth = ref(dayjs().month()) // 현재 월을 ref로 저장
const currentYear = ref(dayjs().year())

const getDaysInMonth = (month, year) => {
  return new Date(year, month + 1, 0).getDate() // 해당 월의 일 수 반환
}

onMounted(() => {
  updateDaysInMonth()
})

const updateDaysInMonth = () => {
  const daysInMonth = getDaysInMonth(currentMonth.value, currentYear.value)
  arr.value = Array.from({ length: daysInMonth }, (_, i) => i) // 0부터 일수까지의 배열 생성
}

const getDayName = (item) => {
  return dayjs()
    .year(currentYear.value)
    .month(currentMonth.value)
    .date(item + 1)
    .format('ddd-DD')
    .replace('-', '\n') // 줄바꿈
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

const count = ref(0)

const downdate = () => {
  count.value = count.value - 1
  console.log(count.value)
  nowDat.value = dayjs().add(count.value, 'month').format('YYYY-MM')

  currentMonth.value = (currentMonth.value - 1 + 12) % 12 // 이전 월로 변경
  updateDaysInMonth()
}

const update = () => {
  count.value = count.value + 1
  console.log(count.value)
  nowDat.value = dayjs().add(count.value, 'month').format('YYYY-MM')

  currentMonth.value = (currentMonth.value + 1) % 12 // 다음 월로 변경
  updateDaysInMonth()
}
</script>

<style lang="scss" scoped></style>
