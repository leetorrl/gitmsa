<template>
    <div>
<h1>상품 목록</h1>
<ul>
    <li v-for="it in item" :key="it.id" :class="{in: cartStore.cartItem.includes(it.id)}">
    <span>{{ it.name }}</span>
    <span>{{ it.price }}</span>
    <button v-if="!cartStore.cartItem.includes(it.id)" @click="inCart(it.id)" >담기</button>
    <button v-else @click="outCart(it.id)" >삭제</button>    
    </li>
</ul>
    </div>
</template>

<script setup>

import { useCartStore } from '@/stores/cart.js';
import { storeToRefs } from 'pinia';

const cartStore = useCartStore();

const {item} = storeToRefs(cartStore);

//장바구니에 상품 추가 기능, cartItem에 id 추가
const inCart = (id)=> {
cartStore.cartItem.push(id)    
}

//장바구니에서 상품 삭제 기능, cartItem에 id삭제
const outCart = (id)=> {
    cartStore.cartItem = cartStore.cartItem.filter((v)=> v !== id);
}

</script>

<style lang="scss" scoped>

// .in {
//     text-decoration: line-through;
// }

</style>