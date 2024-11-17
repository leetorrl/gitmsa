import { useState } from 'react';

export default function StateNest() {
  // 인자 배열을 State로 선언
  const [form, setForm] = useState({
    name: '홍길동',
    address: {
      city: '태안',
      do: '충청남도'
    }
  });

  // 1단계 요소를 업데이트하는 핸들러
  const handleForm = e => {
    setForm({
      ...form,
      [e.target.name]: e.target.value
    });
  };

  // 2단계 요소를 업데이트하는 핸들러
  const handleFormNest = e => {
    setForm({
      ...form,
      address: {
        ...form.address,
        [e.target.name]: e.target.value
      }
    });
  };

  // [보내기] 버튼 클릭으로 폼 정보 로그 출력
  const show = () => {
    console.log(`${form.name}（${form.address.do}・${form.address.city}）`);
  };

  return (
    <form>
      <div>
        <label htmlFor="name">이름:</label>
        <input id="name" name="name" type="text"
          onChange={handleForm} value={form.name} />
      </div>
      <div>
        <label htmlFor="do">주소(도):</label>
        <input id="do" name="do" type="text"
          onChange={handleFormNest} value={form.address.do} />
      </div>
      <div>
        <label htmlFor="city">주소(시/군/구):</label>
        <input id="city" name="city" type="text"
          onChange={handleFormNest} value={form.address.city} />
      </div>
      <div>
        <button type="button" onClick={show}>
          보내기</button>
      </div>
    </form>
  );
}