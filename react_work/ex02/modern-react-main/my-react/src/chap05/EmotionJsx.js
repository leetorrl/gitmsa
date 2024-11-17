/** @jsxImportSource @emotion/react */
import { css } from '@emotion/react';

export default function EmotionJsx() {
  const styles = css`
    width: 300px;
    padding: 10px;
    border: 1px solid #000;
    border-radius: 5px;
    background-color: royalblue;
    color: white;
  `;

  return (
    <div css={styles}><b>Styled JSX</b>는 JSX 표현식에 스타일 정의를 삽입하는 형식의 라이브러리입니다.</div>
  );
}




// /** @jsxImportSource @emotion/react */
// import { css } from '@emotion/react';

// export default function EmotionJsx() {
//   const styles = css({
//     width: 300,
//     padding: 10,
//     border: '1px solid #000',
//     borderRadius: 5,
//     backgroundColor: 'royalblue',
//     color: 'white',
//   });

//   const others = css({
//     height: 150
//   });

//   return (
//     <div css={[styles, others]}><b>Styled JSX</b>는 JSX 표현식에 스타일 정의를 삽입하는 형식의 라이브러리입니다.</div>
//   );
// }



// /** @jsxImportSource @emotion/react */
// import { css } from '@emotion/react';

// export default function EmotionJsx() {
//   const styles = css({
//     width: 300,
//     padding: 10,
//     border: '1px solid #000',
//     borderRadius: 5,
//     backgroundColor: 'royalblue',
//     color: 'white',
//   });

//   const plus = css`
//     ${styles}
//     margin: 20px;
//   `;

//   return (
//     <div css={plus}><b>Styled JSX</b>는 JSX 표현식에 스타일 정의를 삽입하는 형식의 라이브러리입니다.</div>
//   );
// }