import { useRef, useEffect } from 'react';
import './EventPassive.css';

export default function EventPassive() {
  const handleWheel = e => e.preventDefault();
  const divRef = useRef(null);
  useEffect(() => {
    const div = divRef.current;
    div.addEventListener('wheel', handleWheel, { passive: false });
    return (() => {
      div.removeEventListener('wheel', handleWheel);
    });
  });

  return (
    <div className="box"
      onWheel={handleWheel}>예를 들어 Wheel 이벤트를 핸들러에서...
    </div>
  );
}



// export default function EventPassive() {
//   const handleWheel = e => e.preventDefault();
//   // <div> 요소에 대한 참조 가져오기
//   const divRef = useRef(null);
//   useEffect(() => {
//     // 컴포넌트 시작 시 리스너 설정
//     const div = divRef.current;
//     div.addEventListener('wheel', handleWheel, { passive: false });
//     return (() => {
//       // 컴포넌트 폐기 시 리스너도 함께 폐기
//       div.removeEventListener('wheel', handleWheel);
//     });
//   });

//   return (
//     <div ref={divRef} className="box"
//       onWheel={handleWheel}
//     >
//       예를 들어 Wheel 이벤트를 핸들러에서...
//     </div>
//   );
// }
