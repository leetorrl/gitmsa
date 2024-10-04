<template>
    <div class="bg-blue-800 text-white">
<h1 class="bg-slate-500">상품 목록</h1>
<br>

<RouterLink to="/CartView">장바구니</RouterLink>
<br>
<br>
<ul>
    <li v-for="it in item" :key="it.id" :class="{in: cartStore.cartItem.includes(it.id)}">
    <span>{{ it.name }}</span>
    <span>{{ it.price }}</span>
    <button v-if="!cartStore.cartItem.includes(it.id)" @click="inCart(it.id)" class="border border-red-500" >담기</button>
    <button v-else @click="outCart(it.id)" class="border border-red-500" >삭제</button>    
    </li>
</ul>


    </div>
</template>

<script setup>
import { useCartStore } from '@/stores/cart.js';
import { storeToRefs } from 'pinia';

const cartStore = useCartStore();

const {item} = storeToRefs(cartStore); //storeToRefs 를 써야 반응형 함수가 실시간으로 바뀜

console.log(item)

//장바구니에 상품 추가 기능, cartItem에 id 추가
const inCart = (id)=> {
cartStore.cartItem.push(id)    
}

//장바구니에서 상품 삭제 기능, cartItem에 id삭제
const outCart = (id)=> {
    // cartStore.cartItem = cartStore.cartItem.filter((v)=> v !== id);
    cartStore.outCart(id)
}




</script>

<style lang="scss" scoped>
.in {
    text-decoration: line-through;
}



</style>