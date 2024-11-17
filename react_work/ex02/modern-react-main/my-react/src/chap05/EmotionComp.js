/** @jsxImportSource @emotion/react */
import styled from '@emotion/styled';

// 스타일링된 컴포넌트 준비
const MyPanel = styled.div`
  width: 300px;
  padding: 10px;
  border: 1px solid #000;
  border-radius: 5px;
  background-color: royalblue;
  color: white;
`;

export default function EmotionComp() {
  return (
    // 준비된 구성 요소 배치
    <MyPanel><b>Styled JSX</b>는 JSX 표현식에 스타일 정의를 삽입하는 형식의 라이브러리입니다.</MyPanel>
  );
}