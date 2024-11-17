import { useReducer } from 'react';

// 인수에 따라 0~init 사이의 값을 생성한다.
function initCounter(init) {
  console.log('initCounter is called!!');
  return {
    count: Math.floor(Math.random() * (init + 1))
  };
}

export default function HookReducerInit({ init }) {
  const [state, dispatch] = useReducer(
    (state, action) => {
      switch (action.type) {
        case 'update':
          return { count: state.count + 1 };
        default:
          return state;
      }
    },
    initCounter(init)
  );

  const handleClick = () => {
    dispatch({ type: 'update' });
  };
  return (
    <>
      <button onClick={handleClick}>카운트</button>
      <p>{state.count}번 클릭되었습니다.</p>
    </>
  );
}




// import { useReducer } from 'react';

// // 인수에 따라 0~init 사이의 값을 생성한다.
// function initCounter(init) {
//   console.log('initCounter is called!!');
//   return {
//     count: Math.floor(Math.random() * (init + 1))
//   };
// }

// export default function HookReducerInit({ init }) {
//   const [state, dispatch] = useReducer(
//     (state, action) => {
//       switch (action.type) {
//         case 'update':
//           return { count: state.count + 1 };
//         default:
//           return state;
//       }
//     },
//     init,
//     initCounter
//   );

//   const handleClick = () => {
//     dispatch({ type: 'update' });
//   };
//   return (
//     <>
//       <button onClick={handleClick}>카운트</button>
//       <p>{state.count}번 클릭되었습니다.</p>
//     </>
//   );
// }