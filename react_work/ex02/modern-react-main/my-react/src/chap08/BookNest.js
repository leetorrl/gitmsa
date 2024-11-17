import React from 'react';
import { NavLink, Outlet, useParams } from 'react-router-dom';
import books from '../chap08/books';

export function BookListPage() {
  return (
    <>
    {/* 책 제목 목록 보기 (키는 ISBN 코드) */}
    {books.map(b => (
      <React.Fragment key={b.isbn}>
        [<NavLink to={`/books/${b.isbn}`}>
          {b.title}</NavLink>]|
      </React.Fragment>
    ))}
    {/* 자식 경로를 표시하기 위한 영역 준비 */}
    <Outlet />
    </>
  );
}

export function BookDetailsPage() {
  const { isbn='979-1-1583-9517-9' } = useParams();
  // 루트 매개변수: isbn을 키로 도서 검색
  const book = books.find(b => isbn === b.isbn);

  return (
    <ul>
      <li>ISBN 코드:{book.isbn}</li>
      <li>도서명:{book.title}</li>
      <li>가격:{book.price}</li>
      <li>개요:{book.summary}</li>
    </ul>
  );
}