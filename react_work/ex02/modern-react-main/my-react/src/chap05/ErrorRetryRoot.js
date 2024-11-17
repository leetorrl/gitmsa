import { ErrorBoundary } from 'react-error-boundary';
import ErrorRetryThrow from './ErrorRetryThrow';

export default function ErrorRetryRoot() {
  // 오류 발생 시 실행되는 처리
  const handleFallback = ({ error, resetErrorBoundary }) => {
    const handleClick = () => resetErrorBoundary();
    return (
      <div>
        <h4>다음 오류가 발생했다.</h4>
        <p>{error.message}</p>
        <button type="button" onClick={handleClick}>
          Retry
        </button>
      </div>
    );
  };
  // 리셋 시 실행되는 처리
  const handleReset = () => console.log('Retry!!');

  return (
    <>
      <h3>Error Boundary의 기본</h3>
      <ErrorBoundary
        onReset={handleReset}
        fallbackRender={handleFallback}
      >
        <ErrorRetryThrow />
      </ErrorBoundary>
    </>
  );
}



// Code 5-3-10
// import { ErrorBoundary } from 'react-error-boundary';
// import ErrorRetryThrow from './ErrorRetryThrow';
// import ErrorFallback from './ErrorFallback';

// export default function ErrorRetryRoot() {
//   // 오류 발생 시 실행되는 처리
//   const handleFallback = ({ error, resetErrorBoundary }) => {
//     const handleClick = () => resetErrorBoundary();
//     return (
//       <div>
//         <h4>다음 오류가 발생했다.</h4>
//         <p>{error.message}</p>
//         <button type="button" onClick={handleClick}>
//           Retry
//         </button>
//       </div>
//     );
//   };
//   // 리셋 시 실행되는 처리
//   const handleReset = () => console.log('Retry!!');

//   return (
//     <>
//       <h3>Error Boundary의 기본</h3>
//       {/* 오류 발생 시 렌더링 콘텐츠를 컴포넌트로 지정 */}
//       <ErrorBoundary
//         onReset={handleReset}
//         fallbackRender={handleFallback}
//         FallbackComponent={ErrorFallback}
//       >
//         <ErrorRetryThrow />
//       </ErrorBoundary>
//     </>
//   );
// }