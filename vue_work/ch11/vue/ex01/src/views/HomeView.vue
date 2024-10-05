<template>
  <div>
<header v-if="currentConditions" class="header">
      <!-- 지역 -->
      <h1 class="header__title">
        <span class="material-symbols-outlined"> location_on </span>{{address}}
      </h1>
      <h2 class="header__date">{{dayjs().format('HH:mm')}}</h2>
    </header>
    <!-- 현재 날씨 -->
    <main v-if="currentConditions" class="main">
      <article class="weather">
        <section class="weather__info">
          <img
            :src="getImage(currentConditions.icon)"
            :alt="`${currentConditions.datetime}${currentConditions.temp}도`"
            class="weather__img"
          />
          <h3 class="weather_temp">{{currentConditions.temp}}</h3>
          <p class="weather_summary">{{currentConditions.conditions}}</p>
          <ul class="weather__moreList">
            <li class="weather__moreListItem">
              <p class="weather__subtitle">습도</p>
              <p class="weather__desc">{{currentConditions.humidity}}</p>
            </li>
            <li class="weather__moreListItem">
              <p class="weather__subtitle">풍속</p>
              <p class="weather__desc">{{currentConditions.windspeed}}</p>
            </li>
            <li class="weather__moreListItem">
              <p class="weather__subtitle">체감</p>
              <p class="weather__desc">{{currentConditions.feelslike}}도</p>
            </li>
          </ul>
        </section>
      </article>
    </main>
    <!-- 공통 하단 영역 -->
    </div>
</template>

<script setup>
import { onBeforeMount } from "vue";
import { useWeatherStore } from "@/stores/weather";
import { storeToRefs } from "pinia";
import dayjs from 'dayjs'
// import { computed } from "vue";
import { getImage } from "@/composables/helper";

const weatherStore = useWeatherStore();
const {currentConditions, address} = storeToRefs(weatherStore);

// const hourToMinutes = computed(() => {
//   const currentDate = new Date();
//   const currentHour = String(currentDate.getHours()).padStart(2,'0')
//   const currentMinute = String(currentDate.getMinutes()).padStart(2,'0')
//   return `${currentHour}:${currentMinute}`
// })

// const getImage = (path) => {
//   return new URL(`../assets/images/icons/${path}.png`, import.meta.url).href
// }

onBeforeMount (async () => {
 await weatherStore.getCityName();
 await weatherStore.getCurrentWeatherInfo();
})



</script>

<style lang="scss" scoped>

</style>