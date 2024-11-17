// import { render, screen } from '@testing-library/react';
// import App from './App';

// // 테스트케이스 정의
// test('renders learn react link', () => {
//   // 컴포넌트 렌더링
//   render(<App />);
//   // 테스트 대상 요소 검색 및 획득
//   const linkElement = screen.getByText(/learn react/i);
//   // 렌더링 결과의 정확성 검증
//   expect(linkElement).toBeInTheDocument();
// });



// Code 9-1-4
import { render, screen } from '@testing-library/react';
import App from './App';

// 테스트케이스 정의
test('renders learn react link', () => {
  const { debug, baseElement } = render(<App />);
  debug(baseElement);
  // 컴포넌트 렌더링
  render(<App />);
  // 테스트 대상 요소 검색 및 획득
  const linkElement = screen.getByText(/안녕, 리액트!!/i);
  // 렌더링 결과의 정확성 검증
  expect(linkElement).toBeInTheDocument();
});
