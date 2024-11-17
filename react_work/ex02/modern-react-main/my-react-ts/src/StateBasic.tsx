import { useState } from 'react';

// Props 타입 선언
type StateBasicProps = {
  init: number
};

export default function StateBasic({ init }: StateBasicProps) {
  const [count, setCount] = useState<number>(init);
  const handleClick = () => setCount(count + 1);
  return (
    <>
      <button onClick={handleClick}>카운트</button>
      <p>{count}번 클릭했습니다.</p>
    </>
  );
}


