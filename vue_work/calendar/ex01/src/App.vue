<template>
  <div>
<h1 v-if="calchek" @click="gocalindear" class="border-2 hover:bg-blue-500 inline-block mt-60 cursor-pointer">캘릭더로 이동</h1>
<h1 v-if="calchek" @click="gocal2" class="border-2 hover:bg-blue-500 inline-block mt-60 cursor-pointer">캘릭2</h1>
<h1 v-else @click="goback" class="border-2 hover:bg-blue-500 inline-block mt-60 cursor-pointer">뒤로가기</h1>
<router-view />
  </div>
</template>

<script setup>
import { ref } from 'vue'
import { useRouter } from 'vue-router'

const router = useRouter()
const calchek = ref(true)

const gocalindear =()=>{

  calchek.value = false

  router.push({name:'calindar'})
}

const gocal2 =()=>{

calchek.value = false

router.push({name:'cal2'})
}


const goback = () => {

  calchek.value = true
  router.go(-1)
}

</script>

<style lang="scss" scoped>

</style>