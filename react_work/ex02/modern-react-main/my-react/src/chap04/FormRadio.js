import { useState } from 'react';

export default function FormRadio() {
  // State 초기화
  const [form, setForm] = useState({
    os: 'windows'
  });

  // 라디오 버튼 변경 시 입력 값을 State에 반영
  const handleForm = e => {
    setForm({
      ...form,
      [e.target.name]: e.target.value
    });
  };

  // [보내기] 버튼 클릭 시 입력값 로그 출력
  const show = () => {
    console.log(`사용OS:${form.os}`);
  };

  // State의 현재 값에 따라 checked 속성 값을 결정한다.
  return (
    <form>
    <fieldset>
    <legend>사용OS:</legend>
    <label htmlFor="os_win">Windows</label>
    <input id="os_win" name="os"
      type="radio" value="windows"
      checked={form.os === 'windows'}
      onChange={handleForm} /><br />
    <label htmlFor="os_mac">macOS</label>
    <input id="os_mac" name="os"
      type="radio" value="mac"
      checked={form.os === 'mac'}
      onChange={handleForm} /><br />
    <label htmlFor="os_lin">Linux</label>
    <input id="os_lin" name="os"
      type="radio" value="linux"
      checked={form.os === 'linux'}
      onChange={handleForm} />
    </fieldset>
    <button type="button" onClick={show}>보내기</button>
    </form>
  );
}
