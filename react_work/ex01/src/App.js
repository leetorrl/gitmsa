import { useState } from 'react';
import './App.css';
import Person from './components/Person';

//useState , useEffect

function App() {

  const [data,setData] = useState(0)
  const [age,setage] = useState(1)

  const doClick1 = ()=> {
    alert('Hello React!')
    console.log('butten clicked!')
    setData(data+1)
    
  }

  const doClick2 = ()=> {
    setage(age+10)
  }

  return (
    <div className="App">
      <Person name="홍길동" age={20}></Person>
      <Person name="박길동" age={30}></Person>
      <Person name="이길동" age={40}></Person>
     <Person></Person>

     <h1>안녕 REACT</h1> 
<p>d</p>
<h2>Count: {data}</h2>
<h3>age: {age}</h3>
<butten onClick={doClick1} >data 누름</butten>
<butten onClick={doClick2}>age 누름</butten>


    </div>
  );
}

export default App;
