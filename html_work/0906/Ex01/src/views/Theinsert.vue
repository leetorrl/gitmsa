<template>
  <div>
<h1>Theinsert</h1>
<button @click="userSend">전송</button>
  </div>
</template>

<script>
export default {
  setup () {
const mydata ={

        "name": "베테랑",
        "age": 2,
        "email": "9월15일",
        "password": "대.개.봉",
        "wdate": "2024-09-06T11:32:44.718893"
}
  
    const userSend = () => {
      fetch('http://192.168.0.29:8080/user/insert', {
        method:"POST",
        headers:{'Content-Type':'application/json'},
        body: JSON.stringify(mydata)
    })
    .then(res => {
      console.log(res);
    })
    }
    return {userSend}
  
    }
  }

</script>

<style lang="scss" scoped>

</style>