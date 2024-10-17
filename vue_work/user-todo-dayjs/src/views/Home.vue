<template>
  <div>
    <h1>홈</h1>
    <h1 class="text-5xl">{{ now.format('YYYY/MM/DD') }}</h1>
    <h1 class="text-5xl">{{ now.get('month') }}월</h1>

    dayjs() 써도 되고 const지명한 now 써도됨
    <h1 class="text-5xl">{{ dayjs().subtract(1, 'month').format('YYYY/MM/DD') }}</h1>
    <h1 class="text-5xl">{{ now.subtract(1, 'day').format('YYYY/MM/DD') }}</h1>
    <h1 class="text-5xl">{{ now.subtract(1, 'Year').format('YYYY/MM/DD') }}</h1>

    <h1 class="text-5xl">{{ now.add(1, 'month').format('YYYY/MM/DD') }}</h1>
    <h1 class="text-5xl">{{ now.add(1, 'day').format('YYYY/MM/DD') }}</h1>
    <h1 class="text-5xl">{{ now.add(1, 'Year').format('YYYY/MM/DD') }}</h1>

    <hr />
    <h1>올해 첫날{{ now.startOf('year').format('YYYY/MM/DD HH시:mm분:ss초') }}</h1>
    <h1>올해 막날{{ now.endOf('year').format('YYYY/MM/DD HH시:mm분:ss초') }}</h1>
    <hr />

    <button @click="gohome" class="border-2">home버튼</button>
    <button @click="goabout" class="border-2">about버튼</button>
  </div>
</template>

<script setup>
import { useRouter } from 'vue-router'
import dayjs from 'dayjs'
import utc from 'dayjs/plugin/utc'
import timezone from 'dayjs/plugin/timezone'

dayjs.extend(utc)
dayjs.extend(timezone)

const date = new Date()

const router = useRouter()

const firstday = dayjs().startOf('month')
const lastday = dayjs().endOf('month')

const now = dayjs()
console.log(now)
console.log(now.format('MM월-DD일 HH시:mm분:ss초'))
console.log(now.format('YYYY-MM-DD HH:mm:ss'))
console.log(now.format('MM-DD HH:mm:ss'))

//0 일요일 1월요일 2화요일 3수요일 4목요일 5금요일 6토요일
console.log(dayjs().day())
console.log(firstday.day())
console.log(lastday.day())

//지난달의 날짜나 다음달의 날짜 회색처리

//dayjs()는 현재날짜...

//10월 17일 -> 9월 17일
const beforeMonth = dayjs().subtract(1, 'month').format('YYYY/MM/DD')
//9월 마지막날
const sepLastday = dayjs(beforeMonth).endOf('month')

//10월 17일 -> 11월 17일
const afterMonth = dayjs().add(1, 'month').format('YYYY/MM/DD')
console.log(afterMonth)
//11월 마지막날
const novLastday = dayjs(afterMonth).endOf('month')

console.log('sepLastday = ' + sepLastday.format('YYYY/MM/DD'))
console.log('novLastday = ' + novLastday.format('YYYY/MM/DD'))

//9월달과 현재달의 달을 비교 true false
console.log("dayjs().isSame(sepLastday, 'month')" + dayjs().isSame(sepLastday, 'month'))
//현재달의 1일 월 isSame 현재달의 17일 월을 비교
console.log(
  "dayjs().isSame(dayjs().startOf('month'), 'month')" +
    dayjs().isSame(dayjs().startOf('month'), 'month')
)
//현재달의 31일 월 isSame 현재달의 17일 월을 비교
console.log(
  "dayjs().isSame(dayjs().endOf('month'), 'month')" +
    dayjs().isSame(dayjs().endOf('month'), 'month')
)

const gohome = () => {
  router.push({ name: 'home' })
}

const goabout = () => {
  router.push({ name: 'about' })
}
</script>

<style lang="scss" scoped></style>
