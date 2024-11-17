import React from 'react';
import logo from './logo.svg';
import './App.css';

// AppClass 컴포넌트 정의
class AppClass extends React.Component {
  // 렌더링할 내용 정의하기
  render() {
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
          Learn React
        </a>
      </header>
    </div>
    );
  }
}

// AppClass 컴포넌트 내보내기
export default AppClass;