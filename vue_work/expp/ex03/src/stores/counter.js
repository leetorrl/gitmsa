import { defineStore } from "pinia";
import { computed, ref } from "vue";

export const useCounterStore = defineStore('counter', ()=>{

    const count = ref(0)

    const doublecount = computed(()=> count.value*2)

   
    const increment = () => {

        count.value++;
        console.log(count.value)
        console.log(doublecount)
    }
    const unincrement = () => {

        count.value--;
        console.log(count.value)

    }

    return {count,doublecount, increment, unincrement}
   }
 )

export const useCCSStore = defineStore('C', ()=> {

    const name = ref('CC')
console.log(name)
    return {name}
}
)