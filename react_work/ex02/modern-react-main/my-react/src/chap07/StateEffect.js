import { useEffect, useState } from 'react';

export default function StateEffect({ init }) {
  const [count, setCount] = useState(init);
  const [foo, setFoo] = useState('foo');

  // State 값(count)이 변경된 경우에만 로그를 표시한다.
  useEffect(() => {
    console.log(`count is ${count}.`);
  }, []);
  const handleClick = () => setCount(count + 1);

  return (
    <>
      {/* 버튼에 타임스탬프 값 반영 */}
      <button onClick={() => setFoo(Date.now())}>Foo ({foo})</button>
      <button onClick={handleClick}>카운트</button>
      <p>{count}번 클릭되었습니다.</p>
    </>
  );
}