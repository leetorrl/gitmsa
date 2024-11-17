import { useState } from 'react';

export default function FormTextarea() {
  // State 초기화
  const [form, setForm] = useState({
    comment: `다양한 폼 요소를 리액트로 구현하는 방법에 대해서 알아보겠습니다. \n참고로 <input> 요소에서는 type 속성을 변경하여 숫자 스피너, 날짜 입력 박스 등 다양한 입력 박스를 표현할 수 있습니다.`
  });

  // 텍스트 영역 변경 시 입력 값을 State에 반영
  const handleForm = e => {
    setForm({
      ...form,
      [e.target.name]: e.target.value
    });
  };

  // [보내기] 버튼 클릭 시 입력값 로그 출력
  const show = () => {
    console.log(`댓글: ${form.comment}`);
  };

  return (
    <form>
      <label htmlFor="comment">댓글: </label><br />
      <textarea id="comment" name="comment"
        cols="30" rows="7"
        value={form.comment}
        onChange={handleForm}></textarea><br />
      <button type="button" onClick={show}>
        보내기</button>
    </form>
  );
}