import { useReducer } from 'react';

export default function HookReducer({ init }) {
  // State+Reducer 준비
  const [state, dispatch] = useReducer(
    // 감속기 기능
    (state, action) => {
      switch (action.type) {
        case 'update':
          return { count: state.count + 1 };
        default:
          return state;
      }
    },
    // State의 초깃값
    {
      count: init
    }
  );

  // Reducer를 통해 State 업데이트
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