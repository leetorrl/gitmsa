<template>
  <div>

    <div style="border: 1px solid black;">
      <h1>DB연습</h1>
<div>
  <ul v-for="item in arr" :key="item.idx" style="list-style: none;">
    <li> idx : {{item.idx}}</li>
    <li> nickname : {{item.nickname}}</li>
    <li> name : {{item.name}}</li>
    <li> age : {{item.age}}</li>
    <li> image: <img :src="item.image" v-if="item.image" style="width: 50px; height: 50px;" /></li>
  </ul>
</div>

<!-- <template v-if="item.list[0]"> 
              값이 있으면 true , 아니면 false로 인식 
                <td class="border text-center text-lg p-1">
                  <img :src="`
                  ${GLOBAL_URL}/file/download/${item.list[0].name}`" alt="" srcset="" width="150">
                </td>
              </template> -->


<div style="border: 1px solid black">
      <h2>신규등록</h2>
      <input v-model="idx" placeholder="idx" />
      <input v-model="nickname" placeholder="nickName" />
      <input v-model="name" placeholder="Name" />
      <input v-model="age" placeholder="Age" type="number" />
      <button @click="addUser">post</button>
    </div>


    <div style="border: 1px solid black">
   <h2>삭제</h2>
   <input v-model="idx" placeholder="idx" />
   <button @click="deleteUser(idx)">삭제</button>
    </div>

      <input type="file" @change="upfile" accept="image/*">

      <div v-if="imageUrl">
      <img :src="imageUrl" style="width: 200px; height: 200px;" />
    </div>

      <button v-if="imageUrl" @click="uploadImage">클릭</button>
    </div>

  </div>
</template>

<script setup>
import { ref, watchEffect } from 'vue';
import axios from 'axios';

const idx = ref()
const nickname = ref('')
const name = ref('')
const age = ref('')
const image = ref('')

const arr = ref([])
const selectedFile = ref(null) // 선택된 파일
const imageUrl = ref(null) // 미리보기 이미지 URL

const userdata = async() => {

  try{
    const res = await axios.get(`http://localhost:5000/users`)

    console.log(res)
    arr.value = res.data
  

  }catch(e){
    console.log(e)
  }
}

const upfile = (event) => {

  const file = event.target.files[0];

      if (file) {
        // 파일이 선택되면 미리보기 URL을 생성
        selectedFile.value = file;
        imageUrl.value = URL.createObjectURL(file);
 }
}



// 이미지를 서버에 업로드하는 함수
const uploadImage = async () => {
  if (!selectedFile.value) {
    alert('이미지를 선택해 주세요');
    return;
  }

  // FormData 객체 생성 (파일을 서버로 전송하기 위해)
  const formData = new FormData();
  formData.append('image', selectedFile.value);

  try {
    // 이미지 업로드 요청
    const res = await axios.post('http://localhost:5000/users', formData, {
      headers: {
        'Content-Type': 'multipart/form-data',
      },
    });

    // 서버에서 업로드된 이미지의 URL을 받아옴
    const uploadedImageUrl = res.data.image;

    // 사용자 데이터에 이미지 URL을 업데이트 (서버에 PUT 요청)
    await axios.put(`http://localhost:5000/users/${idx.value}`, { image: uploadedImageUrl });

    // 로컬 데이터 배열에 새 이미지 URL을 반영
    const updatedUser = arr.value.find(user => user.idx === idx.value);
    if (updatedUser) {
      updatedUser.image = uploadedImageUrl;
    }

    // 업로드 후 미리보기 및 선택된 파일 초기화
    selectedFile.value = null;
    imageUrl.value = null;

    console.log('이미지 업로드 성공');
  } catch (error) {
    console.error('이미지 업로드 오류:', error);
  }
};




// const formData = new FormData()
//   formData.append('data', new Blob([JSON.stringify(data)],
//    { type: 'application/json' }))
//   formData.append('file', myfile.value)
//   // console.log(data);

//   const res = await saveFreeboard(formData);



const addUser = async () => {

  const data = {
    idx : idx.value,
    nickname : nickname.value,
    name : name.value,
    age : age.value,
  }

      try {
        const res = await axios.post('http://localhost:5000/users', data);
        
        alert(`${res.data.idx}`+"등록완료")
        console.log(res)

        idx.value = null
        nickname.value = null
        name.value = null
        age.value = null
        
      } catch (e) {
        console.error('Error adding user:', error);
    }
};


const deleteUser = async(idx) => {

  try{

       const res = await axios.delete(`http://localhost:5000/users/${idx}`);

       alert(`${idx}삭제완료`)

       idx.value = null

  }catch(e){
    console.log(e)
  }

}


watchEffect(()=>{
  userdata()
})


</script>

<style lang="scss" scoped>

</style>