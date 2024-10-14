
import { defineStore } from "pinia";

export const useLoginStore = defineStore( 'login' ,{


  state: ()=> ({

    loginCheck : false,
    // data: "data",
    // name: "괴도길동"

  }),

  actions:{

    login(data){
console.log(name)
      this.loginCheck = true;
      this.name = data.name

    },
    logout(){
      this.loginCheck = false;
      this.name = '';
      this.data = null;
    }

  }

    // state: () => ({
    //     loginCheck: false,
    //     data: null,
    //     name:''
    //   }),

    //   actions: {
    //     login(data){
    //         this.loginCheck = true;
    //         this.data = data;
    //         this.name = data.name;
    //     },
    //     logout(){
    //         this.loginCheck = false;
    //         this.data = null;
    //         this.name = '';
    //     }

        
    //   },
    
    }
    
);