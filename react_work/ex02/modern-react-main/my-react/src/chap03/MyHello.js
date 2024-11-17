import PropTypes from 'prop-types';

// Code 3-1-1
// export default function MyHello(props) {
//   return (
//     <div>안녕하세요, {props.myName}님!</div>
//   );
// }



// Code 3-1-3
// export default function MyHello({ myName }) {
//   return (
//     <div>안녕하세요, {myName}님!</div>
//   );
// }

// export default function MyHello({ myName = '김철수' }) {
//   return (
//     <div>안녕하세요, {myName}님!</div>
//   );
// }



// Code 3-3-14
// PropTypes 가져오기
function MyHello(props) {
  return (
    <div>안녕하세요, {props.myName}님!</div>
  );
}

// 타입 정보 선언
MyHello.propTypes = {
  myName: PropTypes.string.isRequired
};

export default MyHello;