import HookThemeButton from '../chap07/HookThemeButton';
import MyThemeProvider from '../chap07/MyThemeProvider';
import { render, screen, waitFor } from '@testing-library/react';
import userEvent from '@testing-library/user-event';

test('HookThemeButton Test', async () => {
  const ev = userEvent.setup();
  // MyThemeProvider를 사용하여 HookThemeButton 렌더링
  render(<HookThemeButton />, { wrapper: MyThemeProvider });
  // 버튼 클릭 시뮬레이션
  const btn = screen.getByRole('button');
  ev.click(btn);
  // 버튼 캡션이 dark로 변경된 것을 확인한다.
  await waitFor(() => expect(btn).toHaveTextContent('dark'));
});