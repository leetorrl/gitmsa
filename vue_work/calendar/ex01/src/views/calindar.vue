<template>
    <div class="calendar">
      <header>
        <button @click="prevMonth">이전 달</button>
        <span>{{ currentMonth.format('YYYY년 MM월') }}</span>
        <button @click="nextMonth">다음 달</button>
      </header>
      <div class="weekdays">
        <div class="inline-block" v-for="day in weekdays" :key="day">{{ day }}</div>
      </div>
      <div class="days">
    <div class="day" v-for="(day, index) in days" :key="index">
      {{ day }}
      <br v-if="(index + 1) % 7 === 0" />
    </div>
  </div>
    </div>
  </template>
  
  <script setup>
  import { ref, computed } from 'vue';
  import dayjs from 'dayjs';
  
  const currentMonth = ref(dayjs());
  const weekdays = ['일', '월', '화', '수', '목', '금', '토'];
  

  const firstDayOfMonth = computed(() => {
  return dayjs(currentMonth.value).startOf('month').day();
});

const lastDayOfMonth = computed(() => {
  return dayjs(currentMonth.value).endOf('month').date();
});
  
  const prevMonth = () => currentMonth.value = dayjs(currentMonth.value, 'YYYY년 MM월').subtract(1, 'month');
  const nextMonth = () => currentMonth.value = dayjs(currentMonth.value, 'YYYY년 MM월').add(1, 'month');

  const days = computed(() => {

    console.log(firstDayOfMonth)
    console.log(lastDayOfMonth)

  const firstDay = firstDayOfMonth.value;
  const lastDay = lastDayOfMonth.value;

  const daysArray = Array.from({ length: lastDay + firstDay }, (_, index) => index + 1 - firstDay);

  return daysArray.map(day => day < 1 ? '' : day);
});
</script>

<style>
.days {
  display: flex;
  flex-wrap: wrap; /* 요소들이 한 줄에 다 안 들어갈 경우 줄바꿈 */
  /* 추가적인 스타일 설정 (예: 너비, 간격 등) */
}

.inline-block {
  /* 각 날짜 요소의 너비 설정 (예: 14%) */
  width: calc(100% / 7);
  /* 필요에 따라 여백이나 패딩 등을 추가 */
}
</style>