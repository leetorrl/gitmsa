<template>
    <div>
<h1>dd</h1>
<div>
<button @click="downdat">이전 달</button>
{{nowdat}}
<button @click="updat">다음 달</button>
</div>

    </div>
</template>

<script setup>
import dayjs from 'dayjs';
import 'dayjs/locale/ko';
import 'dayjs/plugin/timezone'; // 시간대 설정을 위한 플러그인

dayjs.locale('ko');

const nowdat = ref(dayjs()); // 현재 날짜를 dayjs 객체로 저장

const updat = () => {
  // 특정 시간대 설정 (필요한 경우)
  // nowdat.value = nowdat.value.tz('Asia/Seoul').add(1, 'month');
  nowdat.value = nowdat.value.add(1, 'month'); // 시간대 설정 없이 사용

  // 원하는 형식으로 포맷
  nowdat.value = nowdat.value.format('YYYY년 MM월 DD일 (dddd)');
};

const downdat = () => {
  nowdat.value = nowdat.value.subtract(1, 'month').format('YYYY년 MM월 DD일 (dddd)');
};
</script>