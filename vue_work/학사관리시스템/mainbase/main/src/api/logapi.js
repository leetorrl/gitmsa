import axios from 'axios'

const url = 'http://192.168.0.67:8080'

export const login = async (userdata) => {
  try {
    const res = await axios.post(`${url}/sign/login`, userdata)

    console.log('포스트 요청된 응애토큰' + res.data)

    return res
  } catch (err) {
    console.error(err)
    return err
  }
}

// export const msgSend = async (message) => {
//   try {
//     const res = await axios.get(`${url}/kakao/msg?message=${message}`, {
//       headers: {
//         'Content-Type': 'application/json',
//         Authorization: `Bearer ${localStorage.getItem('token')}`
//       }
//     })
//     return res
//   } catch (err) {
//     console.error(err)
//     return err
//   }
// }

export const loginCheck = async () => {
  try {
    const res = await axios.get(`${url}/user/info`, {
      headers: {
        'Content-Type': 'application/json',
        Authorization: `Bearer ${localStorage.getItem('token')}`
      }
    })
    return res
  } catch (err) {
    console.error(err)
    return err
  }
}
