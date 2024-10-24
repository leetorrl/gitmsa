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
    login(token) {
      if (token !== null) {
        console.log('로그인 체크')
        this.loginCheck = true
      }
    },

    logout() {
      console.log('로그아웃 체크')
      this.loginCheck = false
    }
  }
})
