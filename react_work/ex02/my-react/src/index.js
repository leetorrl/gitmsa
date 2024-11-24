import React from 'react';
import ReactDOM from 'react-dom/client';
import reportWebVitals from './reportWebVitals';
import './chap02/class.css'
import MyHello from './MyHello';
import EventBasic from './chap03/EventBasic';
import StateBasic from './chap03/StateBasic';
import books from './chap03/books';
import ForList from './chap03/ForList';
import ForNest from './chap03/ForNest';
import ForFilter from './chap03/ForFilter';
import ForSort from './chap03/ForSort';
import SelectStyle from './chap03/SelectStyle';
import StyledPanel from './chap03/Styledpanel';
import TitledPanel from './chap03/TitledPanel';
import Siderbar from './chap03/Siderbar';
import ListTemplate from './chap03/ListTemplate';
import { RouterProvider } from 'react-router-dom';
import routesBasic from './chap08/routesBasic';
import { BrowserRouter as Router, Routes, Route, useNavigate } from "react-router-dom";

const title = '모던 리액트 Deep Dive';
const root = ReactDOM.createRoot(document.getElementById('root'));

const name = '홍길동'
const content = '반응형?'
const dest = 'https://ko.react.dev'
const attrs = {
  href: 'https://wings.msn.to/',
  download: false,
  target: '_blank',
  rel: 'help'
};

const props = {
  color: 'White',
  'background-color' : 'Blue',
  //backgroundColor : 'Blue',
  padding: 3
  //padding: '3px'
}


root.render(

  
  // <TitledPanel>
  // <p key='title'>회원 모집 중!</p>
  // <p key='body'>위키북스 프로젝트에 오신 것을 환영합니다!!</p>
  // <div>
  // </div>
  // </ TitledPanel>
<>
<Router><Siderbar testnum={12} /></Router>


<ListTemplate src={books}>
  {elem => (
   <div>
     <dt>
      <a href={`https://wikibook.co.kr/images/cover/s/${elem.isbn}.jpg`}>
      {elem.title}({elem.price}원)
      </a>
     </dt>
     <dd>{elem.summary}</dd>
   </div>
  )}
  
  </ListTemplate>
 
  <MyHello />

<RouterProvider router={routesBasic} />

</>


 
);



const contentt = `<h3>WINGS 프로젝트</h3>
<img src="https://wings.msn.to/image/wings.jpg" />`;

setInterval(()=>{
  root.render(
    <>
    <p>Hello World!</p>
    <p>Hello React!</p>
    <p>안녕하세요, {name}입니다 !</p>
    <p>{tag}</p>
    <p>{input}<button onClick={aa}>딸깍</button> </p>
    <p>{'안녕하세요'}</p>
    <p>현재 시각: {(new Date()).toLocaleString()}</p>
<p dangerouslySetInnerHTML={{__html:contentt}}></p>

<div>{`Tom &amp; Jerry`}</div>
<div>Tom &amp; Jerry</div>
<div>{`Tom \u0026 Jerry`}</div>
<div>{`Tom ${String.fromCodePoint(38)} Jerry`}</div>
<div dangerouslySetInnerHTML={{__html:'Tom &amp; Jerry'}} />

<ul>
  <li>{true}</li>
  <li>{String(true)}</li>
  <li>{false}</li>
  <li>{undefined}</li>
  <li>{null}</li>
  <li>{0}</li>
</ul>

<a href={dest}>리액트 공식 홈페이지</a>
<br/>
<a href="{dest}">리액트 공식 홈페이지</a>
<br/>
<a href="{dest}/docs">리액트 공식 홈페이지</a>
<br/>
<a href={dest + `/docs`}>리액트 공식 홈페이지</a>
<br/>
<a href={attrs.href} download={attrs.download} target={attrs.target} rel={attrs.rel}>지원 페이지로 이동하기</a>
<br/>

<a href='index.html' download>맨 위로</a>
<br/>
<a href='index.html' download={true}>맨 위로</a>

<p style={props}>WINGS 프로젝트</p>
<br/>
<p className='foo'>WINGS 프로젝트</p>


<div className='main'>
  <p>{title} (김용찬 지음)</p>
  <img src="https://wikibook.co.kr/images/cover/s/9791158394646.jpg" alt={title} />
  절찬 판매 중!
</div>
<br/>

<MyHello myName={13}/>

<MyHello myName={['김철수', '이영희', '홍길동']} />
<MyHello myName={()=>{console.log('홍길동');}} />
  {/* <MyHello myName={{name: '홍길동', age: 48}}/> */}


<EventBasic type="time" />

<br/>

<StateBasic init={0}/>

<br/>
<ForList src={books}/>
<br/>
<ForNest src={books}/>
<br/>
<ForFilter src={books}/>
<br/>
<ForSort src={books}/>
<br/>
<SelectStyle mode="dark"/>

<br/>
<StyledPanel>
  <p>회원 모집 중!</p>
  <p>위키북스 프로젝트에 오신 것을 환영합니다!!</p>
  </StyledPanel>
<br/>

  </>    
 
  );
},100000)

const aa = ()=>{

  alert('ㅎㅇㅎㅇ')
 console.log(content)
}

const input=(
  <div className='field'>
<label htmlFor='title'>이름</label>
<input id='title' value={content} tabIndex="2" />
  </div>
)

const tag=(
  <ul>
    <li>React</li>
    <li>Vue.js</li>
    <li>Angular</li>
  </ul>
)

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
