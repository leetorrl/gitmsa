import { render, screen } from '@testing-library/react';
import QueryPre from '../chap06/QueryPre';

describe('QueryPre', () => {
  test('fetch 함수를 포함하는 테스트', async () => {
    render(<QueryPre />);
    // <img> 요소 가져오기
    const img = await screen.findByRole('img', {}, { timeout: 3000 });
    // alt 속성 값이 Clouds(흐림)인 것을 확인한다.
    expect(img).toHaveAttribute('alt', 'Clouds');
  });
});