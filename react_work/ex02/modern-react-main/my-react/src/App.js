// 로고/스타일시트 가져오기
import logo from './logo.svg';
import './App.css';

// 앱 컴포넌트 정의
function App() {
  const attrs = {
    href: 'https://wings.msn.to/',
download: false,
target: '_blank',
rel: 'help'
};
  // 렌더링할 내용 생성
  return (
    <div className="App">
      <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        <p>
          Edit <code>src/App.js</code> and save to reload.
        </p>
        <a
          className="App-link"
          href="https://reactjs.org"
          target="_blank"
          rel="noopener noreferrer"
        >
          안녕, 리액트!!
        </a>
        <a href={attrs.href} download={attrs.download}
target={attrs.target} rel={attrs.rel}>지원 페이지로 이동하기</a>
      </header>
    </div>
  );
}

// 앱 컴포넌트 내보내기
export default App;