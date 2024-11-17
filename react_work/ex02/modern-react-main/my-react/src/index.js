// 리액트 관련 라이브러리 가져오기
import React, { Suspense } from 'react';
import ReactDOM from 'react-dom/client';
// 앱별 코드 가져오기
import './index.css';
import App from './App';
// 성능 모니터링을 위한 서비스 가져오기
import reportWebVitals from './reportWebVitals';

// ■■chap02■■
import AppClass from './AppClass';
import './chap02/class.css';

// // ■■chap03■■
// import MyHello from './chap03/MyHello';
// import EventBasic from './chap03/EventBasic';
// import StateBasic from './chap03/StateBasic';
// import books from './chap03/books';
// import ForList from './chap03/ForList';
// import ForNest from './chap03/ForNest';
// import ForFilter from './chap03/ForFilter';
// import ForSort from './chap03/ForSort';
// import SelectStyle from './chap03/SelectStyle';
// import StyledPanel from './chap03/StyledPanel';
// import TitledPanel from './chap03/TitledPanel';
// import ListTemplate from './chap03/ListTemplate';
// import TypeProp, { Member } from './chap03/TypeProp';
// import StateParent from './chap03/StateParent';
// import EventMouse from './chap03/EventMouse';
// import EventCompare from './chap03/EventCompare';
// import EventError from './chap03/EventError';
// import EventObj from './chap03/EventObj';
// import EventPoint from './chap03/EventPoint';
// import EventKey from './chap03/EventKey';
// import EventArgs from './chap03/EventArgs';
// import EventArgs2 from './chap03/EventArgs2';
// import EventPropagation from './chap03/EventPropagation';
// import EventOnce from './chap03/EventOnce';
// import EventPassive from './chap03/EventPassive';

// // ■■chap04■■
// import StateForm from './chap04/StateForm';
// import StateFormUC from './chap04/StateFormUC';
// import FormTextarea from './chap04/FormTextarea';
// import FormSelect from './chap04/FormSelect';
// import FormList from './chap04/FormList';
// import FormRadio from './chap04/FormRadio';
// import FormCheck from './chap04/FormCheck';
// import FormCheckMulti from './chap04/FormCheckMulti';
// import FormFile from './chap04/FormFile';
// import StateNest from './chap04/StateNest';
// import StateNestImmer from './chap04/StateNestImmer';
// import StateNestImmer2 from './chap04/StateNestImmer2';
// import StateTodo from './chap04/StateTodo';
// import FormBasic from './chap04/FormBasic';
// import FormYup from './chap04/FormYup';
// import FromKorean from './chap04/FromKorean';

// // // ■■chap05■■
// import LazyBasic from './chap05/LazyBasic';
// import LazyMulti from './chap05/LazyMulti';
// import SuspenseSimple from './chap05/SuspenseSimple';
// import SuspenseResult from './chap05/SuspenseResult';
// import ProfilerBasic from './chap05/ProfilerBasic';
// import StyledComp from './chap05/StyledComp';
// import { MyButton, MyStyledButton } from './chap05/StyledComp2';
// import StyledCommon from './chap05/StyledCommon';
// import GlobalStyle from './chap05/StyledGlobal';
// import StyledProps from './chap05/StyledProps';
// import EmotionJsx from './chap05/EmotionJsx';
// import EmotionComp from './chap05/EmotionComp';
// /** @jsxImportSource @emotion/react */
// import { css, Global } from '@emotion/react';
// import PortalBasic from './chap05/PortalBasic';
// import ErrorRoot from './chap05/ErrorRoot';
// import ErrorRetryRoot from './chap05/ErrorRetryRoot';
// import ErrorEventRoot from './chap05/ErrorEventRoot';

// // ■■chap06■■
// import MaterialBasic from './chap06/MaterialBasic';
// import MaterialDrawer from './chap06/MaterialDrawer';
// import MaterialGrid from './chap06/MaterialGrid';
// import { CssBaseline, ThemeProvider } from '@mui/material';
// import theme from './chap06/theme';
// import MaterialMode from './chap06/MaterialMode';
// import FormMui from './chap06/FormMui';
// import QueryPre from './chap06/QueryPre';
// import { QueryClient, QueryClientProvider } from 'react-query';
// import QueryBasic from './chap06/QueryBasic';
// import { ErrorBoundary } from 'react-error-boundary';
// import QuerySuspense from './chap06/QuerySuspense';

