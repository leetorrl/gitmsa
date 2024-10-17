<template>
  <div>
    <h1 class="bg-blue-500">출결관리(임시)</h1>

    <div style="height: 500px" class="">
      금일 날짜와 출결 유무 체크 및 날짜별 출결 기록, 일수 조회 가능하도록...
      <p>{{ today }}</p>
      <p>{{ year }}</p>
    </div>
  </div>
</template>

<script setup>
import { ref } from 'vue'
import { useRouter } from 'vue-router'
import axios from 'axios'

import { useRoute } from 'vue-router'

const router = useRouter()

const today = new Date()
const week = ['일', '월', '화', '수', '목', '금', '토']
const day = []

const year = today.getFullYear()

// const endDayofTheMonth = new Date(year, month + 1, 0).getDate
</script>

<style lang="scss" scoped></style>
