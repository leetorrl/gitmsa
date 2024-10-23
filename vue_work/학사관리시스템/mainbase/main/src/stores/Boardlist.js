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
    login(headertoken) {
      if(headertoken!==null){
      this.loginCheck = true
      console.log("피니아 들어간 헤더토큰"+ headertoken)
      }
    },

    logout() {


      this.loginCheck = false

    }
  }
})
