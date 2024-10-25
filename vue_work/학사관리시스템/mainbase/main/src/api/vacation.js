import axios from 'axios'

const url = 'http://192.168.0.67:8080'
const token = localStorage.getItem('token')
export const vacation = async (vadata) => {
  console.log('js api로 넘어간 data = ' + vadata)

  console.log('휴가신청 토큰 체크' + token)

  if (vadata.reason !== '' && vadata.reason !== null) {
    if (vadata.peresonalNum !== '' && vadata.peresonalNum !== null) {
      const res = await axios.post(`${url}/vacation/request`, vadata, {
        headers: {
          Authorization: `Bearer ${token}`
        }
      })

      console.log(res)

      return res
    } else {
      alert('비상연락망을 입력바랍니다..')
    }
  } else {
    alert('내용을 입력 바랍니다.')
  }
}
