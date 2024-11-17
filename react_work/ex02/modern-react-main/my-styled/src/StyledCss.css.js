import css from 'styled-jsx/css';

export default css`
.panel {
  width: 300px;
  padding: 10px;
  border: 1px solid #000;
  border-radius: 5px;
  background-color: royalblue;
  color: white;
}`;



// // 글로벌 스타일
// export const globalCss = css.global`
// h3 {
//   background-color: Yellow;
// }
// `;

// // 매립형 스타일
// export const resolveCss = css.resolve`
// .panel {
//   margin: 50px;
// }`;