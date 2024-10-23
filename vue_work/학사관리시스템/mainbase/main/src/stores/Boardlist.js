import { defineStore } from 'pinia'
import { ref } from 'vue'

export const useBoardlistStore = defineStore('Boardlist', () => {
  const tsetidx = ref(3)

  return { tsetidx }
})

export const useloginPiniaStore = defineStore('login', {
  state: () => ({
    loginCheck: false
  }),

  actions: {
    login(logindata) {
      this.loginCheck = true
      console.log(logindata)
    },

    logout() {
      this.loginCheck = false
    }
  }
})
