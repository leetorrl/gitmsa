// import { useRecoilState } from 'recoil';
// import { counterAtom } from '../store/atom';

// export default function RecoilCounter() {
//   // Recoil 관리하에 값과 세터를 가져온다.
//   const [counter, setCounter] = useRecoilState(counterAtom);

//   const handleClick = () => {
//     setCounter(c => c + 1);
//     // setCounter(counter + 1);
//   };

//   return (
//     <>
//       <button onClick={handleClick}>카운트</button>
//       <p>{counter}번 클릭되었습니다. </p>
//     </>
//   );
// }



// import { useRecoilValue, useSetRecoilState } from 'recoil';
// import { counterAtom } from '../store/atom';

// export default function RecoilCounter() {
//   const counter = useRecoilValue(counterAtom);
//   const setCounter = useSetRecoilState(counterAtom);

//   const handleClick = () => {
//     setCounter(c => c + 1);
//   };

//   return (
//     <>
//       <button onClick={handleClick}>카운트</button>
//       <p>{counter}번 클릭되었습니다. </p>
//     </>
//   );
// }




import { useRecoilState, useResetRecoilState } from 'recoil';
import { counterAtom } from '../store/atom';

export default function RecoilCounter() {
  const [counter, setCounter] = useRecoilState(counterAtom); 
  const resetCounter = useResetRecoilState(counterAtom);
  
  const handleClick = () => {
    setCounter(c => c + 1);
  };

  return (
    <>
      <button onClick={handleClick}>카운트</button>
      <button onClick={() => resetCounter()}>리셋</button>
      <p>{counter}번 클릭되었습니다. </p>
    </>
  );
}