import { render, screen } from '@testing-library/react';
import books from '../chap03/books';
import ForNest from '../chap03/ForNest';

// ForItem 컴포넌트 모의 정의
jest.mock('../chap03/ForItem', () => {
  return function ForItemMock({ book }) {
    return (
      <>
        <dt>{book.title}</dt>
        <dd>{book.summary.substring(0, 10)}...</dd>
      </>
    );
  };
});

// 테스트 코드 정의
test('ForNest Test', () => {
  const { debug, baseElement } = render(<ForNest src={books} />);
  const dt = screen.getAllByRole('term');
  // ForNest 컴포넌트 출력 확인
  debug(baseElement);
  // <dt> 요소가 5개가 있고, 첫 번째 <dt> 요소에 '스테이블 디퓨전'이 포함된 것을 확인한다.
  expect(dt).toHaveLength(5);
  expect(dt[0]).toHaveTextContent('스테이블 디퓨전');
});
