<template>
  <div>

<h1>클릭하면...</h1>
<h1>{{c}}</h1> 
--><button @click="count()">클릭!</button>
  </div>
</template>




<script>

export default {

  data() {

    return {

      c: 0,
      
    };

  },

  methods: {

    count() {
      this.c++;
      console.log(`${this.c}오른다!`);
    },

  },





</script>

<style>

</style>