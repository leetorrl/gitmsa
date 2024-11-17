export default function MyTextBox({ label, ref }) {
  return (
    <label>
      {label} :
      <input type="text" size="15" ref={ref} />
    </label>
  );
}



// Code 7-2-8
// import { forwardRef } from 'react';

// const MyTextBox = forwardRef(({ label }, ref) => (
//   <label>
//     {label} :
//     <input type="text" size="15" ref={ref} />
//   </label>
// ));

// export default MyTextBox;



// Code 7-2-9
// // useImperativeHandle 함수를 사용하여 다시 작성한 경우
// import { forwardRef, useImperativeHandle, useRef } from 'react';

// const MyTextBox = forwardRef(({ label }, ref) => {
//   // 텍스트 상자에 대한 참조 준비
//   const input = useRef(null);

//   // 부모 컴포넌트에 노출할 오브젝트를 생성한다.
//   useImperativeHandle(ref, () => {
//     return {
//       focus() {
//         input.current.focus();
//       },
//     };
//   }, []);

//   return (
//     <label>
//       {label}：
//       <input type="text" size="15" ref={input} />
//     </label>
//   );
// });

// export default MyTextBox;