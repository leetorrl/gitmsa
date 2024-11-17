import { useEffect, useRef } from 'react';
import MyTextBox from './MyTextBox';

export default function HookRefForward() {
  const text = useRef(null);
  // 시작 시 텍스트 상자에 포커스 맞추기
  useEffect(() => {
    text.current?.focus();
  }, []);

  return (
    <MyTextBox label="name" ref={text} />
  );
}