// // ■■chap07■■
// import StateEffect from './chap07/StateEffect';
// import HookTimer from './chap07/HookTimer';
// import HookEffect from './chap07/HookEffect';
// import HookRefNg from './chap07/HookRefNg';
// import HookRef from './chap07/HookRef';
// import HookRefForward from './chap07/HookRefForward';
// import HookCallbackRef from './chap07/HookCallbackRef';
// import HookReducer from './chap07/HookReducer';
// import HookReducerUp from './chap07/HookReducerUp';
// import HookReducerInit from './chap07/HookReducerInit';
// import HookContext from './chap07/HookContext';
// import MyThemeProvider from './chap07/MyThemeProvider';
// import HookThemeButton from './chap07/HookThemeButton';
// import { RecoilRoot } from 'recoil';
// import RecoilCounter from './chap07/RecoilCounter';
// import RecoilTodo from './chap07/RecoilTodo';
// import RecoilTodoUp from './chap07/RecoilTodoUp';
// import HookMemo from './chap07/HookMemo';
// import HookTransition from './chap07/HookTransition';
// import HookDeferred from './chap07/HookDeferred';
// import HookDeferredTransition from './chap07/HookDeferredTransition';
// import HookCustom from './chap07/HookCustom';

// // // ■■chap08■■
// // New Router
// import { RouterProvider } from 'react-router-dom';
// import routesBasic from './chap08/routesBasic';
// import routesLink from './chap08/routesLink';
// import routesParam from './chap08/routesParam';
// import routesHandle from './chap08/routesHandle';
// import { HelmetProvider } from 'react-helmet-async';
// import routesMyLink from './chap08/routesMyLink';
// import routesScroll from './chap08/routesScroll';

// ■■column■■
// import MyStore from './column/MyStore';
/* eslint-enable no-unused-vars */

const root = ReactDOM.createRoot(document.getElementById('root'));


// #region ■■chap02■■

// 리액트 앱(App 컴포넌트) 그리기
root.render(
  <React.StrictMode>
    <App />
  </React.StrictMode>
);



// Code 2-2-4
// setInterval(() => {
//   root.render(
//     <p>현재 시각: {(new Date()).toLocaleString()}</p>
//   );;
// }, 1000);

// root.render(
//   <React.StrictMode>
//     <AppClass />
//   </React.StrictMode>
// );



// Code 2-3-1
// root.render(
//   <p>Hello, World!</p>
//   <p>Hello, React!!</p>
// );



// Code 2-3-2
// root.render(
//   <div>
//     <p>Hello, World!</p>
//     <p>Hello, React!!</p>
//   </div>
// );

// root.render(
//   <React.Fragment>
//     <p>Hello, World!</p>
//     <p>Hello, React!!</p>
//   </React.Fragment>
// );

// root.render(
//   <>
//     <p>Hello, World!</p>
//     <p>Hello, React!!</p>
//   </>
// );

// const tag = <img src={image}>;
// const tag = <img src={image}/>;

// const input = (
//   <div className="field">
//     <label htmlFor="title">이름</label>
//     <input id="title" tabIndex="2" />
//   </div>
// );

// const tag = (
//   // 주석이다 (JSX 식이 아니므로 OK)
//   <ul>
//     {/* 주석이다. */}
//     <li // 태그 내에서는 OK
//       >React</li>
//     <li /*
//       이것도 괜찮다
//     */>Vue.js</li>
//     // 자모 요소에서 '//' '//' '/*~*/'은 안 됨
//     <li>Angular</li>
//   </ul>
// );



// Code 2-3-2
// const name = '홍길동';
// root.render(
//   <p>안녕하세요, {name}입니다！</p>
// );



// Code 2-3-3
// JSX 표현식이 아닌 단순한 문자열 리터럴
// const content = `<h3>WINGS 프로젝트</h3>
//   <img src="https://wings.msn.to/image/wings.jpg" />`;
// root.render(
//   <p>{content}</p>
// );

// const content = `<h3>WINGS 프로젝트</h3>
//   <img src="https://wings.msn.to/image/wings.jpg" />`;
// root.render(
//   <p dangerouslySetInnerHTML={{__html: content}}></p>
// );



// Code 2-3-4
// root.render(
//   <div>{'Tom &amp; Jerry'}</div>
// );

// root.render(
//   <div>Tom &amp; Jerry</div>
// );

