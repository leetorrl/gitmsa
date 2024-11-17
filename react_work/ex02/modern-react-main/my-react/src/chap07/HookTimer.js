import { useEffect, useState } from 'react';
import './HookTimer.css';

export default function HookTimer({ init }) {
  const [count, setCount] = useState(init);

  useEffect(() => {
    // 타이머 준비
    const t = setInterval(() => {
      setCount(c => c - 1);
    }, 1000);
    // 컴포넌트 폐기 시 타이머도 함께 폐기
    return () => {
      clearInterval(t);
    };
  }, []);

  return (
    // 카운터가 0보다 작아지면 스타일 WARN 적용
    <div className={count < 0 ? 'warn' : ''}>
      현재 카운트 : {count}
    </div>
  );
}