<template>
    <div class="bg-blue-800 text-white" >
<h1 class="bg-slate-500">장바구니 목록</h1>
<br>
<router-link to="/HomeView">메인으로</router-link>
<br>
<br>
<ul v-if="cartItem.length > 0">
    <li v-for="item in cartItem" :key="item" >
        <span>{{item.name}}</span>
        <span>{{item.price}}</span>
        <button @click="outCart(item.id)" > 삭제</button>
    </li>
</ul>

<p v-else >장바구니가 비었습니다.</p>
<br>
<button @click="payCart" >결제 </button>
<br>
<button @click="allClear" >전체 비우기</button>
<br>
    </div>
</template>

<script setup>
import { useCartStore } from '@/stores/cart';
import { computed } from 'vue';

const cartStore = useCartStore();

const cartItem = computed(() => {
    return cartStore.item.filter((v)=> cartStore.cartItem.includes(v.id));
})

const allClear = () => {
    cartStore.cartItem = [];
}

const payCart = () => {
    const price = cartItem.value.reduce((prev, cur)=> {
        return prev + cur.price
    }, 0)
    alert(`총 ${price.toLocaleString()}원을 결제하시겠습니까?`);

}

const outCart = (id) => {
    // cartStore.cartItem = cartStore.cartItem.filter((v)=> v !== id)
    cartStore.outCart(id)
}


</script>

<style lang="scss" scoped>

</style>