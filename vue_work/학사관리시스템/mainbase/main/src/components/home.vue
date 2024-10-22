<template>
  <div class="m-3">
    <div class="flex justify-center">
      <div class="border-2 p-3 w-6/12">
        <div class="w-full">
          <h1 class="p-5 text font-bold text-3xl text-blue-800">-출결조회-</h1>
          <hr class="border-2 border-blue-800" />

          <div class="inline-block">
            <p>{{ today }}</p>
            <p>{{ year }}</p>

            <div class="pt-16">
              <main class="flex justify-center">
                <div class="max-w-lg w-full bg-white shadow-md rounded-lg p-4">
                  <h1 class="text-xl font-bold text-center mb-4">
                    <button @click="subMonth()">&lt;&lt;</button>
                    {{ now.format('YYYY년 MM월') }}
                    <button @click="addMonth()">&gt;&gt;</button>
                  </h1>
                  <div>
                    <div
                      class="text-center flex text-gray-600 bg-red-300"
                      style="justify-content: space-around"
                    >
                      <div class="w-12 p-2 px-4 text-red-600">일</div>
                      <div class="w-12 p-2 px-4">월</div>
                      <div class="w-12 p-2 px-4">화</div>
                      <div class="w-12 p-2 px-4">수</div>
                      <div class="w-12 p-2 px-4">목</div>
                      <div class="w-12 p-2 px-4">금</div>
                      <div class="w-12 p-2 px-4 text-blue-500">토</div>
                    </div>

                    <div
                      class="flex"
                      style="justify-content: space-around"
                      v-for="group in groupColumns"
                      :key="group.length"
                    >
                      <div
                        @click="selectDateFn(column)"
                        v-for="(column, index) in group"
                        :key="column.format('YYYY-MM-DD')"
                        class="cursor-pointer text-center p-2 hover:bg-blue-200"
                        :class="{
                          'text-red-600': index % 7 == 0,
                          'text-blue-600': index % 7 == 6,
                          'opacity-20': !column.isSame(now, 'month')
                        }"
                      >
                        <div class="w-12">
                          <span>{{ column.get('date') }}</span>
                          <p>dd</p>
                        </div>
                      </div>
                    </div>
                  </div>
                </div>
              </main>
            </div>
          </div>

          <div class="flex">dd</div>
        </div>
      </div>
    </div>
  </div>
</template>

<script setup>
import { ref, watch } from 'vue'
import dayjs from 'dayjs'
import utc from 'dayjs/plugin/utc'
import timezone from 'dayjs/plugin/timezone'

dayjs.extend(utc)
dayjs.extend(timezone)

const now = ref(dayjs())
const columns = ref([])
const groupColumns = ref([])

const selectDate = ref(null)
const title = ref('')
const content = ref('')

const doSave = () => {
  //백에 넘겨줄 데이터
  console.log('save', title.value, content.value, selectDate.value)
}

const subMonth = () => {
  now.value = dayjs(now.value).subtract(1, 'month')
}
const addMonth = () => {
  now.value = dayjs(now.value).add(1, 'month')
}

const selectDateFn = (date) => {
  console.log('dateclick', dayjs(date).format('YYYY-MM-DD'))
  selectDate.value = dayjs(date).format('YYYY-MM-DD')
}

watch(
  now,
  (newValue, _) => {
    columns.value = [] // 원래 있던 값 제거
    groupColumns.value = [] // 원래 있던 값 제거
    // 제일 처음 로딩 할때는 now는 현재 달력...
    const startday = dayjs(now.value).startOf('month')
    const lastday = dayjs(now.value).endOf('month')
    const startdayOfWeek = startday.get('day')
    const lastdayOfWeek = lastday.get('day')

    // 저번달에 날짜 추가
    for (let i = 1; i <= startdayOfWeek; i++) {
      columns.value.unshift(dayjs(startday).subtract(i, 'day'))
    }
    // 현재 달력에 날짜 추가
    for (let i = 0; i < lastday.get('date'); i++) {
      columns.value.push(dayjs(startday).add(i, 'day'))
    }
    // 다음달에 날짜 추가
    for (let i = 1; i <= 6 - lastdayOfWeek; i++) {
      columns.value.push(dayjs(lastday).add(i, 'day'))
    }
    // groupColumns
    //   7                 7                   7                     7                      7
    // ([29,30,1,2,3,4,5],[6,7,8,9,10,11,12],[13,14,15,16,17,18,19],[20,21,22,23,24,25,26],[27,28,29,30,31,1,2]))

    groupColumns.value.push(columns.value.slice(0, 7))
    groupColumns.value.push(columns.value.slice(7, 14))
    groupColumns.value.push(columns.value.slice(14, 21))
    groupColumns.value.push(columns.value.slice(21, 28))
    groupColumns.value.push(columns.value.slice(28, 35))
  },
  {
    immediate: true, // 현재페이지 처음 로딩 될때 도 실행
    deep: true // 안에 값이 객체이면 객체 안에 변수도 변경 될때 watch안에 있는 함수 실행
  }
)
</script>

<style lang="scss" scoped></style>
