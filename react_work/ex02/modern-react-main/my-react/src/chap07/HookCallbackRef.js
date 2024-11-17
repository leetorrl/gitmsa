import { useEffect, useRef, useState } from 'react';

export default function HookCallbackRef() {
  const [show, setShow] = useState(false);
  // 버튼 클릭으로 표시/숨기기 반전
  const handleClick = () => setShow(!show);
  // [주소]란 참조
  const address = useRef(null);
  // [주소] 항목이 비어있지 않으면 포커스 이동
  useEffect(() => {
    if (address.current) {
      address.current.focus();
    }
  }, [show]);

  return (
  <>
  <div>
      <label htmlFor="name">이름:</label>
      <input id="name" type="text" />
  </div>
  <div>
      <label htmlFor="email">이메일 주소:</label>
      <input id="email" type="text" />
      <button onClick={handleClick}>확장 표시</button>
  </div>
  {/* State(show) 값에 따라 [주소] 란을 표시 */}
  {show &&
    <div>
      <label htmlFor="address">주소:</label>
      <input id="address" type="text" ref={address} />
    </div>
  }
  </>
  );
}



// Code 7-2-12
// import { useEffect, useRef, useState } from 'react';

// export default function HookCallbackRef() {
//   const [show, setShow] = useState(false);
//   const handleClick = () => setShow(!show);
  
//   // 콜백 Ref 준비
//   const callbackRef = elem => elem?.focus();

//   return (
//   <>
//   <div>
//       <label htmlFor="name">이름:</label>
//       <input id="name" type="text" />
//   </div>
//   <div>
//       <label htmlFor="email">이메일 주소:</label>
//       <input id="email" type="text" />
//       <button onClick={handleClick}>확장 표시</button>
//   </div>
//   {/* State(show) 값에 따라 [주소] 란을 표시 */}
//   {show &&
//     <div>
//       <label htmlFor="address">주소:</label>
//       <input id="address" type="text" ref={callbackRef} />
//     </div>
//   }
//   </>
//   );
// }