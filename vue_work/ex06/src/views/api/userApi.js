import axios from 'axios';
const URL = 'http://localhost:8080/user';
export const getUsers = async () => {
  try {
    const res = await axios.get(`${URL}/select`); //통신될때까지 대기했다 통신되면 실행됨
    console.log(res);
    return res;
  } catch (e) {
    console.log(e);
    return e;
  }
  
  // .then((res) => {
  //   console.log(res);
  //   return res.data;
  // })
  // .catch((e) => {
  //   console.log(e);
  //   return e;
  // });
};
export const saveUser = async (item) => {
  console.log('save'+JSON.stringify(item))//문자열 변형하여 출력

  try{
  const res = await axios.put(`${URL}/update`,item);

 return res;

  }catch(e){
    console.log(e)
    return e;
  }


};
export const deleteUser = () => {};