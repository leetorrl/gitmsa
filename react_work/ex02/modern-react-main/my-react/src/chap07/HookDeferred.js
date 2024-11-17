import { useDeferredValue, useState } from 'react';

export default function HookDefered() {
  const [text, setText] = useState('');
  // 변수 text의 지연된 버전을 생성한다.
  const deferText = useDeferredValue(text);
  // 텍스트 상자 변경 시 text/deferText 모두 로그 표시
  const handleChange = e => {
    setText(e.target.value);
    console.log(text, deferText);
  };

  return (
    <>
    <input type="text" value={text} onChange={handleChange} />
    {[...Array(10000)].map((e, index) => <p key={index}>{deferText}</p>)}
    </>
  );
}