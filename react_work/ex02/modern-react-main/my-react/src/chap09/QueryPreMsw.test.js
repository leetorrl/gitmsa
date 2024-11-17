import { render, screen } from '@testing-library/react';
import { rest } from 'msw';
import { setupServer } from 'msw/node';
import QueryPre from '../chap06/QueryPre';

describe('QuryPre (Mock)', () => {
  // 모의 서버 준비
  const server = setupServer(
    rest.get('https://api.openweathermap.org/data/2.5/weather',
      async (req, res, context) =>
        res(
          context.status(200),
          context.json({
            weather: [
              { icon: '4n', main: 'Clouds', description: '흐림' }
            ]
          })
        )
    )
  );

  // 모의 서버 시작/종료
  beforeAll(() => server.listen());
  afterEach(() => server.resetHandlers());
  afterAll(() => server.close());

  // 모크를 이용한 컴포넌트 렌더링 및 테스트
  test('mock을 이용한 테스트', async () => {
    const {debug, baseElement} = await render(<QueryPre />);
    const img = await screen.findByRole('img', {}, { timeout: 3000 });
    expect(img).toHaveAttribute('alt', 'Clouds');
    debug(baseElement);
  });
});
