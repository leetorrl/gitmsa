import { isRouteErrorResponse, useRouteError } from 'react-router-dom';

export default function CommonErrorPage() {
  // 루트에서 발생한 오류를 가져온다.
  const error = useRouteError();
  // Response 형식의 오류인지
  if (isRouteErrorResponse(error)) {
    // 상태 코드에 따라 오류 페이지 생성
    switch (error.status) {
      case 404:
        return <p>원하는 페이지를 찾을 수 없습니다.</p>;
      case 401:
        return <p>인증에 실패했습니다.</p>;
      case 501:
        return <p>서비스가 일시적으로 중단되었습니다.</p>;
      default:
        return <p>알 수 없는 오류: {error.data.message}</p>;
    }
  }
  // 비응답형(Error형)의 경우의 오류 메시지
  return (
    <div>
      <h3>문제가 발생했습니다.</h3>
      <p>상세한 문제: {error.message}</p>
    </div>
  );
}