// root.render(
//   <>
//     <div>{'Tom \u0026 Jerry'}</div>
//     <div>{`Tom ${String.fromCodePoint(38)} Jerry`}</div>
//     <div dangerouslySetInnerHTML={{__html: 'Tom &amp; Jerry'}} />
//   </>
// );



// Code 2-3-5
// root.render(
//   <ul>
//     <li>{true}</li>
//     <li>{false}</li>
//     <li>{undefined}</li>
//     <li>{null}</li>
//     <li>{0}</li>
//     <li>{String(true)}</li>
//   </ul>
// );



// Code 2-3-6
// const dest = 'https://ko.react.dev';
// root.render(
//   <>
//     <a href={dest}>리액트 공식 홈페이지</a> <br />
//     <a href="{dest}">리액트 공식 홈페이지</a> <br />
//     <a href="{dest}/docs">리액트 공식 홈페이지</a> <br />
//     <a href={dest + '/docs'}>리액트 공식 홈페이지</a>
//   </>
// );



// Code 2-3-7
// 좋지 않은 예
// const attrs = {
//   href: 'https://wings.msn.to/',
//   download: false,
//   target: '_blank',
//   rel: 'help'
// };

// root.render(
//   <a href={attrs.href} download={attrs.download}
//     target={attrs.target} rel={attrs.rel}>지원 페이지로 이동하기</a>
// );

// root.render(
//   <a {...attrs}>지원 페이지로 이동하기</a>
// );

// root.render(
//   <>
//     <a href="index.html" download>맨 위로</a>
//     <a href="index.html" download={true}>맨 위로</a>
//   </>
// );



// Code 2-3-8
// const props = 'color: White; background-color: Blue; padding: 3px';

// root.render(
//   <p style={props}>WINGS 프로젝트</p>
// );

// const props = {
//   color: 'White',
//   backgroundColor: 'Blue',　
//   padding: 3　
// };

// root.render(
//   <p style={props}>WINGS 프로젝트</p>
// );

// const props = {
//   color: 'White',
//   'background-color': 'Blue',
//   padding: 3
// };

// root.render(
//   <p style={props}>WINGS 프로젝트</p>
// );



// Code 2-3-9
// import './chap02/class.css';

// root.render(
//   <p className="foo">WINGS 프로젝트</p>
// );



// Code 2-3-11
// const title = '모던 리액트 Deep Dive';

// root.render(
//   <div className="main">
//     <p>≪{title}≫ （김용찬 지음）</p>
//     <img src="https://wikibook.co.kr/images/cover/m/9791158394646.png"
//       alt={title} />
//     절찬 판매 중!
//   </div>
// );

// root.render(
//   // 상위 <div> 요소 생성
//   React.createElement(
//     'div',
//     { className: 'main' },
//     // 자식 요소 <p>, <img>, 텍스트 열거
//     React.createElement(
//       'p',
//       null,　// 속성은 생략
//       `≪${title}≫ （김용찬 지음）`
//     ),
//     React.createElement(
//       'img',
//       {
//         src: 'https://wikibook.co.kr/images/cover/m/9791158394646.png',
//         alt: title
//       }
//     ),
//     '절찬 판매 중！'
//   )
// );

// #endregion

// #region ■■chap03■■

// Code 3-1-2
// root.render(
//   <MyHello myName="홍길동" />
// );

// root.render(
//   <MyHello myName={13} />
// );

// root.render(
//   <>
//     <MyHello myName={['야마다', '스즈키', '사토']} />
//     <MyHello myName={() => { console.log('foo'); }} />
//     <MyHello myName={{ name: '스즈키', age: 48 }} />
//   </>
// );



// Code 3-1-5
// root.render(
//   <EventBasic type="time" />
// );

// root.render(
//   <EventBasic type="time" />
// );
  


// Code 3-1-7
// root.render(
//   <StateBasic init={0} />
// );



// Code 3-2-3
// root.render(
//   <ForList src={books} />
// );



// Code 3-2-7
// root.render(
//   <ForNest src={books} />
// );



// Code 3-2-9
// root.render(
//   <ForFilter src={books} />
// );



// Code 3-2-11
// root.render(
//   <ForSort src={books} />
// );


// root.render(
//   <ForNest src={books} />
// );



// Code 3-2-18
// root.render(
//   <SelectStyle mode="light" />
// );



// Code 3-3-2
// root.render(
//   <StyledPanel>
//     <p>회원 모집 중!</p>
//     <p>위키북스 프로젝트에 오신 것을 환영합니다！!</p>
//   </StyledPanel>
// );

