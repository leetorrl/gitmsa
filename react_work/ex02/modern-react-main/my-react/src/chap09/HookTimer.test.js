// import { act, render, screen } from '@testing-library/react';
// import HookTimer from '../chap07/HookTimer';

// describe('HookTimer', () => {
//   test('setInterval', async () => {
//     const { debug } = render(<HookTimer init={10} />);
//     // 카운터 부분 가져오기
//     const counter = screen.getByText(/현재 카운트/);
//     // 카운터가 감소된 결과 확인
//     debug(counter);
//     expect(counter).toHaveTextContent('9');
//   });
// });



// Code 9-1-9
import { act, render, screen } from '@testing-library/react';
import HookTimer from '../chap07/HookTimer';

describe('HookTimer', () => {
  // 테스트 전 의사 타이머 활성화
  beforeEach(() => {
    jest.useFakeTimers();
  });

  afterEach(() => {
    // 테스트 후 실제 타이머로 복귀
    jest.useRealTimers();
  });

  test('setInterval', async () => {
    const { debug } = render(<HookTimer init={10} />);    
    act(() => {
      jest.advanceTimersByTime(1000);
    });
    const counter = screen.getByText(/현재 카운트/);
    debug(counter);
    expect(counter).toHaveTextContent('9');
  });
});