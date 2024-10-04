import { defineStore } from "pinia";
import { ref } from "vue";

export const useCountStore = defineStore('counter', ()=> {

const count = ref(0)

const inerment = () => {

    count.value++;

}


return {count, inerment}



} )