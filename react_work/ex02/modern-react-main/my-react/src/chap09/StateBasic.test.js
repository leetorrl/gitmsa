import { render, screen, waitFor } from '@testing-library/react';
import userEvent from '@testing-library/user-event';
import StateBasic from '../chap03/StateBasic';

test('StateBasic Test', async () => {
  // userEvent 객체 생성
  const ev = userEvent.setup();
  render(<StateBasic init={0} />);
  // 조작 대상 요소 획득
  const btn = screen.getByRole('button', { name: '카운트' });
  const cnt = screen.getByText(/클릭/);
  // 버튼 클릭
  ev.click(btn);
  await waitFor(() => { expect(cnt).toHaveTextContent('1번'); });
});