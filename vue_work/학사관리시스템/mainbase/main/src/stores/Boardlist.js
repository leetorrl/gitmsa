import { defineStore } from 'pinia'
import { ref } from 'vue'

export const useBoardlistStore = defineStore('Boardlist', () => {
  const tsetidx = ref(3)

  return { tsetidx }
})
