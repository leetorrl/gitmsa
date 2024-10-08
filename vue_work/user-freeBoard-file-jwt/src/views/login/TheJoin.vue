<template>
    <div class="my-5 bg-gray-100 flex items-center justify-center min-h-screen">

<div class="bg-white p-8 rounded-lg shadow-md w-96">
        <h2 class="text-2xl font-bold mb-6 text-center">회원가입</h2>
        
        <form @submit.prevent="dosubmit"> 
            <!-- submit.prevent 사용시 새로고침 막을 수 있음 -->
            <div class="mb-4">
                <label for="username" class="block text-sm font-medium text-gray-700">사용자 이름</label>
                <input type="text" id="username" name="username" required class="mt-1 p-2 border border-gray-300 rounded w-full" value="홍길동"  placeholder="사용자 이름을 입력하세요">
            </div>
            <div class="mb-4">
                <label for="email" class="block text-sm font-medium text-gray-700">이메일</label>
                <input type="email" id="email" name="email" required class="mt-1 p-2 border border-gray-300 rounded w-full" value="aaa@naver.com" placeholder="이메일을 입력하세요">
            </div>
            <div class="mb-4">
                <label for="password" class="block text-sm font-medium text-gray-700">비밀번호</label>
                <input type="password" id="password" name="password" required class="mt-1 p-2 border border-gray-300 rounded w-full" value="1234" placeholder="비밀번호를 입력하세요">
            </div>
            <div class="mb-4">
                <label for="confirm-password" class="block text-sm font-medium text-gray-700">비밀번호 확인</label>
                <input type="password" id="confirm-password" name="confirm-password" required class="mt-1 p-2 border border-gray-300 rounded w-full" value="1234" placeholder="비밀번호를 다시 입력하세요">
            </div>
            <button type="submit" class="w-full bg-blue-600 text-white p-2 rounded hover:bg-blue-700">회원가입</button>
        </form>

        <p class="mt-4 text-center text-sm text-gray-600">이미 계정이 있으신가요? <a href="#" @click="gologin" class="text-blue-600 hover:underline">로그인</a></p>
    </div>
    </div>
</template>

<script setup>
import { doJoin } from '../api/loginApi';
import { useRouter } from 'vue-router';

const router = useRouter();

const gologin = () => {

    router.push({name:'login'})

}

const dosubmit = async (event) => {
    // event.stopPropagation(); //이벤트 전파 막기
    // event.preventDefault(); //기본적으로 새로고침 막는거
    console.log("연결? = "+ event)

    const res = await doJoin({
        "name":"홍길동",
        "password":"1234",
        "age":"11",
        "email":"aaa@naver.com",
    })
    console.log(res)
    
    alert("회원가입 완료")
    router.push({name:'login'})

    
}


</script>

<style lang="scss" scoped>

</style>