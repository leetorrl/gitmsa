import axios from 'axios';
import { GLOBAL_URL } from './util.js';

const URL = `${GLOBAL_URL}/user`;

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

export const  deleteUser = async (idx) => {
console.log("넘어간거 맞냐?"+idx)
alert('삭제되었습니다.')
try{
  const res = await axios.delete(`${URL}/delete/${idx}`);
return res;

}catch(e){
  console.log(e)
  return e;
}

}