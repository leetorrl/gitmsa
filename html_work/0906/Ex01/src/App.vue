<template>
  <div>
<TheNav></TheNav>

<AA></AA>
<RouterView></RouterView>
  </div>
</template>

<script>

import AA from './views/AA.vue';
import {RouterView} from 'vue-router';
import TheNav from './views/TheNav.vue';

export default {
  components : {
    
    
    AA,
    RouterView,
    TheNav
  },
  setup () {

   return{AA,RouterView, TheNav }

  }
   

  }

</script>

<style lang="scss" scoped>
</style>