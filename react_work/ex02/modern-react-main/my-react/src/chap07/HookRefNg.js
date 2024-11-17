import { useState } from 'react';

export default function HookRefNg() {
  // 타이머 켜기/끄기를 관리하기 위한 변수
  let id = null;
  const [count, setCount] = useState(0);

  // [시작] 버튼으로 타이머 생성하기
  const handleStart = () => {
    // 타이머 작동 중일 때는 아무것도 하지 않음(두 번 누르기 방지)
    if (id === null) {
      id = setInterval(() => setCount(c => c + 1), 1000);
    }
  };
  // [종료] 버튼으로 타이머를 종료한다.
  const handleEnd = () => {
    clearInterval(id);
    id = null;
  };

  return (
    <>
      <button onClick={handleStart}>시작</button>
      <button onClick={handleEnd}>종료</button>
      <p>{count}초 경과</p>
    </>
  );
}