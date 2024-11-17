/* eslint-disable @typescript-eslint/no-unused-vars */

import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import App from './App';
import reportWebVitals from './reportWebVitals';
import StateBasic from './StateBasic';
import StyledPanel from './StyledPanel';
import ListTemplate from './ListTemplate';
import books from './books';
import type { Book } from './Book';
import MyThemeProvider from './MyThemeProvider';
import HookThemeButton from './HookThemeButton';
import HookReducerUp from './HookReducerUp';
import StateFormUC from './StateFormUC';
import QueryPre from './QueryPre';
import { QueryClient, QueryClientProvider } from 'react-query';
import QueryBasic from './QueryBasic';
/* eslint-enable @typescript-eslint/no-unused-vars */

const root = ReactDOM.createRoot(
  document.getElementById('root') as HTMLElement
);

// root.render(
//   <React.StrictMode>
//     <App />
//   </React.StrictMode>
// );



// Code 10-2-3
// root.render(
//   <StateBasic init={0} />
// );



// Code 10-2-4
// root.render(
//   <StyledPanel>
//     <p>회원 모집 중!</p>
//     <p>위키북스 프로젝트에 오신 것을 환영합니다！!</p>
//   </StyledPanel>
// );



// Code 10-2-7
// root.render(
//   <ListTemplate src={books}>
//   {(elem: Book) => (
//     <>
//     <dt>
//       <a href={`https://wikibook.co.kr/images/cover/s/${elem.isbn}.jpg`}>
//             {elem.title}（{elem.price}원）
//       </a>
//     </dt>
//     <dd>{elem.summary}</dd>
//     </>
//   )}
//   </ListTemplate>
// );



// Code 10-2-11
// root.render(
//   <MyThemeProvider>
//     <HookThemeButton />
//   </MyThemeProvider>
// );



// Code 10-2-12
// root.render(
//   <HookReducerUp init={0} />
// );



// Code 10-2-13
// root.render(
//   <StateFormUC />
// );



// Code 10-2-14
root.render(
  <QueryPre />
);



// Code 10-2-15
const cli = new QueryClient();
root.render(
  <QueryClientProvider client={cli}>
    <QueryBasic />
  </QueryClientProvider>
);


// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
