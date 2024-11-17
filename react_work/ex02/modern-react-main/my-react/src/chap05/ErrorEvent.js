export default function ErrorEvent() {
  const handleClick = () => {
    throw new Error('Error is occured in MyApp.');
  };
  return (
    <button type="button" onClick={handleClick}>
      오류 발사
    </button>
  );
}


// import { useErrorBoundary } from 'react-error-boundary';

// export default function ErrorEvent() {
//   const { showBoundary } = useErrorBoundary();
//   const handleClick = () => {
//     try {
//       throw new Error('Error is occured in MyApp.');
//     } catch(e) {
//       // 핸들러 내에서 발생한 예외를 Error Boundary로 넘긴다.
//       showBoundary(e);
//     }
//   };
//   return (
//     <button type="button" onClick={handleClick}>
//       오류 발사
//     </button>
//   );
// }