// root.render(
//   <StyledPanel>
//     <MyHello myName="홍길동" />
//   </StyledPanel>
// );
  
  

// Code 3-3-4
// root.render(<TitledPanel
//   title={
//     <p>회원 모집 중!</p>
//   }
//   body={
//     <p>위키북스 프로젝트에 오신 것을 환영합니다！!</p>
//   }>
//   </TitledPanel>
// );



// // Code 3-3-5
// const title = <p>회원 모집 중!</p>;
// const body = <p>위키북스 프로젝트에 오신 것을 환영합니다!！</p>;
// root.render(
//   <TitledPanel title={title} body={body}></TitledPanel>
// );



// // Code 3-3-7
// root.render(
//   <TitledPanel>
//     <p key="title">회원 모집 중!</p>
//     <p key="body">위키북스 프로젝트에 오신 것을 환영합니다!！</p>
//   </TitledPanel>
// );



// Cod 3-3-9
// root.render(
//   <ListTemplate src={books}>
//   { elem => (
//     <>
//       <dt>
        // <a href={`https://wikibook.co.kr/images/cover/s/${elem.isbn}.jpg`}>
        //     {elem.title}（{elem.price}원）
//         </a>
//       </dt>
//       <dd>{elem.summary}</dd>
//     </>
//   )}
//   </ListTemplate>
// );



// Cod 3-3-10
// root.render(
//   <ListTemplate src={books}>
//     {elem => (
//     <>
//       <dt>
//         <a href={`https://wikibook.co.kr/images/cover/s/${elem.isbn}.jpg`}>
//             {elem.title}（{elem.price}원）
//         </a>
//       </dt>
//       <dd>{elem.summary}</dd>
//     </>
//   )}
//   </ListTemplate>
// );



// Cod 3-3-13
// root.render(
//   // render 속성으로 렌더 함수를 전달한다.
//   <ListTemplate src={books} render={ elem => (
//     <>
//       <dt>
//         <a href={`https://wikibook.co.kr/images/cover/s/${elem.isbn}.jpg`}>
//           {elem.title}（{elem.price}원）
//         </a>
//       </dt>
//       <dd>{elem.summary}</dd>
//     </>
//   )}/>
// );



// Code 3-3-15
// root.render(
//   <MyHello />
// );



// Code 3-3-17
// （1）PropTypes.instanceOf
// root.render(
//   // 올바른 예
//   // <TypeProp prop1={new Member()} />
//   // 잘못된 예
//   <TypeProp prop1="foo" />
// );
// // 결과: Warning: Failed prop type: Invalid prop `prop1` of type `String` supplied to `TypeProp`, expected instance of `Member`.



// Code 3-3-19
// （2）PropTypes.oneOf
// root.render(
//   // 올바른 예
//   // <TypeProp prop2="남성" />
//   // 잘못된 예
//   <TypeProp prop2="foo" />
// );
// // 결과: Warning: Failed prop type: Invalid prop `prop2` of value `foo` supplied to `TypeProp`, expected one of ["남성","여성","기타"].



// Code 3-3-21
// （3）PropTypes.oneOfType
// root.render(
//   // 올바른 예
//   // <TypeProp prop3="홍길동" />
//   // 잘못된 예
//   <TypeProp prop3={new Member()} />
// );
// // 결과: Warning: Failed prop type: Invalid prop `prop3` supplied to `TypeProp`, expected one of type [string, number, boolean].



// Code 3-3-23
// （4）PropTypes.arrayOf
// root.render(
//   // 올바른 예
//   // <TypeProp prop4={[15, 30]} />
//   // 잘못된 예 
//   <TypeProp prop4={[333, '홍길동']} />
// );
// // 결과: Warning: Failed prop type: Invalid prop `prop4[1]` of type `string` supplied to `TypeProp`, expected `number`.


// Code 3-3-25
// （5）ProtoTypes.objectOf
// root.render(
//   // 올바른 예
//   // <TypeProp prop5={{ '홍길동': 15, '이순신': 30 }} />
//   // 잘못된 예 
//   <TypeProp prop5={{ '홍길동': 15, '이순신': '삼십' }} />
// );
// // 결과: Warning: Failed prop type: Invalid prop `prop5.이순신` of type `string` supplied to `TypeProp`, expected `number`.



