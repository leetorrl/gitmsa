import axios from 'axios';
const URL = 'http://localhost:8080/user';
export const getUsers = async () => {
  try {
    const res = await axios.get(`${URL}/select`);
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
export const saveUser = () => {
  console.log('save')
};
export const deleteUser = () => {};