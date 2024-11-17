import '../stories/button.css';

export default function MyButton ({
    primary = false,
    backgroundColor = null,
    size = 'medium',
    label = 'Button',
    ...props
  }) {
  // primary 속성에 따라 스타일 클래스 결정
  const mode = primary ?
    'storybook-button--primary' : 'storybook-button--secondary';
  return (
    // Props를 기반으로 button 요소를 조립
    <button
      type="button"
      className={['storybook-button', `storybook-button--${size}`, mode].join(' ')}
      style={backgroundColor && { backgroundColor }}
      {...props}
    >
      {label}
    </button>
  );
};



// Code 6-2-6
// import PropTypes from 'prop-types';
// import '../stories/button.css';

// /**
//  * 속성 설정에 따라 다양한 버튼 생성
//  */
// export default function MyButton ({
//     primary = false,
//     backgroundColor = null,
//     size = 'medium',
//     label = 'Button',
//     ...props
//   }) {
//   // primary 속성에 따라 스타일 클래스 결정
//   const mode = primary ?
//     'storybook-button--primary' : 'storybook-button--secondary';
//   return (
//     // Props를 기반으로 button 요소를 조립
//     <button
//       type="button"
//       className={['storybook-button', `storybook-button--${size}`, mode].join(' ')}
//       style={backgroundColor && { backgroundColor }}
//       {...props}
//     >
//       {label}
//     </button>
//   );
// };

// // Props의 타입 정보 선언
//   /**
//    * Primary 색상 활성화 여부
//    */
// MyButton.propTypes = {
//   primary: PropTypes.bool,
//   /**
//    * 배경색
//    */
//   backgroundColor: PropTypes.string,
//   /**
//    * 버튼 크기
//    */
//   size: PropTypes.oneOf(['small', 'medium', 'large']),
//   /**
//    * 버튼 캡션
//    */
//   label: PropTypes.string.isRequired,
//   /**
//    * 클릭 핸들러
//    */
//   onClick: PropTypes.func,
// };



// Code 6-2-10
// import PropTypes from 'prop-types';
// import '../stories/button.css';

// /**
//  * 속성 설정에 따라 다양한 버튼 생성
//  */
// export default function MyButton ({
//     primary = false,
//     backgroundColor = null,
//     size = 'medium',
//     label = 'Button',
//     handleClick,
//     ...props
//   }) {
//   // primary 속성에 따라 스타일 클래스 결정
//   const mode = primary ?
//     'storybook-button--primary' : 'storybook-button--secondary';
//   return (
//     // Props를 기반으로 button 요소를 조립
//     <button
//       type="button"
//       className={['storybook-button', `storybook-button--${size}`, mode].join(' ')}
//       style={backgroundColor && { backgroundColor }}
//       onClick={handleClick}
//       {...props}
//     >
//       {label}
//     </button>
//   );
// };

// // Props의 타입 정보 선언
// MyButton.propTypes = {
//   /**
//    * Primary 색상 활성화 여부
//    */
//   primary: PropTypes.bool,
//   /**
//    * 배경색
//    */
//   backgroundColor: PropTypes.string,
//   /**
//    * 버튼 크기
//    */
//   size: PropTypes.oneOf(['small', 'medium', 'large']),
//   /**
//    * 버튼 캡션
//    */
//   label: PropTypes.string.isRequired,
//   /**
//    * 클릭 핸들러
//    */
//   handleClick: PropTypes.func,
// };