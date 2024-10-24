import axios from 'axios'

const url = 'http://192.168.0.67:8080'

export const freeBoardinput = async (data) => {
  if (data.title !== '' && data.title !== null) {
    if (data.body !== '' && data.body !== null) {
      const token = localStorage.getItem('token')

      console.log(token)
      const res = await axios.post(`${url}/question/save`, data, {
        headers: {
          Authorization: `Bearer ${token}`
        }
      })

      return res
    } else {
      alert('내용을 입력하시길 바랍니다.')
    }
  } else {
    alert('제목을 입력하시길 바랍니다.')
  }
}

export const Quiryview = async (pageidx) => {
  const res = await axios.get(`http://192.168.0.67:8080/question/view/${pageidx}`)

  console.log(res)
  return res
}
