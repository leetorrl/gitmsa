export default function ThrowPromise() {
  throw new Promise((resolve, reject) => { });
}



// Code 5-1-8
// // Promise가 종료되었는지 여부를 나타내는 플래그 변수
// let flag =  false;

// export default function ThrowPromise() {
//   // Promise가 완료되면 원래의 결과를 표시한다.
//   if (flag) {
//     return <p>올바르게 표시되었다.</p>;
//   }
//   // 로딩 중이라면 Promise를 던져라
//   throw new Promise((resolve, reject) => {
//     // 3000밀리초 후에 해결(resolve)하는 처리
//     setTimeout(() => {
//       flag = true;
//       resolve('Susccess!!');
//       // reject(new Error('Error is occurred!!'));
//     }, 3000);
//   });
// }