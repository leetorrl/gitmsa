// import './assets/main.css'

import { createApp, h } from 'vue';
// import App from './App.vue'

createApp({
    data() {
        return {
            mseeage : 'Hello, Vue!',
        };
    },
    methods:{
        reverse(){
            this.message = this.message.split('').reverse().join('');
        },
    },
    render() {
        return h('div',[
            h('p', this.message),
            h('button', {onClick: this.reverse}, 'Reverse'),
        ]);
    },
}).mount('#app');
