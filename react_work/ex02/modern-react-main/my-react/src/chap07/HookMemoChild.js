// 카운터를 늘리거나 줄이는 버튼
// id : id 값, handleClick : 버튼 핸들러, children : 버튼 캡션
export const MyButton = ({ id, handleClick, children }) => {
  // 리렌더링 시 로그
  console.log(`MyButton is called: ${id}`);
  return (
    <button onClick={handleClick}>{children}</button>
  );
};

// 카운터 값을 표시하기 위한 라벨
// id: id 값, value: 표시할 값
export const MyCounter = ({ id, value }) => {
  // 리렌더링 시 로그
  console.log(`MyCounter is called: ${id}`);
  return (
    <p>현재 값:{value}</p>
  );
};



// Code 7-6-5
// import { memo } from 'react';

// export const MyButton = memo(({ id, handleClick, children }) => { 
//   console.log(`MyButton is called: ${id}`);
//   return (
//     <button onClick={handleClick}>{children}</button>
//   );
// });

// export const MyCounter = memo(({ id, value }) => {
//   console.log(`MyCounter is called: ${id}`);
//   return (
//     <p>현재 값:{value}</p>
//   );
// });