// Code 3-3-27
// （6）PropTypes.shape
// root.render(
//   // 올바른 예
//   // <TypeProp prop6={{ name: '홍길동', age: 35, sex: '남성', blood: 'A' }} />
//   // 잘못된 예
//   <TypeProp prop6={{ age: 35, sex: '남성' }} />
// );
// // 결과: Warning: Failed prop type: The prop `prop6.name` is marked as required in `TypeProp`, but its value is `undefined`.

// （7）PropTypes.exact
// root.render(
//   <TypeProp prop7={{ name: '홍길동', age: 35, sex: '남성', blood: 'A' }} />
// );



// Code 3-3-28
// root.render(
//   <StateBasic init={0} />
// );



// Code 3-3-31
// root.render(
//   <StateParent />
// );


// Code 3-4-2
// root.render(
//   <EventMouse
//     alt="로고 이미지"
//     beforeSrc="https://www.web-deli.com/image/linkbanner_l.gif"
//     afterSrc="https://www.web-deli.com/image/home_chara.gif" />
// );



// Code 3-4-5
// root.render(
//   <EventCompare />
// );



// Code 3-4-5
// root.render(
//   <EventError src="./image/wings.jpg"
//     alt="샘플 이미지" />
// );



// Code 3-4-9
// root.render(
//   <EventObj />
// );



// Code 3-4-12
// root.render(
//   <EventPoint />
// );



// Code 3-4-14
// root.render(
//   <EventKey />
// );



// Code 3-4-16
// root.render(
//   <EventArgs />
// );



// Code 3-4-18
// root.render(
//   <EventArgs2 />
// );



// Code 3-4-21
// root.render(
//   <EventPropagation />
// );



// Code 3-4-23
// root.render(
//   <EventOnce />
// );


// Code 3-4-26
// root.render(
//   <EventPassive />
// );

// #endregion

// #region ■■chap04■■

// Code 4-1-2
// root.render(
//   <StateForm />
// );



// Code 4-1-4
// root.render(
//   <StateFormUC />
// );



// Code 4-1-6
// root.render(
//   <FormTextarea />
// );



// Code 4-1-8
// root.render(
//   <FormSelect />
// );



// Code 4-1-10
// root.render(
//   <FormList />
// );



// Code 4-1-12
// root.render(
//   <FormRadio />
// );



// Code 4-1-12
// root.render(
//   <FormCheck />
// );



// Code 4-1-16
// root.render(
//   <FormCheckMulti />
// );



// Code 4-1-18
// root.render(
//   <FormFile />
// );



// Code 4-2-2
// root.render(
//   <StateNest />
// );



// Code 4-2-4
// root.render(
//   <StateNestImmer />
// );



// Code 4-2-6
// root.render(
//   <StateNestImmer2 />
// );



// Code 4-2-8
// root.render(
//   <StateTodo />
// );



// Code 4-3-2
// root.render(
//   <FormBasic />
// );



// Code 4-3-7
// root.render(
//   <FormYup />
// );



// Code 4-3-13
// root.render(
//   <FromKorean />
// );
// #endregion

// #region ■■chap05■■
// Code 5-1-2
// root.render(
//   <LazyBasic />
// );



// Code 5-1-4
// root.render(
//   <LazyMulti />
// );



// Code 5-1-7
// root.render(
//   <SuspenseSimple />
// );


// Code 5-1-12
// root.render(
//   <SuspenseResult />
// );



// Code 5-1-15
// root.render(
//   <ProfilerBasic />
// );



// Code 5-2-14
// root.render(
//   <StyledComp />
// );


// Code 5-2-16
// root.render(
//   <>
//     <MyButton>버튼</MyButton>
//     <MyStyledButton>버튼</MyStyledButton>
//   </>
// );



// 5-2-19
// root.render(
//   <StyledCommon />
// );



// Code 5-2-19
// root.render(
//   <>
//     <GlobalStyle />
//     <StyledComp />
//   </>
// );



// Code 5-2-23
// root.render(
//   <StyledProps />
// );


// Code 5-2-25
// root.render(
//   <EmotionJsx />
// );



// Cod 5-2-27
// root.render(
//   <EmotionComp />
// );



// Code 5-2-28
// const global = css`
//   body {
//     background-color: Yellow;
//   }
// `;

// root.render(
//   <>
//     <Global styles={global} />
//     <EmotionJsx />
//   </>
// );



// Code 5-3-3
// root.render(
//   <>
//     <div id="dialog"></div>
//     <PortalBasic />
//   </>
// );



// Code 5-3-6
// root.render(
//   <ErrorRoot />
// );



