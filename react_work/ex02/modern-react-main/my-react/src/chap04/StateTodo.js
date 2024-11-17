// Code 4-2-7
import { useState } from 'react';

// Todo 항목 id의 최대값(등록할 때마다 증가)
let maxId = 0;
export default function StateTodo() {
  // 입력값(title), 할 일 목록(todo)을 State로 관리
  const [title, setTitle] = useState('');
  const [todo, setTodo] = useState([]);

  // 텍스트 상자에 입력한 내용을 State에 반영
  const handleChangeTitle = e => {
    setTitle(e.target.value);
  };

  const handleClick = () => {
    // 새 할 일 추가하기
    setTodo([
      ...todo,
      {
        id: ++maxId, // id 값
        title, // Todo 본체
        created: new Date(), // 생성 날짜 및 시각
        isDone: false // 실행 완료?
      }
    ]);
  };

  return (
    <div>
      <label>
        해야 할 일:
        <input type="text" name="title"
          value={title} onChange={handleChangeTitle} />
      </label>
      <button type="button"
        onClick={handleClick}>추가하기</button>
      <hr />
      {/* 할 일을 목록으로 정리하기 */}
      <ul>
        {todo.map(item => (
          <li key={item.id}>{item.title}</li>
          ))}
      </ul>
    </div>
  );
}



// Code 4-2-9
// import { useState } from 'react';
// import './StateTodo.css';

// let maxId = 0;
// export default function StateTodo() {
//   // 입력값(title), 할 일 목록(todo)을 State로 관리
//   const [title, setTitle] = useState('');
//   const [todo, setTodo] = useState([]);

//   // 텍스트 상자에 입력한 내용을 State에 반영
//   const handleChangeTitle = e => {
//     setTitle(e.target.value);
//   };

//   const handleClick = () => {
//     // 새 할 일 추가하기
//     setTodo([
//       ...todo,
//       {
//         id: ++maxId, // id 값
//         title, // Todo 본체
//         created: new Date(), // 생성 날짜 및 시각
//         isDone: false // 실행 완료?
//       }
//     ]);
//   };

//   // [완료] 버튼으로 Todo 항목을 완료 상태로 변경
//   const handleDone = e => {
//     // todo 배열을 스캔하여 id 값이 같은 것을 검색한다.
//     setTodo(todo.map(item => {
//       if (item.id === Number(e.target.dataset.id)) {
//         return {
//           ...item,
//           isDone: true
//         };
//       } else {
//         return item;
//       }
//     }));
//   };

//   return (
//     <div>
//       <label>
//         해야 할 일:
//         <input type="text" name="title"
//           value={title} onChange={handleChangeTitle} />
//       </label>
//       <button type="button"
//         onClick={handleClick}>추가하기</button>
//       {/* 할 일을 목록으로 정리하기 */}
      
//       <ul>
//         {todo.map(item => (
//           <li key={item.id}
//             className={item.isDone ? 'done' : ''}>
//             {item.title}
//             <button type="button"
//               onClick={handleDone} data-id={item.id}>완료
//             </button>
//           </li>
//         ))}
//       </ul>
//     </div>
//   );
// }



// Code 4-2-11
// import { useState } from 'react';
// import './StateTodo.css';

// let maxId = 0;
// export default function StateTodo() {
//   // 입력값(title), 할 일 목록(todo)을 State로 관리
//   const [title, setTitle] = useState('');
//   const [todo, setTodo] = useState([]);

//   // 텍스트 상자에 입력한 내용을 State에 반영
//   const handleChangeTitle = e => {
//     setTitle(e.target.value);
//   };

//   const handleClick = () => {
//     // 새 할 일 추가하기
//     setTodo([
//       ...todo,
//       {
//         id: ++maxId, // id 값
//         title, // Todo 본체
//         created: new Date(), // 생성 날짜 및 시각
//         isDone: false // 실행 완료?
//       }
//     ]);
//   };

//   // [완료] 버튼으로 Todo 항목을 완료 상태로 변경
//   const handleDone = e => {
//     // todo 배열을 스캔하여 id 값이 같은 것을 검색한다.
//     setTodo(todo.map(item => {
//       if (item.id === Number(e.target.dataset.id)) {
//         return {
//           ...item,
//           isDone: true
//         };
//       } else {
//         return item;
//       }
//     }));
//   };

