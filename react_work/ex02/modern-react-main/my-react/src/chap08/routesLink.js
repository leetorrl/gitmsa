import { Route, createBrowserRouter, createRoutesFromElements } from 'react-router-dom';
import RouterApp from './RouterApp';
import TopPage from './TopPage';
import ArticlePage from './ArticlePage';
import AboutPage from './AboutPage';

const routesLink = createBrowserRouter(
  createRoutesFromElements(
    // 상위 경로 추가 
    <Route path="/" element={<RouterApp />}>
      {/* <Route path="" element={<TopPage />} /> */}
      <Route index element={<TopPage />} />
      <Route path="article" element={<ArticlePage />} />
      <Route path="about" element={<AboutPage />} />
    </Route>
  )
);

export default routesLink;



// import { Route, createBrowserRouter, createRoutesFromElements } from 'react-router-dom';
// import RouterApp from './RouterApp';
// import TopPage from './TopPage';
// import ArticlePage from './ArticlePage';
// import AboutPage from './AboutPage';

// const routesLink = createBrowserRouter([
//   { path: '/', element: <RouterApp />,
//     children: [
//       { path: '', element: <TopPage /> },
//       { path: 'article', element: <ArticlePage /> },
//       { path: 'about', element: <AboutPage /> },
//     ]
//   }
// ]);

// export default routesLink;



// import { Route, createBrowserRouter, createRoutesFromElements } from 'react-router-dom';
// import RouterApp from './RouterApp';
// import TopPage from './TopPage';
// import ArticlePage from './ArticlePage';
// import AboutPage from './AboutPage';

// const routesLink = createBrowserRouter(
//   createRoutesFromElements(
//     <Route element={<RouterApp />}>
//       <Route path="/" element={<TopPage />} />
//       <Route path="/article" element={<ArticlePage />} />
//       <Route path="/about" element={<AboutPage />} />
//     </Route>
//   )
// );

// export default routesLink;



// Code 8-2-7
// import { Route, createBrowserRouter, createRoutesFromElements } from 'react-router-dom';
// import RouterApp from './RouterApp';
// import RouterNav from './RouterNav';
// import TopPage from './TopPage';
// import ArticlePage from './ArticlePage';
// import AboutPage from './AboutPage';

// const routesLink = createBrowserRouter(
//   createRoutesFromElements(
//     <Route element={<RouterNav />}>
//       <Route path="/" element={<TopPage />} />
//       <Route path="/article" element={<ArticlePage />} />
//       <Route path="/about" element={<AboutPage />} />
//     </Route>
//   )
// );

// export default routesLink;



// 8-2-10
// import { Route, createBrowserRouter, createRoutesFromElements } from 'react-router-dom';
// import RouterApp from './RouterApp';
// import RouterNav from './RouterNav';
// import TopPage from './TopPage';
// import ArticlePage from './ArticlePage';
// import AboutPage from './AboutPage';

// const routesLink = createBrowserRouter(
//   createRoutesFromElements(
//     <Route element={<RouterApp />}>
//       <Route path="/" element={<TopPage />} />
//       <Route path="/article" element={<ArticlePage />} />
//       <Route path="/about" element={<AboutPage />} />
//     </Route>
//   )
// );

// export default routesLink;



// 8-2-12
// import { Route, createBrowserRouter, createRoutesFromElements } from 'react-router-dom';
// import RouterApp from './RouterApp';
// import RouterNav from './RouterNav';
// import TopPage from './TopPage';
// import ArticlePage from './ArticlePage';
// import AboutPage from './AboutPage';
// import InfoPage from './InfoPage';

// const routesLink = createBrowserRouter(
//   createRoutesFromElements(
//     <Route element={<RouterApp />}>
//       <Route path="/" element={<TopPage />} />
//       <Route path="/article" element={<ArticlePage />} />
//       <Route path="/article/info" element={<InfoPage />} />
//       <Route path="/about" element={<AboutPage />} />
//     </Route>
//   )
// );

// export default routesLink;
