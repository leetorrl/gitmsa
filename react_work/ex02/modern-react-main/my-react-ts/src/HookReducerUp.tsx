import { useReducer } from 'react';

// Props 유형 정의
type HookReducerUpProps = {
  init: number
};

// State 타입 정의
type StateType = {
  count: number;
};

// Action의 타입 정의
type ActionType = {
  type: 'update',
  step: number
} | {
  type: 'reset',
  init: number
};

// Reducer 유형 정의
type CountReducerType = (state: StateType, action: ActionType) => StateType;

export default function HookReducerUp({ init }: HookReducerUpProps) {
  // Reducer 타입 정의
  const [state, dispatch] = useReducer<CountReducerType>(
    // Reducer의 실체
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
    // State의 초깃값
    {
      count: init
    }
  );
  const handleUp = () => dispatch({ type: 'update', step: 1 });
  const handleDown = () => dispatch({ type: 'update', step: -1 });
  const handleReset = () => dispatch({ type: 'reset', init: 0 });

  return (
    <>
      <button onClick={handleUp}>카운트업</button>
      <button onClick={handleDown}>카운트다운</button>
      <button onClick={handleReset}>리셋</button>
      <p>{state.count}번 클릭되었습니다.</p>
    </>
  );
}