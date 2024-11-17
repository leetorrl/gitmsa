// // 리액트 라우터 본체 가져오기
import { createBrowserRouter } from 'react-router-dom';
// 라우팅에 사용할 페이지 가져오기
import TopPage from './TopPage';
import ArticlePage from './ArticlePage';
import AboutPage from './AboutPage';

// 라우팅 테이블 정의
const routesBasic = createBrowserRouter([
  { path: '/', element: <TopPage /> },
  { path: '/article', element: <ArticlePage /> },
  { path: '/about', element: <AboutPage /> },
]);

export default routesBasic;



// Code 8-1-3
// // 리액트 라우터 본체 가져오기
// import { Route, createBrowserRouter, createRoutesFromElements } from 'react-router-dom';
// // 라우팅에 사용할 페이지 가져오기
// import TopPage from './TopPage';
// import ArticlePage from './ArticlePage';
// import AboutPage from './AboutPage';

// // 라우팅 테이블 정의
// const routesBasic = createBrowserRouter(
//   createRoutesFromElements(
//     <>
//       <Route path="/" element={<TopPage />} />
//       <Route path="/article" element={<ArticlePage />} />
//       <Route path="/about" element={<AboutPage />} />
//     </>
//   )
// );

// export default routesBasic;