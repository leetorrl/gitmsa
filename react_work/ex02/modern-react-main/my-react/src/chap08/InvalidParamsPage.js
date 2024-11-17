import { useRouteError } from 'react-router-dom';

export default function InvalidParamsPage() {
  // 루트에서 발생한 오류를 가져온다.
  const error = useRouteError();
  return (
    <p style={{ color: 'Red' }}>{error.message}</p>
  );
}