// Code 5-3-9
// root.render(
//   <ErrorRetryRoot />
// );



// Code 5-3-14
// root.render(
//   <ErrorEventRoot />
// );
// #endregion

// #region ■■chap06■■
// Code 6-1-2
// root.render(
//   <MaterialBasic />
// );



// Code 6-1-5
// root.render(
//   <MaterialDrawer />
// );



// Code 6-1-7
// root.render(
//   <MaterialGrid />
// );



// Code 6-1-10
// root.render(
//   <ThemeProvider theme={theme}>
//     <CssBaseline />
//     <MaterialBasic />
//   </ThemeProvider>
// );



// Code 6-1-12
// root.render(
//   <MaterialMode />
// );



// Code 6-1-15
// root.render(
//   <FormMui />
// );



// Code 6-3-2
// root.render(
//   <QueryPre />
// );



// Code 6-3-4
// const cli = new QueryClient();
// root.render(
//   <QueryClientProvider client={cli}>
//     <QueryBasic />
//   </QueryClientProvider>
// );



// Code 6-3-6
// Suspense 모드 활성화
// const cli = new QueryClient({
//   defaultOptions: {
//     queries: {
//       suspense: true,
//     },
//   },
// });

// root.render(
//   <Suspense fallback={<p>Loading...</p>}>
//     <ErrorBoundary fallback={<div>오류가 발생했습니다.</div>}>
//       <QueryClientProvider client={cli}>
//         <QuerySuspense />
//       </QueryClientProvider>
//     </ErrorBoundary>
//   </Suspense>
// );
// #endregion

// #region ■■chap07■■

// Code 7-1-2
// root.render(
//   <StateEffect init={0} />
// );



// Code 7-1-5
// root.render(
//   <HookTimer init={10} />
// );



// Code 7-1-7
// root.render(
//   <HookEffect init={10} />
// );



// Code 7-2-2
// root.render(
//   <HookRefNg />
// );



// Code 7-2-4
// root.render(
//   <HookRef />
// );



// Code 7-2-7
// root.render(
//   <HookRefForward />
// );



// Code 7-2-11
// root.render(
//   <HookCallbackRef />
// );



// Code 7-3-2
// root.render(
//   <HookReducer init={0} />
// );



// Code 7-3-4
// root.render(
//   <HookReducerUp init={0} />
// );



// Code 7-3-6
// root.render(
//   <HookReducerInit init={0} />
// );



// Code 7-4-3
// root.render(
//   <HookContext />
// );


// Code 7-4-6
// root.render(
//   <MyThemeProvider>
//     <HookThemeButton />
//   </MyThemeProvider>
// );



// Code 7-5-3
// root.render(
//   <RecoilRoot>
//     <RecoilCounter />
//   </RecoilRoot>
// );



// Code 7-5-6
// root.render(
//   <RecoilRoot>
//     <RecoilTodo />
//   </RecoilRoot>
// );



// Code 7-5-9
// root.render(
//   <RecoilRoot>
//     <RecoilTodoUp />
//   </RecoilRoot>
// );



// Code 7-6-3
// root.render(
//   <HookMemo />
// );



// Code 7-7-3
// root.render(
//   <HookTransition />
// );



// Code 7-7-8
// root.render(
//   <HookDeferred />
// );



// Code 7-7-10
// root.render(
//   <HookDeferredTransition />
// );



// Code 7-8-3
// root.render(
//   <HookCustom />
// );
// #endregion

// #region ■■chap08■■

// Code 8-1-2
// 리액트 라우터 활성화
// root.render(
//   <RouterProvider router={routesBasic} />
// );



// Code 8-2-3
// root.render(
//   <RouterProvider router={routesLink} />
// );



// Code 8-3-2
// root.render(
//   <RouterProvider router={routesParam} />
// );



// Code 8-3-23
// root.render(
//   <HelmetProvider>
//     <RouterProvider router={routesHandle} />
//   </HelmetProvider>
// );



// Code 8-4-2 (8-3-2)
// root.render(
//   <RouterProvider router={routesParam} />
// );



// Code 8-5-4
// root.render(
//   <RouterProvider router={routesMyLink} />
// );



// Code 8-5-8
// root.render(
//   <RouterProvider router={routesScroll} />
// );
// #endregion

// #region ■■column■■
// root.render(
//   <MyStore />
// );
// #endregion



// 성능 모니터링 도구 활성화
reportWebVitals();
// reportWebVitals(console.log);

