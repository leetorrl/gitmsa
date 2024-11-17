import { Link } from 'react-router-dom';

export default function InfoPage() {
  return (
    <>
    <p>Info 페이지입니다.</p>
    <Link to="..">상위</Link>
    {/* <Link to=".." relative="path">상위</Link> */}
    {/* <Link to="/" reloadDocument>상위</Link> */}
    </>
  );
}
