import Download from './Download';

export default function ForItem({ book }) {
  return (
    <>
      <dt>
        <a href={`https://wikibook.co.kr/images/cover/s/${book.isbn}.jpg`}>
            {book.title}（{book.price}원）
        </a>
      </dt>
      <dd>{book.summary}</dd>
    </>
  );
}



// Code 3-2-13
// if 문
// export default function ForItem({ book }) {
//   let dd;
//   // download 속성의 유무에 따라 태그를 분기한다.
//   if (book.download) {
//     dd = <dd>{book.summary}<Download slug={book.slug} /></dd>;
//   } else {
//     dd = <dd>{book.summary}</dd>;
//   }
//   return (
//   <>
//     <dt>
//     <a href={`https://wikibook.co.kr/images/cover/s/${book.isbn}.jpg`}>
//       {book.title}（{book.price}원）
//     </a>
//     </dt>
//     {/* 생성해둔 태그 삽입 */}
//     {dd}
//   </>
//   );
// }



// Code 3-2-14
// 즉시 함수
// export default function ForItem({ book }) {
//   return (
//   <>
//     <dt>
//     <a href={`https://wikibook.co.kr/images/cover/s/${book.isbn}.jpg`}>
//       {book.title}（{book.price}원）
//     </a>
//     </dt>
//     {(() => {
//       if (book.download) {
//         return <dd>{book.summary}<Download slug={book.slug} /></dd>
//       } else {
//         return <dd>{book.summary}</dd>
//       }
//     })()}
//   </>
//   );
// }



// Code 3-2-15
// ?:, && 연산자
// export default function ForItem({ book }) {
//   return (
//   <>
//     <dt>
//     <a href={`https://wikibook.co.kr/images/cover/s/${book.isbn}.jpg`}>
//       {book.title}（{book.price}원）
//     </a>
//     </dt>
//     <dd>
//       {book.summary}
//       {book.download ? <Download isbn={book.isbn} /> : null}
//       {/* {book.download && <Download isbn={book.isbn} />} */}
//       {/* {book.download || '×' } */}
//     </dd>
//   </>
//   );
// }