import { useReducer } from 'react';

export default function useCounter(init, step) {
  // 카운터를 관리하기 위한 State/Reducer를 준비한다.
  const [state, dispatch] = useReducer(
    (state, action) => {
      switch (action.type) {
        case 'update':
          return { count: state.count + action.step };
        case 'reset' :
          return { count: action.init };
        default:
          return state;
      }
    },
    {
      count: init
    }
  );
  // 각 버튼에 대응하는 핸들러
  const handleUp = () => dispatch({ type: 'update', step });
  const handleDown = () => dispatch({ type: 'update', step: -step });
  const handleReset = () => dispatch({ type: 'reset', init });
  return [state, handleUp, handleDown, handleReset];
}



// Code 7-8-4
// import { useDebugValue } from 'react';
// import { useReducer } from 'react';

// export default function useCounter(init, step) {
//   // 카운터를 관리하기 위한 State/Reducer를 준비한다.
//   const [state, dispatch] = useReducer(
//     (state, action) => {
//       switch (action.type) {
//         case 'update':
//           return { count: state.count + action.step };
//         case 'reset' :
//           return { count: action.init };
//         default:
//           return state;
//       }
//     },
//     {
//       count: init
//     }
//   );
//   useDebugValue(state.count >= 10 ? '10 Over' : '10 Less');
//   // 각 버튼에 대응하는 핸들러
//   const handleUp = () => dispatch({ type: 'update', step });
//   const handleDown = () => dispatch({ type: 'update', step: -step });
//   const handleReset = () => dispatch({ type: 'reset', init });
//   return [state, handleUp, handleDown, handleReset];
// }