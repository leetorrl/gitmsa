import { useRecoilState, useRecoilValue } from 'recoil';
import { useState } from 'react';
import { todoAtom, todoLastIdSelector } from '../store/atom';
import '../chap04/StateTodo.css';

export default function RecoilTodo() {
  const [title, setTitle] = useState('');
  // 할 일 목록, 최대 id 값은 각각 Recoil에서 가져온다.
  const [todo, setTodo] = useRecoilState(todoAtom);
  const maxId = useRecoilValue(todoLastIdSelector);

  const handleChangeTitle = e => setTitle(e.target.value);
  // [추가] 버튼으로 할 일 항목 추가하기
  const handleAdd = () => {
    setTodo([
      ...todo,
      {
        id: maxId + 1,
        title,
        isDone: false
      }
    ]);
  };
  // [완료] 버튼으로 할 일 항목을 작업 완료로 표시
  const handleDone = e => {
    setTodo(todo.map(item => {
      if (item.id === Number(e.target.dataset.id)) {
        return {
          ...item,
          isDone: true
        };
      } else {
        return item;
      }
    }));
  };
  // [삭제] 버튼으로 할 일 항목 삭제하기
  const handleRemove = e => {
    setTodo(todo.filter(item =>
      item.id !== Number(e.target.dataset.id)
    ));
  };

  return (
    <div>
      <label>
        할 일:
        <input type="text" name="todo"
          value={title} onChange={handleChangeTitle} />
      </label>
      <button type="button"
        onClick={handleAdd}>추가하기</button>
      <hr />
      <ul>
        {/* 할 일 목록을 순서대로 출력 */}
        {todo.map(item => (
          <li key={item.id}
            className={item.isDone ? 'done' : ''}>
            {item.title}
            <button type="button"
              onClick={handleDone} data-id={item.id}>완료
            </button>
            <button type="button"
              onClick={handleRemove} data-id={item.id}>삭제
            </button>
          </li>
        ))}
      </ul>
    </div>
  );
}