//   // [삭제] 버튼으로 해당 Todo 항목을 삭제한다.
//   const handleRemove = e => {
//     setTodo(todo.filter(item =>
//       item.id !== Number(e.target.dataset.id)
//     ));
//   };

//   return (
//     <div>
//       <label>
//         해야 할 일:
//         <input type="text" name="title"
//           value={title} onChange={handleChangeTitle} />
//       </label>
//       <button type="button"
//         onClick={handleClick}>추가하기</button>
//       <hr />
//       {/* 할 일을 목록으로 정리하기 */}
      
//       <ul>
//         {todo.map(item => (
//           <li key={item.id}
//             className={item.isDone ? 'done' : ''}>
//             {item.title}
//             <button type="button"
//               onClick={handleDone} data-id={item.id}>완료
//             </button>
//             <button type="button"
//               onClick={handleRemove} data-id={item.id}>삭제
//             </button>
//           </li>
//         ))}
//       </ul>
//     </div>
//   );
// }



// Code 4-2-12
// import { useState } from 'react';
// import './StateTodo.css';

// let maxId = 0;
// export default function StateTodo() {
//   // 다음 정렬 방향 (내림차순인 경우 true)
//   const [desc, setDesc] = useState(true);
//   // 입력값(title), 할 일 목록(todo)을 State로 관리
//   const [title, setTitle] = useState('');
//   const [todo, setTodo] = useState([]);

//   // 텍스트 상자에 입력한 내용을 State에 반영
//   const handleChangeTitle = e => {
//     setTitle(e.target.value);
//   };

//   const handleClick = () => {
//     // 새 할 일 추가하기
//     setTodo([
//       ...todo,
//       {
//         id: ++maxId, // id 값
//         title, // Todo 본체
//         created: new Date(), // 생성 날짜 및 시각
//         isDone: false // 실행 완료?
//       }
//     ]);
//   };

//   // [완료] 버튼으로 Todo 항목을 완료 상태로 변경
//   const handleDone = e => {
//     // todo 배열을 스캔하여 id 값이 같은 것을 검색한다.
//     setTodo(todo.map(item => {
//       if (item.id === Number(e.target.dataset.id)) {
//         return {
//           ...item,
//           isDone: true
//         };
//       } else {
//         return item;
//       }
//     }));
//   };

//   // [삭제] 버튼으로 해당 Todo 항목을 삭제한다.
//   const handleRemove = e => {
//     setTodo(todo.filter(item =>
//       item.id !== Number(e.target.dataset.id)
//     ));
//   };

//   const handleSort = e => {
//     // 기존 Todo 목록을 복제하여 정렬하기
//     const sorted = [...todo];
//     sorted.sort((m, n) => {
//       // desc 값에 따라 오름차순/내림차순 결정
//       if (desc) {
//         return n.created.getTime() - m.created.getTime();
//       } else {
//         return m.created.getTime() - n.created.getTime();
//       }
//     });
//     // desc 값 반전
//     setDesc(d => !d);
//     // 정렬된 목록 재설정
//     setTodo(sorted);
//   };

//   return (
//     <div>
//       <label>
//         해야 할 일:
//         <input type="text" name="title"
//           value={title} onChange={handleChangeTitle} />
//       </label>
//       <button type="button"
//         onClick={handleClick}>추가하기</button>
//       {/* desc 값에 따라 캡션 변경 */}
//       <button type="button"
//         onClick={handleSort}>
//          정렬({desc ? '↑' : '↓'})</button>
//       <hr />

//       {/* 할 일을 목록으로 정리하기 */}
//       <ul>
//         {todo.map(item => (
//           <li key={item.id}
//             className={item.isDone ? 'done' : ''}>
//             {item.title}
//             <button type="button"
//               onClick={handleDone} data-id={item.id}>완료
//             </button>
//             <button type="button"
//               onClick={handleRemove} data-id={item.id}>삭제
//             </button>
//           </li>
//         ))}
//       </ul>
//     </div>
//   );
// }